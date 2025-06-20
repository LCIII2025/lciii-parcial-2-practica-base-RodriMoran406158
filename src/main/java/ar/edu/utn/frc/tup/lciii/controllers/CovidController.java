package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.dtos.common.CovidDataResumenDto;
import ar.edu.utn.frc.tup.lciii.dtos.common.PostCovidDataDto;
import ar.edu.utn.frc.tup.lciii.models.CovidData;
import ar.edu.utn.frc.tup.lciii.services.CovidDataService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController()
@RequestMapping("/v1/covid")
public class CovidController {

    @Autowired
    private CovidDataService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/") //Listar el total de casos testeados y el total de positivos detectados agrupados por estado
    public ResponseEntity<List<CovidDataResumenDto>>  listarTotalesPorEstado(){
        return ResponseEntity.ok(service.listarTotalesPorEstado());
    }

    @PostMapping("/{estado}/{fecha}")
    public ResponseEntity<PostCovidDataDto> crearInforme(@PathVariable String estado,
                                                         @PathVariable LocalDate fecha,
                                                         @RequestBody PostCovidDataDto postCovidDataDto){
        CovidData covidData = service.postCovidData(estado, postCovidDataDto.getSigla(), fecha, postCovidDataDto.getTotalCasos(), postCovidDataDto.getTotalPositivos(), postCovidDataDto.getTotalHospitalizados());
        System.out.println(covidData);
        PostCovidDataDto postDto = modelMapper.map(covidData, PostCovidDataDto.class);
        return ResponseEntity.ok(postDto);
    }

}
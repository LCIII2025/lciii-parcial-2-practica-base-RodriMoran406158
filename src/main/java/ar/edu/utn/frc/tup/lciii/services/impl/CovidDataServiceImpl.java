package ar.edu.utn.frc.tup.lciii.services.impl;

import ar.edu.utn.frc.tup.lciii.dtos.common.CovidDataResumenDto;
import ar.edu.utn.frc.tup.lciii.dtos.common.PostCovidDataDto;
import ar.edu.utn.frc.tup.lciii.entities.CovidDataEntity;
import ar.edu.utn.frc.tup.lciii.models.CovidData;
import ar.edu.utn.frc.tup.lciii.repositories.CovidDataRepository;
import ar.edu.utn.frc.tup.lciii.services.CovidDataService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

import java.util.List;
@Service
public class CovidDataServiceImpl implements CovidDataService {

    @Autowired
    private CovidDataRepository repository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<CovidDataResumenDto> listarTotalesPorEstado() {
        Optional<List<CovidDataResumenDto>> listDataResumenDto = Optional.ofNullable(repository.obtenerTotalesAgrupadosPorEstado());
        if(listDataResumenDto.isEmpty()){
            throw new EntityNotFoundException();
        }
        else {
            return listDataResumenDto.get();
        }
    }

    @Override
    public CovidData postCovidData(String nombreEstado, String sigla, LocalDate fecha, int totalCasos, int totalPositivos, int totalHospitalizados) {
        CovidDataEntity entity = new CovidDataEntity();
        entity.setNombreEstado(nombreEstado);
        entity.setFecha(fecha);
        entity.setSigla(sigla);
        entity.setTotalCasos(totalCasos);
        entity.setTotalPositivos(totalPositivos);
        entity.setTotalHospitalizados(totalHospitalizados);
        entity = repository.save(entity);
        return modelMapper.map(entity, CovidData.class);
    }
}
package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.dtos.common.CovidDataResumenDto;
import ar.edu.utn.frc.tup.lciii.dtos.common.PostCovidDataDto;
import ar.edu.utn.frc.tup.lciii.models.CovidData;

import java.time.LocalDate;
import java.util.List;

public interface CovidDataService {
    List<CovidDataResumenDto> listarTotalesPorEstado();

    CovidData postCovidData(String nombreEstado, String sigla, LocalDate fecha, int totalCasos, int totalPositivos, int totalHospitalizados);

}

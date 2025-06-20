package ar.edu.utn.frc.tup.lciii.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CovidData {

    private Long id;

    private String nombreEstado;

    private String sigla;

    private LocalDate fecha;

    private int totalCasos;

    private int totalPositivos;

    private int totalHospitalizados;
}
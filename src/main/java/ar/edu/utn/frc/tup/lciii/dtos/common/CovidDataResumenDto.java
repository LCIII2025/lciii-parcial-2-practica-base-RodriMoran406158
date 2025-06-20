package ar.edu.utn.frc.tup.lciii.dtos.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CovidDataResumenDto {
    private long totalCasosTesteados;
    private long totalPositivosPorEstado;
    private String sigla;
}

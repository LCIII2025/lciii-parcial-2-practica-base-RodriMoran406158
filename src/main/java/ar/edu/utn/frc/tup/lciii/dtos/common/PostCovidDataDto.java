package ar.edu.utn.frc.tup.lciii.dtos.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class PostCovidDataDto {

    private String sigla;

    private LocalDate fecha;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public int getTotalCasos() {
        return totalCasos;
    }

    public void setTotalCasos(int totalCasos) {
        this.totalCasos = totalCasos;
    }

    public int getTotalPositivos() {
        return totalPositivos;
    }

    public void setTotalPositivos(int totalPositivos) {
        this.totalPositivos = totalPositivos;
    }

    public int getTotalHospitalizados() {
        return totalHospitalizados;
    }

    public void setTotalHospitalizados(int totalHospitalizados) {
        this.totalHospitalizados = totalHospitalizados;
    }

    private String nombreEstado;

    private int totalCasos;

    private int totalPositivos;

    private int totalHospitalizados;
}

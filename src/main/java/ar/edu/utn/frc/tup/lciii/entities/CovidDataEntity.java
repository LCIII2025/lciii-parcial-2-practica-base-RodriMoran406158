package ar.edu.utn.frc.tup.lciii.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "covidData")
public class CovidDataEntity {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sigla;

    private String nombreEstado;

    private LocalDate fecha;

    private int totalCasos;

    private int totalPositivos;

    private int totalHospitalizados;
}

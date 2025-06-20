package ar.edu.utn.frc.tup.lciii.repositories;

import ar.edu.utn.frc.tup.lciii.dtos.common.CovidDataResumenDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ar.edu.utn.frc.tup.lciii.entities.CovidDataEntity;

import java.util.List;

@Repository
public interface CovidDataRepository extends JpaRepository<CovidDataEntity, Long> {

    @Query("SELECT new ar.edu.utn.frc.tup.lciii.dtos.common.CovidDataResumenDto(SUM(c.totalCasos),SUM(c.totalPositivos),c.sigla) " +
            "FROM covidData c GROUP BY c.sigla")
    List<CovidDataResumenDto> obtenerTotalesAgrupadosPorEstado();
}

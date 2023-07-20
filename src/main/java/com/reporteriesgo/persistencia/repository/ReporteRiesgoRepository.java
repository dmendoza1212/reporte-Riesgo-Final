package com.reporteriesgo.persistencia.repository;

import com.reporteriesgo.persistencia.entity.ReporteRiesgo;

import jakarta.persistence.StoredProcedureQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
@Repository
@Transactional(readOnly = true)
public interface ReporteRiesgoRepository extends JpaRepository<ReporteRiesgo, String> {


    @Transactional
     @Procedure(name="procedureinfo")
    //@Query(value = "CALL sacif.PKG_RIESGOS.SP_REPORTE_RIESGO(:PD_fecha,:PO_CURSOR_RESULTADO);", nativeQuery = true)
    List<ReporteRiesgo> obtenerReporteRiesgo(@Param("PD_fecha") Date PD_fecha);
}

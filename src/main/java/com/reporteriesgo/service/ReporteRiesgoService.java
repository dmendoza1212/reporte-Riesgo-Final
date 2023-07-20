package com.reporteriesgo.service;

import com.reporteriesgo.persistencia.entity.*;
import com.reporteriesgo.persistencia.repository.ReporteRiesgoRepository;
import com.reporteriesgo.service.dto.ReporteRiesgoDto;


import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ReporteRiesgoService {

    @PersistenceContext
    private EntityManager em;

    public List<ReporteRiesgo> obtenerReporteRiesgo(Date fecha) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("PKG_RIESGOS.SP_REPORTE_RIESGO");
        storedProcedureQuery.registerStoredProcedureParameter("PD_fecha", Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("PO_CURSOR_RESULTADO", Void.class, ParameterMode.REF_CURSOR);
        storedProcedureQuery.setParameter("PD_fecha",fecha);
        storedProcedureQuery.execute();
        List<ReporteRiesgo> ListReporteRiesgo  = storedProcedureQuery.getResultList();
        return  ListReporteRiesgo;
    }
}

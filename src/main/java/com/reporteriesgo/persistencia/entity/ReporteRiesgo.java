package com.reporteriesgo.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity
@NamedStoredProcedureQuery(
        name = "ReporteRiesgo.procedureinfo",
        procedureName = "PKG_RIESGOS.SP_REPORTE_RIESGO",
        parameters = {
                @StoredProcedureParameter(name = "PD_fecha", mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(name = "PO_CURSOR_RESULTADO", mode = ParameterMode.REF_CURSOR, type = Void.class )
        }
)
public class ReporteRiesgo {


    @Id
    @Column(name = "CODIGOTCHN")
        private String codigoId;

    @Column(name = "CMONEDA")
    private String moneda;

    @Column(name = "ndocumento")
    private String documento;

    @Column(name = "tapaterno")
    private String aPaterno;

    @Column(name = "tamaterno")
    private String aMaterno;

    @Column(name = "tnombres")
    private String nombres;

    @Column(name = "dnacimiento")
    private Date fechaNacimiento;

    @Column(name = "tdireccion")
    private String direccion;

    @Column(name = "cubigeo")
    private String ubigeo;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "distrito")
    private String distrto;

    @Column(name = "cinmueble")
    private String inmueble;

    @Column(name = "actividad")
    private String actividad;

    @Column(name = "saldo_actual")
    private Double saldoActual;

    @Column(name = "cuotasatrasdas")
    private String cuotasAtrasada;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cuota")
    private String cuota;

    @Column(name = "SUELDO")
    private String sueldo;

    @Column(name = "fdesembolso")
    private Date fechaDesembolso;

    @Column(name = "tipooperacion")
    private String tipoOperacion;

    @Column(name = "S_INFOCORP")
    private String infocorp;

    @Column(name = "NVALORIZACION")
    private String nValorizacion;

    @Column(name = "V_EDIFICACION")
    private String vEdificacion;

    @Column(name = "V_PROPIEDAD")
    private String vPropiedad;

    @Column(name = "V_COMERCIAL")
    private String vComercial;

    @Column(name = "V_REALIZACIONSOL")
    private String vRealizacionSol;

    @Column(name = "V_REALIZACIONDOL")
    private String vRealizacionDol;

    @Column(name = "F_VALORIZACION")
    private String fechaValorizacion;

    @Column(name = "dubigeo")
    private String idDistrito;

    @Column(name = "ncuotas_generadas")
    private String nCuotas;

    @Column(name = "cuotasatrasadas")
    private String cuotasAtrasadas;

}

package com.endgame.capturadelinea.model;

import java.util.Date;

public class LineaCaptura {

    String lineaCaptura;
    Date vigencia;
    String tipoPago;
    String idTipo;
    String referencia;
    Integer importe;
    Integer tipoValidacion;
    String rfc;
    Integer digitoGlobales;

    public String getLineaCaptura() {
        return lineaCaptura;
    }

    public void setLineaCaptura(String lineaCaptura) {
        this.lineaCaptura = lineaCaptura;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public Integer getTipoValidacion() {
        return tipoValidacion;
    }

    public void setTipoValidacion(Integer tipoValidacion) {
        this.tipoValidacion = tipoValidacion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Integer getDigitoGlobales() {
        return digitoGlobales;
    }

    public void setDigitoGlobales(Integer digitoGlobales) {
        this.digitoGlobales = digitoGlobales;
    }

    public LineaCaptura generar(){
        // TODO
        // jar.metodo(this.vigencias, .....
        String lc = "" ;
        this.lineaCaptura = lc;

        return this;


    }
}

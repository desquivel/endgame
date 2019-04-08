package com.endgame.capturadelinea.model;

import java.util.Date;

public class LineaCaptura {

    String lineaCaptura;
    Date vigengia;
    String tipoPago;
    String idTipo;
    String referenica;
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

    public Date getVigengia() {
        return vigengia;
    }

    public void setVigengia(Date vigengia) {
        this.vigengia = vigengia;
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

    public String getReferenica() {
        return referenica;
    }

    public void setReferenica(String referenica) {
        this.referenica = referenica;
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

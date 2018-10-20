/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterBikes.dto;

/**
 *
 * @author Edison
 */
public class ClientesDto {
    private String RUT_CLIENTE;
    private String NOMBRE;
    private String APE_PATERNO;
    private String APE_MATERNO;
    private String DIRECCION;
    private String EMAIL;

    public ClientesDto() {
        this.RUT_CLIENTE = new String();
        this.NOMBRE = new String();
        this.APE_PATERNO = new String();
        this.APE_PATERNO = new String();
        this.DIRECCION = new String();
        this.EMAIL = new String();
    }

    public ClientesDto(String RUT_CLIENTE, String NOMBRE, String APE_PATERNO, String APE_MATERNO, String DIRECCION) {
        this.RUT_CLIENTE = RUT_CLIENTE;
        this.NOMBRE = NOMBRE;
        this.APE_PATERNO = APE_PATERNO;
        this.APE_MATERNO = APE_MATERNO;
        this.DIRECCION = DIRECCION;
    }

    public String getRUT_CLIENTE() {
        return RUT_CLIENTE;
    }

    public void setRUT_CLIENTE(String RUT_CLIENTE) {
        this.RUT_CLIENTE = RUT_CLIENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPE_PATERNO() {
        return APE_PATERNO;
    }

    public void setAPE_PATERNO(String APE_PATERNO) {
        this.APE_PATERNO = APE_PATERNO;
    }

    public String getAPE_MATERNO() {
        return APE_MATERNO;
    }

    public void setAPE_MATERNO(String APE_MATERNO) {
        this.APE_MATERNO = APE_MATERNO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    @Override
    public String toString() {
        return "ClientesDto{" + "RUT_CLIENTE=" + RUT_CLIENTE + ", NOMBRE=" + NOMBRE + ", APE_PATERNO=" + APE_PATERNO + ", APE_MATERNO=" + APE_MATERNO + ", DIRECCION=" + DIRECCION + ", EMAIL=" + EMAIL + '}';
    }
       
}

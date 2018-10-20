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
public class ProductosDto {
    private int COD_PRODUCTOS;
    private String NOMBRE;
    private int MONTO;
    private String CATEGORIA;
    private int STOCK;
    private String TIPO_PRODUCTO;

public ProductosDto() {
    this.COD_PRODUCTOS = 0;
    this.NOMBRE = new String();
    this.MONTO =  0;
    this.CATEGORIA = new String();
    this.STOCK = 0;
    this.TIPO_PRODUCTO = new String();
    }

    public int getCOD_PRODUCTOS() {
        return COD_PRODUCTOS;
    }

    public void setCOD_PRODUCTOS(int COD_PRODUCTOS) {
        this.COD_PRODUCTOS = COD_PRODUCTOS;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getMONTO() {
        return MONTO;
    }

    public void setMONTO(int MONTO) {
        this.MONTO = MONTO;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }

    public String getTIPO_PRODUCTO() {
        return TIPO_PRODUCTO;
    }

    public void setTIPO_PRODUCTO(String TIPO_PRODUCTO) {
        this.TIPO_PRODUCTO = TIPO_PRODUCTO;
    }

    @Override
    public String toString() {
        return "ProductosDto{" + "COD_PRODUCTOS=" + COD_PRODUCTOS + ", NOMBRE=" + NOMBRE + ", MONTO=" + MONTO + ", CATEGORIA=" + CATEGORIA + ", STOCK=" + STOCK + ", TIPO_PRODUCTO=" + TIPO_PRODUCTO + '}';
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.formularioUsuario.model;

/**
 *
 * @author LAB_P03
 */
public class Producto {
    private String nombreProducto;
    private String fec_caducidad;
    private int stockMin;
    private int stockMax;
    private double precio_unit;
    private String categoria;
    private String marca;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFec_caducidad() {
        return fec_caducidad;
    }

    public void setFec_caducidad(String fec_caducidad) {
        this.fec_caducidad = fec_caducidad;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    public double getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(double precio_unit) {
        this.precio_unit = precio_unit;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}

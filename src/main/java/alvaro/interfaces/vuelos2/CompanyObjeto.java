/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alvaro.interfaces.vuelos2;

import java.io.Serializable;

/**
 *
 * @author alvarobs
 */
public class CompanyObjeto implements Serializable{
    private int prefijo;
    private String codigo;
    private String nombre;
    private String direccion;
    private String municipio;
    private String telefonoInfoPasajer;
    private String telefonoInfoAereopuerto;

    public CompanyObjeto() {
        
    }
    

    public CompanyObjeto(int prefijo, String codigo, String nombre, String direccion, String municipio, String telefonoInfoPasajer, String telefonoInfoAereopuerto) {
        this.prefijo = prefijo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.municipio = municipio;
        this.telefonoInfoPasajer = telefonoInfoPasajer;
        this.telefonoInfoAereopuerto = telefonoInfoAereopuerto;
    }

    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefonoInfoPasajer() {
        return telefonoInfoPasajer;
    }

    public void setTelefonoInfoPasajer(String telefonoInfoPasajer) {
        this.telefonoInfoPasajer = telefonoInfoPasajer;
    }

    public String getTelefonoInfoAereopuerto() {
        return telefonoInfoAereopuerto;
    }

    public void setTelefonoInfoAereopuerto(String telefonoInfoAereopuerto) {
        this.telefonoInfoAereopuerto = telefonoInfoAereopuerto;
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alvaro.interfaces.vuelos2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author alvarobs
 */
public class Vuelo {
    private String codigoVuelo;
    private int numeroPlazas;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private String diasOperacion;
    private String codigoAereopuertoOrigen;
    private String codigoAereopuertoDestino;
    private Aereopuerto aereopuertoOrigen;
    private Aereopuerto aereopuertoDestino;

    public Vuelo() {
    }

    public Vuelo(String codigoVuelo, int numeroPlazas, LocalTime horaSalida, LocalTime horaLlegada, String diasOperacion, String codigoAereopuertoOrigen, String codigoAereopuertoDestino) {
        this.codigoVuelo = codigoVuelo;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperacion = diasOperacion;
        this.codigoAereopuertoOrigen = codigoAereopuertoOrigen;
        this.codigoAereopuertoDestino = codigoAereopuertoDestino;
    }

    public Vuelo(String codigoVuelo, int numeroPlazas, LocalTime horaSalida, LocalTime horaLlegada, String diasOperacion, Aereopuerto aereopuertoOrigen, Aereopuerto aereopuertoDestino) {
        this.codigoVuelo = codigoVuelo;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperacion = diasOperacion;
        this.aereopuertoOrigen = aereopuertoOrigen;
        this.aereopuertoDestino = aereopuertoDestino;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getDiasOperacion() {
        return diasOperacion;
    }

    public void setDiasOperacion(String diasOperacion) {
        this.diasOperacion = diasOperacion;
    }

    public String getCodigoAereopuertoOrigen() {
        return codigoAereopuertoOrigen;
    }

    public void setCodigoAereopuertoOrigen(String codigoAereopuertoOrigen) {
        this.codigoAereopuertoOrigen = codigoAereopuertoOrigen;
    }

    public String getCodigoAereopuertoDestino() {
        return codigoAereopuertoDestino;
    }

    public void setCodigoAereopuertoDestino(String codigoAereopuertoDestino) {
        this.codigoAereopuertoDestino = codigoAereopuertoDestino;
    }

    public Aereopuerto getAereopuertoOrigen() {
        return aereopuertoOrigen;
    }

    public void setAereopuertoOrigen(Aereopuerto aereopuertoOrigen) {
        this.aereopuertoOrigen = aereopuertoOrigen;
    }

    public Aereopuerto getAereopuertoDestino() {
        return aereopuertoDestino;
    }

    public void setAereopuertoDestino(Aereopuerto aereopuertoDestino) {
        this.aereopuertoDestino = aereopuertoDestino;
    }
    
   
   
    
}

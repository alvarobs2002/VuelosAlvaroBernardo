/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alvaro.interfaces.vuelos2;

import java.util.Date;

/**
 *
 * @author alvarobs
 */
public class Vuelo {
    private String codigoVuelo;
    private int numeroPlazas;
    private Date horaSalida;
    private Date horaLlegada;
    private String diasOperacion;
    private String codigoAereopuertoOrigen;
    private String codigoAereopuertoDestino;
    private Aereopuerto aereopuertoOrigen;
    private Aereopuerto aereopuertoDestino;

    public Vuelo() {
    }

    public Vuelo(String codigoVuelo, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasOperacion, String codigoAereopuertoOrigen, String codigoAereopuertoDestino) {
        this.codigoVuelo = codigoVuelo;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperacion = diasOperacion;
        this.codigoAereopuertoOrigen = codigoAereopuertoOrigen;
        this.codigoAereopuertoDestino = codigoAereopuertoDestino;
    }

    public Vuelo(String codigoVuelo, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasOperacion, Aereopuerto aereopuertoOrigen, Aereopuerto aereopuertoDestino) {
        this.codigoVuelo = codigoVuelo;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperacion = diasOperacion;
        this.aereopuertoOrigen = aereopuertoOrigen;
        this.aereopuertoDestino = aereopuertoDestino;
    }
    
   
   
    
}

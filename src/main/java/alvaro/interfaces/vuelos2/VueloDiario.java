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
public class VueloDiario {
    private String codigoVuelo;
    private Date fechaVuelo;
    private Date horaSalida;
    private Date horaLlegada;
    private int numeroPlazasOcupadas;
    private int precioVuelo;
    private Vuelo vuelo;

    public VueloDiario() {
    }

    public VueloDiario(String codigoVuelo, Date fechaVuelo, Date horaSalida, Date horaLlegada, int numeroPlazasOcupadas, int precioVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.numeroPlazasOcupadas = numeroPlazasOcupadas;
        this.precioVuelo = precioVuelo;
    }

    public VueloDiario(Date fechaVuelo, Date horaSalida, Date horaLlegada, int numeroPlazasOcupadas, int precioVuelo, Vuelo vuelo) {
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.numeroPlazasOcupadas = numeroPlazasOcupadas;
        this.precioVuelo = precioVuelo;
        this.vuelo = vuelo;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getNumeroPlazasOcupadas() {
        return numeroPlazasOcupadas;
    }

    public void setNumeroPlazasOcupadas(int numeroPlazasOcupadas) {
        this.numeroPlazasOcupadas = numeroPlazasOcupadas;
    }

    public int getPrecioVuelo() {
        return precioVuelo;
    }

    public void setPrecioVuelo(int precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
    
    

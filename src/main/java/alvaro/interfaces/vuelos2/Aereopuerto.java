/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alvaro.interfaces.vuelos2;


/**
 *
 * @author alvarobs
 */
public class Aereopuerto {
    private String codigoIATA;
    private String nombre;
    private String ccodigoMunicippio;

    public Aereopuerto() {
    }

    public Aereopuerto(String codigoIATA, String nombre, String ccodigoMunicippio) {
        this.codigoIATA = codigoIATA;
        this.nombre = nombre;
        this.ccodigoMunicippio = ccodigoMunicippio;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCcodigoMunicippio() {
        return ccodigoMunicippio;
    }

    public void setCcodigoMunicippio(String ccodigoMunicippio) {
        this.ccodigoMunicippio = ccodigoMunicippio;
    }
    
    
    
}


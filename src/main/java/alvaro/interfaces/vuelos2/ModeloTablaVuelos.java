/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alvaro.interfaces.vuelos2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class ModeloTablaVuelos extends DefaultTableModel{
    public ModeloTablaVuelos() {
        addColumn("codigoVuelo");
        addColumn("numeroPlazas");
        addColumn("horaSalida");
        addColumn("horaLlegada");
        addColumn("diasOperacion");
        addColumn("codigoAereopuertoOrigen");
        addColumn("codigoAereopuertoDestino");
        setRowCount(GestionVuelos.readCSV().size());
    }
    
}

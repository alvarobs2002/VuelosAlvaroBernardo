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
public class ModeloTablaVuelosDiarios extends DefaultTableModel {
     public ModeloTablaVuelosDiarios() {
        addColumn("codigoVuelo");
        addColumn("fechaVuelo");
        addColumn("horaSalida");
        addColumn("horaLlegada");
        addColumn("numeroPlazasOcupadas");
        addColumn("precioVuelo");
        setRowCount(GestionVuelosDiarios.readCSV().size());
    }
}

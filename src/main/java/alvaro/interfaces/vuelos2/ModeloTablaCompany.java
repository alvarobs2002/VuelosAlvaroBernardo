/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alvaro.interfaces.vuelos2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alvarobs
 */
public class ModeloTablaCompany extends DefaultTableModel {

    public ModeloTablaCompany() {
        addColumn("Prefijo");
        addColumn("Codigo");
        addColumn("Nombre");
        addColumn("Direccion");
        addColumn("Municipio");
        addColumn("TelefonoPasajero");
        addColumn("TelefonoAereopuerto");
        setRowCount(Company.readCSV().size());
    }
    
    
}

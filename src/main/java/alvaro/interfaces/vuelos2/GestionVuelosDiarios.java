/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alvaro.interfaces.vuelos2;

import static alvaro.interfaces.vuelos2.GestionVuelos.leerLista;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class GestionVuelosDiarios extends javax.swing.JFrame {

    ModeloTablaVuelosDiarios modelo = new ModeloTablaVuelosDiarios();

    /**
     * Creates new form GestionVuelosDiarios
     */
    public GestionVuelosDiarios() {
        initComponents();
        verVuelosDiarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnDarDeAlta = new javax.swing.JButton();
        btnDarDeBaja = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl.setModel(modelo);
        jScrollPane1.setViewportView(tbl);

        btnDarDeAlta.setText("Dar de alta");
        btnDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeAltaActionPerformed(evt);
            }
        });

        btnDarDeBaja.setText("Dar de baja");
        btnDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeBajaActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDarDeAlta)
                        .addGap(67, 67, 67)
                        .addComponent(btnDarDeBaja)
                        .addGap(90, 90, 90)
                        .addComponent(btnVolver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDarDeAlta)
                    .addComponent(btnDarDeBaja)
                    .addComponent(btnVolver))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeAltaActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarDeAltaVuelosDiarios().setVisible(true);
            }
        });

    }//GEN-LAST:event_btnDarDeAltaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarDeBajaVuelosDiarios().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnDarDeBajaActionPerformed
    public static List<String[]> readCSV() {
        List<String[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/archivos/vuelosDiarios.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Dividir la línea por comas para obtener los datos individuales
                String[] row = line.split(",");
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<VueloDiario> leerLista() {
        ArrayList<VueloDiario> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/archivos/vuelosDiarios.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                VueloDiario vd = new VueloDiario();
                String[] row = line.split(",");
                String codigoVuelo = row[0];
                String fechaVuelo = row[1];
                String horaSalida = row[2];
                String horaLlegada = row[3];
                String numeroPlazasOcupadas = row[4];
                String precio = row[5];

                String dateHoraSalida = horaSalida;
                String dateHoraLlegada = horaLlegada;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate localFechaVuelo = LocalDate.parse(fechaVuelo, formatter2);
                LocalTime localHoraSalida = LocalTime.parse(dateHoraSalida, formatter);
                LocalTime localHoraLlegada = LocalTime.parse(dateHoraLlegada, formatter);

                int intPlazasOcupadas = Integer.parseInt(numeroPlazasOcupadas);
                int intPrecio = Integer.parseInt(precio);

                vd.setCodigoVuelo(codigoVuelo);
                vd.setFechaVuelo(localFechaVuelo);
                vd.setHoraSalida(localHoraSalida);
                vd.setHoraLlegada(localHoraLlegada);
                vd.setNumeroPlazasOcupadas(intPlazasOcupadas);
                vd.setPrecioVuelo(intPrecio);
                lista.add(vd);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void verVuelosDiarios() {
         ArrayList<VueloDiario> lista = leerLista();
        modelo.setRowCount(lista.size());
        int f = 0;
        for (VueloDiario co : lista) {
            tbl.getModel().setValueAt(co.getCodigoVuelo(), f, 0);
            tbl.getModel().setValueAt(co.getFechaVuelo(), f, 1);
            tbl.getModel().setValueAt(co.getHoraSalida(), f, 2);
            tbl.getModel().setValueAt(co.getHoraLlegada(), f, 3);
            tbl.getModel().setValueAt(co.getNumeroPlazasOcupadas(), f, 4);
            tbl.getModel().setValueAt(co.getPrecioVuelo(), f, 5);
            
            f++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionVuelosDiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVuelosDiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVuelosDiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVuelosDiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVuelosDiarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarDeAlta;
    private javax.swing.JButton btnDarDeBaja;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}

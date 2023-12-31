/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alvaro.interfaces.vuelos2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class DarDeBajaVuelos extends javax.swing.JFrame {

    /**
     * Creates new form DarDeBajaVuelos
     */
    public DarDeBajaVuelos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        btnAceptar.setText("Dar de baja");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnAceptar)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        darDeBaja();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(DarDeBajaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarDeBajaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarDeBajaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarDeBajaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarDeBajaVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    private void darDeBaja() {
        ArrayList<Vuelo> lista=GestionVuelos.leerLista();
        ArrayList<Vuelo> lista2=new ArrayList<>();
        String codigo=txtCodigo.getText();
        boolean comp=comprobarExiste();
        if(comp){
            for(Vuelo v:lista){
                if(v.getCodigoVuelo().equals(codigo)){
                    
                }else{
                    v.getCodigoVuelo();
                    v.getNumeroPlazas();
                    v.getHoraSalida();
                    v.getHoraLlegada();
                    v.getDiasOperacion();
                    v.getCodigoAereopuertoOrigen();
                    v.getCodigoAereopuertoDestino();
                    lista2.add(v);
                }
            }
            String ruta="src/main/java/archivos/vuelos.csv";
            reescribirCSV(lista2,ruta);
        }
    }

    private boolean comprobarExiste() {
        ArrayList<Vuelo> lista=GestionVuelos.leerLista();
        String codigo=txtCodigo.getText();
        for(Vuelo v:lista){
            if(v.getCodigoVuelo().equals(codigo)){
                lblInfo.setText("");
                return true;
            }
        }
        lblInfo.setText("El codigo no existe");
        return false;
    }
    public static void reescribirCSV(ArrayList<Vuelo> listaObjetos, String rutaArchivo) {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            for (Vuelo objeto : listaObjetos) {
                // Adaptar los campos del objeto a una cadena CSV
                String csvLine = objeto.getCodigoVuelo() + "," + objeto.getNumeroPlazas() + "," + objeto.getHoraSalida() + ","
                        + objeto.getHoraLlegada() + "," + objeto.getDiasOperacion() + "," + objeto.getCodigoAereopuertoOrigen()
                        + "," + objeto.getCodigoAereopuertoDestino() + "\n";

                // Escribir la línea CSV en el archivo
                writer.write(csvLine);
            }

            System.out.println("Objetos guardados en formato CSV en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}

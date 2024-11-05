/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Mesa;
import Entidades.Reserva;
import Persistencia.MesaData;
import Persistencia.ReservaData;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author zalaz
 */
public class VistaActualizarMesa extends javax.swing.JInternalFrame {
    VistaPrincipal vista;
    ReservaData con = new ReservaData();
    private MesaData cone = new MesaData();

    public VistaActualizarMesa(VistaPrincipal vista) {
        this.vista=vista;
        initComponents();
        llenarCampos();
      repaint();

        if(VistaPrincipal.getMesa().getReserva()!=null){
            VistaPrincipal.setId(VistaPrincipal.getMesa().getReserva().getIdReserva());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerCapacidad = new javax.swing.JSpinner();
        jSpinnerID = new javax.swing.JSpinner();
        jCheckBoxReserva = new javax.swing.JCheckBox();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Capacidad:");

        jLabel2.setText("Numero:");

        jLabel3.setText("Reserva:");

        jLabel4.setText("Estado:");

        jCheckBoxReserva.setText("(Reservado)");
        jCheckBoxReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxReservaActionPerformed(evt);
            }
        });

        jCheckBoxEstado.setText("(Ocupado)");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.setPreferredSize(new java.awt.Dimension(86, 27));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(70, 70, 70)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBoxReserva)
                                .addComponent(jCheckBoxEstado))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSpinnerID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBoxReserva))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBoxEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id = (int) jSpinnerID.getValue();
        int cap = (int) jSpinnerCapacidad.getValue();
        boolean estado = jCheckBoxEstado.isSelected();
        if (jCheckBoxReserva.isSelected()) {
            Reserva r = con.buscarReservaID(VistaPrincipal.getId());
            Mesa mesa = new Mesa(id, cap, r, estado);
            cone.actualizarMesa(mesa);
            vista.llenarTabla();
        }else{
            Mesa mesa = new Mesa(id, cap, estado);
            cone.actualizarMesa(mesa);
            vista.llenarTabla();
        }

        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxReservaActionPerformed

        if (jCheckBoxReserva.isSelected()) {
            VistaListaReservas ventana2 = new VistaListaReservas(this);
            ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana2.setLocationRelativeTo(null);
            ventana2.setVisible(true);
        }


    }//GEN-LAST:event_jCheckBoxReservaActionPerformed

    public void llenarCampos() {
        boolean x;
        jSpinnerID.setValue(VistaPrincipal.getMesa().getNum());
        jSpinnerCapacidad.setValue(VistaPrincipal.getMesa().getCapacidad());
        if (VistaPrincipal.getMesa().getReserva() == null) {
            x = false;
        } else {
            x = true;
        }
        jCheckBoxReserva.setSelected(x);
        jCheckBoxEstado.setSelected(VistaPrincipal.getMesa().isEstado());
    }

    public void desCheck() {
        jCheckBoxReserva.repaint();
        jCheckBoxReserva.setSelected(false);
        jCheckBoxReserva.repaint();
    }

public void repaint(){
    try{
         if(jCheckBoxReserva.isSelected()){
            jCheckBoxReserva.setText("Numero : "+VistaPrincipal.getMesa().getReserva().getIdReserva());
        }else{
            jCheckBoxReserva.setText("Sin Reserva");
        }
        
        if(jCheckBoxEstado.isSelected()){
            jCheckBoxEstado.setText("Ocupada");
        }else{
            jCheckBoxEstado.setText("Libre");
        }
    }catch(NullPointerException r){
        
    }
   
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JCheckBox jCheckBoxReserva;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerCapacidad;
    private javax.swing.JSpinner jSpinnerID;
    // End of variables declaration//GEN-END:variables
}

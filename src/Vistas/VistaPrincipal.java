/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Mesa;
import Entidades.Mesero;
import Persistencia.MesaData;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mmaci
 */
public final class VistaPrincipal extends javax.swing.JFrame {

    private MesaData con = new MesaData();
    static Mesa mesa;
    static int id;
    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        VistaPrincipal.id = id;
    }

    private Mesero mozo;

    public static Mesa getMesa() {
        return mesa;
    }

    public static void setMesa(Mesa mesa) {
        VistaPrincipal.mesa = mesa;
    }

    /**
     * Creates new form JfremePrincipal
     *
     * @param mozo
     */
    public VistaPrincipal() {
        initComponents();
        iniciarTabla();
        jLabel1.setText("Bienvenido " + VistaLogin.getMozo().getNombre());
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonCrearMesa = new javax.swing.JButton();
        jButtonReservar = new javax.swing.JButton();
        jButtonInventario = new javax.swing.JButton();
        btnBorrarMesa = new javax.swing.JButton();
        jButtonCargarPedido = new javax.swing.JButton();
        jButtonCobrar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnActualizarMesa = new javax.swing.JButton();
        jButtonPedido3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonCrearMesa.setText("Crear Mesa");
        jButtonCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearMesaActionPerformed(evt);
            }
        });

        jButtonReservar.setText("Gestion De Reservas");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        jButtonInventario.setText("Inventario");
        jButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventarioActionPerformed(evt);
            }
        });

        btnBorrarMesa.setText("Borrar Mesa");
        btnBorrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarMesaActionPerformed(evt);
            }
        });

        jButtonCargarPedido.setText("Cargar Pedido");
        jButtonCargarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarPedidoActionPerformed(evt);
            }
        });

        jButtonCobrar.setText("Cobrar Mesa");
        jButtonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCobrarActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar Sesion");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Mesero");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnActualizarMesa.setText("Actualizar Mesa");
        btnActualizarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMesaActionPerformed(evt);
            }
        });

        jButtonPedido3.setText("Pedidos");
        jButtonPedido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedido3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPedido3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCargarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCrearMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(btnBorrarMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCrearMesa)
                        .addComponent(btnBorrarMesa))
                    .addGap(11, 11, 11)
                    .addComponent(btnActualizarMesa)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonInventario)
                        .addComponent(jButtonCobrar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonReservar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCargarPedido)
                        .addComponent(jButtonPedido3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCerrar)
                    .addContainerGap())
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 608, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMesaActionPerformed

        VistaActualizarMesa a1 = null;

        for (JInternalFrame frame : escritorio.getAllFrames()) {
            if (frame instanceof VistaActualizarMesa) {
                a1 = (VistaActualizarMesa) frame;
                break;
            }
        }

        if (a1 == null) {
            // Si no hay una instancia abierta, crear una nueva
            a1 = new VistaActualizarMesa(this);
            escritorio.add(a1);
        }

// Mostrar la ventana y moverla al frente
        a1.setVisible(true);
        escritorio.moveToFront(a1);
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarMesaActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        VistaLogin ventana2 = new VistaLogin();
        ventana2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana2.setLocationRelativeTo(null);
        // Mostrar la ventana2
        ventana2.setVisible(true);

        // Cerrar la primera ventana
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void btnBorrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarMesaActionPerformed
      try{
        int filaSelecionada = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(filaSelecionada, 0);
        con.borrarMesa(id);
        actualizarTabla();
      }catch(ArrayIndexOutOfBoundsException a){
          JOptionPane.showMessageDialog(this, "seleccione una fila, por favor");
      }
    }//GEN-LAST:event_btnBorrarMesaActionPerformed

    private void jButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventarioActionPerformed
        VistaInventario ventana2 = new VistaInventario();
        ventana2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana2.setLocationRelativeTo(null);
        // Mostrar la ventana2
        ventana2.setVisible(true);

        // Cerrar la primera ventana
        this.dispose();
    }//GEN-LAST:event_jButtonInventarioActionPerformed

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        VistaReserva ventana2 = new VistaReserva();
        ventana2.setLocationRelativeTo(null);
        // Mostrar la ventana2
        ventana2.setVisible(true);

        // Cerrar la primera ventana
        this.dispose();
    }//GEN-LAST:event_jButtonReservarActionPerformed

    private void jButtonCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearMesaActionPerformed
        try {
            String cancelar = JOptionPane.showInputDialog("Ingrese la capacidad de la mesa");
            if (cancelar == null) {
                return;

            }

            int cap = Integer.parseInt(cancelar);
            Mesa mesa = new Mesa(cap, false);
            con.guardarMesa(mesa);
            llenarTabla();
        } catch (NumberFormatException r) {
            JOptionPane.showMessageDialog(this,"ingrese solo numeros");
        }


    }//GEN-LAST:event_jButtonCrearMesaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSelecionada = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(filaSelecionada, 0);
        mesa = con.buscarMesa(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonPedido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedido3ActionPerformed
        VistaPedidos ventana2 = new VistaPedidos();
        ventana2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana2.setLocationRelativeTo(null);
        // Mostrar la ventana2
        ventana2.setVisible(true);

        // Cerrar la primera ventana
        this.dispose();
    }//GEN-LAST:event_jButtonPedido3ActionPerformed

    private void jButtonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCobrarActionPerformed

        VistaCobrarMesa a1 = null;

        for (JInternalFrame frame : escritorio.getAllFrames()) {
            if (frame instanceof VistaCobrarMesa) {
                a1 = (VistaCobrarMesa) frame;
                break;
            }
        }

        if (a1 == null) {
            // Si no hay una instancia abierta, crear una nueva
            a1 = new VistaCobrarMesa();
            escritorio.add(a1);
        }

// Mostrar la ventana y moverla al frente
        a1.setVisible(true);
        escritorio.moveToFront(a1);

    }//GEN-LAST:event_jButtonCobrarActionPerformed

    private void jButtonCargarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarPedidoActionPerformed
        VistaCargarPedido a1 = null;

        for (JInternalFrame frame : escritorio.getAllFrames()) {
            if (frame instanceof VistaCargarPedido) {
                a1 = (VistaCargarPedido) frame;
                break;
            }
        }

        if (a1 == null) {

            int filaSelecionada = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(filaSelecionada, 0);

            // Si no hay una instancia abierta, crear una nueva
            a1 = new VistaCargarPedido(con.buscarMesa(id));
            escritorio.add(a1);
        }

// Mostrar la ventana y moverla al frente
        a1.setVisible(true);
        escritorio.moveToFront(a1);

    }//GEN-LAST:event_jButtonCargarPedidoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMesa;
    private javax.swing.JButton btnBorrarMesa;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButtonCargarPedido;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonCobrar;
    private javax.swing.JButton jButtonCrearMesa;
    private javax.swing.JButton jButtonInventario;
    private javax.swing.JButton jButtonPedido3;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 public void iniciarTabla() {

        modelo.addColumn("ID");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Activa");
        modelo.addColumn("Reserva");
        modelo.addColumn("Mozo");
        jTable1.setModel(modelo);
    }

    public void llenarTabla() {

        ArrayList<Mesa> list = con.listaMesa();
        modelo.setRowCount(0);
        for (Mesa p : list) {
            modelo.addRow(new Object[]{p.getNum(), p.getCapacidad(), p.isEstado(), p.getReserva(), "Nadie"});
        }

    }

    public void actualizarTabla() {
        llenarTabla();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Entidades.Reserva;
import Persistencia.ReservaData;
import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLIntegrityConstraintViolationException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabricio Zalazar
 */
public class VistaReserva extends javax.swing.JFrame {

    ReservaData con = new ReservaData();
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    /**
     * Creates new form VistaReserva
     */
    public VistaReserva() {
        initComponents();
        iniciarTabla();
        llenarTabla();
        llenarCombo();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Mostrar una confirmación antes de cerrar
                int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas salir?",
                        "Confirmación de salida", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0); // Cerrar la aplicación
                }
            }
        });
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
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbHorasHasta = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbHorasDe = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDateFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion de Reservas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 202, 195));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Reservar");

        jLabel2.setText("Nombre :");

        jLabel3.setText("Dni :");

        jLabel4.setText("Hora:    De");

        jLabel5.setText("Fecha :");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(226, 70, 70));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel6.setText("a");

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

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Borrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Baja");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Alta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(530, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHorasDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHorasHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(76, 76, 76)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbHorasHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbHorasDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel6))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VistaPrincipal ventana2 = new VistaPrincipal();
        ventana2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana2.setLocationRelativeTo(null);
        // Mostrar la ventana2
        ventana2.setVisible(true);

        // Cerrar la primera ventana
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            String nombre = txtNombre.getText();
            if (nombre.matches(".*[a-zA-Z].*")) {
                int dni = Integer.parseInt(txtDni.getText());
                if (con.buscarReservaDNI(dni).getIdReserva() == 0) {
                    LocalDate fecha = jDateFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                    String selecetHoraDe = (String) cbHorasDe.getSelectedItem();
                    DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("HH:mm");
                    LocalTime horaDe = LocalTime.parse(selecetHoraDe, formato1);

                    String selecetHoraHasta = (String) cbHorasHasta.getSelectedItem();
                    DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm");
                    LocalTime horaHasta = LocalTime.parse(selecetHoraHasta, formato2);
                    Duration duracion = Duration.between(horaDe, horaHasta);

                    if (fecha.isBefore(LocalDate.now())) {
                        JOptionPane.showMessageDialog(this, "Fecha no valida");
                    } else {
                        if (duracion.isNegative()) {
                            duracion = duracion.plusHours(24);
                        }
                        if (!horaDe.equals(horaHasta)) {
                            if (duracion.toHours() <= 2) {

                                Reserva reserva = new Reserva(nombre, dni, fecha, horaDe, horaHasta, true);
                                con.guardarReserva(reserva);
                                llenarTabla();
                            } else {
                                JOptionPane.showMessageDialog(this, "La reserva debe ser menor a dos horas");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Hora de reserva invalida");
                        }

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Este Dni ya tiene reserva");
                }
            }else{
                 JOptionPane.showMessageDialog(this, "Ingrese alguna letra en nombre");
            }
        } catch (NumberFormatException e) {
            {
                JOptionPane.showMessageDialog(this, "ingrese un dni valido");
            }

        } catch (HeadlessException e) {

        } catch (NullPointerException r) {
            JOptionPane.showMessageDialog(this, "Complete los campos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            int filaSelecionada = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(filaSelecionada, 0);

            con.altaLogicaReserva(id);
            llenarTabla();
            LimpiarCampos();
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, "Error , debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String nombre = txtNombre.getText();
            int dni = Integer.parseInt(txtDni.getText());
            LocalDate fecha = jDateFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (fecha.isBefore(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "Fecha no valida");
            } else {
                String selecetHoraDe = (String) cbHorasDe.getSelectedItem();
                DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime horaDe = LocalTime.parse(selecetHoraDe, formato1);
                String selecetHoraHasta = (String) cbHorasHasta.getSelectedItem();
                DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime horaHasta = LocalTime.parse(selecetHoraHasta, formato2);
                Duration duracion = Duration.between(horaDe, horaHasta);
                if (duracion.isNegative()) {
                    duracion = duracion.plusHours(24);
                }

                if (duracion.toHours() <= 2) {
                    int id = con.buscarReservaDNI(dni).getIdReserva();
                    Reserva reserva = new Reserva(id, nombre, dni, fecha, horaDe, horaHasta, true);

                    con.actualizarReserva(reserva);
                    llenarTabla();
                    LimpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "la reserva debe ser menor a dos horas");
                }
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Error, Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSelecionada = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(filaSelecionada, 0);
        Reserva r = con.buscarReservaID(id);
        txtNombre.setText(r.getNombre());
        txtDni.setText(r.getDni() + "");
        jDateFecha.setDate(Date.from(r.getFecha().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        cbHorasDe.setSelectedItem(r.getHoraDe() + "");
        cbHorasHasta.setSelectedItem(r.getHoraHasta() + "");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int filaSelecionada = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(filaSelecionada, 0);
            con.borrarReserva(id);
            llenarTabla();
            LimpiarCampos();
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, "Error, debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int filaSelecionada = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(filaSelecionada, 0);

            con.bajaLogicaReserva(id);
            llenarTabla();
            LimpiarCampos();
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, "Error,Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    public void iniciarTabla() {

        modelo.addColumn("N°");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora de");
        modelo.addColumn("Hasta");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
    }

    public void llenarTabla() {
        String estado;
        ArrayList<Reserva> list = con.listaReserva();
        modelo.setRowCount(0);
        for (Reserva r : list) {
            if (r.isEstado()) {
                estado = "Habilitada";
            } else {
                estado = "Deshabilitada";
            }
            modelo.addRow(new Object[]{r.getIdReserva(), r.getNombre(), r.getDni(), r.getFecha(), r.getHoraDe(), r.getHoraHasta(), estado});
        }

    }

    public void llenarCombo() {
        llenarComboHoraDe();
        llenarComboHoraHasta();
    }

    public void llenarComboHoraDe() {
        String[] horas = {
            "09:00", "10:00", "11:00",
            "12:00", "13:00", "14:00",
            "15:00", "------------",
            "19:00", "20:00", "21:00",
            "22:00", "23:00", "00:00",
            "01:00"

        };

        for (String hora : horas) {
            cbHorasDe.addItem(hora);
        }
    }

    public void llenarComboHoraHasta() {
        String[] horas = {
            "10:00", "11:00",
            "12:00", "13:00", "14:00",
            "15:00", "16:00", "------------",
            "20:00", "21:00",
            "22:00", "23:00", "00:00",
            "01:00", "02:00"

        };

        for (String hora : horas) {
            cbHorasHasta.addItem(hora);
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbHorasDe;
    private javax.swing.JComboBox<String> cbHorasHasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
public void LimpiarCampos() {
        txtNombre.setText("");
        txtDni.setText("");
        jDateFecha.setDate(null);
        cbHorasDe.setSelectedItem(null);
        cbHorasHasta.setSelectedItem(null);
    }

}

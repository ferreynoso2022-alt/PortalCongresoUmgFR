/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package umg.congreso2026fr;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando Rey
 */
public class PanelExpositores extends javax.swing.JPanel {
    
    private ArrayList<Expositor> listaExpositores = new ArrayList<>();
    private final String ruta = "temp/Expositores.txt";

    public PanelExpositores() {
        initComponents();
        listaExpositores = Expositor.RetornarExpositores();
        CargarTabla();
    }

    public void CrearExpositor(){
        String expNombre = txtNombreExpositor.getText().replace(",", "").trim();
        String especialidad = txtEspecialidadExpositor.getText().replace(",", "").trim();
        int indiceId = listaExpositores.stream().mapToInt(Expositor::getIdExpositor).max().orElse(0) + 1;

        String lineaCSV = indiceId+","+expNombre+","+especialidad;
            
        GuardarExpositor(lineaCSV);
    }

    public void GuardarExpositor(String lineaCSV){

        try (FileWriter fw = new FileWriter(ruta, true)){
            fw.append(lineaCSV+"\n");
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir el CSV");
        }

        MenuCongreso.limpiarCampos(this);

    }

    public void CargarTabla(){
        listaExpositores = Expositor.RetornarExpositores();
        DefaultTableModel modelo = (DefaultTableModel) TablaExpositores.getModel();
        modelo.setRowCount(0);
        
        for (Expositor exp : listaExpositores) {
            Object[] fila = {exp.getIdExpositor(),exp.getNombre(),exp.getEspecialidad()};
            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegistrarExpositor = new javax.swing.JButton();
        txtNombreExpositor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEspecialidadExpositor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaExpositores = new javax.swing.JTable();

        jLabel1.setText("Registro de Expositores");

        btnRegistrarExpositor.setText("Registrar");
        btnRegistrarExpositor.addActionListener(this::btnRegistrarExpositorActionPerformed);

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Especialidad");

        jLabel4.setText("Expositores Registrados");

        TablaExpositores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Expositor", "Nombre", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(TablaExpositores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(txtNombreExpositor, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEspecialidadExpositor, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(btnRegistrarExpositor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreExpositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEspecialidadExpositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarExpositor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarExpositorActionPerformed(java.awt.event.ActionEvent evt) {
        if (MenuCongreso.camposVacios(this) != true) {
            CrearExpositor();
            CargarTabla();
        } else{
            return;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaExpositores;
    private javax.swing.JButton btnRegistrarExpositor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEspecialidadExpositor;
    private javax.swing.JTextField txtNombreExpositor;
    // End of variables declaration//GEN-END:variables
}

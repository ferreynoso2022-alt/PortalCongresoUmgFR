/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package umg.congreso2026fr;

import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fernando Rey
 */
public class MenuCongreso extends javax.swing.JFrame {
    
    private final PanelExpositores pExpositores = new PanelExpositores();
    private final PanelConferencias pConferencias = new PanelConferencias();
    private final PanelRegistro pInscripciones = new PanelRegistro();
    private final PanelAsistencia pAsistencia = new PanelAsistencia();
    private final PanelReporte pReporte = new PanelReporte();
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuCongreso.class.getName());

    /**
     * Creates new form MenuCongreso
     */
    public MenuCongreso() {
        initComponents();  
        panelContenido.setLayout(new java.awt.BorderLayout());
    }
    
    private void mostrarPanel(javax.swing.JPanel panel){
 
        panelContenido.removeAll();
        panelContenido.add(panel, java.awt.BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }

    public static void limpiarCampos(javax.swing.JPanel panel){
        for (Component componente : panel.getComponents()) {
            if (componente instanceof JTextField txtCampo) {
                txtCampo.setText("");
            }
        }
        
    }

    public static boolean camposVacios(javax.swing.JPanel panel){

        for (Component componente : panel.getComponents()) {
            if (componente instanceof JTextField txtCampo) {
                if (txtCampo.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "llena los campos");
                    return true;
                }
            }
        }

        return false;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnReporte = new javax.swing.JButton();
        BtnExpositores = new javax.swing.JButton();
        TituloMenu = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        BtnConferencias = new javax.swing.JButton();
        BtnInscripciones = new javax.swing.JButton();
        BtnAsistencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnReporte.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        BtnReporte.setText("GENERAR REPORTE");
        BtnReporte.addActionListener(this::BtnReporteActionPerformed);

        BtnExpositores.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        BtnExpositores.setText("Expositores");
        BtnExpositores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnExpositores.addActionListener(this::BtnExpositoresActionPerformed);

        TituloMenu.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        TituloMenu.setText("Congreso Estudiantil 2026");

        panelContenido.setToolTipText("");
        panelContenido.setLayout(new java.awt.BorderLayout());

        BtnConferencias.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        BtnConferencias.setText("Conferencias");
        BtnConferencias.addActionListener(this::BtnConferenciasActionPerformed);

        BtnInscripciones.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        BtnInscripciones.setText("Inscripciones");
        BtnInscripciones.addActionListener(this::BtnInscripcionesActionPerformed);

        BtnAsistencia.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        BtnAsistencia.setText("Asistencia");
        BtnAsistencia.addActionListener(this::BtnAsistenciaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TituloMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnExpositores, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnConferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(TituloMenu)
                .addGap(58, 58, 58)
                .addComponent(BtnExpositores, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnConferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(BtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReporteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // -------------BOTON MODULO REPORTE-------------:
        mostrarPanel(pReporte);
        pReporte.cargarDatos();
    }

    private void BtnExpositoresActionPerformed(java.awt.event.ActionEvent evt) {
        // -------------BOTON MODULO EXPOSITORES-------------:
        limpiarCampos(pExpositores);
        mostrarPanel(pExpositores);
        
    }

    private void BtnConferenciasActionPerformed(java.awt.event.ActionEvent evt) {
        // -------------BOTON MODULO CONFERENCIAS-------------:
        limpiarCampos(pConferencias);
        mostrarPanel(pConferencias);
        pConferencias.cargarComboBox();
    }

    private void BtnInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {
        // -------------BOTON MODULO INSCRIPCIONES-------------:
        limpiarCampos(pInscripciones);
        mostrarPanel(pInscripciones);
    }

    private void BtnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {
        // -------------BOTON MODULO ASISTENCIA-------------:
        limpiarCampos(pAsistencia);
        mostrarPanel(pAsistencia);
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuCongreso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAsistencia;
    private javax.swing.JButton BtnConferencias;
    private javax.swing.JButton BtnExpositores;
    private javax.swing.JButton BtnInscripciones;
    private javax.swing.JButton BtnReporte;
    private javax.swing.JLabel TituloMenu;
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables
}

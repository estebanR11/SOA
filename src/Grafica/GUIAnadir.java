/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;


import javax.swing.JOptionPane;

/**
 *
 * @author juane
 */
public class GUIAnadir extends javax.swing.JFrame {

    /**
     * Creates new form GUIAnadir
     */
    public GUIAnadir() 
    {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtextNombre = new javax.swing.JTextField();
        jtextCodigo = new javax.swing.JTextField();
        jtextCedula = new javax.swing.JTextField();
        jtextCorreo = new javax.swing.JTextField();
        jtextCelular = new javax.swing.JTextField();
        btnAnadirEstudiante = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Anadir Estudiante");

        jLabel2.setText("Nombre");

        jLabel3.setText("Codigo");

        jLabel4.setText("Cedula");

        jLabel5.setText("Correo");

        jLabel6.setText("Celular");

        btnAnadirEstudiante.setText("Agregar");
        btnAnadirEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirEstudianteActionPerformed(evt);
            }
        });

        jLabel7.setText("@estudiantes.edu.co");

        btnSalir.setText("Atras");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtextNombre)
                            .addComponent(jtextCodigo)
                            .addComponent(jtextCedula)
                            .addComponent(jtextCelular)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnadirEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir)
                                .addGap(46, 46, 46)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnadirEstudiante)
                    .addComponent(btnSalir))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirEstudianteActionPerformed

        // TODO add your handling code here:
        
        int celular = 0;
        
         try {
            celular = Integer.parseInt(jtextCelular.getText());
        } catch (Exception e) {
        }
        
        if( jtextCedula.getText().equals("") || !jtextCelular.getText().matches("[0-9]*")
                || jtextCodigo.getText().equals("") || jtextCorreo.getText().equals("") 
                || jtextNombre.getText().equals(""))           
        {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
        
       if(Main.uni.buscarEstudiantePorCodigo(jtextCodigo.getText())!= null )
       {
            JOptionPane.showMessageDialog(this, "ERROR: codigo de estudiante ya existe");
       }
       
       else if(Main.uni.existeCelular(celular) == true )
       {
            JOptionPane.showMessageDialog(this, "ERROR: celular de estudiante ya existe");
            
       }
       else if(Main.uni.existeCorreo(jtextCorreo.getText()) == true )
       {
            JOptionPane.showMessageDialog(this, "ERROR: correo de estudiante ya existe");
       }
        else
       {
           String nombre = jtextNombre.getText();
           int cedula = Integer.parseInt(jtextCedula.getText());
           String codigo = jtextCodigo.getText();
           String correo = jtextCorreo.getText();
           
           Main.uni.anadirEstudiante(nombre, cedula, codigo, correo, celular);
           
           jtextNombre.setText("");
           jtextCedula.setText("");
           jtextCodigo.setText("");
           jtextCelular.setText("");
           jtextCorreo.setText("");
           JOptionPane.showMessageDialog(this, "Se anadio un nuevo estudiante");
        
       }
         
        
        
        
        
    }//GEN-LAST:event_btnAnadirEstudianteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        GUIPrincipal a = new GUIPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAnadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirEstudiante;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtextCedula;
    private javax.swing.JTextField jtextCelular;
    private javax.swing.JTextField jtextCodigo;
    private javax.swing.JTextField jtextCorreo;
    private javax.swing.JTextField jtextNombre;
    // End of variables declaration//GEN-END:variables
}

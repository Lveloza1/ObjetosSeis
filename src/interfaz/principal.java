/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author lveloza1
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        cmdPredeterminada = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtagregar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtServir = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdServirTazas = new javax.swing.JButton();
        cmdAgregarTazas = new javax.swing.JButton();
        cmdVaciarCafetera = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdLlenarCafetera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Ejercicio 6");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 80, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la Cafetera"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cantidad Actual");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Capacidad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, 30));
        jPanel2.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 30));

        cmdPredeterminada.setText("Predeterminada");
        jPanel2.add(cmdPredeterminada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 30));

        cmdGuardar.setText("Guardar");
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Contenido"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Servir tazas");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel3.add(txtagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Agregar Café");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel3.add(txtServir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 110));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdServirTazas.setText("Servir Tazas");
        jPanel4.add(cmdServirTazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 40));

        cmdAgregarTazas.setText("Agregar tazas ");
        jPanel4.add(cmdAgregarTazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 40));

        cmdVaciarCafetera.setText("Vaciar Cafetera");
        jPanel4.add(cmdVaciarCafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 40));

        cmdBorrar.setText("Nuevo");
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 40));

        cmdLlenarCafetera.setText("Llenar cafetera");
        jPanel4.add(cmdLlenarCafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 180, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregarTazas;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLlenarCafetera;
    private javax.swing.JButton cmdPredeterminada;
    private javax.swing.JButton cmdServirTazas;
    private javax.swing.JButton cmdVaciarCafetera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtServir;
    private javax.swing.JTextField txtagregar;
    // End of variables declaration//GEN-END:variables
}

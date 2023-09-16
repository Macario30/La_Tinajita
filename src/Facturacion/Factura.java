/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

/**
 *
 * @author gmg
 */
public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     */
    public Factura() {
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

        jPanel_titulo = new javax.swing.JPanel();
        jIcon_Tinajita = new javax.swing.JLabel();
        jLabel_variedades = new javax.swing.JLabel();
        jLabel_facturacion = new javax.swing.JLabel();
        jLabel_tinajita = new javax.swing.JLabel();
        jPanel_Body = new javax.swing.JPanel();
        jPanel_Datos = new javax.swing.JPanel();
        jPanel_tabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_titulo.setBackground(new java.awt.Color(153, 255, 51));

        jIcon_Tinajita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Facturacion/IconTinajita.jpg"))); // NOI18N

        jLabel_variedades.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel_variedades.setText("Variedades");

        jLabel_facturacion.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel_facturacion.setText("Facturación");

        jLabel_tinajita.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel_tinajita.setText("La Tinajita");

        javax.swing.GroupLayout jPanel_tituloLayout = new javax.swing.GroupLayout(jPanel_titulo);
        jPanel_titulo.setLayout(jPanel_tituloLayout);
        jPanel_tituloLayout.setHorizontalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_variedades)
                    .addComponent(jLabel_tinajita, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(jIcon_Tinajita)
                .addContainerGap())
        );
        jPanel_tituloLayout.setVerticalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_tituloLayout.createSequentialGroup()
                        .addComponent(jLabel_variedades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_tinajita)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE))
                    .addComponent(jIcon_Tinajita))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Body.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Datos.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_Datos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        javax.swing.GroupLayout jPanel_DatosLayout = new javax.swing.GroupLayout(jPanel_Datos);
        jPanel_Datos.setLayout(jPanel_DatosLayout);
        jPanel_DatosLayout.setHorizontalGroup(
            jPanel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_DatosLayout.setVerticalGroup(
            jPanel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        jPanel_tabla.setBackground(new java.awt.Color(255, 153, 204));
        jPanel_tabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventario"));

        javax.swing.GroupLayout jPanel_tablaLayout = new javax.swing.GroupLayout(jPanel_tabla);
        jPanel_tabla.setLayout(jPanel_tablaLayout);
        jPanel_tablaLayout.setHorizontalGroup(
            jPanel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_tablaLayout.setVerticalGroup(
            jPanel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_BodyLayout = new javax.swing.GroupLayout(jPanel_Body);
        jPanel_Body.setLayout(jPanel_BodyLayout);
        jPanel_BodyLayout.setHorizontalGroup(
            jPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_BodyLayout.setVerticalGroup(
            jPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jIcon_Tinajita;
    private javax.swing.JLabel jLabel_facturacion;
    private javax.swing.JLabel jLabel_tinajita;
    private javax.swing.JLabel jLabel_variedades;
    private javax.swing.JPanel jPanel_Body;
    private javax.swing.JPanel jPanel_Datos;
    private javax.swing.JPanel jPanel_tabla;
    private javax.swing.JPanel jPanel_titulo;
    // End of variables declaration//GEN-END:variables
}
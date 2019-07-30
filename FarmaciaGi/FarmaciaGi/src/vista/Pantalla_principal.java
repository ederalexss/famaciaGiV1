/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Abada Nava
 */
public class Pantalla_principal extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla_principal
     */
    public Pantalla_principal() {
        initComponents();
         cerrar();
         jTextFieldUsuarioLogin.requestFocus();
    }
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(Pantalla_Ventas.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    confirmarSalida();
                }
            });
            this.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void confirmarSalida(){
        Icon icono = new ImageIcon(getClass().getResource("/resources/logo22.png"));
        int valor = JOptionPane.showConfirmDialog(this, "<html><h1 align='center'> ¿Esta seguro de cerrar la aplicacion? </h1></html>","Advertencia",JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"<html><h1 align='center'> Famacia Gi </html>" , "Gracias", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            
        }
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/logo22.png"));


        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogLogin = new javax.swing.JDialog(this, true);
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuarioLogin = new javax.swing.JTextField();
        jButtonSalirLogin = new javax.swing.JButton();
        jButtonIngresarLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPasswordLogin = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelIma = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAdmon = new javax.swing.JMenu();
        jMenuItemGestionEmp = new javax.swing.JMenuItem();
        jMenuItemGestionProveedor = new javax.swing.JMenuItem();
        jMenuItemGestionCliente = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemProductosAdmin = new javax.swing.JMenuItem();
        jMenuItemInformacionSucursal = new javax.swing.JMenuItem();
        jMenuItemBajas = new javax.swing.JMenuItem();
        jMenuItemPromociones = new javax.swing.JMenuItem();
        jMenuItemSettings = new javax.swing.JMenuItem();
        jMenuCajero = new javax.swing.JMenu();
        jMenuItemRealizarVenta = new javax.swing.JMenuItem();
        jMenuItemGrstionGastos = new javax.swing.JMenuItem();
        jMenuItemRealizarCorteCaja = new javax.swing.JMenuItem();
        jMenuItemDevoluciones = new javax.swing.JMenuItem();
        jMenuItemGestionProducto = new javax.swing.JMenuItem();
        jMenuItemRetiro = new javax.swing.JMenuItem();
        jMenuInicioSesion = new javax.swing.JMenu();
        jMenuItemIniciarSesion = new javax.swing.JMenuItem();

        jPanel1.setBackground(new java.awt.Color(0, 184, 233));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Contraseña:");

        jTextFieldUsuarioLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioLoginActionPerformed(evt);
            }
        });

        jButtonSalirLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSalirLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_Log Out_27856.png"))); // NOI18N
        jButtonSalirLogin.setText("Salir");
        jButtonSalirLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirLoginActionPerformed(evt);
            }
        });

        jButtonIngresarLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonIngresarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login_37128 (1).png"))); // NOI18N
        jButtonIngresarLogin.setText("Ingresar");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("¡ Bienvenido !");

        jTextFieldPasswordLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miranda.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonIngresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jButtonSalirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresarLogin)
                    .addComponent(jButtonSalirLogin))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogLoginLayout = new javax.swing.GroupLayout(jDialogLogin.getContentPane());
        jDialogLogin.getContentPane().setLayout(jDialogLoginLayout);
        jDialogLoginLayout.setHorizontalGroup(
            jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialogLoginLayout.setVerticalGroup(
            jDialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        javax.swing.GroupLayout jPanelImaLayout = new javax.swing.GroupLayout(jPanelIma);
        jPanelIma.setLayout(jPanelImaLayout);
        jPanelImaLayout.setHorizontalGroup(
            jPanelImaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );
        jPanelImaLayout.setVerticalGroup(
            jPanelImaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 184, 233));

        jMenuAdmon.setBackground(new java.awt.Color(0, 0, 102));
        jMenuAdmon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin1.png"))); // NOI18N
        jMenuAdmon.setText("ADMINISTRADOR");

        jMenuItemGestionEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados1.png"))); // NOI18N
        jMenuItemGestionEmp.setText("Gestion de Empleados");
        jMenuAdmon.add(jMenuItemGestionEmp);

        jMenuItemGestionProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        jMenuItemGestionProveedor.setText("Gestion de Proveedores");
        jMenuItemGestionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionProveedorActionPerformed(evt);
            }
        });
        jMenuAdmon.add(jMenuItemGestionProveedor);

        jMenuItemGestionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        jMenuItemGestionCliente.setText("Gestion de Clientes");
        jMenuAdmon.add(jMenuItemGestionCliente);

        jMenuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        jMenuItemUsuarios.setText("Gestion de Usuarios");
        jMenuAdmon.add(jMenuItemUsuarios);

        jMenuItemProductosAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medi.png"))); // NOI18N
        jMenuItemProductosAdmin.setText("Gestion Productos");
        jMenuAdmon.add(jMenuItemProductosAdmin);

        jMenuItemInformacionSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_Help_info_notification_information_sign_1886951.png"))); // NOI18N
        jMenuItemInformacionSucursal.setText("Informacion Sucursal");
        jMenuAdmon.add(jMenuItemInformacionSucursal);

        jMenuItemBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bajas.png"))); // NOI18N
        jMenuItemBajas.setText("Baja de medicamento");
        jMenuAdmon.add(jMenuItemBajas);

        jMenuItemPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/promociones.png"))); // NOI18N
        jMenuItemPromociones.setText("Promociones");
        jMenuAdmon.add(jMenuItemPromociones);

        jMenuItemSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N
        jMenuItemSettings.setText("Configuraciones");
        jMenuAdmon.add(jMenuItemSettings);

        jMenuBar1.add(jMenuAdmon);

        jMenuCajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajero1.png"))); // NOI18N
        jMenuCajero.setText("CAJERO");

        jMenuItemRealizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cobro1.png"))); // NOI18N
        jMenuItemRealizarVenta.setText("Ventas");
        jMenuCajero.add(jMenuItemRealizarVenta);

        jMenuItemGrstionGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/egresos1.png"))); // NOI18N
        jMenuItemGrstionGastos.setText("Gastos");
        jMenuCajero.add(jMenuItemGrstionGastos);

        jMenuItemRealizarCorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corteCaja1.png"))); // NOI18N
        jMenuItemRealizarCorteCaja.setText("Realizar Corte de Caja");
        jMenuCajero.add(jMenuItemRealizarCorteCaja);

        jMenuItemDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devoluciones.png"))); // NOI18N
        jMenuItemDevoluciones.setText("Devoluciones");
        jMenuCajero.add(jMenuItemDevoluciones);

        jMenuItemGestionProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medi.png"))); // NOI18N
        jMenuItemGestionProducto.setText("Gestion de Productos");
        jMenuItemGestionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionProductoActionPerformed(evt);
            }
        });
        jMenuCajero.add(jMenuItemGestionProducto);

        jMenuItemRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        jMenuItemRetiro.setText("Retiros");
        jMenuCajero.add(jMenuItemRetiro);

        jMenuBar1.add(jMenuCajero);

        jMenuInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loo4.png"))); // NOI18N
        jMenuInicioSesion.setText("LOGIN");
        jMenuInicioSesion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuInicioSesionItemStateChanged(evt);
            }
        });
        jMenuInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInicioSesionActionPerformed(evt);
            }
        });

        jMenuItemIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login1.png"))); // NOI18N
        jMenuItemIniciarSesion.setText("Iniciar Sesion");
        jMenuInicioSesion.add(jMenuItemIniciarSesion);

        jMenuBar1.add(jMenuInicioSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemGestionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGestionProveedorActionPerformed

    private void jMenuItemGestionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGestionProductoActionPerformed

    private void jButtonSalirLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirLoginActionPerformed

    private void jMenuInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInicioSesionActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuInicioSesionActionPerformed

    private void jMenuInicioSesionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuInicioSesionItemStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuInicioSesionItemStateChanged

    private void jTextFieldUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonIngresarLogin;
    public javax.swing.JButton jButtonSalirLogin;
    public javax.swing.JDialog jDialogLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JMenu jMenuAdmon;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jMenuCajero;
    public javax.swing.JMenu jMenuInicioSesion;
    public javax.swing.JMenuItem jMenuItemBajas;
    public javax.swing.JMenuItem jMenuItemDevoluciones;
    public javax.swing.JMenuItem jMenuItemGestionCliente;
    public javax.swing.JMenuItem jMenuItemGestionEmp;
    public javax.swing.JMenuItem jMenuItemGestionProducto;
    public javax.swing.JMenuItem jMenuItemGestionProveedor;
    public javax.swing.JMenuItem jMenuItemGrstionGastos;
    public javax.swing.JMenuItem jMenuItemInformacionSucursal;
    public javax.swing.JMenuItem jMenuItemIniciarSesion;
    public javax.swing.JMenuItem jMenuItemProductosAdmin;
    public javax.swing.JMenuItem jMenuItemPromociones;
    public javax.swing.JMenuItem jMenuItemRealizarCorteCaja;
    public javax.swing.JMenuItem jMenuItemRealizarVenta;
    public javax.swing.JMenuItem jMenuItemRetiro;
    public javax.swing.JMenuItem jMenuItemSettings;
    public javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelIma;
    public javax.swing.JPasswordField jTextFieldPasswordLogin;
    public javax.swing.JTextField jTextFieldUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}

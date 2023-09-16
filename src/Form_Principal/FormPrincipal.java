/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_Principal;
import Inventario.NewJFrame_Inventario;
import Config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FormPrincipal extends javax.swing.JFrame {

    Conexion con1= new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public FormPrincipal() {
        initComponents();
        Consultar();
        setSize(750,710);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(FormPrincipal.EXIT_ON_CLOSE);
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jPanel_titulo = new javax.swing.JPanel();
        jLabel_control_inventario = new javax.swing.JLabel();
        jLabel_la_tinajita = new javax.swing.JLabel();
        Icono1 = new javax.swing.JLabel();
        jLabel_variedades1 = new javax.swing.JLabel();
        jPane_body = new javax.swing.JPanel();
        jPanel_Datos = new javax.swing.JPanel();
        jPanel_Datos_TXT = new javax.swing.JPanel();
        jLabel_Código_del_producto = new javax.swing.JLabel();
        jLabel_Cantidad = new javax.swing.JLabel();
        jLabel_Nombre_del_Producto = new javax.swing.JLabel();
        jLabel_Precio_del_producto = new javax.swing.JLabel();
        jLabel_Descripción = new javax.swing.JLabel();
        jTextField_Codigo = new javax.swing.JTextField();
        jTextField_Nombre_producto = new javax.swing.JTextField();
        jTextField_Precio_del_producto = new javax.swing.JTextField();
        jTextField_Cantidad = new javax.swing.JTextField();
        jTextField_Descripción = new javax.swing.JTextField();
        jPanel_Operaciones = new javax.swing.JPanel();
        jPanel_Botones = new javax.swing.JPanel();
        jButton_registrar = new javax.swing.JButton();
        jButton_modificar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_Reporte = new javax.swing.JButton();
        jButton_inventario1 = new javax.swing.JButton();
        jButton_limpiar = new javax.swing.JButton();
        jPanel_Busqueda = new javax.swing.JPanel();
        jPanel_Buscar = new javax.swing.JPanel();
        jLabel_Buscar_Código_del_producto = new javax.swing.JLabel();
        jLabel_Buscar_Nombre_del_Producto = new javax.swing.JLabel();
        jTextField_Buscar_codigo = new javax.swing.JTextField();
        jTextField_Buscar_nombre = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jPanel_Tabla = new javax.swing.JPanel();
        jPanel_Base_de_datos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel_titulo.setBackground(new java.awt.Color(167, 226, 50));
        jPanel_titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_control_inventario.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel_control_inventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_control_inventario.setText("Control de Inventario");

        jLabel_la_tinajita.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel_la_tinajita.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_la_tinajita.setText("La Tinajita");
        jLabel_la_tinajita.setToolTipText("");

        Icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/IconTinajita.jpg"))); // NOI18N

        jLabel_variedades1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel_variedades1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_variedades1.setText("Variedades");

        javax.swing.GroupLayout jPanel_tituloLayout = new javax.swing.GroupLayout(jPanel_titulo);
        jPanel_titulo.setLayout(jPanel_tituloLayout);
        jPanel_tituloLayout.setHorizontalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addGroup(jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tituloLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_variedades1))
                    .addGroup(jPanel_tituloLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel_control_inventario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jLabel_la_tinajita)))
                .addGap(18, 18, 18)
                .addComponent(Icono1)
                .addContainerGap())
        );
        jPanel_tituloLayout.setVerticalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Icono1)
                    .addGroup(jPanel_tituloLayout.createSequentialGroup()
                        .addComponent(jLabel_variedades1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_la_tinajita)
                            .addComponent(jLabel_control_inventario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPane_body.setBackground(new java.awt.Color(255, 255, 255));
        jPane_body.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel_Datos.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Datos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        jPanel_Datos_TXT.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Datos_TXT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_Código_del_producto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Código_del_producto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Código_del_producto.setText("Código del Producto:");

        jLabel_Cantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Cantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Cantidad.setText("Cantidad:");

        jLabel_Nombre_del_Producto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Nombre_del_Producto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Nombre_del_Producto.setText("Nombre del Producto:");

        jLabel_Precio_del_producto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Precio_del_producto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Precio_del_producto.setText("Precio del producto:");

        jLabel_Descripción.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Descripción.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Descripción.setText("Descripción:");

        jTextField_Codigo.setEditable(false);

        javax.swing.GroupLayout jPanel_Datos_TXTLayout = new javax.swing.GroupLayout(jPanel_Datos_TXT);
        jPanel_Datos_TXT.setLayout(jPanel_Datos_TXTLayout);
        jPanel_Datos_TXTLayout.setHorizontalGroup(
            jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_TXTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Código_del_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Nombre_del_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Precio_del_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Descripción, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Codigo)
                    .addComponent(jTextField_Nombre_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Precio_del_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Cantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Descripción, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel_Datos_TXTLayout.setVerticalGroup(
            jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Datos_TXTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Código_del_producto)
                    .addComponent(jTextField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre_del_Producto)
                    .addComponent(jTextField_Nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cantidad)
                    .addComponent(jTextField_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Precio_del_producto)
                    .addComponent(jTextField_Precio_del_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Datos_TXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Datos_TXTLayout.createSequentialGroup()
                        .addComponent(jLabel_Descripción)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_Datos_TXTLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField_Descripción)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_DatosLayout = new javax.swing.GroupLayout(jPanel_Datos);
        jPanel_Datos.setLayout(jPanel_DatosLayout);
        jPanel_DatosLayout.setHorizontalGroup(
            jPanel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Datos_TXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_DatosLayout.setVerticalGroup(
            jPanel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DatosLayout.createSequentialGroup()
                .addComponent(jPanel_Datos_TXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_Operaciones.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Operaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        jPanel_Botones.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Botones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_registrar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/agregar.png"))); // NOI18N
        jButton_registrar.setText("Nuevo Registro");
        jButton_registrar.setHideActionText(true);
        jButton_registrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton_registrar.setIconTextGap(10);
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jButton_modificar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/editar.png"))); // NOI18N
        jButton_modificar.setText("Modificar Registro");
        jButton_modificar.setHideActionText(true);
        jButton_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton_modificar.setIconTextGap(10);
        jButton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificarActionPerformed(evt);
            }
        });

        jButton_eliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/eliminar.png"))); // NOI18N
        jButton_eliminar.setText("Eliminar Registro");
        jButton_eliminar.setHideActionText(true);
        jButton_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton_eliminar.setIconTextGap(10);
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jButton_Reporte.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/facturar.png"))); // NOI18N
        jButton_Reporte.setText("Generar Reporte");
        jButton_Reporte.setToolTipText("");
        jButton_Reporte.setHideActionText(true);
        jButton_Reporte.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton_Reporte.setIconTextGap(10);
        jButton_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReporteActionPerformed(evt);
            }
        });

        jButton_inventario1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_inventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/mostrar.png"))); // NOI18N
        jButton_inventario1.setText("Visualizar Inventario");
        jButton_inventario1.setHideActionText(true);
        jButton_inventario1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton_inventario1.setIconTextGap(10);
        jButton_inventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inventario1ActionPerformed(evt);
            }
        });

        jButton_limpiar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/limpiar.png"))); // NOI18N
        jButton_limpiar.setText("Limpiar Campos");
        jButton_limpiar.setHideActionText(true);
        jButton_limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton_limpiar.setIconTextGap(10);
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BotonesLayout = new javax.swing.GroupLayout(jPanel_Botones);
        jPanel_Botones.setLayout(jPanel_BotonesLayout);
        jPanel_BotonesLayout.setHorizontalGroup(
            jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_registrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_inventario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_BotonesLayout.setVerticalGroup(
            jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_inventario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Reporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_limpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_OperacionesLayout = new javax.swing.GroupLayout(jPanel_Operaciones);
        jPanel_Operaciones.setLayout(jPanel_OperacionesLayout);
        jPanel_OperacionesLayout.setHorizontalGroup(
            jPanel_OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_OperacionesLayout.setVerticalGroup(
            jPanel_OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OperacionesLayout.createSequentialGroup()
                .addComponent(jPanel_Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_Busqueda.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        jPanel_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_Buscar_Código_del_producto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Buscar_Código_del_producto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Buscar_Código_del_producto.setText("Código del Producto:");

        jLabel_Buscar_Nombre_del_Producto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_Buscar_Nombre_del_Producto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Buscar_Nombre_del_Producto.setText("Nombre del Producto:");

        jButton_Buscar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form_Principal/buscar.png"))); // NOI18N
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BuscarLayout = new javax.swing.GroupLayout(jPanel_Buscar);
        jPanel_Buscar.setLayout(jPanel_BuscarLayout);
        jPanel_BuscarLayout.setHorizontalGroup(
            jPanel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BuscarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_Buscar_Código_del_producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Buscar_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Buscar_Nombre_del_Producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Buscar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_BuscarLayout.setVerticalGroup(
            jPanel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BuscarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BuscarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel_Buscar_Código_del_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_BuscarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField_Buscar_codigo))
                    .addGroup(jPanel_BuscarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel_Buscar_Nombre_del_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_BuscarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Buscar_nombre)
                            .addComponent(jButton_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel_BusquedaLayout = new javax.swing.GroupLayout(jPanel_Busqueda);
        jPanel_Busqueda.setLayout(jPanel_BusquedaLayout);
        jPanel_BusquedaLayout.setHorizontalGroup(
            jPanel_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_BusquedaLayout.setVerticalGroup(
            jPanel_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BusquedaLayout.createSequentialGroup()
                .addComponent(jPanel_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPane_bodyLayout = new javax.swing.GroupLayout(jPane_body);
        jPane_body.setLayout(jPane_bodyLayout);
        jPane_bodyLayout.setHorizontalGroup(
            jPane_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPane_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPane_bodyLayout.createSequentialGroup()
                        .addComponent(jPanel_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Operaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPane_bodyLayout.setVerticalGroup(
            jPane_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane_bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPane_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Operaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        jPanel_Tabla.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel_Base_de_datos.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Base_de_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_productos);

        javax.swing.GroupLayout jPanel_Base_de_datosLayout = new javax.swing.GroupLayout(jPanel_Base_de_datos);
        jPanel_Base_de_datos.setLayout(jPanel_Base_de_datosLayout);
        jPanel_Base_de_datosLayout.setHorizontalGroup(
            jPanel_Base_de_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Base_de_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel_Base_de_datosLayout.setVerticalGroup(
            jPanel_Base_de_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Base_de_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_TablaLayout = new javax.swing.GroupLayout(jPanel_Tabla);
        jPanel_Tabla.setLayout(jPanel_TablaLayout);
        jPanel_TablaLayout.setHorizontalGroup(
            jPanel_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Base_de_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_TablaLayout.setVerticalGroup(
            jPanel_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Base_de_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPane_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPane_body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        Agregar();
        Consultar();
        Nuevo();
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jButton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificarActionPerformed
        Modificar();
        Consultar();
        Nuevo();
    }//GEN-LAST:event_jButton_modificarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        Eliminar();
        Consultar();
        Nuevo();
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReporteActionPerformed
       Conexion con = new Conexion();
       Connection conn = con.getConnection();
       
        try {
            JasperReport reporte =null;
            String path ="src\\Report\\InventarioReport.jasper";
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton_ReporteActionPerformed

    private void jButton_inventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_inventario1ActionPerformed
            NewJFrame_Inventario frmInventario = new NewJFrame_Inventario();
            frmInventario.setExtendedState(NewJFrame_Inventario.MAXIMIZED_BOTH);
            this.dispose();
            frmInventario.setVisible(true); 
    }//GEN-LAST:event_jButton_inventario1ActionPerformed

    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        Nuevo();
    }//GEN-LAST:event_jButton_limpiarActionPerformed

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
        int fila = jTable_productos.getSelectedRow();
        if (fila==-1){
           jOptionPane1.showMessageDialog(null,"No se encontró el numero de fila"); 
        }
        else{
            idc= Integer.parseInt((String) jTable_productos.getValueAt(fila, 0).toString());
            String nom =(String) jTable_productos.getValueAt(fila, 1);
            float prec = Float.parseFloat(jTable_productos.getValueAt(fila, 2).toString());
            int cant = Integer.parseInt((String) jTable_productos.getValueAt(fila, 3).toString());
            String desc =(String) jTable_productos.getValueAt(fila, 4);
            
            jTextField_Codigo.setText(""+ idc);
            jTextField_Nombre_producto.setText(nom);
            jTextField_Precio_del_producto.setText(""+prec);
            jTextField_Cantidad.setText("" + cant);
            jTextField_Descripción.setText(desc);
            
        }
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        Buscar();
        Nuevo_Buscar();
    }//GEN-LAST:event_jButton_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }
   
    void Agregar(){
        String nom = jTextField_Nombre_producto.getText();
        String prec = jTextField_Precio_del_producto.getText();
        String cant = jTextField_Cantidad.getText();
        String desc = jTextField_Descripción.getText();
        try {
            if (nom.equals("")||prec.equals("")||cant.equals("")||desc.equals("")){
                jOptionPane1.showMessageDialog(null,"Falta ingresar datos");
                LimpiarTabla();
            }
            else{
                String sql = "INSERT INTO `productos` (`nombre`, `preciou`, `cantidad`, `descripcion`) VALUES ('"+nom+"', '"+prec+"', '"+cant+"', '"+desc+"') ";
                conet= con1.getConnection();
                st= conet.createStatement();
                st.executeUpdate(sql);
                jOptionPane1.showMessageDialog(null, "Nuevo registro completado");
                LimpiarTabla();
            }
        }catch(Exception e){
            
        }
    }
    
    void LimpiarTabla(){
        for(int i = 0; i <=jTable_productos.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    void Nuevo(){
        jTextField_Nombre_producto.setText("");
        jTextField_Precio_del_producto.setText("");
        jTextField_Cantidad.setText("");
        jTextField_Descripción.setText("");
        jTextField_Codigo.setText("");
        jTextField_Buscar_codigo.setText("");
        jTextField_Buscar_nombre.requestFocus();
        jTextField_Codigo.requestFocus();
    }
    
    void Nuevo_Buscar(){
        jTextField_Buscar_codigo.setText("");
        jTextField_Buscar_nombre.setText("");
        jTextField_Buscar_codigo.requestFocus();
    }
    
    void Modificar(){
        String nom = jTextField_Nombre_producto.getText();
        String prec = jTextField_Precio_del_producto.getText();
        String cant = jTextField_Cantidad.getText();
        String desc = jTextField_Descripción.getText(); 
        
        try{
            if(nom.equals("")||prec.equals("")||cant.equals("")||desc.equals("")){
                jOptionPane1.showMessageDialog(null, "Faltan ingresar Datos");
                LimpiarTabla();
            }
            else{
                String sql = "UPDATE `productos` SET `cod`='" + idc + "', `nombre`='" + nom + "', `preciou`='" + prec + "', `cantidad`='" + cant + "', `descripcion`='" + desc + "' WHERE `productos`.`cod`=" + idc;
                conet= con1.getConnection();
                st= conet.createStatement();
                st.executeUpdate(sql); 
                jOptionPane1.showMessageDialog(null, "Datos del productos modificados");
                LimpiarTabla();
            }
            
        }
        catch(Exception e){
            
        }
    }
    
    void Eliminar(){
         int fila=jTable_productos.getSelectedRow();
        try{
            if(fila<0){
                jOptionPane1.showMessageDialog(null, "Producto no seleccionado");
                LimpiarTabla();
            }else{
                jOptionPane1.showMessageDialog(null, "¿Desea Eliminar el Producto?");
                String sql="DELETE FROM productos WHERE `productos`.`cod` = "+idc;
                conet= con1.getConnection();
                st= conet.createStatement();
                st.executeUpdate(sql); 
                LimpiarTabla();
            }
        }catch(Exception e){
            
        }
    }
    
    void Buscar(){
    String bcod = jTextField_Buscar_codigo.getText();
    String bnom = jTextField_Buscar_nombre.getText();
    try {
        if (bcod.equals("") && bnom.equals("")) {
            jOptionPane1.showMessageDialog(null, "Faltan ingresar Datos");
            LimpiarTabla();
        } else {
            String sql = "SELECT * FROM productos WHERE ";
            boolean condiciones = false;
                
            if (!bcod.isEmpty()) {
                sql += "cod = '" + bcod + "'";
                condiciones = true;
            }
            
            if (!bnom.isEmpty()) {
                if (condiciones) {
                    sql += " OR ";
                }
                sql += "nombre LIKE '" + bnom + "%'";
            }
            
            try {
                conet = con1.getConnection();
                st = conet.createStatement();
                rs = st.executeQuery(sql);
                
                Object[] productos = new Object[5];
                modelo = (DefaultTableModel) jTable_productos.getModel();
                modelo.setRowCount(0); // Limpia la tabla antes de agregar resultados
                
                boolean resultadosEncontrados = false; // Bandera para verificar si se encontraron resultados
                
                while (rs.next()) {
                    resultadosEncontrados = true; // Se encontraron resultados
                    productos[0] = rs.getInt("cod");
                    productos[1] = rs.getString("nombre");
                    productos[2] = rs.getFloat("preciou");
                    productos[3] = rs.getInt("cantidad");
                    productos[4] = rs.getString("descripcion");
                    
                    modelo.addRow(productos);
                }
                
                jTable_productos.setModel(modelo);
                
                if (!resultadosEncontrados) {
                    jOptionPane1.showMessageDialog(null, "No se encontraron registros que coincidan con los criterios de búsqueda.");
                }
                
            } catch (SQLException e) {
                // Manejar excepciones de SQL
            }
        }
    } catch (Exception e) {
        // Manejar otras excepciones
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono1;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Reporte;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_inventario1;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JButton jButton_modificar;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JLabel jLabel_Buscar_Código_del_producto;
    private javax.swing.JLabel jLabel_Buscar_Nombre_del_Producto;
    private javax.swing.JLabel jLabel_Cantidad;
    private javax.swing.JLabel jLabel_Código_del_producto;
    private javax.swing.JLabel jLabel_Descripción;
    private javax.swing.JLabel jLabel_Nombre_del_Producto;
    private javax.swing.JLabel jLabel_Precio_del_producto;
    private javax.swing.JLabel jLabel_control_inventario;
    private javax.swing.JLabel jLabel_la_tinajita;
    private javax.swing.JLabel jLabel_variedades1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPane_body;
    private javax.swing.JPanel jPanel_Base_de_datos;
    private javax.swing.JPanel jPanel_Botones;
    private javax.swing.JPanel jPanel_Buscar;
    private javax.swing.JPanel jPanel_Busqueda;
    private javax.swing.JPanel jPanel_Datos;
    private javax.swing.JPanel jPanel_Datos_TXT;
    private javax.swing.JPanel jPanel_Operaciones;
    private javax.swing.JPanel jPanel_Tabla;
    private javax.swing.JPanel jPanel_titulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_productos;
    private javax.swing.JTextField jTextField_Buscar_codigo;
    private javax.swing.JTextField jTextField_Buscar_nombre;
    private javax.swing.JTextField jTextField_Cantidad;
    private javax.swing.JTextField jTextField_Codigo;
    private javax.swing.JTextField jTextField_Descripción;
    private javax.swing.JTextField jTextField_Nombre_producto;
    private javax.swing.JTextField jTextField_Precio_del_producto;
    // End of variables declaration//GEN-END:variables

    void Consultar() {
        String sql= "select * from productos";
        try{
            conet= con1.getConnection();
            st= conet.createStatement();
            rs= st.executeQuery(sql);  
            Object[] productos = new Object[5];
            modelo= (DefaultTableModel) jTable_productos.getModel();
            while (rs.next()){
                productos[0]=rs.getInt("cod");
                productos[1]=rs.getString("nombre");
                productos[2]=rs.getFloat("preciou");
                productos[3]=rs.getInt("cantidad");
                productos[4]=rs.getString("descripcion");
                
                modelo.addRow(productos);
            }
            jTable_productos.setModel(modelo);
        }
        catch(SQLException e){
            
        }
    }
}

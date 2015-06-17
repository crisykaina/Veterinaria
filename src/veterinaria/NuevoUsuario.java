/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbelSanz
 */
public class NuevoUsuario extends javax.swing.JFrame {
DefaultTableModel modelo;
    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    conectar con = new conectar();
      Connection reg =con.conexion();
      
      void Generarnumeracion()
    {
     String SQL="select max(ID_usuario) from usuario";
       // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        
          int c=0;
          int b=0;
        try {
           Statement st = reg.createStatement();
           ResultSet rs=st.executeQuery(SQL);
            while(rs.next())
            {              
                 c=rs.getInt(1);
            }
            
           
            if(c==0){
                txtID.setText("1");
            }
            else
            {
                
                txtID.setText(""+(c+1));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
void mostrarusuarios(){
   String [] titulos= {"id","USUARIO","TIPO USUARIO"};//CREAMOS UN ARREGLO PARA LA TABLA
   modelo=new  DefaultTableModel(null,titulos);   
   String datos []= new String[5];
   String sql="SELECT * FROM  usuario"; //CONSULTAMOPS A LA BASE DE DATOS
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString("ID_usuario");
                datos[1]=rs.getString("nick");
                datos[2]= rs.getString("tipo_usuario");
                modelo.addRow(datos);
            }
            tbusuario.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }}
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
        txtID = new javax.swing.JTextField();
        txtNICK = new javax.swing.JTextField();
        txtCONTRASEÑA = new javax.swing.JTextField();
        jCTIPOUSUARIO = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtCONTRA = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nuevo Usuario");

        jLabel2.setText("ID:");

        jLabel3.setText("NICK:");

        jLabel4.setText("Password:");

        jLabel5.setText("Tipo Usuario:");

        jCTIPOUSUARIO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..", "Administrador", "Invitado" }));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbusuario);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(46, 46, 46))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(60, 60, 60)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNICK, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(txtID)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCONTRASEÑA, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jCTIPOUSUARIO, 0, 1, Short.MAX_VALUE))))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNICK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jCTIPOUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(txtCONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      String id,contra,nick,tipousu;
      String sql;
      tipousu= jCTIPOUSUARIO.getSelectedItem().toString();
      id=txtID.getText();
      contra = txtCONTRASEÑA.getText();
      nick= txtNICK.getText();
      
      sql="INSERT INTO usuario(nick,contraseña,tipo_usuario)VALUES(?,?,?)";
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            
            pst.setString(1,nick);
            pst.setString(2,contra);
            pst.setString(3,tipousu);
           
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registrado con exito");
                mostrarusuarios();
                txtNICK.setText(null);
                txtCONTRASEÑA.setText(null);
                jCTIPOUSUARIO.setSelectedIndex(0);
                Generarnumeracion();
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "Error");
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(prueba1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int fila= tbusuario.getSelectedRow();
    if(fila<0)
    {
        JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
    }
    else
    {
         idfila= tbusuario.getValueAt(fila, 0).toString();
         JOptionPane.showMessageDialog(this, "debe Ingresar la Contraseña para Eliminar algun Usuario");
         txtCONTRA.requestFocus();
    }
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String compara="";
    String contra="";
    contra= new String(txtCONTRASEÑA.getText());
    
    String cap="";
    System.out.print(cap);
    String sql="SELECT * FROM usuario WHERE nick='"+cap+"'";
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
            compara=rs.getString("contraseña");
            }
          System.out.println(compara);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
          if(compara.equals(contra))
            {
                
                String eli="DELETE FROM usuario WHERE ID_usuario = '"+idfila+"'";
                PreparedStatement pst;
            try {
                pst = reg.prepareStatement(eli);
                  int m=pst.executeUpdate();
                if(m>0){
                    JOptionPane.showMessageDialog(this, "elimino regisro");
                     mostrarusuarios();
                     txtCONTRA.setText(null);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar");
                    mostrarusuarios();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
              
            }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jCTIPOUSUARIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbusuario;
    private javax.swing.JPasswordField txtCONTRA;
    private javax.swing.JTextField txtCONTRASEÑA;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNICK;
    // End of variables declaration//GEN-END:variables
String idfila="";
}

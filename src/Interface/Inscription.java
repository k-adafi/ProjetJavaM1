/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import miaproject.database;

/**
 *
 * @author KADAFI Ben
 */
public class Inscription extends javax.swing.JFrame {

    
    private Connection connect;
    
    private PreparedStatement prepare;
    
    private Statement statement;
    
    private ResultSet result;
    
    /**
     * Creates new form Inscription
     */
    public Inscription() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inscrptSeconnecterBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        inscrptEmailTextfield = new javax.swing.JTextField();
        inscrptPasswordTextfield = new javax.swing.JPasswordField();
        inscrptInscriptionBtn = new javax.swing.JButton();
        inscrptNomTextfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 2, 48)); // NOI18N
        jLabel3.setText("GRAPHICAL");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setText("GOOD DESING ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 190));

        inscrptSeconnecterBtn.setBackground(new java.awt.Color(204, 255, 255));
        inscrptSeconnecterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log-in.png"))); // NOI18N
        inscrptSeconnecterBtn.setText("Se connecter");
        inscrptSeconnecterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscrptSeconnecterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscrptSeconnecterBtnMouseClicked(evt);
            }
        });
        inscrptSeconnecterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrptSeconnecterBtnActionPerformed(evt);
            }
        });
        jPanel2.add(inscrptSeconnecterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 230, 40));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vous avez déjà un compte!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(136, 157, 236));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenue");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tonga soa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 10, 30));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S'inscrire");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 30));

        inscrptEmailTextfield.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        inscrptEmailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrptEmailTextfieldActionPerformed(evt);
            }
        });
        jPanel1.add(inscrptEmailTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 230, 30));

        inscrptPasswordTextfield.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jPanel1.add(inscrptPasswordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 30));

        inscrptInscriptionBtn.setBackground(new java.awt.Color(204, 255, 255));
        inscrptInscriptionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-user.png"))); // NOI18N
        inscrptInscriptionBtn.setText("Inscription");
        inscrptInscriptionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscrptInscriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrptInscriptionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(inscrptInscriptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, 40));

        inscrptNomTextfield.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        inscrptNomTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrptNomTextfieldActionPerformed(evt);
            }
        });
        jPanel1.add(inscrptNomTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscrptSeconnecterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrptSeconnecterBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscrptSeconnecterBtnActionPerformed

    private void inscrptEmailTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrptEmailTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscrptEmailTextfieldActionPerformed

    private void inscrptInscriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrptInscriptionBtnActionPerformed
        // TODO add your handling code here:
        
        String sql = "INSERT INTO admin"
                + "(nomA, EmailA, passwordA)"
                + "VALUES(?,?,?)";
        
        connect = database.ConnectDb();
        
        try{     
            JOptionPane alert;
            
            if(inscrptNomTextfield.getText().isEmpty()
                    || inscrptEmailTextfield.getText().isEmpty()
                    || inscrptPasswordTextfield.getText().isEmpty())
            { 
                alert = new JOptionPane(JOptionPane.ERROR_MESSAGE);
                alert.showMessageDialog(null, "S'il vous plaît, vous devez remplir ces formulaires!");
                
            }else if(inscrptPasswordTextfield.getText().length() < 8){
                
               alert = new JOptionPane(JOptionPane.ERROR_MESSAGE);
               alert.showMessageDialog(null, "Le mot de passe doit être au minimum à 08 carractères!");
            
            }else{
                String check = "SELECT nomA FROM admin WHERE nomA = '"
                        +inscrptNomTextfield.getText()+"'";
                
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                
                if(result.next()){
                   alert = new JOptionPane(JOptionPane.ERROR_MESSAGE);
                   alert.showMessageDialog(null, "Cette utilisateur " +inscrptNomTextfield.getText()+" existe déjà!");
                }
                else
                {
                    prepare = connect.prepareStatement(sql);
                    prepare.setString(1, inscrptNomTextfield.getText());
                    prepare.setString(2, inscrptEmailTextfield.getText());
                    prepare.setString(3, inscrptPasswordTextfield.getText());
                    prepare.executeUpdate();
                    
                       
                    alert = new JOptionPane(JOptionPane.INFORMATION_MESSAGE);
                    alert.showMessageDialog(null, "Utilisateur ajouter avec succès!");
                    
                    inscrptNomTextfield.setText("");
                    inscrptEmailTextfield.setText("");
                    inscrptPasswordTextfield.setText("");
                }
            
            }
            
        }catch(Exception e){e.printStackTrace();}
        
    }//GEN-LAST:event_inscrptInscriptionBtnActionPerformed

    private void inscrptNomTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrptNomTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscrptNomTextfieldActionPerformed

    private void inscrptSeconnecterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrptSeconnecterBtnMouseClicked
        // TODO add your handling code here:
        Inscription.super.dispose();
        Connecter connect = new Connecter();
        connect.setVisible(true);
    }//GEN-LAST:event_inscrptSeconnecterBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inscrptEmailTextfield;
    private javax.swing.JButton inscrptInscriptionBtn;
    private javax.swing.JTextField inscrptNomTextfield;
    private javax.swing.JPasswordField inscrptPasswordTextfield;
    private javax.swing.JButton inscrptSeconnecterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
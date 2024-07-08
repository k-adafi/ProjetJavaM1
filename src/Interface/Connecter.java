/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import miaproject.database;

/**
 *
 * @author KADAFI Ben
 */
public class Connecter extends javax.swing.JFrame {

    /**
     * Creates new form Connecter
     */
    
    private Connection connect;
    
    private PreparedStatement prepare;
    
    private Statement statement;
    
    private ResultSet result;
    
    public Connecter() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        try {
            jPanelSeConnecter =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "Interface.Connecter_jPanelSeConnecter");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        connectNomTxtfield = new javax.swing.JTextField();
        connectPasswordTxtfield = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        connectMotDePasseOublierBtn = new javax.swing.JLabel();
        connectConnexionBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        connectInscriptionBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSeConnecter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        connectNomTxtfield.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        connectNomTxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectNomTxtfieldActionPerformed(evt);
            }
        });
        jPanelSeConnecter.add(connectNomTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 230, 30));

        connectPasswordTxtfield.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        connectPasswordTxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectPasswordTxtfieldActionPerformed(evt);
            }
        });
        jPanelSeConnecter.add(connectPasswordTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 30));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tonga soa");
        jPanelSeConnecter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Mot de passe:");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelSeConnecter.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 230, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanelSeConnecter.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 10, 30));

        connectMotDePasseOublierBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        connectMotDePasseOublierBtn.setForeground(new java.awt.Color(255, 255, 255));
        connectMotDePasseOublierBtn.setText("Mot de passe oublier?");
        connectMotDePasseOublierBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        connectMotDePasseOublierBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectMotDePasseOublierBtnMouseClicked(evt);
            }
        });
        jPanelSeConnecter.add(connectMotDePasseOublierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        connectConnexionBtn.setBackground(new java.awt.Color(204, 255, 255));
        connectConnexionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log-in.png"))); // NOI18N
        connectConnexionBtn.setText("Connexion");
        connectConnexionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        connectConnexionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectConnexionBtnMouseClicked(evt);
            }
        });
        connectConnexionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectConnexionBtnActionPerformed(evt);
            }
        });
        jPanelSeConnecter.add(connectConnexionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 230, 40));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bienvenue");
        jPanelSeConnecter.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Se connecter");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelSeConnecter.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 30));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Nom:");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelSeConnecter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 230, 20));

        getContentPane().add(jPanelSeConnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 400));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vous n'avez pas encore un compte!");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 210, -1));

        connectInscriptionBtn.setBackground(new java.awt.Color(204, 255, 255));
        connectInscriptionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-user.png"))); // NOI18N
        connectInscriptionBtn.setText("S'inscrire");
        connectInscriptionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        connectInscriptionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectInscriptionBtnMouseClicked(evt);
            }
        });
        connectInscriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectInscriptionBtnActionPerformed(evt);
            }
        });
        jPanel3.add(connectInscriptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 230, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 2, 48)); // NOI18N
        jLabel3.setText("GRAPHICAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setText("GOOD DESING ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 190));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectNomTxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectNomTxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connectNomTxtfieldActionPerformed

    private void connectInscriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectInscriptionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connectInscriptionBtnActionPerformed

    private void connectConnexionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectConnexionBtnActionPerformed
        
        // TODO add your handling code here:
        String sql = "SELECT * FROM admin WHERE nomA = ? and passwordA = ? ";
        
        connect = (Connection) database.ConnectDb();

        try{
           prepare = connect.prepareStatement(sql);
           prepare.setString(1, connectNomTxtfield.getText());
           prepare.setString(2, connectPasswordTxtfield.getText());
           
           result = prepare.executeQuery();
           JOptionPane alert;
           
           if(connectNomTxtfield.getText().isEmpty() || connectPasswordTxtfield.getText().isEmpty()){
               alert = new JOptionPane(JOptionPane.ERROR_MESSAGE);
               alert.showMessageDialog(null, "S'il vous plaît, vous devez d'abord complétez ces formulaires.");
               
           }else{
               if(result.next()){
                   getData.username = connectNomTxtfield.getText();
                   
                   alert = new JOptionPane(JOptionPane.INFORMATION_MESSAGE);
                   alert.showMessageDialog(null, "Connexion réussi!");
                   
                   Connecter.super.dispose();
                   Dashboard dash = new Dashboard();
                   dash.setVisible(true);
                    
                }else{
                   alert = new JOptionPane(JOptionPane.ERROR_MESSAGE);
                   alert.showMessageDialog(null, "Une de ces informations est incorecte");
                }
               
           }
           
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_connectConnexionBtnActionPerformed

    
//    //Pour switch forme dans le menu demmarer
//    public void switchFormConnect(ActionEvent event){
//        
//        if (event.getSource() == connectMotDePasseOublierBtn) {
//            jPanelMotdePasseOublier.setVisible(true);
//            jPanelSeConnecter.setVisible(false);
//
//        } else if (event.getSource() == changePasswordRetourBtn) {
//            jPanelMotdePasseOublier.setVisible(false);
//            jPanelSeConnecter.setVisible(true);
//        }
//        
//    }
//    
    
//    private void connectConnexionBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                    
//    // Afficher la boîte de dialogue de confirmation
//    int response = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir vous connecter ?", "Message de confirmation",
//                                                 JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//    
//    // Si l'utilisateur clique sur "Oui"
//    if (response == JOptionPane.YES_OPTION) {
//        String sql = "SELECT * FROM admin WHERE nomA = ? and passwordA = ? ";
//        
//        connect = (Connection) Database.connectDb();
//
//        try {
//            PreparedStatement prepare = connect.prepareStatement(sql);
//            prepare.setString(1, connectNomTxtfield.getText());
//            prepare.setString(2, connectPasswordTxtfield.getText());
//
//            ResultSet result = prepare.executeQuery();
//            JOptionPane alert;
//
//            if (connectNomTxtfield.getText().isEmpty() || connectPasswordTxtfield.getText().isEmpty()) {
//                alert = new JOptionPane(JOptionPane.ERROR_MESSAGE);
//                alert.showMessageDialog(null, "S'il vous plaît, vous devez d'abord compléter ces formulaires.");
//                
//            } else {
//                if (result.next()) {
//                    getData.username = connectNomTxtfield.getText();
//
//                    alert = new JOptionPane(JOptionPane.INFORMATION_MESSAGE);
//                    alert.showMessageDialog(null, "Connexion réussie!");
//
//                    // Fermer la fenêtre actuelle et ouvrir le tableau de bord
//                    Connecter.super.dispose();
//                    Dashboard dash = new Dashboard();
//                    dash.setVisible(true);
//
//                } else {
//                    alert = new JOptionPane(JOptionPane.ERROR_MESSAGE);
//                    alert.showMessageDialog(null, "Une de ces informations est incorrecte");
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    } else {
//        // Si l'utilisateur clique sur "Non"
//        JOptionPane.showMessageDialog(null, "Connexion annulée");
//    }
//}

    
    
    
    private void connectInscriptionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectInscriptionBtnMouseClicked
        // TODO add your handling code here:
        Connecter.super.dispose();
        Inscription insc = new Inscription();
        insc.setVisible(true);
    }//GEN-LAST:event_connectInscriptionBtnMouseClicked

    private void connectConnexionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectConnexionBtnMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_connectConnexionBtnMouseClicked

    private void connectPasswordTxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectPasswordTxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connectPasswordTxtfieldActionPerformed

    private void connectMotDePasseOublierBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectMotDePasseOublierBtnMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_connectMotDePasseOublierBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connecter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectConnexionBtn;
    private javax.swing.JButton connectInscriptionBtn;
    private javax.swing.JLabel connectMotDePasseOublierBtn;
    private javax.swing.JTextField connectNomTxtfield;
    private javax.swing.JPasswordField connectPasswordTxtfield;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelSeConnecter;
    // End of variables declaration//GEN-END:variables
}

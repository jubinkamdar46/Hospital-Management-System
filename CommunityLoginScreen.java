
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 
 */
public class CommunityLoginScreen extends javax.swing.JFrame {
    ArrayList<CommunityAdmin> community = new ArrayList<CommunityAdmin>();
    /**
     * Creates new form CommunityLogin
     */
    public CommunityLoginScreen() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    private void clearAllFields(){
        communityID.setText("");
        communityEmail.setText("");
        communityPass.setText("");
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
        Community_ID = new javax.swing.JLabel();
        Community_Email = new javax.swing.JLabel();
        CommunityPassword = new javax.swing.JLabel();
        communityID = new javax.swing.JTextField();
        communityEmail = new javax.swing.JTextField();
        communityPass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Community_ID.setText("Community_ID:");

        Community_Email.setText("Community_Email:");

        CommunityPassword.setText("Password:");

        communityID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityIDActionPerformed(evt);
            }
        });

        communityEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityEmailActionPerformed(evt);
            }
        });

        communityPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityPassActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(87, 87, 87)
                        .addComponent(Login)
                        .addGap(73, 73, 73)
                        .addComponent(Clear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CommunityPassword)
                            .addComponent(Community_Email))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(communityEmail)
                            .addComponent(communityPass, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Community_ID)
                        .addGap(36, 36, 36)
                        .addComponent(communityID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Community_ID)
                    .addComponent(communityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Community_Email)
                    .addComponent(communityEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommunityPassword)
                    .addComponent(communityPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(Back)
                    .addComponent(Clear))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void communityIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityIDActionPerformed

    private void communityPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityPassActionPerformed

    private void communityEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityEmailActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
         String idPattern ="[0-9]+";
        String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean loginUser=false;
        CommunityAdmin cd1 = new CommunityAdmin(101,"admin","123Admin","admin@gmail.com");
        CommunityAdmin cd2 = new CommunityAdmin(102,"admin1","123Admin","admin1@gmail.com");
        CommunityAdmin cd3 = new CommunityAdmin(103,"admin2","123Admin","admin2@gmail.com");
        CommunityAdmin cd4 = new CommunityAdmin(104,"admin3","123Admin","admin3@gmail.com");
        community.add(cd1);
        community.add(cd2);
        community.add(cd3);
        community.add(cd4);
        String cpass = new String(communityPass.getPassword());
        String cemail = communityEmail.getText();
         
        if (communityID.getText().isEmpty() | communityEmail.getText().isEmpty() | communityPass.getPassword().length==0){
            JOptionPane.showMessageDialog(this, "Please Fill all the fields" , "Warning", JOptionPane.ERROR_MESSAGE);
        }else if(!communityID.getText().matches(idPattern)){
            JOptionPane.showMessageDialog(this, "Enter valid ID", "Warning", JOptionPane.ERROR_MESSAGE);
        }else if(!communityEmail.getText().matches(emailPattern)){
            JOptionPane.showMessageDialog(this, "Enter valid Email", "Warning", JOptionPane.ERROR_MESSAGE);
        }//password validation left
        else{
            for(CommunityAdmin com : community){
               if (com.email.equals(cemail) && com.password.equals(cpass)) {
                    loginUser = true;
                    break;
                } else {
                    loginUser = false;
                }
            }
        if(loginUser == true){
             JOptionPane.showMessageDialog(this, "Login Successfull", "Warning", JOptionPane.ERROR_MESSAGE);
             CommunityLoginScreen cl = new CommunityLoginScreen();
             CommunityMainScreen cm = new CommunityMainScreen();
             cl.setVisible(false);
             cm.setVisible(true);
             super.dispose();
        }else{
             JOptionPane.showMessageDialog(this, "Enter Valid Email and Password", "Warning", JOptionPane.ERROR_MESSAGE);

        }
        clearAllFields();
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clearAllFields();
    }//GEN-LAST:event_ClearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CommunityLoginScreen cl = new CommunityLoginScreen();
        MainLoginScreen ms = new MainLoginScreen();
        ms.setVisible(true);
        cl.setVisible(false);
        super.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel CommunityPassword;
    private javax.swing.JLabel Community_Email;
    private javax.swing.JLabel Community_ID;
    private javax.swing.JButton Login;
    private javax.swing.JTextField communityEmail;
    private javax.swing.JTextField communityID;
    private javax.swing.JPasswordField communityPass;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

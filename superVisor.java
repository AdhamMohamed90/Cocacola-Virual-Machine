/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adhamcocacolavm;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author DELL
 */
public class superVisor extends javax.swing.JFrame {

    /**
     * Creates new form superVisor
     */
    public superVisor() {
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
        user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("USER NAME :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 120, 130, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 210, 130, 22);

        user.setBackground(new java.awt.Color(0, 102, 255));
        user.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(user);
        user.setBounds(220, 120, 360, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 290, 90, 40);

        password.setBackground(new java.awt.Color(0, 102, 255));
        password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(password);
        password.setBounds(220, 210, 360, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adhamcocacolavm/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 630, 430);

        setSize(new java.awt.Dimension(642, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addingFrame a = new addingFrame();//object from adding frame 

        String userName = user.getText();//return text of user name
        String Password = String.valueOf(password.getPassword());//return text of password and convert to string
        
//check on user name and password
//================================
        if (!(userName.equals("supervisor")) && Password.equals("159753")) {
            JOptionPane.showMessageDialog(null, "user name is wrong");
        } else if (userName.equals("supervisor") && !(Password.equals("159753"))) {
            JOptionPane.showMessageDialog(null, "password is wrong");
        } else if (userName.equals("supervisor") && Password.equals("159753")) {
            this.setVisible(false);
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "both is wrong");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(superVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(superVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(superVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(superVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new superVisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

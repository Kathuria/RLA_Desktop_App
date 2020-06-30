package rlaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Avi
 */
public class User_Details extends javax.swing.JFrame {
    /**
     * Creates new form User_Details
     */
    Connection con;
    public User_Details() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        myconnection_class mycon1=new myconnection_class();
        if(mycon1.my_connection_status()==true)
        {
            con=mycon1.get_my_connection();
            //JOptionPane.showMessageDialog(rootPane, "connected");
        }
         else
        {
            JOptionPane.showMessageDialog(rootPane, mycon1.errmsg().toString());
         }
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t1 = new javax.swing.JComboBox();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Get = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Details");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("City:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 58, 20));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 280, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 280, -1));

        jLabel5.setText("Gender:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 58, 22));

        jLabel10.setText("Univ. Roll No.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, -1));

        jLabel4.setText("Email Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 112, 23));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 280, -1));

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 112, 23));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        Get.setText("Get Details");
        Get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetActionPerformed(evt);
            }
        });
        getContentPane().add(Get, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 112, 23));

        jLabel7.setText("DOB:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 58, 17));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 280, -1));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 280, -1));

        jLabel9.setText("College");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rlaproject/rla_images/user-login.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jButton1.setText("Get Roll No.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new admin_data().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void GetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetActionPerformed
        try
        {
            PreparedStatement pstmt=con.prepareStatement("select * from Administrator where UnivRoll='"+(String)t1.getSelectedItem()+"'");
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                String d1 = rs.getString("AdminName");
                String d2 = rs.getString("AdminLastName");
                String d3 = rs.getString("E-mailId");
                String d4 = rs.getString("Gender");
                String d5 = rs.getString("City");
                String d6 = rs.getString("DOB");
                String d7 = rs.getString("College");
                t2.setText(d1);
                t3.setText(d2);
                t4.setText(d3);
                t5.setText(d4);
                t6.setText(d5);
                t7.setText(d6);
                t8.setText(d7);
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Sorry you are not authorised");
            }
        }
        catch(Exception ob)
        {
            System.out.println(ob.toString());

        }
    }//GEN-LAST:event_GetActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {      
            Statement my_statement =con.createStatement();
            String str="select UnivRoll from Administrator";
            ResultSet my_result=my_statement.executeQuery(str);
           while( my_result.next())
           {
            t1.addItem(my_result.getString(1));
           } 
        } catch (SQLException ex) {
            Logger.getLogger(User_Details.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Details().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Get;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    // End of variables declaration//GEN-END:variables
}

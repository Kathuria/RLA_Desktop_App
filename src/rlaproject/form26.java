package rlaproject;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import org.apache.commons.io.FileUtils;
/**
 *
 * @author Avi Kathuria
 */
public class form26 extends javax.swing.JFrame {

    /** Creates new form form26 */
    Connection con;
    public form26() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        myconnection_class mycon1=new myconnection_class();
         if(mycon1.my_connection_status()==true)
         {
             con=mycon1.get_my_connection();
            // JOptionPane.showMessageDialog(rootPane, "connected");
         }
          else
         {
             JOptionPane.showMessageDialog(rootPane, mycon1.errmsg().toString());
          }   

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        certificate = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("FORM 26");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel2.setText("Intimation of loss or Destruction etc. of the Certificate of Registration and Application for the ");

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel5.setText("issue of Duplicate Certificate of Registration");

        jLabel7.setText("To");

        jLabel8.setText("The registering Authority");

        jLabel9.setText("Sir,");

        jLabel10.setText("The Certificate of Registration of my/our Motor Vehicle the Registration make of which is");

        jLabel11.setText("has been lost / destroyed /completely written of / soiled / torn mutilated in the");

        jLabel12.setText("following circumstances:");

        jLabel13.setText("I / We hereby declare that to the best of my / our knowledge the registration of vehicle has not been");

        jLabel14.setText("suspended or cancelled under the provisions of the Act or Rules made there under and the circumstances");

        jLabel15.setText("explained above are true.");

        jLabel16.setText("- I/We do hereby apply for the issue of a duplicate Certificate of Registration.");

        jLabel17.setText("- The written off / soiled / torn mutilated Certificates of Registration is enclosed.");

        jLabel18.setText("- The vehicle is not held under any agreement of Hire Purchase / Lease / Hypothecation.");

        jLabel19.setText("- I/We have reported the loss to the Police Station on");

        jLabel20.setText("(date)");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel22.setText("Name");

        jLabel23.setText("Address");

        jLabel25.setText("- The vehicle is held under Hire/Purchase/Lease /Hypothecation agreement with and the 'No Objection");

        jLabel27.setText("Certificate' obtained from the financier is enclosed.");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        certificate.setText("File Upload");
        certificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificateActionPerformed(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rlaproject/rla_images/Icon.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(certificate)
                                .addGap(226, 226, 226)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(Submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addComponent(jLabel36))
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel17)
                .addGap(6, 6, 6)
                .addComponent(jLabel18)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(6, 6, 6)
                .addComponent(jLabel27)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(certificate))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(Submit)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
          try
    {
            int d1_len=t1.getText().length();
            int d2_len=t2.getText().length();
            int d3_len=t3.getText().length();
            int d4_len=t4.getText().length();
            int d5_len=t5.getText().length();
            int d6_len=t6.getText().length();
             if(d1_len==0 || d2_len==0 || d3_len==0 || d4_len==0 || d5_len==0 || d6_len==0)
             {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Required Fields to Submit the Form");
                if(d1_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Authority Name ");
                } 
                else if(d2_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Reg. Make");
                } 
                else  if(d3_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Circumstances");
                } 
                else if(d4_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Date of Report");
                }  
                else if(d5_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert your Name");
                }  
                else if(d6_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert your Address");
                }      
            }
            else
            { 
          int res=JOptionPane.showConfirmDialog(null,"Want to Submit Form","Info",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if(res==JOptionPane.OK_OPTION)
            {
                PreparedStatement pstmt=con.prepareStatement("insert into form26 values(?,?,?,?,?,?,?,?)");
                pstmt.setString(1,(t1.getText()));
                pstmt.setString(2,(t2.getText()));
                pstmt.setString(3,(t3.getText()));
                pstmt.setString(4,(t4.getText()));

                java.util.Date d1=new java.util.Date();
                String newdate=new SimpleDateFormat("dd/MM/yyyy").format(d1);
                pstmt.setString(5,newdate); 

                pstmt.setString(6,(t5.getText()));
                pstmt.setString(7,(t6.getText()));
                pstmt.setString(8,(f2.getPath()));
                pstmt.executeUpdate();    
                FileUtils.copyFileToDirectory(f1, f2);
               new main().setVisible(true);
                 dispose();
            }
        }    
    }                                     
         catch(Exception obj)
        {
             System.out.println(obj.toString());
            JOptionPane.showMessageDialog(rootPane, "Please Upload Required File in the Form");
        } 
        
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");    
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    File f1,f2;
    private void certificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificateActionPerformed
        JFileChooser JFC = new JFileChooser();

        if( JFC.showOpenDialog(null)==0)
        {

            f1=new File(JFC.getSelectedFile().toString());
            f2=new File("C:\\rlaproject\\Uploaded_Files");
        }
    }//GEN-LAST:event_certificateActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(form25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form26().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Submit;
    private javax.swing.JButton certificate;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables

}

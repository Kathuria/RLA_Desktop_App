package rlaproject;

import java.io.File;
import javax.swing.ButtonGroup;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import java.text.SimpleDateFormat;
/**
 *
 * @author Avi Kathuria
 */
public class form4a extends javax.swing.JFrame {

    /**
     * Creates new form form4a
     */
    public form4a() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        b3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        b2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        b5 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        b6 = new javax.swing.JComboBox();
        h3 = new javax.swing.JCheckBox();
        h2 = new javax.swing.JCheckBox();
        h4 = new javax.swing.JCheckBox();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        b1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        g1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        h1 = new javax.swing.JCheckBox();
        b4 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        certificate1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        certificate2 = new javax.swing.JButton();
        certificate3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Licensing Form");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("RH FACTOR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        b3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RH+", "RH-" }));
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("BLOOD GROUP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        b2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel16.setText("DISQUALIFIED FOR OBTANING A DRIVING LISENCE TO DRIVE  ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setText("PREVIOUSLY HELD INTERNATIONAL DRIVING PERMIT");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        b5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel18.setText("IF YES GIVE DETAILS ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel17.setText("REASON IF YES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, 20));

        b6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        h3.setText("d)  MOTOR VEHICLE USED FOR THE CARRIGE OF PASSENGER AND HAVING MORE THAN EIGHT SEATS IN ADDITION TO  THE DRIVER'S SEAT.");
        getContentPane().add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 20));

        h2.setText("c)  MOTOR VEHICLES OTHER THAN THOSE IN CATEGORE (a) ABOVE HAVING A PERMISIBLE MAX. MASS/WEIGHT NOT EXCEEDING 3500kg AND NOT MORE THAN EIGHT SETS IN ADDITION TO THE DRIVER SEAT IN CATEGORY M1.  ");
        getContentPane().add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 20));

        h4.setText("e)  COMBINATION OF VEHICLES OF WHICH THE DRIVING IS INN THE CATEGORY OR CATEGORIES FOR WHICH THE DRIVER IS LICENSED (b & c & d) BUT WHICH ARE NOT THEMSELVES IN THE CATEGORIES.");
        getContentPane().add(h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        t2.setText("Son/Daughter/Wife of");
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 88, 290, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("PERMANENT ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 118, 410, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 87, 215, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setText("NAME");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, 50, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("TEMPORARY ADDRESS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 137, -1));

        b1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Argentina", "Australia", "Canada", "Hong Kong", "Italy", "Japan", "New Zealand", "Singapore", "Switzerland", "United States of America" }));
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 92, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("COUNTRY ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 93, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 120, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 460, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("DATE OF BIRTH");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 110, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("EDUCATIONAL QUALIFICATION  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("IDENTIFICATION MARK");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 410, -1));
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 92, -1));

        jLabel30.setFont(jLabel30.getFont().deriveFont(jLabel30.getFont().getStyle() | java.awt.Font.BOLD, jLabel30.getFont().getSize()+1));
        jLabel30.setText("FEES PAID ");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, 20));

        g1.setText("MALE");
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        getContentPane().add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 60, -1));

        g2.setText("FEMALE");
        getContentPane().add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 70, -1));

        r4.setText("OBC");
        getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setText("GENDER");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 70, 21));

        r2.setText("SC");
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        r3.setText("ST");
        getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText("CATEGORY");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        r1.setText("GE");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("FORM -4A");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 90, -1));

        h1.setText("b)  MOTER VEHICLES USED FOR CARRIGE OF GOODS AND WHOSE PREMISIBLE MAX. MASS/WEIGHT EXCEEDS 3500 kg. ");
        getContentPane().add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        b4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MOTER CYCLE Category L1", "MOTER CYCLE Category L2" }));
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel19.setFont(jLabel19.getFont().deriveFont(jLabel19.getFont().getStyle() | java.awt.Font.BOLD, jLabel19.getFont().getSize()+1));
        jLabel19.setText("CATEGORIE OF VEHICLES FOR WHICH THE PERMIT IS APPLIED FOR ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 442, -1));

        jLabel26.setFont(jLabel26.getFont().deriveFont(jLabel26.getFont().getStyle() | java.awt.Font.BOLD, jLabel26.getFont().getSize()+1));
        jLabel26.setText("PROOFS");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 64, 20));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, -1, -1));

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, -1, -1));

        jButton2.setText("Upload Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 90, -1, 115));
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 256, -1));
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 246, -1));

        jLabel6.setText("[See Rule 14 (2)]");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jLabel21.setText(" FORM OF APPLICATION FOR ISSUE OF INTERNATIONAL DRIVING PERMIT TO DRIVE A MOTOR VEHICLE IN OTHER COUNTRIES");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        certificate1.setText("File Upload");
        certificate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificate1ActionPerformed(evt);
            }
        });
        getContentPane().add(certificate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, -1, -1));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("PLACE OF BIRTH & COUNTRY PROOF");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 250, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel20.setText("DATE OF BIRTH PROOF");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 178, -1));

        certificate2.setText("File Upload");
        certificate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificate2ActionPerformed(evt);
            }
        });
        getContentPane().add(certificate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 440, -1, -1));

        certificate3.setText("File Upload");
        certificate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificate3ActionPerformed(evt);
            }
        });
        getContentPane().add(certificate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 470, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel22.setText("MEDICAL CERTIFICATE");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 178, -1));

        jLabel1.setText("a)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 20, 20));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rlaproject/rla_images/Icon.jpg"))); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(g1);
        bg1.add(g2);
    }//GEN-LAST:event_g1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
    }//GEN-LAST:event_r1ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed
        Connection con;
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       try
       {
            int d1_len=t1.getText().length();
            int d2_len=t2.getText().length();
            int d3_len=t3.getText().length();
            int d4_len=t4.getText().length();
            int d5_len=t5.getText().length();
            int d6_len=t7.getText().length();
            int d7_len=t10.getText().length();
            if(d1_len==0 || d2_len==0 || d3_len==0 || d4_len==0 || d5_len==0 || d6_len==0 || d7_len==0 )
            {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Required Fields to Submit the Form");
                if(d1_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Name ");
                } 
                else if(d2_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Relation");
                } 
                else  if(d3_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert DOB");
                } 
                else if(d4_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Permanent Address");
                }  
                else if(d5_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Temporary Address");
                }  
                else if(d6_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Educational Qualification");
                }  
                else if(d7_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Paid Fees");
                }
            }
            else
            {    
             int res=JOptionPane.showConfirmDialog(null,"Want to Submit Form","Info",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if(res==JOptionPane.OK_OPTION)
            {
                    PreparedStatement pstmt=con.prepareStatement("insert into form4a values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                     pstmt.setString(1,(t1.getText()));
                     pstmt.setString(2,(t2.getText()));
                     pstmt.setString(3,(t3.getText()));
                     
                     String std=(String)b1.getSelectedItem();
                     pstmt.setString(4,std);

                     pstmt.setString(5,(f2.getPath()));
                     
                     pstmt.setString(6,(t4.getText()));
                     pstmt.setString(7,(t5.getText()));
                     pstmt.setString(8,(t6.getText()));

                    String gender ="";
                    if(g1.isSelected())
                    {
                         gender="Male";                  
                    }
                    else if(g2.isSelected())
                    {
                        gender="Female";
                    }
                    pstmt.setString(9,gender);

                    String category ="General";
                    if(r1.isSelected())
                    {
                         category="General";                  
                    }
                    else if(r2.isSelected())
                    {
                        category="SC";
                    }
                    else if(r3.isSelected())
                    {
                        category="ST";
                    }
                    else if(r4.isSelected())
                    {
                        category="OBC";
                    }
                    pstmt.setString(10,category);

                    String bld=(String)b2.getSelectedItem();
                    pstmt.setString(11,bld);

                    String rh=(String)b3.getSelectedItem();
                    pstmt.setString(12,rh);

                    pstmt.setString(13,(t7.getText()));            

                    String cat=(String)b4.getSelectedItem();
                    pstmt.setString(14,cat);

                    String max_mass_exceeds="No";
                    if(h1.isSelected())
                     {
                        max_mass_exceeds="Yes";
                     }
                     pstmt.setString(15,max_mass_exceeds);

                     String max_mass_not_exceeds_3500kg="No";
                     if(h2.isSelected())
                      {
                        max_mass_not_exceeds_3500kg="Yes";
                      }
                     pstmt.setString(16,max_mass_not_exceeds_3500kg);

                     String more_8_seats="No";
                    if(h3.isSelected())
                     {
                        more_8_seats="Yes";
                     }
                     pstmt.setString(17,more_8_seats);

                     String license_category="No";
                    if(h4.isSelected())
                     {
                        license_category="Yes";
                     }
                     pstmt.setString(18,license_category);

                    String inter=(String)b5.getSelectedItem();
                    pstmt.setString(19,inter);
                    pstmt.setString(20,(t8.getText()));

                    String dis=(String)b6.getSelectedItem();
                    pstmt.setString(21,dis);
                    pstmt.setString(22,(t9.getText()));

                     pstmt.setString(23,(t10.getText()));
                     
                     pstmt.setString(24,(f4.getPath()));
                     pstmt.setString(25,(f6.getPath()));
                     pstmt.setString(26,(f8.getPath()));
                     
                     java.util.Date d1=new java.util.Date();
                     String newdate=new SimpleDateFormat("dd/MM/yyyy").format(d1);
                    pstmt.setString(27,newdate);

                     FileUtils.copyFileToDirectory(f1, f2);
                     FileUtils.copyFileToDirectory(f3, f4);
                     FileUtils.copyFileToDirectory(f5, f6);
                     FileUtils.copyFileToDirectory(f7, f8);
                    pstmt.executeUpdate();
                new main().setVisible(true);
                dispose();
            }               
         }    
    }//GEN-LAST:event_submitActionPerformed
 catch(Exception obj)
        {
            System.out.println(obj.toString());
            JOptionPane.showMessageDialog(rootPane, "Please Upload Required File/Image in the Form");
        }
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       t1.setText("");
       t2.setText("");
       t3.setText("");
       t4.setText("");
       t4.setText("");
       t5.setText("");
       t6.setText("");
       t7.setText("");
       t8.setText("");
       t9.setText("");
       t10.setText("");
       h1.setSelected(false);
       h2.setSelected(false);
       h3.setSelected(false);
       h4.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed
File f1,f2,f3,f4,f5,f6,f7,f8;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser JFC = new JFileChooser();
        
        if( JFC.showOpenDialog(null)==0)
        {
         
             f1=new File(JFC.getSelectedFile().toString());
           f2=new File("C:\\rlaproject\\Uploaded_Files");
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void certificate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificate1ActionPerformed
        JFileChooser JFC = new JFileChooser();

        if( JFC.showOpenDialog(null)==0)
        {

            f3=new File(JFC.getSelectedFile().toString());
            f4=new File("C:\\rlaproject\\Uploaded_Files");
        }
    }//GEN-LAST:event_certificate1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void certificate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificate2ActionPerformed
        JFileChooser JFC = new JFileChooser();

        if( JFC.showOpenDialog(null)==0)
        {

            f5=new File(JFC.getSelectedFile().toString());
            f6=new File("C:\\rlaproject\\Uploaded_Files");
        }
    }//GEN-LAST:event_certificate2ActionPerformed

    private void certificate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificate3ActionPerformed
       JFileChooser JFC = new JFileChooser();

        if( JFC.showOpenDialog(null)==0)
        {

            f7=new File(JFC.getSelectedFile().toString());
            f8=new File("C:\\rlaproject\\Uploaded_Files");
        }
    }//GEN-LAST:event_certificate3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if((String)b6.getSelectedItem()=="YES")
        {
            t9.setVisible(true);
        }
        else
        {
           t9.setVisible(false); 
        }    
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if((String)b5.getSelectedItem()=="YES")
        {
            t8.setVisible(true);
        }
        else
        {
           t8.setVisible(false); 
        }    
    }//GEN-LAST:event_b5ActionPerformed
               
    
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
            java.util.logging.Logger.getLogger(form4a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form4a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form4a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form4a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form4a().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox b1;
    private javax.swing.JComboBox b2;
    private javax.swing.JComboBox b3;
    private javax.swing.JComboBox b4;
    private javax.swing.JComboBox b5;
    private javax.swing.JComboBox b6;
    private javax.swing.JButton certificate1;
    private javax.swing.JButton certificate2;
    private javax.swing.JButton certificate3;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JCheckBox h1;
    private javax.swing.JCheckBox h2;
    private javax.swing.JCheckBox h3;
    private javax.swing.JCheckBox h4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JButton submit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
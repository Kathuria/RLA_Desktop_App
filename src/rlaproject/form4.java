package rlaproject;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
/**
 *
 * @author Avi Kathuria
 */
public class form4 extends javax.swing.JFrame {

    /**
     * Creates new form form4
     */
    Connection con;
    public form4() {
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

        c12 = new javax.swing.JCheckBox();
        c13 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        c14 = new javax.swing.JCheckBox();
        c15 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        t7 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        h2 = new javax.swing.JComboBox();
        h1 = new javax.swing.JComboBox();
        c10 = new javax.swing.JCheckBox();
        c11 = new javax.swing.JCheckBox();
        t9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c9 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        certificate = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Licensing Form");
        setResizable(false);

        c12.setText("MEDICAL FITNESS CERTIFICATE");

        c13.setText("APPLICATION FOR LEARNER’S LICENSE THE WRITTEN CONSENT OF PARENT /GUARDIAN (ONLY IN CASE OF MINOR)");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("LEARNER LICENSE NO.");

        jLabel15.setText("DRIVING CERTIFICATE NO");

        c14.setText("EXEMPTED FROM MEDICAL TEST UNDER THE RULE 6 OF MOTER VEHICLE 1989");

        c15.setText("EXEMPTED FROM PRELIMINIRY TEST UNDER RULE 11(2) UNDER MOTER VEHICLE 1989");

        jLabel21.setText("FEE PAID IN Rs.");

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel23.setText("IDENTIFICATION MARK");

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel27.setText("PERMANENT ADDRESS");

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel30.setText("DATE OF BIRTH");

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel31.setText("NAME");

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel32.setText("TEMPORARY ADDRESS");

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t3.setText("Son/Daughter/Wife of");

        jLabel54.setText("BLOOD GROUP OF THE APPICANT");

        jLabel56.setText("RH FACTOR OF THE APPLICANT");

        h2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RH+", "RH-" }));

        h1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        c10.setText("PREVIOUSLY HELD INTERNATIONAL DRIVING PERMIT");

        c11.setText("DISQUALIFIED FOR OBTANING A DRIVING LISENCE TO DRIVE  ");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("TYPE OF VEHICLE");

        c1.setText("MOTOR CYCLE WITHOUT GEAR ");

        c2.setText("MOTOR CYCLE WITH GEAR ");

        c3.setText("INVALID CARRIGES");

        c4.setText("LIGHT MOTOR");

        c5.setText("MEDIUM GOODS VEHICLE");

        c6.setText("MEDIUM PASSENGER MOTOR VEHICLE");

        c7.setText("HEAVY GOODS VEHICLE");

        c8.setText("HEAVY PASSENGER MOTOR VEHICLE");

        c9.setText("ROAD ROLLER");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("FORM OF APPLICATION FOR LICENSE TO DRIVE A MOTOR VEHICLE");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("FORM 4");

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel5.getFont().getSize()+1));
        jLabel5.setText("To ");

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getSize()+1f));
        jLabel7.setText("THE LICENSING AUTHORITY");

        certificate.setText("File Upload");
        certificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificateActionPerformed(evt);
            }
        });

        jLabel24.setFont(jLabel24.getFont().deriveFont(jLabel24.getFont().getSize()+1f));
        jLabel24.setText("PROOFS");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rlaproject/rla_images/Icon.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(certificate)
                        .addGap(0, 790, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(c10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c11)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(10, 10, 10)
                                .addComponent(t5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c14)
                                            .addComponent(c15)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c9)
                                            .addComponent(c1)
                                            .addComponent(c5))
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c2)
                                            .addComponent(c6))
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c7)
                                            .addComponent(c3))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c4)
                                            .addComponent(c8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel24))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(470, 470, 470))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(252, 252, 252)))
                        .addComponent(jLabel37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addComponent(jLabel37)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)))
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(c9))
                    .addComponent(c1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(c5))
                    .addComponent(c2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(c6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(c7))
                    .addComponent(c3)
                    .addComponent(c4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(c8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel27))
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel54)
                                    .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel56)
                                .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c10)
                            .addComponent(c11))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c12)
                            .addComponent(certificate))
                        .addGap(3, 3, 3)
                        .addComponent(c13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c15)
                            .addComponent(jLabel21)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            int d1_len=t1.getText().length();
            int d2_len=t2.getText().length();
            int d3_len=t3.getText().length();
            int d4_len=t4.getText().length();
            int d5_len=t5.getText().length();
            int d6_len=t6.getText().length();
            int d7_len=t8.getText().length();
            int d8_len=t9.getText().length();
            int d9_len=t10.getText().length();
            if(d1_len==0 || d2_len==0 || d3_len==0 || d4_len==0 || d5_len==0 || d6_len==0 || d7_len==0 || d8_len==0 || d9_len==0)
              {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Required Fields to Submit the Form");
                if(d1_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Authority Name ");
                } 
                else if(d2_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Name");
                } 
                else  if(d3_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Relation");
                } 
                else if(d4_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert DOB");
                }  
                else if(d5_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Permanent Address");
                }  
                else if(d6_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Temporary Address");
                }  
                else if(d7_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Learner License No.");
                }
                else if(d8_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Driving Certificate No.");
                } 
                else if(d9_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Paid Fees");
                } 
             }
            else
            { 
            int res=JOptionPane.showConfirmDialog(null,"Want to Submit Form","Info",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
             if(res==JOptionPane.OK_OPTION)
                {
                  PreparedStatement pstmt=con.prepareStatement("insert into form4 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstmt.setString(1,(t1.getText()));
                     String checkbox_value="";
                  if(c1.isSelected()){checkbox_value =c1.getText();}
                   if(c2.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c2.getText();}
                    if(c3.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c3.getText();}
                     if(c4.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c4.getText();}
                      if(c5.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c5.getText();}
                       if(c6.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c6.getText();}
                        if(c7.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c7.getText();}
                         if(c8.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c8.getText();}
                          if(c9.isSelected()){if(!checkbox_value.equals("")) checkbox_value +=","; checkbox_value +=c9.getText();}

                     pstmt.setString(2,checkbox_value);
                     pstmt.setString(3,(t2.getText()));
                     pstmt.setString(4,(t3.getText()));
                     pstmt.setString(5,(t4.getText()));
                     pstmt.setString(6,(t5.getText()));
                     pstmt.setString(7,(t6.getText()));
                     pstmt.setString(8,(t7.getText())); 

                     String blood=(String)h1.getSelectedItem();
                     pstmt.setString(9,blood);

                     String rh=(String)h2.getSelectedItem();
                     pstmt.setString(10,rh);

                     String international_DL="No";
                    if(c10.isSelected())
                     {
                        international_DL="Yes";
                     }
                     pstmt.setString(11,international_DL);

                    String disqualified_for_DL="No";
                    if(c11.isSelected())
                     {
                        disqualified_for_DL="Yes";
                     }
                     pstmt.setString(12,disqualified_for_DL);

                   String medical_certificate="No";
                    if(c12.isSelected())
                     {
                        medical_certificate="Yes";
                     }
                     pstmt.setString(13,medical_certificate);  

                     pstmt.setString(14,(f2.getPath()));

                     String application_LL="No";
                     if(c13.isSelected())
                     {
                        application_LL="Yes";
                     }
                     pstmt.setString(15,application_LL);  

                     pstmt.setString(16,(t8.getText())); 
                     pstmt.setString(17,(t9.getText())); 

                  String EXEMPTED_FROM_MEDICAL_TEST ="No";
                    if(c14.isSelected())
                     {
                        EXEMPTED_FROM_MEDICAL_TEST="Yes";
                     }
                     pstmt.setString(18,EXEMPTED_FROM_MEDICAL_TEST);

                     String EXEMPTED_FROM_PRIMINIRY_TEST ="No";
                    if(c15.isSelected())
                     {
                        EXEMPTED_FROM_PRIMINIRY_TEST="Yes";
                     }
                     pstmt.setString(19,EXEMPTED_FROM_PRIMINIRY_TEST);

                    pstmt.setString(20,(t10.getText()));

                    java.util.Date d1=new java.util.Date();
                    String newdate=new SimpleDateFormat("dd/MM/yyyy").format(d1);
                    pstmt.setString(21,newdate);
                    
                    FileUtils.copyFileToDirectory(f1, f2);
                   
                    pstmt.executeUpdate();
                    new main().setVisible(true);
                    dispose();
         }
       }   
    }//GEN-LAST:event_jButton1ActionPerformed
        catch(Exception obj)
            {
            System.out.println(obj.toString());
            JOptionPane.showMessageDialog(rootPane, "Please Upload Required File in the Form");
           }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       t1.setText("");
       t2.setText("");
       t3.setText("");
       t4.setText("");
       t5.setText("");
       t6.setText("");
       t7.setText("");
       t8.setText("");
       t9.setText("");
       t10.setText("");
       c1.setSelected(false);
       c2.setSelected(false);
       c3.setSelected(false);
       c4.setSelected(false);
       c5.setSelected(false);
       c6.setSelected(false);
       c7.setSelected(false);
       c8.setSelected(false);
       c9.setSelected(false);
       c10.setSelected(false);
       c11.setSelected(false);
       c12.setSelected(false);
       c13.setSelected(false);
       c14.setSelected(false);
       c15.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed
    File f1,f2;
    private void certificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificateActionPerformed
        JFileChooser JFC = new JFileChooser();

        if( JFC.showOpenDialog(null)==0)
        {

            f1=new File(JFC.getSelectedFile().toString());
            f2=new File("C:\\rlaproject\\Uploaded_Files");
        }
    }//GEN-LAST:event_certificateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
       
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
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c10;
    private javax.swing.JCheckBox c11;
    private javax.swing.JCheckBox c12;
    private javax.swing.JCheckBox c13;
    private javax.swing.JCheckBox c14;
    private javax.swing.JCheckBox c15;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox c9;
    private javax.swing.JButton certificate;
    private javax.swing.JComboBox h1;
    private javax.swing.JComboBox h2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel7;
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
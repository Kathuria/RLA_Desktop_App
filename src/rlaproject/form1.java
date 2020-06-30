package rlaproject;

import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import org.apache.commons.io.FileUtils;
import java.text.SimpleDateFormat;
/**
 *
 * @author Avi Kathuria
 */
public class form1 extends javax.swing.JFrame {

    /**
     * Creates new form form1
     */
    public form1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        r2a = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3a = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        r1a = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r15a = new javax.swing.JRadioButton();
        r15 = new javax.swing.JRadioButton();
        r14a = new javax.swing.JRadioButton();
        r14 = new javax.swing.JRadioButton();
        r16 = new javax.swing.JRadioButton();
        r11a = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        r13a = new javax.swing.JRadioButton();
        r13 = new javax.swing.JRadioButton();
        r12a = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        r9 = new javax.swing.JRadioButton();
        r8a = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        r9a = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        r10a = new javax.swing.JRadioButton();
        t6 = new javax.swing.JTextField();
        r7 = new javax.swing.JRadioButton();
        t7 = new javax.swing.JTextField();
        r8 = new javax.swing.JRadioButton();
        r7a = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox();
        c1 = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r6a = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r5a = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        r4a = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        r18a = new javax.swing.JRadioButton();
        r19 = new javax.swing.JRadioButton();
        r17a = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        r18 = new javax.swing.JRadioButton();
        r16a = new javax.swing.JRadioButton();
        r17 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        r19a = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Licensing Form");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(r2a);
        r2a.setText("No");
        getContentPane().add(r2a, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, -1, -1));

        buttonGroup2.add(r2);
        r2.setText("Yes");
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        buttonGroup3.add(r3a);
        r3a.setText("No");
        getContentPane().add(r3a, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        buttonGroup3.add(r3);
        r3.setText("Yes");
        getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, -1));

        jLabel23.setText("(f)  Are you so deaf as to unable to hear ( driving a light motor vehicle, with or without hearing aid) the ordinary sound signal?");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        buttonGroup1.add(r1a);
        r1a.setText("No");
        getContentPane().add(r1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        buttonGroup1.add(r1);
        r1.setText("Yes");
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        buttonGroup14.add(r15a);
        r15a.setText("No");
        getContentPane().add(r15a, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, 20));

        buttonGroup14.add(r15);
        r15.setText("Yes");
        getContentPane().add(r15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, 20));

        buttonGroup13.add(r14a);
        r14a.setText("No");
        getContentPane().add(r14a, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        buttonGroup13.add(r14);
        r14.setText("Yes");
        getContentPane().add(r14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        buttonGroup15.add(r16);
        r16.setText("Yes");
        getContentPane().add(r16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, 20));

        buttonGroup19.add(r11a);
        r11a.setText("No");
        getContentPane().add(r11a, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jLabel21.setText("(e)  Do you suffer from night blindness ?");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        buttonGroup12.add(r13a);
        r13a.setText("No");
        getContentPane().add(r13a, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, -1));

        buttonGroup12.add(r13);
        r13.setText("Yes");
        getContentPane().add(r13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        buttonGroup11.add(r12a);
        r12a.setText("No");
        getContentPane().add(r12a, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, 30));

        buttonGroup11.add(r12);
        r12.setText("Yes");
        getContentPane().add(r12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, 30));

        jLabel17.setText("(c)  Have you lost either hand or foot are you suffering from any defect in movement, control or muscular power of either arm or leg.");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel15.setText("(b)   Are you able to distinguish with each eye ar a distance of 25 meters in good day light (with glasses if worn)?");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel12.setText("(a)   Do you suffer from epilepsy, or from sudden attacks of loss of consciousness or giddiness from any cause ?");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("DECLARATION AS TO PHYSICAL FITNESS TO BE GIVEN BY THE APPLICANT");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel19.setText("(d)  Can you readily distinguish the pigmentary colours red and green ?");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        buttonGroup9.add(r9);
        r9.setText("Yes");
        getContentPane().add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 30));

        buttonGroup8.add(r8a);
        r8a.setText("No");
        getContentPane().add(r8a, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

        buttonGroup10.add(r10);
        r10.setText("Yes");
        getContentPane().add(r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        buttonGroup9.add(r9a);
        r9a.setText("No");
        getContentPane().add(r9a, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, 30));

        buttonGroup19.add(r11);
        r11.setText("Yes");
        getContentPane().add(r11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        buttonGroup10.add(r10a);
        r10a.setText("No");
        getContentPane().add(r10a, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 330, -1));

        buttonGroup7.add(r7);
        r7.setText("Yes");
        getContentPane().add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 289, -1));

        buttonGroup8.add(r8);
        r8.setText("Yes");
        getContentPane().add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        buttonGroup7.add(r7a);
        r7a.setText("No");
        getContentPane().add(r7a, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        jLabel25.setText("NAME AND DESIGATION OF MEDICAL OFFICER");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 300, -1));

        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RH+", "RH-" }));
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, -1, -1));

        jLabel56.setText("(o)   RH Factor of the applicant");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 180, 20));

        jLabel54.setText("(n)   Blood Group of the applicant.");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 190, -1));

        jLabel52.setText("(l)   Does he suffer from any other disease or disability likely to cause his driving a motor vehicle a source of danger to the public?");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel50.setText("(m)   Is he mentally ill person.");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("DECLARATION BY MEDICAL OFFICER");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        buttonGroup6.add(r6a);
        r6a.setText("No");
        getContentPane().add(r6a, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, -1, 30));

        buttonGroup6.add(r6);
        r6.setText("Yes");
        getContentPane().add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, 30));

        buttonGroup5.add(r5a);
        r5a.setText("No");
        getContentPane().add(r5a, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel28.setText("(a)   If the applicant to the best of your judgment subject to epilepsy, vertigo or any mental ailment likely to affect his driving efficiency ?");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel46.setText("(j)   Is he suffering from defect in movement control or muscular power of either arm or limb.");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabel48.setText("(k)   What is the height of applicant? Consider that this height will be disadvantageous for him to have a clear vision of the road while driving.");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jLabel42.setText("(h)   Does he suffer from attacks of loss of consciousness from any cause ?");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel44.setText("(i)   Is he able to distinguish with each eye at a distance of 25 meters in good day light a motor car number plate ?");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jLabel40.setText("(g)   Does he show any evidence of being addicted to excessive use of alcohol, tobacco or drugs ?");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        buttonGroup4.add(r4a);
        r4a.setText("No");
        getContentPane().add(r4a, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, 20));

        buttonGroup5.add(r5);
        r5.setText("Yes");
        getContentPane().add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        buttonGroup4.add(r4);
        r4.setText("Yes");
        getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, 20));

        jLabel30.setText("(b)   Does the applicant suffer from any heart or lung disorder which might interfere with the performance of his duties as a driver ?");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel34.setText("(d)   Can be applicant readily distinguish the pigmentary colours red and green ?");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel32.setText("(c)   Is there any defect of vision? If so, has it been corrected by a suitable spectacle.");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel38.setText("(f)   Does the applicant suffer from night blindness?");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel36.setText("(e)   Does the applicant’s suffer from a degree of deafness which would prevent his hearing the ordinary sound signals.");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("IDENTIFICATION MARK");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("PERMANENT ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 590, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("TEMPORARY ADDRESS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 137, 20));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 590, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("DATE OF BIRTH");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 117, -1));

        buttonGroup17.add(r18a);
        r18a.setText("No");
        getContentPane().add(r18a, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, -1, 20));

        buttonGroup18.add(r19);
        r19.setText("Yes");
        getContentPane().add(r19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        buttonGroup16.add(r17a);
        r17a.setText("No");
        getContentPane().add(r17a, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, -1, 13));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setText("NAME");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 20));

        buttonGroup17.add(r18);
        r18.setText("Yes");
        getContentPane().add(r18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, -1, 20));

        buttonGroup15.add(r16a);
        r16a.setText("No");
        getContentPane().add(r16a, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, 20));

        buttonGroup16.add(r17);
        r17.setText("Yes");
        getContentPane().add(r17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, 13));

        t2.setText("Son/Daughter/Wife of");
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 350, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 215, -1));

        buttonGroup18.add(r19a);
        r19a.setText("No");
        getContentPane().add(r19a, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("FORM 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 650, -1, -1));

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, 60, -1));

        jButton3.setText("Upload Image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 110, 120));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, -1, -1));

        jLabel2.setText("Medical Certificate in respect of an applicant for obtaining a Learner’s License / Driving License or renewal of Driving License    ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rlaproject/rla_images/Icon.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed
                Connection con ;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
            int d1_len=t1.getText().length();
            int d2_len=t2.getText().length();
            int d3_len=t3.getText().length();
            int d4_len=t4.getText().length();
            int d5_len=t5.getText().length();
            int d6_len=t7.getText().length();
            if(d1_len==0 || d2_len==0 || d3_len==0 || d4_len==0 || d5_len==0 || d6_len==0)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Fill Required Fields to Submit the Form");
                if(d1_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Name");
                } 
                else if(d2_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Relation");
                } 
                else  if(d3_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Permanent Address");
                } 
                else if(d4_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Temporary Address");
                }
                else  if(d5_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert DOB");
                } 
                else  if(d6_len==0)
                {
                JOptionPane.showMessageDialog(rootPane, "Please insert Details about Medical Officer");
                } 
            }
            else
            {    
             int res=JOptionPane.showConfirmDialog(null,"Want to Submit Form","Info",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
             if(res==JOptionPane.OK_OPTION)
           {
            PreparedStatement pstmt=con.prepareStatement("insert into form1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1,(t1.getText()));
            pstmt.setString(2,(t2.getText()));
            pstmt.setString(3,(t3.getText()));
            pstmt.setString(4,(t4.getText()));
            pstmt.setString(5,(t5.getText()));
            pstmt.setString(6,(t6.getText()));
            
            String suffer_epilepsy ="NO";
            if(r1.isSelected())
            {
                 suffer_epilepsy="yes";
                   
            }
            else if(r1a.isSelected())
            {
                suffer_epilepsy="NO";
            }
            pstmt.setString(7,suffer_epilepsy);
            
            String distance_25m="NO";
            if(r2.isSelected())
            {
                distance_25m="yes";
            }
            else if(r2a.isSelected())
            {
                distance_25m="NO";
            }
             pstmt.setString(8,distance_25m);
           
             String lost_foot_hand="NO";
            if(r3.isSelected())
            {
                lost_foot_hand="yes";
            }
            else if(r3a.isSelected())
            {
                lost_foot_hand="NO";
            }
            pstmt.setString(9,lost_foot_hand);
            
            String distinguish_colours="NO";
            if(r4.isSelected())
            {
                 distinguish_colours="yes";
            }
            else if(r4a.isSelected())
            {
                distinguish_colours="no";
            }
            pstmt.setString(10,distinguish_colours);
            String night_blindness="NO";
            if(r5.isSelected())
            {
                night_blindness="yes";
            }
            else if(r5a.isSelected())
            {
                night_blindness="no";
            }
            pstmt.setString(11,night_blindness);
            String deafness="no";
            if(r6.isSelected())
            {
                deafness="yes";
            }
            else if(r6a.isSelected())
            {
                deafness="no";
            }
            pstmt.setString(12,deafness);
            String epilepsy_MO="no";
            if(r7.isSelected())
            {
                epilepsy_MO="yes";
            }
            else if(r7a.isSelected())
            {
                epilepsy_MO="no";
            }
            pstmt.setString(13,epilepsy_MO);
            String heart_disorder_MO="no";
            if(r8.isSelected())
            {
                heart_disorder_MO="yes";
            }
            else if(r8a.isSelected())
            {
                heart_disorder_MO="no";
            }
            pstmt.setString(14,heart_disorder_MO);
            String vision_defect_MO="no";
            if(r9.isSelected())
            {
                vision_defect_MO="yes";
            }
            else if(r9a.isSelected())
            {
                vision_defect_MO="no";
            }
            pstmt.setString(15,vision_defect_MO);
            String colour_distinguish_MO="no";
            if(r10.isSelected())
            {
                colour_distinguish_MO="yes";
            }
            else if(r10a.isSelected())
            {
                colour_distinguish_MO="no";
            }
            pstmt.setString(16,colour_distinguish_MO);
            String deafness_MO="no";
            if(r11.isSelected())
            {
                deafness_MO="yes";
            }
            else if(r11a.isSelected())
            {
                deafness_MO="no";
            }
             pstmt.setString(17,deafness_MO);
            String night_blindness_MO="no";
            if(r12.isSelected())
            {
                night_blindness_MO="yes";
            }
            else if(r12a.isSelected())
            {
                 night_blindness_MO="no";
            }
            pstmt.setString(18,night_blindness_MO);
            String alcohol_MO="no";
            if(r13.isSelected())
            {
                alcohol_MO="yes";
            }
            else if(r13a.isSelected())
            {
                alcohol_MO="no";     
            }
            pstmt.setString(19,alcohol_MO);
            String loss_of_consiousness_MO="no";
            if(r14.isSelected())
            {
                loss_of_consiousness_MO="yes";
            }
            else if(r14a.isSelected())
            {
                loss_of_consiousness_MO="no";
            }
            pstmt.setString(20,loss_of_consiousness_MO);
            String distance_25m_MO="no";
            if(r15.isSelected())
            {
                distance_25m_MO="yes";
            }
            else if(r15a.isSelected())
            {
                distance_25m_MO="no";
            }
            pstmt.setString(21,distance_25m_MO);
            String movement_control_MO="no";
            if(r16.isSelected())
            {
                movement_control_MO="yes";
            }
            else if(r16a.isSelected())
            {
                movement_control_MO="no";
            }
            pstmt.setString(22,movement_control_MO);
            String height_MO="no";
            if(r17.isSelected())
            {
                height_MO="yes";
            }
            else if(r17a.isSelected())
            {
                height_MO="no";           
            }
              pstmt.setString(23,height_MO);
            String disease_MO="no";
            if(r18.isSelected())
            {
                disease_MO="yes";
            }
            else if(r18a.isSelected())
            {
                disease_MO="no";
            }
            pstmt.setString(24,disease_MO);
            String mentilly_ill_MO="no";
            if(r19.isSelected())
            {
                mentilly_ill_MO="yes";
            }
            else if(r19a.isSelected())
            {
                mentilly_ill_MO="no";
            }
            pstmt.setString(25, mentilly_ill_MO);
            
            String std=(String)c1.getSelectedItem();
             pstmt.setString(26,std);
             
            String rtd=(String)c2.getSelectedItem();
            pstmt.setString(27,rtd);
            
             pstmt.setString(28,(f2.getPath()));
             pstmt.setString(29,(t7.getText()));
              java.util.Date d1=new java.util.Date();
            String newdate=new SimpleDateFormat("dd/MM/yyyy").format(d1);
            pstmt.setString(30,newdate);
            
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       t1.setText("");
       t2.setText("");
       t3.setText("");
       t4.setText("");
       t5.setText("");
       t6.setText("");
       t7.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
File f1,f2;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 JFileChooser JFC = new JFileChooser();
        
        if( JFC.showOpenDialog(null)==0)
        {
         
             f1=new File(JFC.getSelectedFile().toString());
           f2=new File("C:\\rlaproject\\Uploaded_Files");
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r10a;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r11a;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r12a;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r13a;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r14a;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r15a;
    private javax.swing.JRadioButton r16;
    private javax.swing.JRadioButton r16a;
    private javax.swing.JRadioButton r17;
    private javax.swing.JRadioButton r17a;
    private javax.swing.JRadioButton r18;
    private javax.swing.JRadioButton r18a;
    private javax.swing.JRadioButton r19;
    private javax.swing.JRadioButton r19a;
    private javax.swing.JRadioButton r1a;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r2a;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r3a;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r4a;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r5a;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r6a;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r7a;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r8a;
    private javax.swing.JRadioButton r9;
    private javax.swing.JRadioButton r9a;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 *
 * @author Bernard Skerritt x14110717
 */
public class GeomQuiz extends javax.swing.JPanel {

    int count;
    GeomQuestion[] q = new GeomQuestion[5]; //Array
    String[] s = new String[5];
    String[] j = new String[5];
    String[] k = new String[5];
    String[] l = new String[5];
    String[] m = new String[5];
    GeomQuestion q1;
    GeomQuestion q2;
    GeomQuestion q3;
    GeomQuestion q4;
    GeomQuestion q5;
    int correctAns;
    boolean finished;

    public GeomQuiz() {
        initComponents();
        
        s[0] = "Select an Answer";
        s[1] = "Angle-Side-Angle (ASA)";
        s[2] = "Side-Angle-Side (SAS)";
        s[3] = "Angle-Angle-Side (AAS)";
        s[4] = "None of these";
        q1 = new GeomQuestion("<html>Given: AC' bisects \u2221BAD and \u2221BCD. Which of the following methods can be used to prove \u2206ABC\u2245\u2206ADC.</html>", 1, "q1GeomPic.png", s); //Question 1 object
        j[0] = "Select an Answer";
        j[1] = "24 degrees";
        j[2] = "33 degrees";
        j[3] = "48 degrees";
        j[4] = "66 degrees";
        q2 = new GeomQuestion("<html>In the diagram below, AC'\u2245DC'\u2245DB'. If the m&lt;ACD = 48, find the m&lt;B.</html>", 2, "q2GeomPic.png", j); //Question 2 object
        k[0] = "Select an Answer";
        k[1] = "25 degrees";
        k[2] = "125 degrees";
        k[3] = "155 degrees";
        k[4] = "158 degrees";
        q3 = new GeomQuestion("<html>In the diagram below, the angles are represented as shown. Find the m&lt;DBC.</html>", 3, "q3GeomPic.png", k); //Question 3 object
        l[0] = "Select an Answer";
        l[1] = "32";
        l[2] = "36";
        l[3] = "40";
        l[4] = "60";
        q4 = new GeomQuestion("<html>In the diagram below, triangle ABC is similar to triangle DEF, AC = 6, AB = BC = 12, and DF = 8. Find the perimeter of triangle DEF.</html>", 3, "q4GeomPic.png", l); //Question 4 object
        m[0] = "Select an Answer";
        m[1] = "117";
        m[2] = "110";
        m[3] = "27";
        m[4] = "63";
        q5 = new GeomQuestion("<html>In the diagram below, BA'\u2245BC' and m\u2221x = 117. Find m\u2221y.</html>", 4, "q5GeomPic.png", m); //Question 5 object
        
        count = 0;
        ansLbl.setText("");
        endTitle.setVisible(false);
        youGotLbl.setVisible(false);
        numRltLbl.setVisible(false);
        chkAnsBtn.setEnabled(false);
        nxtBtn1.setEnabled(false);
        correctAns = 0;
        finished = false;
        q[0] = q1;
        q[1] = q2;
        q[2] = q3;
        q[3] = q4;
        q[4] = q5;
        multiAnsBox1.setModel(new javax.swing.DefaultComboBoxModel(q[count].getAnswers()));
        q1GeomLbl.setText("<html>Q" + (count + 1) + ". " + q[count].getQuestionTitle()+"</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        question1 = new javax.swing.JPanel();
        nxtBtn1 = new javax.swing.JButton();
        chkAnsBtn = new javax.swing.JButton();
        ansLbl = new javax.swing.JLabel();
        q1GeomLbl = new javax.swing.JLabel();
        multiAnsBox1 = new javax.swing.JComboBox();
        geomPic1 = new javax.swing.JLabel();
        endTitle = new javax.swing.JLabel();
        youGotLbl = new javax.swing.JLabel();
        numRltLbl = new javax.swing.JLabel();

        mainMenuPanel.setBackground(new java.awt.Color(52, 152, 219));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(400, 640));
        mainMenuPanel.setLayout(null);

        copyrightLbl.setBackground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        copyrightLbl.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLbl.setText("Copyright © 2015 | Maths Mate");
        copyrightLbl.setAlignmentY(0.0F);
        mainMenuPanel.add(copyrightLbl);
        copyrightLbl.setBounds(30, 580, 340, 30);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/homeIcon.png"))); // NOI18N
        homeBtn.setAlignmentY(0.0F);
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        homeBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        homeBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(homeBtn);
        homeBtn.setBounds(300, 10, 80, 50);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/backIcon.png"))); // NOI18N
        backBtn.setAlignmentY(0.0F);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        backBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        backBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(backBtn);
        backBtn.setBounds(20, 10, 80, 50);

        screenTitleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        screenTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        screenTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenTitleLbl.setText("Geometry Quiz");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        question1.setBackground(new java.awt.Color(142, 68, 173));
        question1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        question1.setLayout(null);

        nxtBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nxtBtn1.setText("Next");
        nxtBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtBtn1ActionPerformed(evt);
            }
        });
        question1.add(nxtBtn1);
        nxtBtn1.setBounds(206, 406, 131, 41);

        chkAnsBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkAnsBtn.setText("Check Answer");
        chkAnsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsBtnActionPerformed(evt);
            }
        });
        question1.add(chkAnsBtn);
        chkAnsBtn.setBounds(23, 406, 173, 41);

        ansLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ansLbl.setForeground(new java.awt.Color(255, 255, 255));
        ansLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ansLbl.setText("Correct");
        question1.add(ansLbl);
        ansLbl.setBounds(6, 360, 350, 29);

        q1GeomLbl.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        q1GeomLbl.setForeground(new java.awt.Color(255, 255, 255));
        q1GeomLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1GeomLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        question1.add(q1GeomLbl);
        q1GeomLbl.setBounds(13, 14, 334, 100);

        multiAnsBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        multiAnsBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select an Answer", "Angle-Side-Angle (ASA)", "Side-Angle-Side (SAS)", "Angle-Angle-Side (AAS)", "None of these." }));
        multiAnsBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiAnsBox1ActionPerformed(evt);
            }
        });
        question1.add(multiAnsBox1);
        multiAnsBox1.setBounds(90, 310, 170, 30);

        geomPic1.setBackground(new java.awt.Color(255, 255, 255));
        geomPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/q1GeomPic.png"))); // NOI18N
        question1.add(geomPic1);
        geomPic1.setBounds(70, 110, 210, 190);

        endTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        endTitle.setForeground(new java.awt.Color(255, 255, 255));
        endTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endTitle.setText("Results");
        endTitle.setAlignmentY(0.0F);
        question1.add(endTitle);
        endTitle.setBounds(100, 40, 150, 50);

        youGotLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        youGotLbl.setForeground(new java.awt.Color(255, 255, 255));
        youGotLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        youGotLbl.setText("You Answered");
        youGotLbl.setAlignmentY(0.0F);
        question1.add(youGotLbl);
        youGotLbl.setBounds(60, 120, 230, 40);

        numRltLbl.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        numRltLbl.setForeground(new java.awt.Color(255, 255, 255));
        numRltLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numRltLbl.setAlignmentY(0.0F);
        question1.add(numRltLbl);
        numRltLbl.setBounds(60, 170, 220, 190);

        mainMenuPanel.add(question1);
        question1.setBounds(20, 80, 360, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "GEOMETRY_MENU");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void chkAnsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsBtnActionPerformed
        if (finished == true) {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cl = (CardLayout) layout;
                cl.show(getParent(), "MAIN");
            }
        }else{
            nxtBtn1.setEnabled(true);
            chkAnsBtn.setEnabled(false);
            multiAnsBox1.setEnabled(false);
            if (multiAnsBox1.getSelectedIndex()==(q[count].getCorrectAns())) {
                ansLbl.setText("Correct!");
                correctAns++;
            } else {
                ansLbl.setText("Incorrect!");
            }
        }
    }//GEN-LAST:event_chkAnsBtnActionPerformed

    private void nxtBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtn1ActionPerformed
        if(finished == true){
            count = 0;
            ansLbl.setText("");
            endTitle.setVisible(false);
            youGotLbl.setVisible(false);
            numRltLbl.setVisible(false);
            chkAnsBtn.setEnabled(false);
            nxtBtn1.setEnabled(false);
            q1GeomLbl.setVisible(true);
            multiAnsBox1.setVisible(true);
            geomPic1.setVisible(true);
            multiAnsBox1.setModel(new javax.swing.DefaultComboBoxModel(q[count].getAnswers()));
            q1GeomLbl.setText("<html>Q" + (count + 1) + ". " + q[count].getQuestionTitle()+"</html>");            
            multiAnsBox1.setEnabled(true);
            chkAnsBtn.setText("Check Answer");
            nxtBtn1.setText("Next");
            correctAns = 0;
            finished = false;
        }else{
            if (q.length - 1 <= count) {
                endTitle.setVisible(true);
                youGotLbl.setVisible(true);
                numRltLbl.setVisible(true);
                numRltLbl.setText(correctAns + "/5");
                ansLbl.setText("Correct!");
                q1GeomLbl.setVisible(false);
                multiAnsBox1.setVisible(false);
                geomPic1.setVisible(false);
                chkAnsBtn.setEnabled(true);
                chkAnsBtn.setText("Main Menu");
                nxtBtn1.setText("Reset");
                finished = true;
            } else {
                nextQuestion();
            }
        }    
    }//GEN-LAST:event_nxtBtn1ActionPerformed

    private void multiAnsBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiAnsBox1ActionPerformed
        chkAnsBtn.setEnabled(true);    
    }//GEN-LAST:event_multiAnsBox1ActionPerformed

    
    private void nextQuestion() {
        count++;
        q1GeomLbl.setText("<html>Q" + (count + 1) + ". " + q[count].getQuestionTitle()+"</html>");
        geomPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource(q[count].getImage())));
        multiAnsBox1.setModel(new javax.swing.DefaultComboBoxModel(q[count].getAnswers()));
        multiAnsBox1.setEnabled(true);
        nxtBtn1.setEnabled(false);
        ansLbl.setText("");
        chkAnsBtn.setEnabled(false);
        if (q.length <= count + 1) {
            nxtBtn1.setText("Finished");
            
        } else {
            nxtBtn1.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton chkAnsBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JLabel endTitle;
    private javax.swing.JLabel geomPic1;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JComboBox multiAnsBox1;
    private javax.swing.JLabel nameBg;
    private javax.swing.JLabel numRltLbl;
    private javax.swing.JButton nxtBtn1;
    private javax.swing.JLabel q1GeomLbl;
    private javax.swing.JPanel question1;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JLabel youGotLbl;
    // End of variables declaration//GEN-END:variables

}

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
 * @author Bernard Skerritt
 */
public class AlgebraQuiz extends javax.swing.JPanel {

    /**
     * Creates new form AlgebraMenu
     */
    
    int count;
    AlgebraQuestion[] q = new AlgebraQuestion[5]; //Array
    AlgebraQuestion q1 = new AlgebraQuestion("Solve {x+y = 10, x-y = 4}", "  y = 4,   x = 3", "  x = 7,   y = 3", "  x = 6,   y = 1", 2); //Question 1 object
    AlgebraQuestion q2 = new AlgebraQuestion("What is 2+2?", "3", "4", "5", 2); //Question 2 object
    AlgebraQuestion q3 = new AlgebraQuestion("What 6*2?", "6", "2", "12", 3); //Question 3 object
    AlgebraQuestion q4 = new AlgebraQuestion("What 10/5?", "2", "8", "1", 1); //Question 4 object
    AlgebraQuestion q5 = new AlgebraQuestion("What 20-4?", "16", "12", "19", 1); //Question 5 object
    
    public AlgebraQuiz() {
        initComponents();
        ansLbl.setText("");
        chkAnsBtn.setEnabled(false);
        nxtBtn1.setEnabled(false);
        count = 0;
        q[0] = q1;
        q[1] = q2;
        q[2] = q3;
        q[3] = q4;
        q[4] = q5;
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
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        question1 = new javax.swing.JPanel();
        q1Lbl = new javax.swing.JLabel();
        ans1RadBtn = new javax.swing.JRadioButton();
        ans2RadBtn = new javax.swing.JRadioButton();
        ans3RadBtn = new javax.swing.JRadioButton();
        nxtBtn1 = new javax.swing.JButton();
        chkAnsBtn = new javax.swing.JButton();
        ansLbl = new javax.swing.JLabel();

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
        screenTitleLbl.setText("Algebra Quiz");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        question1.setBackground(new java.awt.Color(142, 68, 173));
        question1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        q1Lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        q1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1Lbl.setText("Q1. Solve {x+y = 10, x-y = 4}");
        q1Lbl.setAlignmentY(0.0F);

        buttonGroup1.add(ans1RadBtn);
        ans1RadBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ans1RadBtn.setForeground(new java.awt.Color(255, 255, 255));
        ans1RadBtn.setText("  y = 4,   x = 3");
        ans1RadBtn.setContentAreaFilled(false);
        ans1RadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans1RadBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(ans2RadBtn);
        ans2RadBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ans2RadBtn.setForeground(new java.awt.Color(255, 255, 255));
        ans2RadBtn.setText("  x = 7,   y = 3");
        ans2RadBtn.setOpaque(false);
        ans2RadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans2RadBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(ans3RadBtn);
        ans3RadBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ans3RadBtn.setForeground(new java.awt.Color(255, 255, 255));
        ans3RadBtn.setText("  x = 6,   y = 1");
        ans3RadBtn.setOpaque(false);
        ans3RadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans3RadBtnActionPerformed(evt);
            }
        });

        nxtBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nxtBtn1.setText("Next");
        nxtBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtBtn1ActionPerformed(evt);
            }
        });

        chkAnsBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkAnsBtn.setText("Check Answer");
        chkAnsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsBtnActionPerformed(evt);
            }
        });

        ansLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ansLbl.setForeground(new java.awt.Color(255, 255, 255));
        ansLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ansLbl.setText("Correct");

        javax.swing.GroupLayout question1Layout = new javax.swing.GroupLayout(question1);
        question1.setLayout(question1Layout);
        question1Layout.setHorizontalGroup(
            question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question1Layout.createSequentialGroup()
                .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(question1Layout.createSequentialGroup()
                        .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(question1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ans3RadBtn)
                                    .addComponent(ans2RadBtn)
                                    .addComponent(ans1RadBtn)
                                    .addComponent(ansLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(question1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(chkAnsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nxtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(question1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(q1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        question1Layout.setVerticalGroup(
            question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ans1RadBtn)
                .addGap(33, 33, 33)
                .addComponent(ans2RadBtn)
                .addGap(35, 35, 35)
                .addComponent(ans3RadBtn)
                .addGap(18, 18, 18)
                .addComponent(ansLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAnsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nxtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        mainMenuPanel.add(question1);
        question1.setBounds(20, 80, 360, 430);

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
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "ALGEBRA_MENU");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void ans2RadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2RadBtnActionPerformed
       chkAnsBtn.setEnabled(true);
    }//GEN-LAST:event_ans2RadBtnActionPerformed

    private void ans1RadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1RadBtnActionPerformed
        chkAnsBtn.setEnabled(true);
    }//GEN-LAST:event_ans1RadBtnActionPerformed

    private void ans3RadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3RadBtnActionPerformed
        chkAnsBtn.setEnabled(true);
    }//GEN-LAST:event_ans3RadBtnActionPerformed

    private void chkAnsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsBtnActionPerformed
        nxtBtn1.setEnabled(true);
        ans1RadBtn.setEnabled(false);
        ans2RadBtn.setEnabled(false);
        ans3RadBtn.setEnabled(false);
        if(ans1RadBtn.isSelected() && (q[count].getCorrectAns() == 1)){
            ansLbl.setText("Correct!");
        } else if(ans2RadBtn.isSelected() && (q[count].getCorrectAns() == 2)){
            ansLbl.setText("Correct!");
        } else if(ans3RadBtn.isSelected() && (q[count].getCorrectAns() == 3)){
            ansLbl.setText("Correct!");
        } else {
            ansLbl.setText("Incorrect!");
        }
    }//GEN-LAST:event_chkAnsBtnActionPerformed

    private void nxtBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtn1ActionPerformed
        nextQuestion();
    }//GEN-LAST:event_nxtBtn1ActionPerformed

    private void nextQuestion(){
        count++;
        q1Lbl.setText("Q" + (count + 1) + ". " + q[count].getQuestionTitle());
        ans1RadBtn.setText(q[count].getA1());
        ans2RadBtn.setText(q[count].getA2());
        ans3RadBtn.setText(q[count].getA3());
        ans1RadBtn.setEnabled(true);
        ans2RadBtn.setEnabled(true);
        ans3RadBtn.setEnabled(true);
        nxtBtn1.setEnabled(false);
        ansLbl.setText("");
        chkAnsBtn.setEnabled(false);
        buttonGroup1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ans1RadBtn;
    private javax.swing.JRadioButton ans2RadBtn;
    private javax.swing.JRadioButton ans3RadBtn;
    private javax.swing.JLabel ansLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chkAnsBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JButton nxtBtn1;
    private javax.swing.JLabel q1Lbl;
    private javax.swing.JPanel question1;
    private javax.swing.JLabel screenTitleLbl;
    // End of variables declaration//GEN-END:variables
}

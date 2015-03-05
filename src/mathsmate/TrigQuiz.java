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
public class TrigQuiz extends javax.swing.JPanel {

    /**
     * Creates new form AlgebraMenu
     */
    public TrigQuiz() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        q1Lbl = new javax.swing.JLabel();
        q1Pic = new javax.swing.JLabel();
        ans1TrigLbl = new javax.swing.JRadioButton();
        ans2TrigLbl = new javax.swing.JRadioButton();
        ans3TrigLbl = new javax.swing.JRadioButton();

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
        screenTitleLbl.setText("Trig Quiz");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        question1.setBackground(new java.awt.Color(142, 68, 173));
        question1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        nxtBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nxtBtn1.setText("Next");

        chkAnsBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkAnsBtn.setText("Check Answer");

        ansLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ansLbl.setForeground(new java.awt.Color(255, 255, 255));
        ansLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ansLbl.setText("Correct");

        q1Lbl.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        q1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        q1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1Lbl.setText("Q1. Find x and H in the right triangle below");

        q1Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1Pic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leanne&Ben\\Desktop\\MathsMate\\q1TrigPic.png")); // NOI18N

        buttonGroup1.add(ans1TrigLbl);
        ans1TrigLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans1TrigLbl.setForeground(new java.awt.Color(255, 255, 255));
        ans1TrigLbl.setText("x = 10 / H = 13");
        ans1TrigLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ans1TrigLbl.setOpaque(false);

        buttonGroup1.add(ans2TrigLbl);
        ans2TrigLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans2TrigLbl.setForeground(new java.awt.Color(255, 255, 255));
        ans2TrigLbl.setText("x = 8 / H = 15");
        ans2TrigLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ans2TrigLbl.setOpaque(false);

        buttonGroup1.add(ans3TrigLbl);
        ans3TrigLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans3TrigLbl.setForeground(new java.awt.Color(255, 255, 255));
        ans3TrigLbl.setText("x = 11 / H = 12");
        ans3TrigLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ans3TrigLbl.setOpaque(false);

        javax.swing.GroupLayout question1Layout = new javax.swing.GroupLayout(question1);
        question1.setLayout(question1Layout);
        question1Layout.setHorizontalGroup(
            question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question1Layout.createSequentialGroup()
                .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(question1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(q1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(question1Layout.createSequentialGroup()
                        .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(question1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(chkAnsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nxtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(question1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(ansLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(question1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ans1TrigLbl)
                                    .addComponent(ans2TrigLbl)
                                    .addComponent(ans3TrigLbl)
                                    .addComponent(q1Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        question1Layout.setVerticalGroup(
            question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(question1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q1Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ans1TrigLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ans2TrigLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ans3TrigLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ansLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAnsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nxtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

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
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "TRIG_MENU");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ans1TrigLbl;
    private javax.swing.JRadioButton ans2TrigLbl;
    private javax.swing.JRadioButton ans3TrigLbl;
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
    private javax.swing.JLabel q1Pic;
    private javax.swing.JPanel question1;
    private javax.swing.JLabel screenTitleLbl;
    // End of variables declaration//GEN-END:variables
}

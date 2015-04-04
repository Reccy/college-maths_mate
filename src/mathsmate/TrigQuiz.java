/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

/**
 *
 * @author Bernard Skerritt x14110717
 */
public class TrigQuiz extends javax.swing.JPanel {

    int count;
    private ArrayList<TrigQuestion> q; //ArrayList
    TrigQuestion q1 = new TrigQuestion("<html>In the triangle below, what is sin &#945;?</html>",
                                        "13 / 9", "9 / 13", "<html>13 &#8730;10 / 50</html>", 3,
                                        "q1TrigPic.png"); //Question 1 object
    TrigQuestion q2 = new TrigQuestion("<html>What is the length of AB in the figure below?</html>", 
                                        "<html>12 &#8730;2</html>", "<html>12 &#8730;6</html>", "<html>12 &#8730;3</html>", 3,
                                        "q2TrigPic.png"); //Question 2 object
    TrigQuestion q3 = new TrigQuestion("<html>In the figure below, find cosθ.</html>", 
                                        " 3 / 5 ", " 4 / 5 ", " 1 / 5 ", 2, 
                                        "q3TrigPic.png"); //Question 3 object
    TrigQuestion q4 = new TrigQuestion("<html>In the triangle below, m = ?</html>", 
                                        " 5 ", "<html> 20 &#8730;2 </html", "<html> 5 &#8730;2 </html>", 3, 
                                        "q4TrigPic.png"); //Question 4 object
    TrigQuestion q5 = new TrigQuestion("<html>What is the period of the graph shown below?</html>", 
                                        "<html> 2 &#960; </html>", "<html> 5 &#960;/3 </html>", "<html> &#960;/3 </html>", 1, 
                                        "q5TrigPic.png"); //Question 5 object
    int correctAns;
    boolean finished;
    
    public TrigQuiz() {
        initComponents();
        ansLbl.setText("");
        endTitle.setVisible(false);
        youGotLbl.setVisible(false);
        numRltLbl.setVisible(false);
        chkAnsBtn.setEnabled(false);
        nxtBtn1.setEnabled(false);
        count = 0;
        correctAns = 0;
        finished = false;
        q = new ArrayList<>();
        q.add(q1);
        q.add(q2);
        q.add(q3);
        q.add(q4);
        q.add(q5);
        //Fixed answer bug
        ans1TrigRbtn.setText(q.get(count).getA1()); //Set text from constructors
        ans2TrigRbtn.setText(q.get(count).getA2());
        ans3TrigRbtn.setText(q.get(count).getA3());
        ans1TrigRbtn.setEnabled(true); //Enable button to be clicked
        ans2TrigRbtn.setEnabled(true);
        ans3TrigRbtn.setEnabled(true);
        q1Lbl.setText("<html>Q" + (count + 1) + ". " + q.get(count).getQuestionTitle()+"</html>");
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
        ans1TrigRbtn = new javax.swing.JRadioButton();
        ans2TrigRbtn = new javax.swing.JRadioButton();
        ans3TrigRbtn = new javax.swing.JRadioButton();
        numRltLbl = new javax.swing.JLabel();
        youGotLbl = new javax.swing.JLabel();
        endTitle = new javax.swing.JLabel();

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

        q1Lbl.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        q1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        q1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1Lbl.setText("Q1. Find x and H in the right triangle below");
        q1Lbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        question1.add(q1Lbl);
        q1Lbl.setBounds(13, 14, 334, 70);

        q1Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/q1TrigPic.png"))); // NOI18N
        question1.add(q1Pic);
        q1Pic.setBounds(10, 60, 340, 180);

        buttonGroup1.add(ans1TrigRbtn);
        ans1TrigRbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans1TrigRbtn.setForeground(new java.awt.Color(255, 255, 255));
        ans1TrigRbtn.setText("x = 10 / H = 13");
        ans1TrigRbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ans1TrigRbtn.setOpaque(false);
        ans1TrigRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans1TrigRbtnActionPerformed(evt);
            }
        });
        question1.add(ans1TrigRbtn);
        ans1TrigRbtn.setBounds(120, 250, 135, 30);

        buttonGroup1.add(ans2TrigRbtn);
        ans2TrigRbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans2TrigRbtn.setForeground(new java.awt.Color(255, 255, 255));
        ans2TrigRbtn.setText("x = 8 / H = 15");
        ans2TrigRbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ans2TrigRbtn.setOpaque(false);
        ans2TrigRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans2TrigRbtnActionPerformed(evt);
            }
        });
        question1.add(ans2TrigRbtn);
        ans2TrigRbtn.setBounds(120, 280, 125, 40);

        buttonGroup1.add(ans3TrigRbtn);
        ans3TrigRbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans3TrigRbtn.setForeground(new java.awt.Color(255, 255, 255));
        ans3TrigRbtn.setText("x = 11 / H = 12");
        ans3TrigRbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ans3TrigRbtn.setOpaque(false);
        ans3TrigRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans3TrigRbtnActionPerformed(evt);
            }
        });
        question1.add(ans3TrigRbtn);
        ans3TrigRbtn.setBounds(120, 320, 135, 30);

        numRltLbl.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        numRltLbl.setForeground(new java.awt.Color(255, 255, 255));
        numRltLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numRltLbl.setAlignmentY(0.0F);
        question1.add(numRltLbl);
        numRltLbl.setBounds(70, 150, 220, 160);

        youGotLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        youGotLbl.setForeground(new java.awt.Color(255, 255, 255));
        youGotLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        youGotLbl.setText("You Answered");
        youGotLbl.setAlignmentY(0.0F);
        question1.add(youGotLbl);
        youGotLbl.setBounds(60, 120, 230, 40);

        endTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        endTitle.setForeground(new java.awt.Color(255, 255, 255));
        endTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endTitle.setText("Results");
        endTitle.setAlignmentY(0.0F);
        question1.add(endTitle);
        endTitle.setBounds(100, 40, 150, 50);

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

    private void ans1TrigRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1TrigRbtnActionPerformed
        chkAnsBtn.setEnabled(true);
    }//GEN-LAST:event_ans1TrigRbtnActionPerformed

    private void ans2TrigRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2TrigRbtnActionPerformed
        chkAnsBtn.setEnabled(true);
    }//GEN-LAST:event_ans2TrigRbtnActionPerformed

    private void ans3TrigRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3TrigRbtnActionPerformed
        chkAnsBtn.setEnabled(true);
    }//GEN-LAST:event_ans3TrigRbtnActionPerformed

    private void chkAnsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsBtnActionPerformed
        if (finished == true) {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cl = (CardLayout) layout;
                cl.show(getParent(), "MAIN");
            }
        } else {
            nxtBtn1.setEnabled(true);
            chkAnsBtn.setEnabled(false);
            ans1TrigRbtn.setEnabled(false);
            ans2TrigRbtn.setEnabled(false);
            ans3TrigRbtn.setEnabled(false);
            if (ans1TrigRbtn.isSelected() && (q.get(count).getCorrectAns() == 1)) {
                ansLbl.setText("Correct!");
                correctAns++;
            } else if (ans2TrigRbtn.isSelected() && (q.get(count).getCorrectAns() == 2)) {
                ansLbl.setText("Correct!");
                correctAns++;
            } else if (ans3TrigRbtn.isSelected() && (q.get(count).getCorrectAns() == 3)) {
                ansLbl.setText("Correct!");
                correctAns++;
            } else {
                ansLbl.setText("Incorrect!");
            }
        }
    }//GEN-LAST:event_chkAnsBtnActionPerformed

    private void nxtBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtn1ActionPerformed
        if (finished == true) {
            count = 0;
            ansLbl.setText("");
            endTitle.setVisible(false);
            youGotLbl.setVisible(false);
            numRltLbl.setVisible(false);
            chkAnsBtn.setEnabled(false);
            nxtBtn1.setEnabled(false);
            q1Lbl.setVisible(true);
            q1Pic.setVisible(true);
            ans1TrigRbtn.setVisible(true);
            ans2TrigRbtn.setVisible(true);
            ans3TrigRbtn.setVisible(true);
            q1Lbl.setText("<html>Q" + (count + 1) + ". " + q.get(count).getQuestionTitle()+"</html>");
            q1Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource(q.get(count).getImage())));
            ans1TrigRbtn.setText(q.get(count).getA1());
            ans2TrigRbtn.setText(q.get(count).getA2());
            ans3TrigRbtn.setText(q.get(count).getA3());
            ans1TrigRbtn.setEnabled(true);
            ans2TrigRbtn.setEnabled(true);
            ans3TrigRbtn.setEnabled(true);
            buttonGroup1.clearSelection();
            chkAnsBtn.setText("Check Answer");
            nxtBtn1.setText("Next");
            correctAns = 0;
            finished = false;
        } else {
            if (q.size() - 1 <= count) {
                endTitle.setVisible(true);
                youGotLbl.setVisible(true);
                numRltLbl.setVisible(true);
                numRltLbl.setText(correctAns + "/5");
                ansLbl.setText("Correct!");
                q1Lbl.setVisible(false);
                q1Pic.setVisible(false);
                ans1TrigRbtn.setVisible(false);
                ans2TrigRbtn.setVisible(false);
                ans3TrigRbtn.setVisible(false);
                chkAnsBtn.setEnabled(true);
                chkAnsBtn.setText("Main Menu");
                nxtBtn1.setText("Reset");
                finished = true;
            } else {
                nextQuestion();
            }
        }
    }//GEN-LAST:event_nxtBtn1ActionPerformed

    private void nextQuestion() {
        count++;
        q1Lbl.setText("<html>Q" + (count + 1) + ". " + q.get(count).getQuestionTitle()+"</html>");
        q1Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource(q.get(count).getImage())));
        ans1TrigRbtn.setText(q.get(count).getA1());
        ans2TrigRbtn.setText(q.get(count).getA2());
        ans3TrigRbtn.setText(q.get(count).getA3());
        ans1TrigRbtn.setEnabled(true);
        ans2TrigRbtn.setEnabled(true);
        ans3TrigRbtn.setEnabled(true);
        nxtBtn1.setEnabled(false);
        ansLbl.setText("");
        chkAnsBtn.setEnabled(false);
        buttonGroup1.clearSelection();
        if (q.size() <= count + 1) {
            nxtBtn1.setText("Finished");
        } else {
            nxtBtn1.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ans1TrigRbtn;
    private javax.swing.JRadioButton ans2TrigRbtn;
    private javax.swing.JRadioButton ans3TrigRbtn;
    private javax.swing.JLabel ansLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chkAnsBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JLabel endTitle;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JLabel numRltLbl;
    private javax.swing.JButton nxtBtn1;
    private javax.swing.JLabel q1Lbl;
    private javax.swing.JLabel q1Pic;
    private javax.swing.JPanel question1;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JLabel youGotLbl;
    // End of variables declaration//GEN-END:variables
}

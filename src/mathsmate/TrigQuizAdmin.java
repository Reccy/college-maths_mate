/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Bernard Skerritt x14110717
 */
public class TrigQuizAdmin extends javax.swing.JPanel {

    int count;  //Creates a counter for the ArrayList.
    String newQ, ans1, ans2, ans3, image;
    private ArrayList<TrigQuestion> q; //ArrayList declared.
    private ArrayList<TrigQuestion> addQst;
    TrigQuestion q1 = new TrigQuestion("<html>In the triangle below, what is sin &#945;?</html>", //Object of type TrigQuestion q1 created to hold questions, answers and picture.
            "13 / 9", "9 / 13", "<html>13 &#8730;10 / 50</html>", 3,
            "q1TrigPic.png");
    TrigQuestion q2 = new TrigQuestion("<html>What is the length of AB in the figure below?</html>", //Object of type TrigQuestion q2 created to hold questions, answers and picture.
            "<html>12 &#8730;2</html>", "<html>12 &#8730;6</html>", "<html>12 &#8730;3</html>", 3,
            "q2TrigPic.png");
    TrigQuestion q3 = new TrigQuestion("<html>In the figure below, find cosθ.</html>", //Object of type TrigQuestion q3 created to hold questions, answers and picture.
            " 3 / 5 ", " 4 / 5 ", " 1 / 5 ", 2,
            "q3TrigPic.png");
    TrigQuestion q4 = new TrigQuestion("<html>In the triangle below, m = ?</html>", //Object of type TrigQuestion q4 created to hold questions, answers and picture.
            " 5 ", "<html> 20 &#8730;2 </html", "<html> 5 &#8730;2 </html>", 3,
            "q4TrigPic.png");
    TrigQuestion q5 = new TrigQuestion("<html>What is the period of the graph shown below?</html>", //Object of type TrigQuestion q5 created to hold questions, answers and picture.
            "<html> 2 &#960; </html>", "<html> 5 &#960;/3 </html>", "<html> &#960;/3 </html>", 1,
            "q5TrigPic.png");
    int correctAns;  //Creates a variable to store the amount of correct answers.
    boolean finished;  //Creates a boolean variable to store if user has completed the quiz.
    String img;

    //Contructor to set the components.
    public TrigQuizAdmin() {
        initComponents();
        count = 0;
        correctAns = 0;
        finished = false;
        q = new ArrayList<>(); //ArrayList created.
        addQst = new ArrayList<>();
        q.add(q1);  //Objects of type TrigQuestion added to ArrayList.
        q.add(q2);
        q.add(q3);
        q.add(q4);
        q.add(q5);

        //Test Code
        addQst = q;
        //

        addQtnField.setText(addQst.get(count).getQuestionTitle());
        ansField1.setText(addQst.get(count).getA1());
        ansField2.setText(addQst.get(count).getA2());
        ansField3.setText(addQst.get(count).getA3());
        image = addQst.get(count).getImage();
        correctAns = addQst.get(count).getCorrectAns();

        if (count - 1 < 0) {
            previousBtn.setEnabled(false);
        } else {
            previousBtn.setEnabled(true);
        }

        if (correctAns == 1) {
            selectAns1.setSelected(true);
            selectAns2.setSelected(false);
            selectAns3.setSelected(false);
        } else if (correctAns == 2) {
            selectAns1.setSelected(false);
            selectAns2.setSelected(true);
            selectAns3.setSelected(false);
        } else {
            selectAns1.setSelected(false);
            selectAns2.setSelected(false);
            selectAns3.setSelected(true);
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
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        question1 = new javax.swing.JPanel();
        resetBtn = new javax.swing.JButton();
        addQtn = new javax.swing.JLabel();
        addQtnField = new javax.swing.JTextField();
        addAnsLbl = new javax.swing.JLabel();
        ans2Lbl = new javax.swing.JLabel();
        ansField1 = new javax.swing.JTextField();
        ansField2 = new javax.swing.JTextField();
        ansField3 = new javax.swing.JTextField();
        addPicLbl2 = new javax.swing.JLabel();
        ans1Lbl1 = new javax.swing.JLabel();
        ans2Lbl1 = new javax.swing.JLabel();
        selectAns1 = new javax.swing.JRadioButton();
        selectAns2 = new javax.swing.JRadioButton();
        selectAns3 = new javax.swing.JRadioButton();
        previousBtn = new javax.swing.JButton();
        addBtn1 = new javax.swing.JButton();
        editBtn1 = new javax.swing.JButton();
        deleteBtn1 = new javax.swing.JButton();
        nextBtn1 = new javax.swing.JButton();
        saveBtn2 = new javax.swing.JButton();
        imageBtn = new javax.swing.JButton();

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
        screenTitleLbl.setText("Trig Quiz Admin");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        question1.setBackground(new java.awt.Color(142, 68, 173));
        question1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        question1.setLayout(null);

        resetBtn.setBackground(new java.awt.Color(255, 0, 0));
        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("RESET");
        question1.add(resetBtn);
        resetBtn.setBounds(135, 447, 90, 25);

        addQtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addQtn.setForeground(new java.awt.Color(255, 255, 255));
        addQtn.setText("Add a new question");
        question1.add(addQtn);
        addQtn.setBounds(20, 10, 170, 30);
        question1.add(addQtnField);
        addQtnField.setBounds(20, 40, 320, 70);

        addAnsLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addAnsLbl.setForeground(new java.awt.Color(255, 255, 255));
        addAnsLbl.setText("Input answers then select correct answer");
        question1.add(addAnsLbl);
        addAnsLbl.setBounds(20, 180, 320, 40);

        ans2Lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        ans2Lbl.setText("3.");
        question1.add(ans2Lbl);
        ans2Lbl.setBounds(20, 310, 30, 30);
        question1.add(ansField1);
        ansField1.setBounds(40, 310, 270, 30);
        question1.add(ansField2);
        ansField2.setBounds(40, 230, 270, 30);
        question1.add(ansField3);
        ansField3.setBounds(40, 270, 270, 30);

        addPicLbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addPicLbl2.setForeground(new java.awt.Color(255, 255, 255));
        addPicLbl2.setText("Add a new diagram");
        question1.add(addPicLbl2);
        addPicLbl2.setBounds(20, 110, 170, 40);

        ans1Lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans1Lbl1.setForeground(new java.awt.Color(255, 255, 255));
        ans1Lbl1.setText("1.");
        question1.add(ans1Lbl1);
        ans1Lbl1.setBounds(20, 230, 30, 30);

        ans2Lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans2Lbl1.setForeground(new java.awt.Color(255, 255, 255));
        ans2Lbl1.setText("2.");
        question1.add(ans2Lbl1);
        ans2Lbl1.setBounds(20, 270, 30, 30);

        selectAns1.setOpaque(false);
        question1.add(selectAns1);
        selectAns1.setBounds(320, 230, 30, 30);

        selectAns2.setOpaque(false);
        question1.add(selectAns2);
        selectAns2.setBounds(320, 310, 30, 30);

        selectAns3.setOpaque(false);
        question1.add(selectAns3);
        selectAns3.setBounds(320, 270, 30, 30);

        previousBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        previousBtn.setText("PREVIOUS");
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });
        question1.add(previousBtn);
        previousBtn.setBounds(30, 410, 100, 23);

        addBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addBtn1.setText("ADD");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });
        question1.add(addBtn1);
        addBtn1.setBounds(149, 410, 80, 23);

        editBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editBtn1.setText("EDIT");
        question1.add(editBtn1);
        editBtn1.setBounds(30, 370, 73, 23);

        deleteBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteBtn1.setText("DELETE");
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });
        question1.add(deleteBtn1);
        deleteBtn1.setBounds(250, 370, 80, 23);

        nextBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nextBtn1.setText("NEXT");
        nextBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtn1ActionPerformed(evt);
            }
        });
        question1.add(nextBtn1);
        nextBtn1.setBounds(250, 410, 80, 23);

        saveBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveBtn2.setText("SAVE");
        saveBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn2ActionPerformed(evt);
            }
        });
        question1.add(saveBtn2);
        saveBtn2.setBounds(140, 370, 73, 23);

        imageBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imageBtn.setText("SELECT IMAGE");
        imageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageBtnActionPerformed(evt);
            }
        });
        question1.add(imageBtn);
        imageBtn.setBounds(20, 150, 140, 23);

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
            cl.show(getParent(), "TRIG_QUIZ");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void imageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageBtnActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File(TrigQuizAdmin.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() + "../../customimg"));
            chooser.showOpenDialog(nameBg);
            img = TrigQuizAdmin.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() + "../../customimg/" + chooser.getSelectedFile().getName();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No image selected: " + e);
        } catch (URISyntaxException f) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + f);
        }
    }//GEN-LAST:event_imageBtnActionPerformed

    private void saveBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn2ActionPerformed

        int correctAns;

        newQ = addQtnField.getText();
        ans1 = ansField1.getText();
        ans2 = ansField2.getText();
        ans3 = ansField3.getText();


    }//GEN-LAST:event_saveBtn2ActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        String newQ, ans1, ans2, ans3;
        int correctAns;

        newQ = addQtnField.getText();
        ans1 = ansField1.getText();
        ans2 = ansField2.getText();
        ans3 = ansField3.getText();

        if (selectAns1.isEnabled()) {
            correctAns = 1;
        } else if (selectAns2.isEnabled()) {
            correctAns = 2;
        } else {
            correctAns = 3;
        }

        TrigQuestion aQ = new TrigQuestion(newQ, ans1, ans2, ans3, correctAns, img);
        addQst.add(aQ);
        count++;
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        addQst.remove(count);
        count--;
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void nextBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtn1ActionPerformed
        count++;
        addQtnField.setText(addQst.get(count).getQuestionTitle());
        ansField1.setText(addQst.get(count).getA1());
        ansField2.setText(addQst.get(count).getA2());
        ansField3.setText(addQst.get(count).getA3());
        image = addQst.get(count).getImage();
        correctAns = addQst.get(count).getCorrectAns();

        if (correctAns == 1) {
            selectAns1.setSelected(true);
            selectAns2.setSelected(false);
            selectAns3.setSelected(false);
        } else if (correctAns == 2) {
            selectAns1.setSelected(false);
            selectAns2.setSelected(true);
            selectAns3.setSelected(false);
        } else {
            selectAns1.setSelected(false);
            selectAns2.setSelected(false);
            selectAns3.setSelected(true);
        }

        if (count - 1 < 0) {
            previousBtn.setEnabled(false);
        } else {
            previousBtn.setEnabled(true);
        }
        

    }//GEN-LAST:event_nextBtn1ActionPerformed

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        count--;
        addQtnField.setText(addQst.get(count).getQuestionTitle());
        ansField1.setText(addQst.get(count).getA1());
        ansField2.setText(addQst.get(count).getA2());
        ansField3.setText(addQst.get(count).getA3());
        image = addQst.get(count).getImage();
        correctAns = addQst.get(count).getCorrectAns();

        if (correctAns == 1) {
            selectAns1.setSelected(true);
            selectAns2.setSelected(false);
            selectAns3.setSelected(false);
        } else if (correctAns == 2) {
            selectAns1.setSelected(false);
            selectAns2.setSelected(true);
            selectAns3.setSelected(false);
        } else {
            selectAns1.setSelected(false);
            selectAns2.setSelected(false);
            selectAns3.setSelected(true);
        }

        if (count - 1 < 0) {
            previousBtn.setEnabled(false);
        } else {
            previousBtn.setEnabled(true);
        }
    }//GEN-LAST:event_previousBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addAnsLbl;
    private javax.swing.JButton addBtn1;
    private javax.swing.JLabel addPicLbl2;
    private javax.swing.JLabel addQtn;
    private javax.swing.JTextField addQtnField;
    private javax.swing.JLabel ans1Lbl1;
    private javax.swing.JLabel ans2Lbl;
    private javax.swing.JLabel ans2Lbl1;
    private javax.swing.JTextField ansField1;
    private javax.swing.JTextField ansField2;
    private javax.swing.JTextField ansField3;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton editBtn1;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton imageBtn;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JButton nextBtn1;
    private javax.swing.JButton previousBtn;
    private javax.swing.JPanel question1;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn2;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JRadioButton selectAns1;
    private javax.swing.JRadioButton selectAns2;
    private javax.swing.JRadioButton selectAns3;
    // End of variables declaration//GEN-END:variables
}

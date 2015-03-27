/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class CourseFinder extends javax.swing.JPanel {

    ArrayList<Course> courseList;
    Course c1 = new Course("NCI", "Dublin", "ncirl.ie", 2500, 385, 8, 4);
    Course c2 = new Course("Waterford IT", "Waterford", "wit.ie", 2000, 405, 8, 4);
    Course c5 = new Course("Sligo IT", "Sligo", "itsligo.ie", 2000, 385, 6, 2);
    Course c6 = new Course("Royal College of Surgeons", "Dublin", "rcsi.ie", 3000, 600, 8, 2);
    Course c7 = new Course("Galway-Mayo IT", "Galway", "gmit.ie", 3000, 405, 7, 2);
    Course c8 = new Course("Waterford IT", "Waterford", "wit.ie", 2500, 555, 8, 1);
    Course c3 = new Course("University College Cork", "Cork", "ucc.ie", 2500, 405, 8, 4);
    Course c9 = new Course("Galway-Mayo IT", "Mayo", "gmit.ie", 2500, 385, 8, 4);
    Course c10 = new Course("Athlone IT", "Athlone", "ait.ie", 2000, 555, 7, 2);
    Course c4 = new Course("NCI", "Dublin", "ncirl.ie", 1500, 385, 6, 2);
    
    public CourseFinder() {
        initComponents();
        searchBtn.setEnabled(false);
        courseList = new ArrayList<>();

        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        courseList.add(c4);
        courseList.add(c5);
        courseList.add(c6);
        courseList.add(c7);
        courseList.add(c8);
        courseList.add(c9);
        courseList.add(c10);

        coursePanel.setLayout(new GridLayout(courseList.size(), 0, 0, 5));
        for (int i = 0; i < courseList.size(); i++) {
            CoursePanel p = new CoursePanel();
            p.setName(courseList.get(i).getName());
            p.setPrice(courseList.get(i).getPrice());
            p.setAddress(courseList.get(i).getAddress());
            p.setYears(courseList.get(i).getYears());
            p.setLevel(courseList.get(i).getLevel());
            p.setPoints(courseList.get(i).getPoints());
            p.setURL(courseList.get(i).getUrl());

            coursePanel.add(p);
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

        subjectGroup1 = new javax.swing.ButtonGroup();
        subjectGroup2 = new javax.swing.ButtonGroup();
        subjectGroup3 = new javax.swing.ButtonGroup();
        subjectGroup4 = new javax.swing.ButtonGroup();
        subjectGroup5 = new javax.swing.ButtonGroup();
        subjectGroup6 = new javax.swing.ButtonGroup();
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        instituteFilterLbl = new javax.swing.JLabel();
        priceFilterLbl = new javax.swing.JLabel();
        addressFilterLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        levelFilterLbl = new javax.swing.JLabel();
        levelTxtField = new javax.swing.JTextField();
        levelCheckBox = new javax.swing.JCheckBox();
        instituteTxtField = new javax.swing.JTextField();
        addressTxtField = new javax.swing.JTextField();
        priceTxtField = new javax.swing.JTextField();
        priceCheckBox = new javax.swing.JCheckBox();
        instituteCheckBox = new javax.swing.JCheckBox();
        addressCheckBox = new javax.swing.JCheckBox();
        searchBtn = new javax.swing.JButton();
        courseScrollPane = new javax.swing.JScrollPane();
        coursePanel = new javax.swing.JPanel();

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

        instituteFilterLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instituteFilterLbl.setForeground(new java.awt.Color(255, 255, 255));
        instituteFilterLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        instituteFilterLbl.setText("Institute Filter:");
        mainMenuPanel.add(instituteFilterLbl);
        instituteFilterLbl.setBounds(20, 130, 120, 20);

        priceFilterLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceFilterLbl.setForeground(new java.awt.Color(255, 255, 255));
        priceFilterLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceFilterLbl.setText("Price Filter:");
        mainMenuPanel.add(priceFilterLbl);
        priceFilterLbl.setBounds(20, 100, 120, 20);

        addressFilterLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressFilterLbl.setForeground(new java.awt.Color(255, 255, 255));
        addressFilterLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressFilterLbl.setText("Address Filter:");
        mainMenuPanel.add(addressFilterLbl);
        addressFilterLbl.setBounds(20, 70, 120, 20);

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
        screenTitleLbl.setText("Course Finder");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        levelFilterLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        levelFilterLbl.setForeground(new java.awt.Color(255, 255, 255));
        levelFilterLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelFilterLbl.setText("Level Filter:");
        mainMenuPanel.add(levelFilterLbl);
        levelFilterLbl.setBounds(20, 160, 120, 20);

        levelTxtField.setEditable(false);
        mainMenuPanel.add(levelTxtField);
        levelTxtField.setBounds(150, 160, 200, 20);

        levelCheckBox.setContentAreaFilled(false);
        levelCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelCheckBoxActionPerformed(evt);
            }
        });
        mainMenuPanel.add(levelCheckBox);
        levelCheckBox.setBounds(360, 160, 21, 21);

        instituteTxtField.setEditable(false);
        mainMenuPanel.add(instituteTxtField);
        instituteTxtField.setBounds(150, 130, 200, 20);

        addressTxtField.setEditable(false);
        mainMenuPanel.add(addressTxtField);
        addressTxtField.setBounds(150, 70, 200, 20);

        priceTxtField.setEditable(false);
        mainMenuPanel.add(priceTxtField);
        priceTxtField.setBounds(150, 100, 200, 20);

        priceCheckBox.setContentAreaFilled(false);
        priceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceCheckBoxActionPerformed(evt);
            }
        });
        mainMenuPanel.add(priceCheckBox);
        priceCheckBox.setBounds(360, 100, 21, 21);

        instituteCheckBox.setContentAreaFilled(false);
        instituteCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instituteCheckBoxActionPerformed(evt);
            }
        });
        mainMenuPanel.add(instituteCheckBox);
        instituteCheckBox.setBounds(360, 130, 21, 21);

        addressCheckBox.setContentAreaFilled(false);
        addressCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressCheckBoxActionPerformed(evt);
            }
        });
        mainMenuPanel.add(addressCheckBox);
        addressCheckBox.setBounds(360, 70, 20, 21);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(searchBtn);
        searchBtn.setBounds(160, 190, 80, 23);

        courseScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        courseScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        coursePanel.setBackground(new java.awt.Color(52, 152, 219));
        coursePanel.setLayout(new java.awt.GridLayout());
        courseScrollPane.setViewportView(coursePanel);

        mainMenuPanel.add(courseScrollPane);
        courseScrollPane.setBounds(10, 220, 380, 360);

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
            cl.show(getParent(), "EXTRAS_MENU");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void priceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceCheckBoxActionPerformed
        priceTxtField.setEditable(priceCheckBox.isSelected());
        checkSearchBtn();
    }//GEN-LAST:event_priceCheckBoxActionPerformed

    private void instituteCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instituteCheckBoxActionPerformed
        instituteTxtField.setEditable(instituteCheckBox.isSelected());
        checkSearchBtn();
    }//GEN-LAST:event_instituteCheckBoxActionPerformed

    private void addressCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressCheckBoxActionPerformed
        addressTxtField.setEditable(addressCheckBox.isSelected());
        checkSearchBtn();
    }//GEN-LAST:event_addressCheckBoxActionPerformed

    private void levelCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelCheckBoxActionPerformed
        levelTxtField.setEditable(levelCheckBox.isSelected());
        checkSearchBtn();
    }//GEN-LAST:event_levelCheckBoxActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed
    private void checkSearchBtn() {
        if (!addressTxtField.isEditable() && !instituteTxtField.isEditable() && !priceTxtField.isEditable() && !levelTxtField.isEditable()) {
            searchBtn.setEnabled(false);
        } else {
            searchBtn.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addressCheckBox;
    private javax.swing.JLabel addressFilterLbl;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JScrollPane courseScrollPane;
    private javax.swing.JButton homeBtn;
    private javax.swing.JCheckBox instituteCheckBox;
    private javax.swing.JLabel instituteFilterLbl;
    private javax.swing.JTextField instituteTxtField;
    private javax.swing.JCheckBox levelCheckBox;
    private javax.swing.JLabel levelFilterLbl;
    private javax.swing.JTextField levelTxtField;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JCheckBox priceCheckBox;
    private javax.swing.JLabel priceFilterLbl;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JButton searchBtn;
    private javax.swing.ButtonGroup subjectGroup1;
    private javax.swing.ButtonGroup subjectGroup2;
    private javax.swing.ButtonGroup subjectGroup3;
    private javax.swing.ButtonGroup subjectGroup4;
    private javax.swing.ButtonGroup subjectGroup5;
    private javax.swing.ButtonGroup subjectGroup6;
    // End of variables declaration//GEN-END:variables
}

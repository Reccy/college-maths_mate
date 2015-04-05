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
 * @author Elmo
 */
public class NotesGeometry extends javax.swing.JPanel {

    /*
     * Creates new form AlgebraMenu
     */
      int count;
      ArrayList<Notes> n = new ArrayList<>();
    Notes n1 = new Notes("The perimeter of a circle is called the circumference:\\n\\Circumference = 2π × radius\\n\\");//Page 1
    Notes n2 = new Notes("Finding the area of a triangle \\n\\Height = h = 12\\n\\Base = b = 20\\n\\Area = ½ × b × h = ½ × 20 × 12 = 120\\n\\");//Page 2
    Notes n3 = new Notes("Cartesian Coordinates\\n\\ example \\n\\Point (6,4) is\\n\\6 units across (in the x direction), and\\n\\4 units up (in the y direction)\\n\\So (6,4) means:\\n\\Go along 6 and then go up 4 then \"plot the dot\".\\n\\");//Page 3
    Notes n4 = new Notes("Pythagoras Theorem\\n\\Example\\n\\ A 3,4,5 Triangle has a right angle in it.\\n\\Let's check if the areas are the same:\\n\\32 + 42 = 52\\n\\Calculating this becomes:\\n\\9 + 16 = 25\\n\\It works ... like Magic!\\n\\");//Page 4
    
    public NotesGeometry() {
        initComponents();
         count = 0;
        n.add(n1);
        n.add(n2);
        notesArea.setText(n.get(count).getNote());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textField1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        textArea1 = new java.awt.TextArea();
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        notesArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        textField1.setText("textField1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/Examples.fw.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

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
        screenTitleLbl.setText("Geometry Notes");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/Geometry Diagram.fw.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        mainMenuPanel.add(jLabel3);
        jLabel3.setBounds(60, 70, 270, 230);

        notesArea.setColumns(20);
        notesArea.setRows(5);
        notesArea.setText("Far far away, behind the word mountains,\n far from the countries Vokalia and Cons\nonantia, there live the blind texts. Separ\nated they live in Bookmarksgrove right at th\ne coast of the Semantics, a large language o\ncean. A small river named Duden flows by th\neir place and supplies it with the necessa\nry regelialia. It is a paradisematic country, in which r\noasted parts of sentences fly into your mo\nuth. Even the all-powerful Pointing has\n no control about the blind texts it \nis an almost unorthographic life One d\nay however a small line of blind text by\n the name of Lorem Ipsum decided to leave f\nor the far World of Grammar. The Big Ox\nmox advised her not to do so, because ther\ne were thousands of bad Commas, wild Ques\ntion Marks and devious Semikoli, but the\n Little Blind Text didn’t listen. She \npacked her seven versalia, put her initi\nal into the belt an\nd \nma\n,,,,");
        jScrollPane4.setViewportView(notesArea);

        mainMenuPanel.add(jScrollPane4);
        jScrollPane4.setBounds(20, 310, 350, 190);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(jButton1);
        jButton1.setBounds(40, 530, 93, 29);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(jButton2);
        jButton2.setBounds(280, 530, 69, 31);

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

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "GEOMETRY_MENU");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    nextNote(); 
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    prevNote();                                             
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
     private void nextNote() {
        if(count + 1 >= n.size()){
            count = 0;
        } else {
            count++;
        }
        notesArea.setText(n.get(count).getNote());
    }
    
    private void prevNote() {
        if(count - 1 < 0){
            count = n.size() - 1;
        } else {
            count--;
        }
        notesArea.setText(n.get(count).getNote());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JLabel screenTitleLbl;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
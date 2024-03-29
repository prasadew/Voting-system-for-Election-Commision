/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eadcw;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author LENOVO
 */
public class userdashbord extends javax.swing.JFrame {
public String username;

    
    String rnic;
    Color defualt,clicked;
    public userdashbord(String getnic) {
        initComponents();
        rnic= getnic;
        defualt = new Color(13,36,51);
        clicked = new Color(240,151,57);
        
        btnprofile.setBackground(clicked);
        btnballot.setBackground(defualt);
        btncandidate.setBackground(defualt);
        btnabout.setBackground(defualt);
        btnlogout.setBackground(defualt);
        
        userprofile up = new userprofile();
        panelview.removeAll();
        panelview.add(up).setVisible(true);
        
        time();
        date();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnprofile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnballot = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btncandidate = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnabout = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        txthi = new javax.swing.JLabel();
        panelview = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnprofile.setBackground(new java.awt.Color(0, 0, 51));
        btnprofile.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnprofileMouseMoved(evt);
            }
        });
        btnprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprofileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnprofileMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER PROFILE");

        javax.swing.GroupLayout btnprofileLayout = new javax.swing.GroupLayout(btnprofile);
        btnprofile.setLayout(btnprofileLayout);
        btnprofileLayout.setHorizontalGroup(
            btnprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnprofileLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btnprofileLayout.setVerticalGroup(
            btnprofileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnprofileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 40));

        btnballot.setBackground(new java.awt.Color(0, 0, 51));
        btnballot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnballotMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BALLOT ");

        javax.swing.GroupLayout btnballotLayout = new javax.swing.GroupLayout(btnballot);
        btnballot.setLayout(btnballotLayout);
        btnballotLayout.setHorizontalGroup(
            btnballotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnballotLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        btnballotLayout.setVerticalGroup(
            btnballotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnballotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(btnballot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, 40));

        btncandidate.setBackground(new java.awt.Color(0, 0, 51));
        btncandidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncandidateMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INSTRUCTIONS");

        javax.swing.GroupLayout btncandidateLayout = new javax.swing.GroupLayout(btncandidate);
        btncandidate.setLayout(btncandidateLayout);
        btncandidateLayout.setHorizontalGroup(
            btncandidateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncandidateLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        btncandidateLayout.setVerticalGroup(
            btncandidateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncandidateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(btncandidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, 40));

        btnlogout.setBackground(new java.awt.Color(0, 0, 51));
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LOG OUT");

        javax.swing.GroupLayout btnlogoutLayout = new javax.swing.GroupLayout(btnlogout);
        btnlogout.setLayout(btnlogoutLayout);
        btnlogoutLayout.setHorizontalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlogoutLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        btnlogoutLayout.setVerticalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 140, 40));

        btnabout.setBackground(new java.awt.Color(0, 0, 51));
        btnabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaboutMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ABOUT");

        javax.swing.GroupLayout btnaboutLayout = new javax.swing.GroupLayout(btnabout);
        btnabout.setLayout(btnaboutLayout);
        btnaboutLayout.setHorizontalGroup(
            btnaboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnaboutLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        btnaboutLayout.setVerticalGroup(
            btnaboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnaboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(btnabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 490));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons8-macos-close-24.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        jLabel5.setText("Welcome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\download (2).png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Election Commision of Sri Lanka");
        jLabel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel3FocusGained(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 10));

        lbltime.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        lbltime.setText("jLabel10");
        jPanel1.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 60, -1));

        lbldate.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbldate.setText("jLabel10");
        jPanel1.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 60, -1));

        txthi.setText("jLabel3");
        jPanel1.add(txthi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 200, -1));
        txthi.getAccessibleContext().setAccessibleDescription("");

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 30));

        panelview.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelviewLayout = new javax.swing.GroupLayout(panelview);
        panelview.setLayout(panelviewLayout);
        panelviewLayout.setHorizontalGroup(
            panelviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        panelviewLayout.setVerticalGroup(
            panelviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel4.add(panelview, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 810, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(865, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnprofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprofileMouseClicked
        // TODO add your handling code here:
        btnprofile.setBackground(clicked);
        btnballot.setBackground(defualt);
        btncandidate.setBackground(defualt);
        btnabout.setBackground(defualt);
        btnlogout.setBackground(defualt);
        
        userprofile up = new userprofile();
        panelview.removeAll();
        panelview.add(up).setVisible(true);
    }//GEN-LAST:event_btnprofileMouseClicked

    private void btnballotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnballotMouseClicked
        // TODO add your handling code here:
        btnprofile.setBackground(defualt);
        btnballot.setBackground(clicked);
        btncandidate.setBackground(defualt);
        btnabout.setBackground(defualt);
        btnlogout.setBackground(defualt);
        ballot bal = new ballot();
        panelview.removeAll();
        panelview.add(bal).setVisible(true);
        
        
    }//GEN-LAST:event_btnballotMouseClicked

    private void btncandidateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncandidateMouseClicked
        // TODO add your handling code here:
        btnprofile.setBackground(defualt);
        btnballot.setBackground(defualt);
        btncandidate.setBackground(clicked);
        btnabout.setBackground(defualt);
        btnlogout.setBackground(defualt);
        instructions ins = new instructions();
        panelview.removeAll();
        panelview.add(ins).setVisible(true);
    }//GEN-LAST:event_btncandidateMouseClicked

    private void btnaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaboutMouseClicked
        // TODO add your handling code here:
        btnprofile.setBackground(defualt);
        btnballot.setBackground(defualt);
        btncandidate.setBackground(defualt);
        btnabout.setBackground(clicked);
        btnlogout.setBackground(defualt);
        about ab = new about();
        panelview.removeAll();
        panelview.add(ab).setVisible(true);
    }//GEN-LAST:event_btnaboutMouseClicked

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:
        btnprofile.setBackground(defualt);
        btnballot.setBackground(defualt);
        btncandidate.setBackground(defualt);
        btnabout.setBackground(defualt);
        btnlogout.setBackground(clicked);
        this.dispose();
        login log=new login();
        log.setVisible(true);
        
        
    }//GEN-LAST:event_btnlogoutMouseClicked
    public void time() {
    new Timer(0, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date d = new Date();
            SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss a");
            lbltime.setText(a.format(d));
        }
    }).start();
}
    public void date(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        lbldate.setText(s.format(d));
    }
    private void btnprofileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprofileMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnprofileMousePressed

    private void btnprofileMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprofileMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprofileMouseMoved

    private void jLabel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3FocusGained

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
            java.util.logging.Logger.getLogger(userdashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userdashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userdashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userdashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new userdashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnabout;
    private javax.swing.JPanel btnballot;
    private javax.swing.JPanel btncandidate;
    private javax.swing.JPanel btnlogout;
    private javax.swing.JPanel btnprofile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbltime;
    private javax.swing.JPanel panelview;
    public javax.swing.JLabel txthi;
    // End of variables declaration//GEN-END:variables
}

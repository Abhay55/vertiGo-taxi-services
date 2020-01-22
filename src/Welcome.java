import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Welcome extends javax.swing.JFrame {   
     ImageIcon S1=new ImageIcon("E://board_pics//welcome1.jpg");
     ImageIcon S2=new ImageIcon("E://board_pics//logo_det.jpg");
     ImageIcon S3=new ImageIcon("E://board_pics//customer.jpg");        
     ImageIcon S4=new ImageIcon("E://board_pics//excellentservice.jpg");
     static int i=0;
       
    public Welcome() {
        initComponents();
        l1.setIcon(S1);
        final Timer t=new Timer();
        t.scheduleAtFixedRate(new TimerTask()
        {
            public void run()
            { i=i+4;
                if (i==04){l1.setIcon(S1); r1.setSelected(true);}
                if (i==200){l1.setIcon(S2);  r2.setSelected(true);}
                if (i==500){l1.setIcon(S3); r3.setSelected(true);}
                if (i==900){l1.setIcon(S4); r4.setSelected(true);}
                if (i==1300)i=0;               
            }
        },0,20);
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        p1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        p1.setBackground(new java.awt.Color(153, 204, 255));
        p1.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        p1.setForeground(new java.awt.Color(0, 102, 102));
        p1.setMaximum(800);
        p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        p1.setOpaque(true);
        p1.setStringPainted(true);
        getContentPane().add(p1);
        p1.setBounds(100, 540, 240, 30);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jLabel1.setMaximumSize(new java.awt.Dimension(245, 308));
        jLabel1.setMinimumSize(new java.awt.Dimension(245, 308));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 380, 250, 280);

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Continue to VertiGO Taxi Service");
        jButton2.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(37, 460, 370, 50);

        l1.setMaximumSize(new java.awt.Dimension(750, 300));
        l1.setMinimumSize(new java.awt.Dimension(750, 300));
        l1.setPreferredSize(new java.awt.Dimension(750, 300));
        getContentPane().add(l1);
        l1.setBounds(0, 0, 750, 300);

        buttonGroup1.add(r1);
        r1.setForeground(new java.awt.Color(0, 102, 102));
        r1.setOpaque(false);
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1MouseClicked(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(210, 320, 20, 21);

        buttonGroup1.add(r4);
        r4.setOpaque(false);
        r4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r4MouseClicked(evt);
            }
        });
        getContentPane().add(r4);
        r4.setBounds(400, 320, 21, 20);

        buttonGroup1.add(r2);
        r2.setOpaque(false);
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2MouseClicked(evt);
            }
        });
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2);
        r2.setBounds(270, 320, 21, 21);

        buttonGroup1.add(r3);
        r3.setOpaque(false);
        r3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r3MouseClicked(evt);
            }
        });
        getContentPane().add(r3);
        r3.setBounds(340, 320, 21, 21);

        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         final Timer t=new Timer();
        t.scheduleAtFixedRate(new TimerTask()
        {   public void run()
            {   p1.setValue(p1.getValue()+2);           
                if(p1.getValue()>=800)
                 { t.cancel();
                   new Login_Page().setVisible(true); chk();
                 }
            }
        },0,5);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseClicked
    i=200;
    l1.setIcon(S2);
    }//GEN-LAST:event_r2MouseClicked

    private void r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseClicked
    i=04;
    l1.setIcon(S1);
    }//GEN-LAST:event_r1MouseClicked

    private void r3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r3MouseClicked
        i=500;
        l1.setIcon(S3);
    }//GEN-LAST:event_r3MouseClicked

    private void r4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r4MouseClicked
i=900;
l1.setIcon(S4);
    }//GEN-LAST:event_r4MouseClicked

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

public void chk()
{ this.dispose();
}

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JProgressBar p1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}
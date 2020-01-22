import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Admin_account extends javax.swing.JFrame {

    public Admin_account() {
        initComponents();
        
    try{ 
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select * from currentadmin;";
        ResultSet rs1=stmt.executeQuery(query);
        
        while(rs1.next())
            { String curname=rs1.getString("name");
             jLabel2.setText(""+curname);
            }
          }
    
    catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("View Users");
        jButton1.setMaximumSize(new java.awt.Dimension(133, 35));
        jButton1.setMinimumSize(new java.awt.Dimension(133, 35));
        jButton1.setPreferredSize(new java.awt.Dimension(133, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(113, 235, 150, 70);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Drivers");
        jButton2.setMaximumSize(new java.awt.Dimension(133, 35));
        jButton2.setMinimumSize(new java.awt.Dimension(133, 35));
        jButton2.setPreferredSize(new java.awt.Dimension(133, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(283, 235, 140, 70);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Income/Outcome");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(143, 365, 180, 70);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Bookings");
        jButton4.setMaximumSize(new java.awt.Dimension(133, 35));
        jButton4.setMinimumSize(new java.awt.Dimension(133, 35));
        jButton4.setPreferredSize(new java.awt.Dimension(133, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 235, 133, 70);

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setText("Feedbacks");
        jButton7.setMaximumSize(new java.awt.Dimension(133, 35));
        jButton7.setMinimumSize(new java.awt.Dimension(133, 35));
        jButton7.setPreferredSize(new java.awt.Dimension(133, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(371, 365, 160, 70);

        jButton6.setBackground(new java.awt.Color(255, 164, 131));
        jButton6.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 102, 0));
        jButton6.setText("Log Out");
        jButton6.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(250, 480, 150, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("ADMIN ACCOUNT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 150, 220, 40);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Welcome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 80, 130, 40);

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(610, 80, 90, 40);

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new View_Users().setVisible(true);
this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Drivers().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new Income().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new Bookings().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
new Feedbacks().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     try
      {Class.forName("java.sql.DriverManager");
       Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="delete from currentadmin;";
        stmt.executeUpdate(query);
         new Login_Page().setVisible(true);
        this.dispose();
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(this, e.getMessage());
      }
      new Login_Page().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class User_account extends javax.swing.JFrame {
    public User_account() {
        initComponents();
    try{ 
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select * from currentuser;";
        ResultSet rs1=stmt.executeQuery(query);    
        
        while(rs1.next())
            { String curname=rs1.getString("name");
             jButton7.setText(""+curname);   
            }
       }
        
    
    catch (Exception e)
        { JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Book Now");
        jButton1.setMaximumSize(new java.awt.Dimension(250, 200));
        jButton1.setMinimumSize(new java.awt.Dimension(250, 200));
        jButton1.setPreferredSize(new java.awt.Dimension(250, 200));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 280, 200, 85);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Booking History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 400, 250, 90);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Account Settings");
        jButton4.setMaximumSize(new java.awt.Dimension(250, 200));
        jButton4.setMinimumSize(new java.awt.Dimension(250, 200));
        jButton4.setPreferredSize(new java.awt.Dimension(250, 200));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 280, 250, 85);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("Feedback");
        jButton5.setMaximumSize(new java.awt.Dimension(250, 200));
        jButton5.setMinimumSize(new java.awt.Dimension(250, 200));
        jButton5.setPreferredSize(new java.awt.Dimension(250, 200));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(110, 400, 200, 85);

        jButton6.setBackground(new java.awt.Color(255, 164, 131));
        jButton6.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 102, 0));
        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(230, 550, 280, 60);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("USER ACCOUNT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 190, 200, 40);

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setText("Displays_name");
        jButton7.setMaximumSize(new java.awt.Dimension(250, 200));
        jButton7.setMinimumSize(new java.awt.Dimension(250, 200));
        jButton7.setPreferredSize(new java.awt.Dimension(250, 200));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(530, 80, 200, 85);

        theme_label.setBackground(new java.awt.Color(153, 204, 255));
        theme_label.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        theme_label.setForeground(new java.awt.Color(0, 102, 153));
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
try
   {   Class.forName("java.sql.DriverManager");
       Connection con=(Connection)
       DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
       Statement stmt=(Statement) con.createStatement();
       String query="delete from currentuser;";
       stmt.executeUpdate(query);
       new Login_Page().setVisible(true);
       this.dispose();
   }
catch (Exception e)
      {JOptionPane.showMessageDialog(this, e.getMessage());
      }     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Feedback().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new Booking_History().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     new Account_Settings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 new Book_A_Taxi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    new View_details().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

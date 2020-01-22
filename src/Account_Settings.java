import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Account_Settings extends javax.swing.JFrame {
static String Name,cur_id, pass,mobno;

public Account_Settings() 
{
    initComponents();
        t1.setVisible(false);
        b1.setVisible(false);
        t2.setVisible(false);
        b2.setVisible(false);
        t3.setVisible(false);
        b3.setVisible(false);
 try
    {  
     
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select user_id from currentuser;";
        ResultSet rs=stmt.executeQuery(query);
        while (rs.next())
            {
                cur_id=rs.getString("user_id");
            }
    }
 catch (Exception e)
    {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
  
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Change Mobile Number");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(470, 270, 250, 110);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Change Name");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 270, 190, 110);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Sitka Heading", 0, 25)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Change Password");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 270, 220, 110);

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 102));
        jButton6.setText("Back");
        jButton6.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(270, 560, 150, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("SETTINGS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 170, 170, 60);
        getContentPane().add(t1);
        t1.setBounds(270, 420, 180, 30);

        b1.setBackground(new java.awt.Color(204, 204, 255));
        b1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 153, 153));
        b1.setText("OK...");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(310, 460, 100, 33);

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        getContentPane().add(t3);
        t3.setBounds(270, 420, 180, 30);

        b2.setBackground(new java.awt.Color(204, 204, 255));
        b2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 153, 153));
        b2.setText("OK...");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(310, 460, 100, 33);

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(270, 420, 180, 30);

        b3.setBackground(new java.awt.Color(204, 204, 255));
        b3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 153, 153));
        b3.setText("OK...");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(310, 460, 100, 33);

        theme_label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        theme_label.setOpaque(true);
        theme_label.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
JOptionPane.showMessageDialog(this, "Please Enter your name in text field & press OK button");
                           b2.setVisible(true);
                           t2.setVisible(true);
                           b1.setVisible(false);
                           t1.setVisible(false);
                           b3.setVisible(false);
                           t3.setVisible(false);
                           t2.requestFocus();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JOptionPane.showMessageDialog(this, "Please Enter your new mobile in text field & press OK button");
                          b3.setVisible(true);
                          t3.setVisible(true);
                          b2.setVisible(false);
                          t2.setVisible(false);
                          b1.setVisible(false);
                          t1.setVisible(false);
                          t1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       JOptionPane.showMessageDialog(this, "Please Enter your new password in text field & press OK button");
                           b1.setVisible(true);
                           t1.setVisible(true);
                           b3.setVisible(false);
                           t3.setVisible(false);
                           b2.setVisible(false);
                           t2.setVisible(false);
                           t3.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new User_account().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
pass=t1.getText();
try{    
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query1="Update users set password='"+pass+"' where user_id="+cur_id+";";
        stmt.executeUpdate(query1);
        String query2="Update currentuser set password='"+pass+"' where user_id="+cur_id+";";
        stmt.executeUpdate(query2);
        JOptionPane.showMessageDialog(this, "Password changed Successfully");
        t1.setVisible(false);
        b1.setVisible(false);
    }
catch (Exception e)
    {
          JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
  Name=t2.getText();
    try{    
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query1="Update users set name='"+Name+"' where user_id="+cur_id+";";
        stmt.executeUpdate(query1);
        String query2="Update currentuser set name='"+Name+"' where user_id="+cur_id+";";
        stmt.executeUpdate(query2);
        JOptionPane.showMessageDialog(this, "Name changed Successfully");
        t2.setVisible(false);
        b2.setVisible(false);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(this, e.getMessage());
      }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        mobno=t3.getText();
    try{    
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query1="Update users set mobile='"+mobno+"' where user_id="+cur_id+";";
        stmt.executeUpdate(query1);
        String query2="Update currentuser set mobile='"+mobno+"' where user_id="+cur_id+";";
        stmt.executeUpdate(query2);
        JOptionPane.showMessageDialog(this, "Mobile No. changed Successfully");
        t3.setVisible(false);
        b3.setVisible(false);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(this, e.getMessage());
      }
    }//GEN-LAST:event_b3ActionPerformed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
char kc=evt.getKeyChar();
         if(!((kc>='a' && kc<='z')||kc==KeyEvent.VK_SPACE||(kc>='A' && kc<='Z')))
         evt.consume();      
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
       char kc=evt.getKeyChar();
        if ((!(kc>='0'&& kc<='9'))|| t3.getText().length()>=10)
    evt.consume();
    }//GEN-LAST:event_t3KeyTyped

   
    public static void main(String args[]) {
              java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                new Account_Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class View_details extends javax.swing.JFrame {
    
    public View_details() {
    initComponents();
     Account_Settings as=new Account_Settings();
            String cur_id=as.cur_id;
       
   try
      { Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select * from users where user_id='"+cur_id+"';";
        ResultSet rs=stmt.executeQuery(query);
        
        while (rs.next())
        {   int id=Integer.parseInt(rs.getString("user_id"));
            String Name=rs.getString("name");
            String Email=rs.getString("email");
            String password=rs.getString("password");
            String mobile=rs.getString("mobile");
            int balance =Integer.parseInt(rs.getString("balance"));
            t1.setText(id+"");
            t2.setText(Name);
            t3.setText(Email);
            t4.setText(password);
            t5.setText(mobile);
            t6.setText(balance+"");           
        }
      }
    catch(Exception e)
              {
                  JOptionPane.showMessageDialog(this, e.getMessage());
              }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("User ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(181, 294, 65, 23);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(181, 338, 49, 23);

        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(181, 382, 49, 23);

        jLabel4.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(181, 426, 76, 23);

        jLabel5.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Mobile");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(181, 470, 62, 23);

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("VertiGO cash");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(181, 514, 111, 23);

        t1.setMaximumSize(new java.awt.Dimension(200, 25));
        t1.setMinimumSize(new java.awt.Dimension(200, 25));
        t1.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(t1);
        t1.setBounds(368, 294, 200, 25);

        t2.setMaximumSize(new java.awt.Dimension(200, 25));
        t2.setMinimumSize(new java.awt.Dimension(200, 25));
        t2.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(t2);
        t2.setBounds(368, 338, 200, 25);

        t3.setMaximumSize(new java.awt.Dimension(200, 25));
        t3.setMinimumSize(new java.awt.Dimension(200, 25));
        t3.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(t3);
        t3.setBounds(368, 382, 200, 25);

        t4.setMaximumSize(new java.awt.Dimension(200, 25));
        t4.setMinimumSize(new java.awt.Dimension(200, 25));
        t4.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(t4);
        t4.setBounds(368, 426, 200, 25);

        t5.setMaximumSize(new java.awt.Dimension(200, 25));
        t5.setMinimumSize(new java.awt.Dimension(200, 25));
        t5.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(t5);
        t5.setBounds(368, 470, 200, 25);

        t6.setMaximumSize(new java.awt.Dimension(200, 25));
        t6.setMinimumSize(new java.awt.Dimension(200, 25));
        t6.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(t6);
        t6.setBounds(368, 514, 200, 25);

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Back");
        jButton2.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(264, 603, 150, 60);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Your Details:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(289, 178, 180, 50);

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setText("jLabel1");
        theme_label.setMaximumSize(new java.awt.Dimension(750, 700));
        theme_label.setMinimumSize(new java.awt.Dimension(750, 700));
        theme_label.setOpaque(true);
        theme_label.setPreferredSize(new java.awt.Dimension(750, 700));
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new User_account().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(View_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

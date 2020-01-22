import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Ride_summary extends javax.swing.JFrame {

    public Ride_summary() {
        initComponents();
        Bill bill=new Bill();
        Book_A_Taxi book =new  Book_A_Taxi();
        
        Double tot=bill.amt;
        Double prebal=book.bal +bill.amt;
        Double presbal=bill.balance;
        int ride_id=Book_A_Taxi.ride_id -1;
        String jrdat=(bill.jr_date);
        int jrdate=0;int n=0,countdd=0,counta=0;
        jrdate=Integer.parseInt(jrdat);
        String drivern = "a",mob = "1";
        int driver_id=-5;        
     try
      { Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
       
       String query ="Update Driver_Details,availability Set avail=0 where Driver_ID=Driverid and avail_date='"+jrdate+"'; ";
       stmt.executeUpdate(query);        
        
       String query0="Select * from driver_details where avail=1;";
       ResultSet rs=stmt.executeQuery(query0);
       
       while (rs.next())
        {     n++; 
              driver_id=Integer.parseInt(rs.getString("Driver_ID"));
              drivern=rs.getString("name");
              mob=rs.getString("mobile");
        }
       
       if (n>0)
        {    
       String quer="insert into availability values( '"+driver_id+"','"+drivern+"','"+jrdate+"');";
       stmt.executeUpdate(quer);
       
       Statement stmt1=(Statement) con.createStatement();
       String query1="update bookings set driver='"+drivern+"' where ride_id='"+ride_id+"';";
       stmt1.executeUpdate(query1);
        
        Statement stmt2=(Statement) con.createStatement();
        String query2="update ride_details set driver='"+drivern+"'where ride_id='"+ride_id+"';";
        stmt2.executeUpdate(query2);
        
        t1.setText(""+ride_id);
        t2.setText(""+prebal);
        t6.setText(""+tot);
        t3.setText(""+presbal);
        t4.setText(drivern);
        t5.setText(mob);
        }
       
        else
         {  JOptionPane.showMessageDialog(this, "Sorry,All Drivers Booked,try for Another Date");
            new User_account().setVisible(true);
            this.dispose();
         } 
      }
      catch(Exception e)
              { JOptionPane.showMessageDialog(this, e.getMessage());
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
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel1.setText("Ride id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 230, 110, 40);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel2.setText("Previous balance");
        jLabel2.setMaximumSize(new java.awt.Dimension(135, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(135, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(135, 25));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 270, 170, 30);

        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel3.setText("Present balance");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 350, 126, 23);

        jLabel4.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel4.setText("Your Driver");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 430, 101, 23);

        jLabel5.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel5.setText("Driver's no.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 470, 94, 23);

        t1.setMaximumSize(new java.awt.Dimension(135, 25));
        t1.setMinimumSize(new java.awt.Dimension(135, 25));
        t1.setPreferredSize(new java.awt.Dimension(135, 25));
        getContentPane().add(t1);
        t1.setBounds(340, 230, 218, 25);

        t2.setMaximumSize(new java.awt.Dimension(135, 25));
        t2.setMinimumSize(new java.awt.Dimension(135, 25));
        t2.setPreferredSize(new java.awt.Dimension(135, 25));
        getContentPane().add(t2);
        t2.setBounds(340, 270, 218, 25);

        t3.setMaximumSize(new java.awt.Dimension(135, 25));
        t3.setMinimumSize(new java.awt.Dimension(135, 25));
        t3.setPreferredSize(new java.awt.Dimension(135, 25));
        getContentPane().add(t3);
        t3.setBounds(340, 350, 218, 25);

        t4.setMaximumSize(new java.awt.Dimension(135, 25));
        t4.setMinimumSize(new java.awt.Dimension(135, 25));
        t4.setPreferredSize(new java.awt.Dimension(135, 25));
        getContentPane().add(t4);
        t4.setBounds(340, 430, 218, 25);

        t5.setMaximumSize(new java.awt.Dimension(135, 25));
        t5.setMinimumSize(new java.awt.Dimension(135, 25));
        t5.setPreferredSize(new java.awt.Dimension(135, 25));
        getContentPane().add(t5);
        t5.setBounds(340, 470, 218, 25);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Home");
        jButton1.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 560, 150, 50);

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel6.setText("Amount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 310, 69, 23);

        t6.setMaximumSize(new java.awt.Dimension(135, 25));
        t6.setMinimumSize(new java.awt.Dimension(135, 25));
        t6.setPreferredSize(new java.awt.Dimension(135, 25));
        getContentPane().add(t6);
        t6.setBounds(340, 310, 218, 25);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("RIDE SUMMARY");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 160, 240, 40);

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new User_account().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ride_summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ride_summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ride_summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ride_summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ride_summary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
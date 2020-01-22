import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Bill extends javax.swing.JFrame {
    String car = null,depr = null,arr = null,jr_date = null,time = null;
        char ac; static  double sub_total=0.0,balance;
        static int rate=0,ride_id,user_id; double ac_amt=0.0,amt=500.0;
  
    public Bill() {
        initComponents();
            Book_A_Taxi book =new  Book_A_Taxi();
            int dist=book.distance;
            t1.setText(""+dist);
            car =book.car;
            ac=book.ac;
            depr=book.depr;
            arr=book.arr;
            jr_date=book.jr_date;
            time=book.jrtime;
            ride_id=book.ride_id;
            user_id=book.user_id;
            balance=book.bal;
            t15.setText(""+balance);
            t3.setText(car);
            t9.setText(depr);
            t10.setText(arr);
            t11.setText(jr_date);
            t12.setText(time);

            if (car.equals("Innova"))rate=12;
            else if (car.equals("Swift Dzire"))rate=10;
            else rate=8;
            t4.setText(""+rate);
      
        
        if (ac=='y')
        {t5.setText(""+"1.50"); ac_amt=1.5*dist; t6.setText(""+ ac_amt);
        }
        else     
        {  t5.setText(""+"0.00"); ac_amt=0.0*dist; t6.setText(""+ ac_amt);
        }
        sub_total=( (dist-20)*rate + ac_amt+150);
        t7.setText(""+sub_total);
        double tax= 0.145*sub_total;
        tax=(Math.round(tax*10.0))/10.0;
        t8.setText(""+tax);
        double total = sub_total+tax;
        t14.setText(""+total);
        amt=total;
        t13.setText(""+ride_id);
    
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        theme_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t14 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t15 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        theme_label1 = new javax.swing.JLabel();

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Distance");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 370, 70, 23);

        jLabel4.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Sub Total");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 510, 83, 23);

        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("AC rate /km");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 450, 103, 23);

        jLabel5.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Min charge (for 20km)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 370, 186, 23);

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Car Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 420, 76, 25);

        jLabel7.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Total");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 560, 90, 30);

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t1.setMaximumSize(new java.awt.Dimension(130, 25));
        t1.setMinimumSize(new java.awt.Dimension(130, 25));
        t1.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t1);
        t1.setBounds(210, 370, 120, 25);

        t2.setEditable(false);
        t2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t2.setText("Rs. 150");
        t2.setMaximumSize(new java.awt.Dimension(130, 25));
        t2.setMinimumSize(new java.awt.Dimension(130, 25));
        t2.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t2);
        t2.setBounds(570, 370, 120, 25);

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t3.setMaximumSize(new java.awt.Dimension(130, 25));
        t3.setMinimumSize(new java.awt.Dimension(130, 25));
        t3.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t3);
        t3.setBounds(310, 420, 140, 25);

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t4.setMaximumSize(new java.awt.Dimension(130, 25));
        t4.setMinimumSize(new java.awt.Dimension(130, 25));
        t4.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t4);
        t4.setBounds(460, 420, 60, 25);

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t5.setMaximumSize(new java.awt.Dimension(130, 25));
        t5.setMinimumSize(new java.awt.Dimension(130, 25));
        t5.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t5);
        t5.setBounds(390, 450, 60, 25);

        t6.setEditable(false);
        t6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t6.setMaximumSize(new java.awt.Dimension(130, 25));
        t6.setMinimumSize(new java.awt.Dimension(130, 25));
        t6.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t6);
        t6.setBounds(460, 450, 60, 25);

        t7.setEditable(false);
        t7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t7.setMaximumSize(new java.awt.Dimension(130, 25));
        t7.setMinimumSize(new java.awt.Dimension(130, 25));
        t7.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t7);
        t7.setBounds(360, 510, 120, 25);

        t8.setEditable(false);
        t8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t8.setMaximumSize(new java.awt.Dimension(130, 25));
        t8.setMinimumSize(new java.awt.Dimension(130, 25));
        t8.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t8);
        t8.setBounds(360, 540, 120, 25);

        b1.setBackground(new java.awt.Color(153, 204, 255));
        b1.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 102, 102));
        b1.setText("Confirm ride");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(130, 615, 137, 50);

        t9.setEditable(false);
        t9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t9.setMaximumSize(new java.awt.Dimension(130, 25));
        t9.setMinimumSize(new java.awt.Dimension(130, 25));
        t9.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t9);
        t9.setBounds(210, 230, 120, 25);

        t10.setEditable(false);
        t10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t10.setMaximumSize(new java.awt.Dimension(130, 25));
        t10.setMinimumSize(new java.awt.Dimension(130, 25));
        t10.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t10);
        t10.setBounds(210, 270, 120, 25);

        t11.setEditable(false);
        t11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t11.setMaximumSize(new java.awt.Dimension(130, 25));
        t11.setMinimumSize(new java.awt.Dimension(130, 25));
        t11.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t11);
        t11.setBounds(210, 300, 120, 25);

        t12.setEditable(false);
        t12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t12.setMaximumSize(new java.awt.Dimension(130, 25));
        t12.setMinimumSize(new java.awt.Dimension(130, 25));
        t12.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t12);
        t12.setBounds(210, 330, 120, 25);

        t13.setEditable(false);
        t13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t13.setMaximumSize(new java.awt.Dimension(130, 25));
        t13.setMinimumSize(new java.awt.Dimension(130, 25));
        t13.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t13);
        t13.setBounds(580, 230, 120, 25);

        jLabel8.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Departure");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 230, 82, 23);

        jLabel9.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Arrival");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 270, 59, 23);

        jLabel10.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 300, 38, 23);

        jLabel11.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Time");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(120, 330, 44, 23);

        jLabel12.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Ride ID");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(440, 230, 100, 23);

        jLabel13.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Tax");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(270, 540, 44, 23);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Acc to 14.5%");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 540, 120, 23);

        t14.setEditable(false);
        t14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t14.setMaximumSize(new java.awt.Dimension(130, 25));
        t14.setMinimumSize(new java.awt.Dimension(130, 25));
        t14.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t14);
        t14.setBounds(360, 570, 120, 25);

        jLabel14.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("VertiGO Money");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(400, 270, 200, 30);

        t15.setEditable(false);
        t15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        t15.setMaximumSize(new java.awt.Dimension(130, 25));
        t15.setMinimumSize(new java.awt.Dimension(130, 25));
        t15.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(t15);
        t15.setBounds(580, 270, 120, 25);

        b2.setBackground(new java.awt.Color(153, 204, 255));
        b2.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 102, 102));
        b2.setText("Edit Details");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(430, 621, 127, 40);

        jLabel15.setFont(new java.awt.Font("Sitka Small", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("BILL");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 170, 267, 32);

        theme_label1.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        theme_label1.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label1.setOpaque(true);
        getContentPane().add(theme_label1);
        theme_label1.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        if (balance < amt) {
         JOptionPane.showMessageDialog(this,"Insufficient Account Balance");
         new User_account().setVisible(true);
         this.dispose();
        }
        
        else {
        balance=balance-amt;
        
                try {

                        Class.forName("java.sql.DriverManager");
                        Connection con=(Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                        Statement stmt=(Statement) con.createStatement();
                        String query1="INSERT INTO ride_details VALUES( "+ride_id+" , "+user_id+",'"+depr+"','"+arr+"','"+jr_date+"','"+time+"',"+amt+",'"+ac+"','"+car+"',null);";
                        stmt.executeUpdate(query1);
                        String query0="Update Driver_Details,availability Set avail=1; ";
                        stmt.executeUpdate(query0);
                        String query2="INSERT INTO bookings VALUES( "+ride_id+" , "+user_id+","+amt+",'"+jr_date+"','"+depr+"','"+arr+"',null);";
                        stmt.executeUpdate(query2);
                         String query3="UPDATE users set balance="+balance+" where user_id="+user_id+";";
                        stmt.executeUpdate(query3);
                        String query4="UPDATE currentuser set balance="+balance+" where user_id="+user_id+";";
                        stmt.executeUpdate(query4);         

                        JOptionPane.showMessageDialog(this,"Successfully Added Your ride Id is: "+ride_id+" Please Save It For Future Reference");
                         new Ride_summary().setVisible(true);
                        this.dispose();
                    }

                catch(Exception e)

                   {JOptionPane.showMessageDialog(this,e.getMessage());                                
                   }
             }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
 new Book_A_Taxi().setVisible(true);
 this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JLabel theme_label;
    private javax.swing.JLabel theme_label1;
    // End of variables declaration//GEN-END:variables
}

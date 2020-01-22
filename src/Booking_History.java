import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Booking_History extends javax.swing.JFrame {
String curname;
int user_id;

public Booking_History() {
     initComponents();
     DefaultTableModel model =(DefaultTableModel)
     tb1.getModel();
try{ 
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select * from currentuser;";
        ResultSet rs1=stmt.executeQuery(query);
        
        while(rs1.next())
        {   curname=rs1.getString("name");
            t2.setText(""+curname);
            user_id=Integer.parseInt(rs1.getString("user_id"));
        }
       Statement stmt1=(Statement) con.createStatement();
       String query1="Select * from bookings where user_id='"+user_id+"';";
       ResultSet rs2=stmt1.executeQuery(query1);
        while (rs2.next())
        {  String ride_id=rs2.getString("ride_id");
            String amount=rs2.getString("amount");
            String Date=rs2.getString("date");
            String depart=rs2.getString("departure");
            String arrival=rs2.getString("arrival");
            String drivername=rs2.getString("Driver"); 
            model.addRow(new Object[]{ride_id,amount,Date,depart,arrival,drivername});
        }
    }

catch (Exception e)
    { JOptionPane.showMessageDialog(this,e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        tb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        tb1.setFont(new java.awt.Font("Sitka Subheading", 0, 15)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ride ID", "Amount", "Date", "From", "To", "Driver "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setOpaque(false);
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(2, 250, 750, 300);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Signed in As:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 80, 130, 23);

        t2.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(t2);
        t2.setBounds(590, 80, 135, 25);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("BOOKING HISTORY");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 160, 240, 40);

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
        jButton2.setBounds(310, 600, 150, 60);

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new User_account().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel t2;
    private javax.swing.JTable tb1;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Income extends javax.swing.JFrame {

    public Income() {
        initComponents();
        double amt=0,damt=0,mamt=0,net=0;
  
    try{ 
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();        
        String query="Select sum(amount) from bookings;";        
        ResultSet rs=stmt.executeQuery(query);
        
        while(rs.next())
        {  amt=Double.parseDouble(rs.getString("sum(amount)"));        
        }           
        
        String query1="Select sum(amount*0.45) from bookings;";
        ResultSet rs1=stmt.executeQuery(query1);
         while(rs1.next())
        { damt=Double.parseDouble(rs1.getString("sum(amount*0.45)"));        
        }    
        
        String query2="Select sum(amount*0.2) from bookings;";
        ResultSet rs2=stmt.executeQuery(query2);
        while(rs2.next())
        {  mamt=Double.parseDouble(rs2.getString("sum(amount*0.2)"));        
        }    
        
        String query3="Select sum(amount*0.35) from bookings;";
        ResultSet rs3=stmt.executeQuery(query3);
        while(rs3.next())
        { net=Double.parseDouble(rs3.getString("sum(amount*0.35)"));
        }
     l2.setText(amt+"");
     l4.setText(damt+"");
     l5.setText(mamt+"");
     l3.setText(net+"");
    }   
    catch(Exception e)
        {JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("NET INCOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 420, 160, 50);

        l2.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        getContentPane().add(l2);
        l2.setBounds(440, 250, 150, 50);

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
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
        jButton2.setBounds(300, 540, 150, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("MONEY MATTERS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 160, 220, 40);

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("MISCELLANEOUS(FUEL,MAINTAINANCE,etc)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 350, 370, 50);

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("BALANCE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 250, 100, 50);

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("DRIVER'S SALARY");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 300, 160, 50);

        l4.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        getContentPane().add(l4);
        l4.setBounds(440, 300, 150, 50);

        l3.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        getContentPane().add(l3);
        l3.setBounds(440, 420, 150, 50);

        l5.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        getContentPane().add(l5);
        l5.setBounds(440, 350, 150, 50);

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Admin_account().setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Income().setVisible(true);
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
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

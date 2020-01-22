import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Feedbacks extends javax.swing.JFrame {

    public Feedbacks() {
        initComponents();        
       int m=0;
             
      try
      { Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select * from feedback;";
        ResultSet rs=stmt.executeQuery(query);
        while (rs.next())
        {   m++;
            String Name=rs.getString("name");
            String Mobile=rs.getString("mobile");
            int Rating=Integer.parseInt(rs.getString("rating"));
            String Feedback=rs.getString("feedback");
            ta1.setText(ta1.getText()+m+". Name:"+ Name +"\n"+"Mobile:"+ Mobile +"\n"+"Stars:"+Rating+"\n"+"Feedback:"+Feedback + "\n"+"\n");
         }
      }
      catch(Exception e)
      {  JOptionPane.showMessageDialog(this, e.getMessage());
      }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        ta1.setForeground(new java.awt.Color(0, 102, 102));
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ta1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(80, 230, 645, 360);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 2, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("These are the suggestions and comments submitted by our users :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 180, 490, 40);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Back");
        jButton1.setMaximumSize(new java.awt.Dimension(150, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 600, 150, 50);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("FEEDBACKS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 130, 150, 40);

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new Admin_account().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedbacks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ta1;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

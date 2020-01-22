import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View_Users extends javax.swing.JFrame {

    public View_Users() {
        initComponents();            
        DefaultTableModel model =(DefaultTableModel)
        tb1.getModel();
      try
      { Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select * from users order by name;";
        ResultSet rs=stmt.executeQuery(query);
        
        while (rs.next())
        {   String id=rs.getString("user_id");
            String Name=rs.getString("name");
            String email=rs.getString("email");
            String Password=rs.getString("password");
            String Mobile=rs.getString("mobile");
            model.addRow(new Object[]{id,Name,email,Password,Mobile});           
        }
      }
    catch(Exception e)
      {JOptionPane.showMessageDialog(this, e.getMessage());
      }                
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        tb1.setFont(new java.awt.Font("Sitka Subheading", 0, 15)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User_Id", "Name", "Email", "Password", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 730, 160);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText(" USERS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 150, 100, 40);

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
        jButton2.setBounds(290, 470, 150, 50);

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
        new Admin_account().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

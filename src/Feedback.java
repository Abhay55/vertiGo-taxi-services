import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Feedback extends javax.swing.JFrame {
String curmob,curname;
ImageIcon S1=new ImageIcon("E://board_pics//filled_star_small.jpg");
ImageIcon S2=new ImageIcon("E://board_pics//unfilled_star_small.jpg");
    
public Feedback() {
        initComponents();
        s1.setIcon(S1); s2.setIcon(S1); s3.setIcon(S1); s4.setIcon(S1);s5.setIcon(S2);
    try{ 
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            Statement stmt=(Statement) con.createStatement();
            String query="Select * from currentuser;";
            ResultSet rs=stmt.executeQuery(query);
        
            while(rs.next())
            {   curname=rs.getString("name");
                t2.setText(""+curname);
                curmob=rs.getString("mobile");
            }       
        }
    
    catch (Exception e)
        { JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j1 = new javax.swing.JSlider();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        b1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        j1.setMajorTickSpacing(1);
        j1.setMaximum(5);
        j1.setMinimum(1);
        j1.setToolTipText("");
        j1.setValue(4);
        j1.setOpaque(false);
        j1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                j1StateChanged(evt);
            }
        });
        getContentPane().add(j1);
        j1.setBounds(160, 560, 410, 26);
        getContentPane().add(s1);
        s1.setBounds(160, 480, 58, 69);
        getContentPane().add(s2);
        s2.setBounds(240, 480, 58, 69);
        getContentPane().add(s3);
        s3.setBounds(320, 480, 58, 69);
        getContentPane().add(s4);
        s4.setBounds(400, 480, 58, 69);
        getContentPane().add(s5);
        s5.setBounds(490, 480, 58, 69);

        ta1.setColumns(20);
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 690, 180);

        b1.setBackground(new java.awt.Color(255, 204, 204));
        b1.setFont(new java.awt.Font("Sitka Heading", 0, 20)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 102, 0));
        b1.setText("Submit Feedback");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(160, 610, 230, 60);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Signed in As:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 90, 130, 23);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 2, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 80, 80));
        jLabel2.setText("We care for your valuable suggestions and comments , ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 230, 440, 30);

        jLabel3.setFont(new java.awt.Font("High Tower Text", 2, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 79, 77));
        jLabel3.setText("so please specify them here :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 250, 240, 30);

        t2.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(t2);
        t2.setBounds(550, 90, 200, 25);

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
        jButton2.setBounds(430, 610, 150, 60);

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("FEEDBACK");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 160, 160, 40);

        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void set()
{         if (j1.getValue() == 1) {s1.setIcon(S1); s2.setIcon(S2); s3.setIcon(S2); s4.setIcon(S2);s5.setIcon(S2);}
         if (j1.getValue() == 2){s1.setIcon(S1); s2.setIcon(S1); s3.setIcon(S2); s4.setIcon(S2);s5.setIcon(S2);}
         if (j1.getValue() == 3){s1.setIcon(S1); s2.setIcon(S1); s3.setIcon(S1); s4.setIcon(S2);s5.setIcon(S2);}
         if (j1.getValue() == 4){s1.setIcon(S1); s2.setIcon(S1); s3.setIcon(S1); s4.setIcon(S1);s5.setIcon(S2);}
         if (j1.getValue() == 5) {s1.setIcon(S1); s2.setIcon(S1); s3.setIcon(S1); s4.setIcon(S1);s5.setIcon(S1);}
}
    
    private void j1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_j1StateChanged
         set();       
    }//GEN-LAST:event_j1StateChanged

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       String txt=ta1.getText();
       int rt=j1.getValue();
        try{ 
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="INSERT INTO feedback VALUES( '"+curname+"' , '"+curmob+"','"+rt+"','"+txt+"');";
        stmt.executeUpdate(query);
        
        JOptionPane.showMessageDialog(this,"Thanks For Feedback");
        new User_account().setVisible(true);
        this.dispose();            
        }
    
        catch (Exception e)
        {JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new User_account().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JSlider j1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel t2;
    private javax.swing.JTextArea ta1;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}
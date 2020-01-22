
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class Book_A_Taxi extends javax.swing.JFrame {

    public static int ride_id=0,user_id=0,amt=5,bal;
    int depr_km=-1,arr_km=-1; public static  int distance=50;
    public static String dd,mm,yyyy,hh,min;
    public static String jr_date="",jrtime="",depr="",arr="",car="",curname="";
    public static char ac;String d="",e="";
    int sysdate=0,systime=0;int inputdate=0,inputtime=0;
     
public Book_A_Taxi() {
 initComponents();
    Date df=new Date();
    SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat sdfg= new SimpleDateFormat("hhmm");
    d=sdf.format(df);
    e=sdfg.format(df);
    sysdate =Integer.parseInt(d);
    systime =Integer.parseInt(e);
        
    try{ 
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=(Statement) con.createStatement();
        String query="Select * from currentuser;";
        ResultSet rs1=stmt.executeQuery(query);
        while(rs1.next())
        {curname=rs1.getString("name");
         bal=rs1.getInt("balance"); t3.setText(bal+"");
         t2.setText(""+curname);
         user_id=Integer.parseInt(rs1.getString("user_id"));
        }
         String id="select max(ride_id) from ride_details;";
         ResultSet   rs2 =   stmt.executeQuery(id);
            while(rs2.next())
            {ride_id =rs2.getInt(1);
            }
         ride_id=ride_id+1;
         t1.setText(""+ride_id);
}

    catch (Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        P1 = new javax.swing.JPanel();
        r4 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JComboBox();
        c2 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c9 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        c4 = new javax.swing.JComboBox();
        c5 = new javax.swing.JComboBox();
        c6 = new javax.swing.JComboBox();
        c7 = new javax.swing.JComboBox();
        c8 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("High Tower Text", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("VertiGO Money");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 220, 168, 27);

        jLabel13.setFont(new java.awt.Font("High Tower Text", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Ride ID");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 220, 79, 27);

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(204, 204, 255));
        t1.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(160, 220, 102, 30);

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(204, 204, 255));
        t2.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(520, 30, 210, 30);

        P1.setOpaque(false);

        buttonGroup2.add(r4);
        r4.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        r4.setForeground(new java.awt.Color(0, 65, 74));
        r4.setText("Non A/C");

        buttonGroup2.add(r3);
        r3.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 65, 74));
        r3.setSelected(true);
        r3.setText("A/C");

        c1.setBackground(new java.awt.Color(153, 195, 216));
        c1.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 102, 102));
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agra", "Dehradun", "Delhi", "Mathura", "Meerut", "Roorkee" }));
        c1.setPreferredSize(new java.awt.Dimension(80, 30));

        c2.setBackground(new java.awt.Color(153, 195, 216));
        c2.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(0, 102, 102));
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agra", "Dehradun", "Delhi", "Mathura", "Meerut", "Roorkee" }));
        c2.setSelectedIndex(4);
        c2.setToolTipText("");
        c2.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel11.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Car");

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("From:");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("To:");

        c9.setBackground(new java.awt.Color(204, 255, 204));
        c9.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c9.setForeground(new java.awt.Color(0, 102, 102));
        c9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Innova", "Swift Dzire", "Indica" }));
        c9.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Journey Date ");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Proceed to payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("High Tower Text", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Journey  Time");

        c4.setBackground(new java.awt.Color(153, 195, 216));
        c4.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c4.setForeground(new java.awt.Color(0, 102, 102));
        c4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        c4.setPreferredSize(new java.awt.Dimension(80, 30));

        c5.setBackground(new java.awt.Color(153, 195, 216));
        c5.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c5.setForeground(new java.awt.Color(0, 102, 102));
        c5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        c5.setPreferredSize(new java.awt.Dimension(80, 30));

        c6.setBackground(new java.awt.Color(153, 195, 216));
        c6.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c6.setForeground(new java.awt.Color(0, 102, 102));
        c6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016" }));
        c6.setToolTipText("");
        c6.setPreferredSize(new java.awt.Dimension(80, 30));

        c7.setBackground(new java.awt.Color(153, 195, 216));
        c7.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c7.setForeground(new java.awt.Color(0, 102, 102));
        c7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        c7.setPreferredSize(new java.awt.Dimension(80, 30));

        c8.setBackground(new java.awt.Color(153, 195, 216));
        c8.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        c8.setForeground(new java.awt.Color(0, 102, 102));
        c8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        c8.setPreferredSize(new java.awt.Dimension(80, 30));

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

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r3)
                        .addGap(18, 18, 18)
                        .addComponent(r4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1Layout.createSequentialGroup()
                        .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P1Layout.createSequentialGroup()
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P1Layout.createSequentialGroup()
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(88, 88, 88))
            .addGroup(P1Layout.createSequentialGroup()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(P1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel11))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r3)
                            .addComponent(r4)))
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(P1);
        P1.setBounds(130, 280, 520, 420);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Book A Taxi");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 150, 200, 50);

        t3.setEditable(false);
        t3.setBackground(new java.awt.Color(204, 204, 255));
        t3.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        getContentPane().add(t3);
        t3.setBounds(510, 220, 130, 28);

        jLabel14.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Signed in As:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(390, 30, 109, 23);
        getContentPane().add(l1);
        l1.setBounds(630, 270, 100, 40);

        theme_label.setBackground(new java.awt.Color(204, 255, 204));
        theme_label.setFont(new java.awt.Font("High Tower Text", 1, 22)); // NOI18N
        theme_label.setForeground(new java.awt.Color(0, 102, 102));
        theme_label.setIcon(new javax.swing.ImageIcon("E:\\board_pics\\theme.jpg")); // NOI18N
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 750, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    depr=(String) c1.getSelectedItem();
    arr=(String) c2.getSelectedItem();
    dd=(String)c4.getSelectedItem();
    if (dd.length()==1) dd="0"+dd;
    mm=(String) c5.getSelectedItem();
    if (mm.length()==1) mm="0"+mm;
    yyyy= (String) c6.getSelectedItem();
    if (yyyy.length()==1) yyyy="0"+yyyy;
    hh= (String) c7.getSelectedItem();
    if (hh.length()==1) hh="0"+hh;
    min= (String) c8.getSelectedItem();
    if (min.length()==1) min="0"+min;
    jr_date=dd+mm+yyyy;
    jrtime=hh+min;
    inputdate=Integer.parseInt(yyyy+mm+dd);
    inputtime=Integer.parseInt(jrtime);
    car=(String) c9.getSelectedItem();
    
    if (r3.isSelected()==true) ac='y';
    else                       ac='n';
    
   if (c1.getSelectedIndex()==0) depr_km=438;
   if (c2.getSelectedIndex()==0) arr_km=438;
   if (c1.getSelectedIndex()==1) depr_km=0;
   if (c2.getSelectedIndex()==1) arr_km=0;
   if (c1.getSelectedIndex()==2) depr_km=247;
   if (c2.getSelectedIndex()==2) arr_km=247;
   if (c1.getSelectedIndex()==3) depr_km=373;
   if (c2.getSelectedIndex()==3) arr_km=373;
   if (c1.getSelectedIndex()==4) depr_km=177;
   if (c2.getSelectedIndex()==4) arr_km=177;
   if (c1.getSelectedIndex()==5) depr_km=71;
   if (c2.getSelectedIndex()==5) arr_km=71;
   distance=Math.abs(depr_km - arr_km);
   if  (distance==0) { c2.requestFocus();JOptionPane.showMessageDialog(this, "Both Cities are Same");}
   else if (inputdate<=sysdate&&inputtime<systime)
   { c4.requestFocus();JOptionPane.showMessageDialog(this, "Invalid Date and Time");
   }
   else
   {  new Bill().setVisible(true); this.dispose();
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new User_account().setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_jButton2ActionPerformed

     public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_A_Taxi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c2;
    private javax.swing.JComboBox c4;
    private javax.swing.JComboBox c5;
    private javax.swing.JComboBox c6;
    private javax.swing.JComboBox c7;
    private javax.swing.JComboBox c8;
    private javax.swing.JComboBox c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}

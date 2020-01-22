import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login_Page extends javax.swing.JFrame {
    
    ImageIcon S1=new ImageIcon("F://nb icons//tick.jpg");
    ImageIcon S2=new ImageIcon("F://nb icons//wrong.jpg");
    int k=0,v1=1,v2=1,v3=1,v4=1,v5=1,v6=1;
    static int user_id = 0;
    
    public Login_Page() {
        initComponents();
        pn2.setVisible(false);
        pn1.setVisible(true);              
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        pn2 = new javax.swing.JPanel();
        t3 = new javax.swing.JPasswordField();
        t5 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        c1 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        t4 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        str = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        pn1 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ta = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        theme_label = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 700));
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        pn2.setOpaque(false);

        t3.setMaximumSize(new java.awt.Dimension(135, 25));
        t3.setMinimumSize(new java.awt.Dimension(135, 25));
        t3.setPreferredSize(new java.awt.Dimension(135, 25));
        t3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t3CaretUpdate(evt);
            }
        });

        t5.setMaximumSize(new java.awt.Dimension(135, 25));
        t5.setMinimumSize(new java.awt.Dimension(135, 25));
        t5.setPreferredSize(new java.awt.Dimension(135, 25));
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });

        t2.setMaximumSize(new java.awt.Dimension(135, 25));
        t2.setMinimumSize(new java.awt.Dimension(135, 25));
        t2.setPreferredSize(new java.awt.Dimension(135, 25));

        jLabel5.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        jLabel5.setText("Mobile");

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        jLabel6.setText("Confirm Password");

        jLabel7.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        jLabel7.setText("New password");

        jLabel8.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        jLabel8.setText("Email Id");

        jLabel9.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        jLabel9.setText("Name");

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jButton3.setText("Terms & Conditions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        c1.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        c1.setText("I accept the");

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jButton4.setText("Create Account");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        t4.setMaximumSize(new java.awt.Dimension(135, 25));
        t4.setMinimumSize(new java.awt.Dimension(135, 25));
        t4.setPreferredSize(new java.awt.Dimension(135, 25));

        jLabel10.setFont(new java.awt.Font("Sitka Small", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("NEW USER SIGN UP");

        str.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N

        l1.setMaximumSize(new java.awt.Dimension(24, 20));
        l1.setMinimumSize(new java.awt.Dimension(24, 20));

        t6.setMaximumSize(new java.awt.Dimension(135, 25));
        t6.setMinimumSize(new java.awt.Dimension(135, 25));
        t6.setPreferredSize(new java.awt.Dimension(135, 25));

        l5.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        l5.setText("@");
        l5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        l6.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        l6.setText(".com");

        l7.setMaximumSize(new java.awt.Dimension(24, 20));
        l7.setMinimumSize(new java.awt.Dimension(24, 20));

        l9.setMaximumSize(new java.awt.Dimension(24, 20));
        l9.setMinimumSize(new java.awt.Dimension(24, 20));

        l10.setFont(new java.awt.Font("High Tower Text", 0, 17)); // NOI18N
        l10.setText("+91");

        l11.setMaximumSize(new java.awt.Dimension(24, 20));
        l11.setMinimumSize(new java.awt.Dimension(24, 20));

        l12.setMaximumSize(new java.awt.Dimension(24, 20));
        l12.setMinimumSize(new java.awt.Dimension(24, 20));

        elab.setFont(new java.awt.Font("High Tower Text", 0, 15)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jButton1.setText("Already A user? Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(str, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)))
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(elab, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel5))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(c1)))
                .addGap(43, 43, 43)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1))
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(l6))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(l5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(str, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(l10))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(c1)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(elab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pn2);
        pn2.setBounds(20, 100, 710, 450);

        pn1.setOpaque(false);

        buttonGroup1.add(r1);
        r1.setSelected(true);
        r1.setText("User");

        buttonGroup1.add(r2);
        r2.setText("Admin");

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 15)); // NOI18N
        jLabel1.setText("EMAIL");

        jLabel2.setFont(new java.awt.Font("High Tower Text", 0, 15)); // NOI18N
        jLabel2.setText("PASSWORD");

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ta.setMaximumSize(new java.awt.Dimension(135, 25));
        ta.setMinimumSize(new java.awt.Dimension(135, 25));
        ta.setPreferredSize(new java.awt.Dimension(135, 25));

        pf1.setMaximumSize(new java.awt.Dimension(135, 25));
        pf1.setMinimumSize(new java.awt.Dimension(135, 25));
        pf1.setPreferredSize(new java.awt.Dimension(135, 25));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("LOGIN");

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        jButton5.setText("New User ? Click Here..");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn1Layout.createSequentialGroup()
                                .addComponent(r1)
                                .addGap(159, 159, 159)
                                .addComponent(r2))
                            .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(pf1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1)
                    .addComponent(r2))
                .addGap(18, 18, 18)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(38, 38, 38)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(pn1);
        pn1.setBounds(130, 110, 570, 430);

        theme_label.setFont(new java.awt.Font("High Tower Text", 0, 19)); // NOI18N
        theme_label.setOpaque(true);
        getContentPane().add(theme_label);
        theme_label.setBounds(0, 0, 0, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        v1=1;
        if(jTextField1.getText().isEmpty() ) { v1=0;}
        else  { l1.setIcon(S1);v1=2;}   Error();
      
         v2=1;
         if(t2.getText().isEmpty() ) { v2=0; }
         else     { l7.setIcon(S1);v2=2;  }  Error();
       
        v4=1;
        if(t3.getText().isEmpty() ) { v4=0; }
        else      { l12.setIcon(S1);v4=2;  }   Error();
       
        v5=1;
        if(t4.getText().isEmpty() ) { v5=0; }
        else      { v5=2;  l9.setIcon(S1); }   Error();
        if(t4.getText().equals(t3.getText())==false)
         { elab.setText("pass dont match"); l9.setIcon(S2); v5=1;}
            
        v6=1 ;
        if(t5.getText().isEmpty() ) {v6=0;  }
        else      { l11.setIcon(S1); v6=2; } Error();
        if ((t5.getText()).length()!=10)
        {elab.setText("lenght is not 10"); l11.setIcon(S2);v6=1; }      
        
        v3=1;
        if(t6.getText().isEmpty() ) { v3=0; }
        else   { l7.setIcon(S1);v3=2;}  Error();  
   
        
    if (v1!=2 || v2!=2 || v3!=2 || v4!=2 || v5!=2 || v6!=2)
    {  elab.setText("Please Fill All Entries");}
    
    else if(c1.isSelected()==false)
    { elab.setText("Please Accept Terms & Conditions ");    }
    
    else if  (v1==2 && v2==2 && v3==2 && v4==2 && v5==2 && v6==2)  
    {   String name,email,password,mobile,a;
        name=jTextField1.getText();
        mobile=t5.getText();
        email=t2.getText()+"@"+t6.getText()+".com";
        password=t3.getText();
        try {

                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                Statement stmt=(Statement) con.createStatement();
                String id="select max(user_id) from users;";
                ResultSet   rs =   stmt.executeQuery(id);

                while(rs.next())
                {  user_id =rs.getInt(1);
                }

                user_id=user_id+1;
                String query="INSERT INTO users VALUES( '"+user_id+"' , '"+name+"','"+email+"','"+password+"','"+mobile+"',10000);";
                stmt.executeUpdate(query);
                Statement del=(Statement) con.createStatement();
                String q="delete from currentuser;";
                del.executeUpdate(q);
                Statement cur=(Statement) con.createStatement();
                String login="Insert into currentuser values ('"+user_id+"','"+name+"','"+email+"','"+password+"','"+mobile+"',10000);";
                cur.executeUpdate(login);

                new User_account().setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome new user To Vertigo Taxi Services,\nYou Have Won Free 10000 Vertigo Money" );
            }
        catch(Exception e)
         { JOptionPane.showMessageDialog(this,e.getMessage());
         }
    }                       
    }//GEN-LAST:event_jButton4ActionPerformed
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      new Terms_and_conditions().setVisible(true);     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     pn1.setVisible(true); pn2.setVisible(false);    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
  char kc=evt.getKeyChar();
  if ((!(kc>='0'&& kc<='9'))|| t5.getText().length()>=10)
  evt.consume();
    }//GEN-LAST:event_t5KeyTyped

    private void t3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t3CaretUpdate
        if ( (t3.getText().length()) == 0) str.setText("");

        else if ( (t3.getText().length()) <= 4 )  
             {  str.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
                str.setForeground(new java.awt.Color(255, 0, 0));
                str.setText("WEAK");
             }  
        else if ( (t3.getText().length()) <= 7 )  
             {  str.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
                str.setForeground(new java.awt.Color(0, 0, 255));
                str.setText("NORMAL");
             }  
        else  
             {  str.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
                str.setForeground(new java.awt.Color(0, 102, 102));
                str.setText("STRONG");
             }  
    }//GEN-LAST:event_t3CaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String email=ta.getText();
        String email_id = null;
        String password = null;

        if (r1.isSelected()==true)
        {
            try
            {   Class.forName("java.sql.DriverManager");
                Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                Statement stmt=(Statement) con.createStatement();
                String query="Select email,password from users where email='"+email+"';";
                ResultSet rs=stmt.executeQuery(query);
                
                if(rs.next())
                { email_id=rs.getString("email");
                  password=rs.getString("password");
                }
                else
                { JOptionPane.showMessageDialog(this,"sorry no record");
                }

                if(password.equals(pf1.getText())==false)
                { JOptionPane.showMessageDialog(this,"incorrect Password");
                }                
                else
                {   Statement stmt2=(Statement) con.createStatement();
                    String query2="Select* from users where email='"+email+"';";
                    Statement stmt4=(Statement) con.createStatement();
                    String query4="delete from currentuser;";
                    stmt4.executeUpdate(query4);
                    ResultSet rs2=stmt2.executeQuery(query2);
                    while (rs2.next())
                    {
                        String cur_id=rs2.getString("user_id");
                        String cur_name=rs2.getString("name");
                        String cur_email=rs2.getString("email");
                        String cur_password=rs2.getString("password");
                        String cur_mob=rs2.getString("mobile");
                        String cur_bal=rs2.getString("balance");
                        Statement stmt3=(Statement) con.createStatement();
                        String login="Insert into currentuser values ('"+cur_id+"','"+cur_name+"','"+cur_email+"','"+cur_password+"','"+cur_mob+"','"+cur_bal+"');";
                        stmt3.executeUpdate(login);
                        this.dispose();
                        new User_account().setVisible(true);
                    }
                }
            }
            catch(Exception e)
            { JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
        
        String ad_id=null;
        String ad_name=null;
        String ad_password=null;
        if (r2.isSelected())
        {
            try{
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                Statement stmt=(Statement) con.createStatement();
                String query="Select id,password from admin where id='"+email+"';";
                ResultSet rs=stmt.executeQuery(query);
                
                if(rs.next())
                { ad_id=rs.getString("id");
                  ad_password=rs.getString("password");
                }
                else
                { JOptionPane.showMessageDialog(this,"sorry no record");
                }
                
                if(ad_password.equals(pf1.getText())==false)
                { JOptionPane.showMessageDialog(this,"incorrect Password");
                }
                else
                {   Statement stmta=(Statement) con.createStatement();
                    String querya="delete from currentadmin;";
                    stmta.executeUpdate(querya);
                    Statement stmtb=(Statement) con.createStatement();
                    String queryb="Select * from admin where id='"+email+"';";
                    ResultSet rsa=stmtb.executeQuery(queryb);
                    while(rsa.next())
                    {   String cur_name=rsa.getString("name");
                        String cur_id=rsa.getString("id");
                        String cur_pass=rsa.getString("password");
                        Statement stmtc=(Statement) con.createStatement();
                        String logina="Insert into currentadmin values ('"+cur_name+"','"+cur_id+"','"+cur_pass+"');";
                        stmtc.executeUpdate(logina);
                        this.dispose();
                        new Admin_account().setVisible(true);
                    }
                }
            }
            catch (Exception e)
            {  JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pn2.setVisible(true); pn1.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       char kc=evt.getKeyChar();
         if(!((kc>='a' && kc<='z')||kc==KeyEvent.VK_SPACE||(kc>='A' && kc<='Z')))
         evt.consume();      
    }//GEN-LAST:event_jTextField1KeyTyped

public void Error()
    { if (v1==0) { elab.setText("Please enter name"); l1.setIcon(S2); }
      if (v6==0) { elab.setText("Please enter mobile");  l11.setIcon(S2); }
      if (v5==0) { elab.setText("Please confirm password"); l9.setIcon(S2);}
      if (v4==0) { elab.setText("Please enter password"); l12.setIcon(S2);}
      if (v3==0) { elab.setText("Please enter full email"); l7.setIcon(S2);}
      if (v2==0) { elab.setText("Please enter full email");l7.setIcon(S2);}           
      
      if (v6==1) elab.setText("Please enter mobile");
      if (v5==1) elab.setText("Please confirm password");
      if (v4==1) elab.setText("Please enter password");
      if (v3==1) elab.setText("Please enter full email"); 
      if (v2==1) elab.setText("Please enter full email");
      if (v1==1) elab.setText("Please enter name");
                
      if ((v2==2 && v3!= 2)||(v3==2 && v2!= 2)  )               l7.setIcon(S2);
      if  (v1==2 && v2==2 && v3==2 && v4==2 && v5==2 && v6==2)  elab.setText("");        
    }   
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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JLabel elab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l9;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JLabel str;
    private javax.swing.JTextField t2;
    private javax.swing.JPasswordField t3;
    private javax.swing.JPasswordField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField ta;
    private javax.swing.JLabel theme_label;
    // End of variables declaration//GEN-END:variables
}
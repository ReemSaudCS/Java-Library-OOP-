/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;
import java.sql.*;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import java.time.temporal.Temporal;
import javax.swing.ImageIcon;
/**
 *
 * @author End-user
 */
public class ReturnBooks extends javax.swing.JFrame {
    Connection con;
    Statement st;
    Statement st2;
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    PreparedStatement up;
    PreparedStatement up2;
    public static  String u;
    CustomerView v=new CustomerView();


    /**
     * Creates new form ReturnBooks
     */
    public ReturnBooks() {
        initComponents();
     //   fillcombo(u);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cc = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setMaximumSize(new java.awt.Dimension(61, 100));
        jPanel5.setMinimumSize(new java.awt.Dimension(61, 100));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMouseClicked(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(142, 182, 172));
        jLabel3.setText("Due date is in");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(142, 182, 172));
        jLabel4.setText("Return Books");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(142, 182, 172));
        jLabel5.setText("Select Bill Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        title.setText("                                 ");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 180, -1));

        due.setText("               ");
        getContentPane().add(due, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(142, 182, 172));
        jLabel6.setText("Book Title:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));
        jButton1.setBackground(new java.awt.Color(152, 175, 172));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N

        jButton1.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));
        jButton2.setBackground(new java.awt.Color(152, 175, 172));

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N

        jButton2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/backk.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:

        int bid;
        try{
           String query="select * from borrow_table where Bill_no='"+combo.getSelectedItem().toString()+"'";
           con=mainclass.createConnection();
                  st=con.createStatement();
        rs=st.executeQuery(query);
            rs.next();
            bid=rs.getInt("Book_id");
                        due.setText(rs.getDate("Due_date").toString());

            String query2="select * from book_table where Book_id='"+bid+"'";
                  st2=con.createStatement();
        rs1=st2.executeQuery(query2);
                    rs1.next();
        title.setText(rs1.getString("Title"));
//        long millis=System.currentTimeMillis();
//        java.sql.Date date=new java.sql.Date(millis);
             
           ImageIcon i;
            i = new javax.swing.ImageIcon(getClass().getResource(rs1.getString("cover")));
            cc.setIcon(i);       
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
        e.printStackTrace();
       }finally{
         if (rs!=null) 
             try{rs.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (st!=null) 
             try{st.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (rs1!=null) 
             try{rs1.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (st2!=null) 
             try{st2.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (con!=null) 
             try{con.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
   }
       
        
    }//GEN-LAST:event_comboActionPerformed

    private void comboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_comboMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            long millis=System.currentTimeMillis();
            java.sql.Date date=new java.sql.Date(millis);
            if(Date.valueOf(due.getText()).compareTo(date)>0||Date.valueOf(due.getText()).compareTo(date)==0){
        String query2="select * from book_table where Title='"+title.getText()+"'";
        int quantity=0;
        con=mainclass.createConnection();
         st2=con.createStatement();
        rs=st2.executeQuery(query2);
            rs.next();
            quantity=rs.getInt("quantity")+1;
         up=con.prepareStatement("update book_table set quantity=? where Title='"+title.getText()+"'");
            up.setInt(1,quantity);
            up.executeUpdate();
                    
         up2=con.prepareStatement("update borrow_table set Return_date=? where Bill_no='"+combo.getSelectedItem()+"'");
            up2.setDate(1,date);
            up2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Book Returned Successfuly! Thank you");
        }else{
                        JOptionPane.showMessageDialog(null,"you missed the due date, please check your email to pay the book amount");

            }
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
       }finally{
         if (rs!=null) 
             try{rs.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (st2!=null) 
             try{st2.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (up!=null) 
             try{up.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (up2!=null) 
             try{up2.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (con!=null) 
             try{con.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
   }
       
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void fillcombo(String username){
        try{
            String query2="select * from customer_table where Username='"+username+"'";

        int id=0;
         con=mainclass.createConnection();
         st2=con.createStatement();
        rs=st2.executeQuery("select * from customer_table where Username='"+username+"'");
            rs.next();
            id=rs.getInt("Cust_id");
            System.out.println(rs.getInt("Cust_id"));
        String query="Select * from borrow_table where Cust_id='"+id+"'";
        st=con.createStatement();
         rs2=st.executeQuery("Select * from borrow_table where Return_date is null AND Cust_id='"+id+"'");
        while(rs2.next()){
               combo.addItem(String.valueOf(rs2.getInt("Bill_no")));
              System.out.println((rs2.getInt("Bill_no")));}
        
        }
              
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
e.printStackTrace();       }finally{
         if (rs!=null) 
             try{rs.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (st2!=null) 
             try{st2.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (rs2!=null) 
             try{rs2.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (st!=null) 
             try{st.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
         if (con!=null) 
             try{con.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}
   }
       
    }
    public void setusername(String u){
       // uu.setText(u);
       this.u=u;
        }
    
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
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cc;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}

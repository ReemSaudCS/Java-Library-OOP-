/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import static Library.Card.amount;
import static Library.Card.b;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author End-user
 */
public class alrajhicard extends javax.swing.JFrame {

    /**
     * Creates new form alrajhicard
     */
    static Double amount;
    public static int b;
    public static Double discount;
    public alrajhicard() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        cardnumber = new javax.swing.JTextField();
        cvctxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Monthtxt = new javax.swing.JComboBox<>();
        Yeartxt = new javax.swing.JComboBox<>();
        holdertxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARD HOLDER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 150, 30));

        cardnumber.setBackground(new java.awt.Color(60, 73, 110));
        cardnumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cardnumber.setForeground(new java.awt.Color(255, 255, 255));
        cardnumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cardnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnumberActionPerformed(evt);
            }
        });
        cardnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardnumberKeyTyped(evt);
            }
        });
        jPanel1.add(cardnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 380, 40));

        cvctxt.setBackground(new java.awt.Color(60, 73, 110));
        cvctxt.setForeground(new java.awt.Color(255, 255, 255));
        cvctxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cvctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvctxtActionPerformed(evt);
            }
        });
        cvctxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvctxtKeyTyped(evt);
            }
        });
        jPanel1.add(cvctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 80, -1));
        cvctxt.setBackground(new java.awt.Color(60, 73, 110));

        cvctxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CVC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 50, 30));

        Monthtxt.setBackground(new java.awt.Color(60, 73, 110));
        Monthtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Monthtxt.setSelectedIndex(-1);
        Monthtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthtxtActionPerformed(evt);
            }
        });
        jPanel1.add(Monthtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 70, -1));

        Yeartxt.setBackground(new java.awt.Color(60, 73, 110));
        Yeartxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));
        Yeartxt.setSelectedIndex(-1);
        Yeartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeartxtActionPerformed(evt);
            }
        });
        jPanel1.add(Yeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        holdertxt.setBackground(new java.awt.Color(60, 73, 110));
        holdertxt.setForeground(new java.awt.Color(255, 255, 255));
        holdertxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        holdertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holdertxtActionPerformed(evt);
            }
        });
        holdertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                holdertxtKeyTyped(evt);
            }
        });
        jPanel1.add(holdertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 310, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/alrajhi.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 380));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, 30));
        jButton1.setBackground(new java.awt.Color(152, 175, 172));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N

        jButton1.setForeground(new java.awt.Color(255, 255, 255));

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, 30));
        confirm.setBackground(new java.awt.Color(152, 175, 172));

        confirm.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N

        confirm.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/backk.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -220, 990, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void setBillNo(int b,String am){
        this.b=b;
        
        discount=(Double.valueOf(am)*20)/100;
        this.amount=(Double.valueOf(am)-discount);
    }
    private void cardnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnumberActionPerformed

    private void cardnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardnumberKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(!Character.isDigit(c))
        {
            evt.consume();
        }
        //
        else if(cardnumber.getText().trim().length()==16 ||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }

    }//GEN-LAST:event_cardnumberKeyTyped

    private void MonthtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthtxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MonthtxtActionPerformed

    private void YeartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeartxtActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_YeartxtActionPerformed

    private void cvctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvctxtActionPerformed

    private void cvctxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvctxtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(!Character.isDigit(c))
        {
            evt.consume();
        }
        else if(cvctxt.getText().trim().length()==3 ||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_cvctxtKeyTyped

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
      
            if (cardnumber.getText().trim().isEmpty() &&cvctxt.getText().trim().isEmpty()&&holdertxt.getText().trim().isEmpty()&&Monthtxt.getSelectedIndex()==-1&&Yeartxt.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(null,"Fill your card information please","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }

            else if(cardnumber.getText().trim().isEmpty())

            JOptionPane.showMessageDialog(null, "please fill your card number","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            else if(cvctxt.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "please fill your cvc","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            else  if (holdertxt.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "please fill your card holder name","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            else if(Monthtxt.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(null, "please select expiration month","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            else if(Yeartxt.getSelectedIndex()==-1)
            {
                JOptionPane.showMessageDialog(null, "please select expiration year","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            else if(cardnumber.getText().trim().length()!=16)
            {
                JOptionPane.showMessageDialog(null, "your card number should be 16 digit!","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            else   if(cvctxt.getText().trim().length()!=3)
            {
                JOptionPane.showMessageDialog(null, "your cvc should be 3 digits","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }

            else{

                       
JOptionPane.showMessageDialog(null,"Thank you for your payment! Payment processed with amount"+amount);            //                    
BoughtBill n=new BoughtBill();
n.BoughtBill(b,amount,discount);
        n.setVisible(true);
        this.setVisible(false);
       
                    }
            

    }//GEN-LAST:event_confirmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login lo=new Login();
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void holdertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holdertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_holdertxtActionPerformed

    private void holdertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_holdertxtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(!(Character.isAlphabetic(c) ||  (Character.isWhitespace(c)) ||(c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE )){
            evt.consume(); 
        }
    }//GEN-LAST:event_holdertxtKeyTyped

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
            java.util.logging.Logger.getLogger(alrajhicard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alrajhicard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alrajhicard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alrajhicard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alrajhicard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Monthtxt;
    private javax.swing.JComboBox<String> Yeartxt;
    private javax.swing.JTextField cardnumber;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField cvctxt;
    private javax.swing.JTextField holdertxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

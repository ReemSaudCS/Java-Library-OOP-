/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import java.awt.event.KeyEvent;

/**
 *
 * @author End-user
 */
public class Card extends javax.swing.JFrame {
    public static int b;
    /**
     * Creates new form Card
     */
    public Card() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Month = new javax.swing.JComboBox<>();
        Year = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        card = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(60, 73, 110));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("                                     ");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 370, 40));

        jTextField2.setBackground(new java.awt.Color(60, 73, 110));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("         ");
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));
        jTextField2.setBackground(new java.awt.Color(60, 73, 110));

        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CVC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 50, 30));

        jTextField3.setBackground(new java.awt.Color(60, 73, 110));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("                         ");
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 140, -1));

        Month.setBackground(new java.awt.Color(60, 73, 110));
        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Month.setSelectedIndex(-1);
        jPanel1.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 70, -1));

        Year.setBackground(new java.awt.Color(60, 73, 110));
        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));
        Year.setSelectedIndex(-1);
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });
        jPanel1.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VALID THRU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        confirm.setText("jButton1");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/credit_65.jpg"))); // NOI18N
        jPanel1.add(card, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 940, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setBillNo(int b){
        this.b=b;
    }
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
     
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
//     
    if(jTextField1.getText().trim().length()==16 ||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
        evt.consume();

    }                                    
    
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
     
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
//     
    if(jTextField3.getText().trim().length()==3 ||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
        evt.consume();

    }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (Character.isWhitespace(c)) ||(c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE )){
     evt.consume();
    }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        BoughtBill n=new BoughtBill();
        n.BoughtBill(b);
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JLabel card;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
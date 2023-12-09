
package pos;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class SearchOrder extends javax.swing.JFrame {

    public SearchOrder() {
        initComponents();
        setResizable(false);
        phoneNumberText.setEditable(false);
        sizeText.setEditable(false);
        qtyText.setEditable(false);
        amountText.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderIdText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        sizeText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Order ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 457, 46));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Order ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 124, -1, -1));

        orderIdText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(orderIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 120, 182, -1));

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 529, 110, -1));

        searchButton.setBackground(new java.awt.Color(153, 204, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 175, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 457, 14));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Phone Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 294, -1, -1));

        phoneNumberText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(phoneNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 290, 182, -1));

        sizeText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sizeText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(sizeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 345, 182, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Size");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 349, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 404, -1, -1));

        qtyText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        qtyText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(qtyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 400, 182, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 459, -1, -1));

        amountText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        amountText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 455, 182, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 246, 399, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design (47).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 470, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        //orderIdTextActionPerformed(evt);
        String orderId=orderIdText.getText();
        OrderController ordercontroller = new OrderController();     
        Order foundOrder=ordercontroller.searchOrder(orderId);
       
        if (foundOrder != null) {
            phoneNumberText.setText(foundOrder .getPhoneNumber());
            sizeText.setText(foundOrder .getSize());
            qtyText.setText(String.valueOf(foundOrder .getQty()));
            amountText.setText(String.valueOf(foundOrder .getAmount()));
        } else {      
            JOptionPane.showMessageDialog(this, "Order not found.");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        MainForm mainForm = new MainForm();
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField orderIdText;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField sizeText;
    // End of variables declaration//GEN-END:variables

    private void orderIdTextActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

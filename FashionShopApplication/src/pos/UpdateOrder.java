
package pos;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;

public class UpdateOrder extends javax.swing.JFrame {
    
    /** Creates new form AddCustomerForm */
    public UpdateOrder() {
        initComponents();
        setResizable(false);
        amountText.setEditable(false);
        
        qtySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtySpinnerStateChanged(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        orderIdText = new javax.swing.JTextField();
        sizeComboBox = new javax.swing.JComboBox<>();
        qtySpinner = new javax.swing.JSpinner();
        updateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        amountText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        amountText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 182, -1));

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 534, 110, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 246, 399, 10));

        searchButton.setBackground(new java.awt.Color(153, 204, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 175, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 450, 14));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Phone Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 294, -1, -1));

        phoneNumberText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(phoneNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 182, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Size");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 407, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Order ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 450, 46));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Order ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 124, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 464, -1, -1));

        orderIdText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(orderIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 182, -1));

        sizeComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(sizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 345, 87, -1));

        qtySpinner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(qtySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 402, 87, -1));

        updateButton.setBackground(new java.awt.Color(153, 204, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 534, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design (47).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 460, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        MainForm mainForm = new MainForm();
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        //orderIdTextActionPerformed(evt);
        String orderId=orderIdText.getText();
        OrderController ordercontroller = new OrderController();
        Order foundOrder=ordercontroller.searchOrder(orderId);
     
        if (foundOrder != null) {
            phoneNumberText.setText(foundOrder .getPhoneNumber());
            sizeComboBox.setSelectedItem(foundOrder.getSize());
            qtySpinner.setValue(foundOrder.getQty());
            amountText.setText(String.valueOf(foundOrder .getAmount()));   
            
        } else {
            JOptionPane.showMessageDialog(this, "Order not found.");
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String orderId=orderIdText.getText();
        String phoneNumber=phoneNumberText.getText();
        int qty=(int)qtySpinner.getValue();
        if(qty==0){
           JOptionPane.showMessageDialog(this, "Invalid Quantity");
           return;
        }
        
        if(phoneNumber.length()==10 && phoneNumber.startsWith("0")){
            String size=sizeComboBox.getSelectedItem().toString();
            //int qty=(int)qtySpinner.getValue();
            double amount=Double.parseDouble(amountText.getText());
            Order order=new Order(orderId, phoneNumber, size, qty, amount);
            boolean isUpdated=OrderController.setOrder(order);
            if(isUpdated){
                JOptionPane.showMessageDialog(this, "Updated Your Order");
                
                /*phoneNumberText.setEditable(false);
                sizeComboBox.setEnabled(false);
                qtySpinner.setEnabled(false);
                amountText.setEditable(false);*/
                
                //updateButton.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Phone Number");
        }    
    }//GEN-LAST:event_updateButtonActionPerformed

    private void qtySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {
        calculateAmount();
    }

    private void calculateAmount() {
        String size = sizeComboBox.getSelectedItem().toString();
        int qty = (int) qtySpinner.getValue();
        double price = 0.00;

        if (qty > 0) {
            switch (size) {
                case "XS":
                    price = 600.00 * qty;
                    break;
                case "S":
                    price = 800.00 * qty;
                    break;
                case "M":
                    price = 900.00 * qty;
                    break;
                case "L":
                    price = 1000.00 * qty;
                    break;
                case "XL":
                    price = 1100.00 * qty;
                    break;
                case "XXL":
                    price = 1200.00 * qty;
                    break;
            }
            amountText.setText(String.format("%.2f", price));
        } else {
            amountText.setText(""); // Set to empty if qty is 0 or negative
        }
    }

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
    private javax.swing.JTextField orderIdText;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> sizeComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}

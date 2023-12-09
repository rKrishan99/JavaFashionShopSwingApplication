package pos;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class AddOrder extends javax.swing.JFrame {
    
    private OrderListImpl orderListInstance;
   
    public AddOrder(OrderListImpl orderListInstance) {
        this.orderListInstance = orderListInstance;
        initComponents();
        setResizable(false);
        amountText.setEditable(false);
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        qtySpinner.setModel(spinnerModel);
        
        //OrderListImpl orderListInstance = ...;
        int orderNumber=orderListInstance.size();
        String orderId = OrderController.generateId(++orderNumber);
        orderIdText.setText(orderId);
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orderIdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        sizeComboBox = new javax.swing.JComboBox<>();
        qtySpinner = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 473, 85));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Order ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 123, -1, -1));

        orderIdText.setEditable(false);
        orderIdText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        orderIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextActionPerformed(evt);
            }
        });
        getContentPane().add(orderIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 119, 179, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 432, -1, -1));

        phoneNumberText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });
        getContentPane().add(phoneNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 432, 195, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("T-Shirt Size");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 179, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 231, -1, -1));

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        placeOrderButton.setBackground(new java.awt.Color(204, 204, 255));
        placeOrderButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Amount");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 289, -1, -1));

        amountText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        amountText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextActionPerformed(evt);
            }
        });
        getContentPane().add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 289, 149, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, 461, 10));

        sizeComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(sizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 174, 87, -1));

        qtySpinner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(qtySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 231, 87, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 356, 461, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Do You Want To Place Your Order...");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 384, 306, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design (47).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 480, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
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
            boolean isAdded=OrderController.addOrder(order);
            if(isAdded){
                JOptionPane.showMessageDialog(this, "Placed Your Order");
                
                phoneNumberText.setEditable(false);
                sizeComboBox.setEnabled(false);
                qtySpinner.setEnabled(false);
                amountText.setEditable(false);
                
                placeOrderButton.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Phone Number");
        }    
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        dispose();
        MainForm mainForm = new MainForm();
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void orderIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTextActionPerformed

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

    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed

    private void amountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextActionPerformed


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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField orderIdText;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JComboBox<String> sizeComboBox;
    // End of variables declaration//GEN-END:variables

    void setModal(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

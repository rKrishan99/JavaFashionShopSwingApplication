
package pos;

public class MainForm extends javax.swing.JFrame {

    private OrderListImpl orderListInstance;
    
    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addOrderButton = new javax.swing.JButton();
        searchOrderButton = new javax.swing.JButton();
        updateCustomerFormButton = new javax.swing.JButton();
        deleteCustomerFormButton = new javax.swing.JButton();
        viewOrderTableButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchCustomerButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addOrderButton.setBackground(new java.awt.Color(153, 204, 255));
        addOrderButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addOrderButton.setText("Add New Order");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 264, -1));

        searchOrderButton.setBackground(new java.awt.Color(153, 204, 255));
        searchOrderButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchOrderButton.setText("Search Order");
        searchOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 264, -1));

        updateCustomerFormButton.setBackground(new java.awt.Color(153, 204, 255));
        updateCustomerFormButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateCustomerFormButton.setText("Update Order");
        updateCustomerFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerFormButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateCustomerFormButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 264, -1));

        deleteCustomerFormButton.setBackground(new java.awt.Color(153, 204, 255));
        deleteCustomerFormButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteCustomerFormButton.setText("Delete Order");
        deleteCustomerFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerFormButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteCustomerFormButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 264, -1));

        viewOrderTableButton.setBackground(new java.awt.Color(153, 204, 255));
        viewOrderTableButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewOrderTableButton.setText("View All Orders");
        viewOrderTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderTableButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewOrderTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 264, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fashion Store");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 393, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elevate your style, and embrace the extraordinary...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 320, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 490, 10));

        searchCustomerButton.setBackground(new java.awt.Color(153, 204, 255));
        searchCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchCustomerButton.setText("Search Customer");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 264, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design (47).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 510, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        dispose();
        AddOrder addOrderWindow = new AddOrder((OrderListImpl) DBConnection.getInstance().getOrderList());
        addOrderWindow.setLocationRelativeTo(null);
        addOrderWindow.setVisible(true);
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void searchOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOrderButtonActionPerformed
        //new SearchOrderForm().setVisible(true);
        dispose();
       
        SearchOrder SearchOrder = new SearchOrder();
        SearchOrder.setLocationRelativeTo(null);
        SearchOrder.setVisible(true);
    }//GEN-LAST:event_searchOrderButtonActionPerformed

    private void updateCustomerFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerFormButtonActionPerformed
        //new UpdateOrder().setVisible(true);
        dispose();
        
        UpdateOrder updateOrder = new UpdateOrder();
        updateOrder.setLocationRelativeTo(null);
        updateOrder.setVisible(true);        
    }//GEN-LAST:event_updateCustomerFormButtonActionPerformed

    private void viewOrderTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderTableButtonActionPerformed
        dispose();
       
        ViewOrderTable viewtable = new ViewOrderTable();
        viewtable.setLocationRelativeTo(null);
        viewtable.setVisible(true);
    }//GEN-LAST:event_viewOrderTableButtonActionPerformed

    private void deleteCustomerFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerFormButtonActionPerformed
        //new DeleteOrderForm().setVisible(true);
        dispose();
       
        DeleteOrder deleteOrder = new DeleteOrder();
        deleteOrder.setLocationRelativeTo(null);
        deleteOrder.setVisible(true);
    }//GEN-LAST:event_deleteCustomerFormButtonActionPerformed

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
        SearchCustomer searchCustomer = new SearchCustomer();
        searchCustomer.setLocationRelativeTo(null);
        searchCustomer.setVisible(true);
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton deleteCustomerFormButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton searchOrderButton;
    private javax.swing.JButton updateCustomerFormButton;
    private javax.swing.JButton viewOrderTableButton;
    // End of variables declaration//GEN-END:variables
}

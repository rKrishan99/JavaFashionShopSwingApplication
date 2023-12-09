
package pos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewOrderTable extends javax.swing.JFrame {

  
    public ViewOrderTable() {
        initComponents();
        displayOrderDetails();
    }

    public JTable getOrderDetailsTable(){
        return orderDetailsTable;
    }
    
    private void displayOrderDetails() {
        Order[] orderArray = OrderController.getAllOrders();
        DefaultTableModel dtm = (DefaultTableModel) orderDetailsTable.getModel();
        
        dtm.setRowCount(0);
        for (Order order : orderArray) {
            Object[] rowData = { order.getOrderId(), order.getPhoneNumber(), order.getSize(), order.getQty(),
                    order.getAmount() };
            dtm.addRow(rowData);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderDetailsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View All Order Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, 1133, 54));

        orderDetailsTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Phone Number", "Size", "Quantity", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderDetailsTable);
        if (orderDetailsTable.getColumnModel().getColumnCount() > 0) {
            orderDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            orderDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            orderDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            orderDetailsTable.getColumnModel().getColumn(3).setResizable(false);
            orderDetailsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, 1121, 459));

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 575, 135, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 1133, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design (47).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1140, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        MainForm mainForm = new MainForm();
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable orderDetailsTable;
    // End of variables declaration//GEN-END:variables

  
}

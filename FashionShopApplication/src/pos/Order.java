
package pos;

public class Order {
    private String orderId;
    private String phoneNumber;
    private String size;
    private int qty;
    private double amount;

    public Order() {
    }

    public Order(String orderId, String phoneNumber, String size, int qty, double amount) {
        this.orderId = orderId;
        this.phoneNumber = phoneNumber;
        this.size = size;
        this.qty = qty;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return orderId+"-"+phoneNumber+"-"+size+"-"+qty+"-"+amount;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
    
}

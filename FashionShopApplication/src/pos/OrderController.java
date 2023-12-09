
package pos;

public class OrderController {
    
    public static boolean addOrder(Order order){
       /*// Get the single instance of DBConnection
        DBConnection dbConnection = DBConnection.getInstance();

        // Get the OrderList associated with the DBConnection instance
        OrderList orderList = dbConnection.getOrderList();*/

        OrderList orderList = DBConnection.getInstance().getOrderList();
        return  orderList.add(order);
    }
    
    public static Order[] getAllOrders(){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.toArray();
    }
    
    public static int getIndexOf(Order order){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.indexOf();
    }
    
    public static boolean setOrder(Order order){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.set(order);
    }
    
    public static Order searchOrder(String orderId){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.search(orderId);
    }
    
    public static String generateId(int orderCounter){
        //Insert code to generate an id
        String formattedCounter = String.format("%05d", orderCounter);
        String orderId = "ODR#" + formattedCounter;
        return orderId;
    }
    
    public static boolean deleteOrder(String orderId){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        Order order = orderList.search(orderId);
        return orderList.remove(order);
    }
    
    public static boolean update(Order order){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.set(order);
    }
    
}

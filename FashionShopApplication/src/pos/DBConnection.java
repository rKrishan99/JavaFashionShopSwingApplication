
package pos;


public class DBConnection {
    private OrderList orderList;
    private static DBConnection dBConnection;
    private DBConnection(){
        orderList=new OrderListImpl(100, 0.5f);
    }
    public static DBConnection getInstance(){
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
    public OrderList getOrderList(){
       return orderList;
    }
}

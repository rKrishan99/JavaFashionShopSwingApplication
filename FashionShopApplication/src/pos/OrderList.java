
package pos;


public interface OrderList {
    public boolean add(Order order);
    public boolean add(int index, Order order);
    public boolean remove(int index);
    public boolean remove(Order order);
    public Order get(int index);
    public int indexOf(Order order);
    public Order[] toArray();
    public Order search(String orderId);
    public boolean set(Order order);
    public int size();

    public int indexOf();
}

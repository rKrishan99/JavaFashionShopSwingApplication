
package pos;


public class OrderListImpl implements OrderList {

    private Order[] orderArray;
    private int nextIndex;
    private int intSize;
    private double loadFact;

    OrderListImpl(int intSize, double loadFact) {
        this.intSize = intSize;
        this.loadFact = loadFact;
        orderArray = new Order[intSize];
        nextIndex = 0;
    }

    private boolean isEmpty() {
        return nextIndex == 0;
    }

    private boolean isFull() {
        return nextIndex >= orderArray.length;
    }

    @Override
    public int size() {
        return nextIndex;
    }

    public void clear() {
        nextIndex = 0;
        orderArray = new Order[intSize];
    }

    @Override
    public String toString() {
        String list = "{";
        for (int i = 0; i < nextIndex; i++) {
            list += orderArray[i] + ", "; //orderArray[i].toString()
        }
        return isEmpty() ? "{empty}" : list + "\b\b}";
    }

    @Override
    public boolean add(Order order) {
        if (isFull()) {
            extendArray();
        }
        orderArray[nextIndex++] = order;
        return true;
    }

    private void extendArray() {
        Order[] tempOrderArray = new Order[orderArray.length + (int) (orderArray.length * loadFact)];
        for (int i = 0; i < orderArray.length; i++) {
            tempOrderArray[i] = orderArray[i];
        }
        orderArray = tempOrderArray;
    }

    @Override
    public boolean add(int index, Order order) {
        if (!isValidIndex(index)) {
            return false;
        }
        if (isFull()) {
            extendArray();
        }
        for (int i = nextIndex - 1; i >= index; i--) {
            orderArray[i + 1] = orderArray[i];
        }
        orderArray[index] = order;
        nextIndex++;
        return true;
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < nextIndex;
    }

    @Override
    public Order[] toArray() {
        Order[] tempOrderArray = new Order[nextIndex];
        for (int i = 0; i < nextIndex; i++) {
            tempOrderArray[i] = orderArray[i];
        }
        return tempOrderArray;

    }

    @Override
    public boolean remove(int index) {
        if (isValidIndex(index)) {
            for (int i = index; i < nextIndex - 1; i++) {
                orderArray[i] = orderArray[i + 1];
            }
            nextIndex--;
            Order[] tempOrderArray = new Order[nextIndex];
            for (int i = 0; i < nextIndex; i++) {
                tempOrderArray[i] = orderArray[i];
            }
            orderArray = tempOrderArray;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Order order) {
        return remove(indexOf(order));
    }

    @Override
    public Order get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public int indexOf(Order order) {
        if (order != null) {
            for (int i = 0; i < nextIndex; i++) {
                if (orderArray[i].getOrderId().equalsIgnoreCase(order.getOrderId())) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public Order search(String orderId) {
        for (int i = 0; i < nextIndex; i++) {
            if (orderArray[i].getOrderId().equalsIgnoreCase(orderId)) {
                return orderArray[i];
            }
        }
        return null;
    }

    @Override
    public boolean set(Order order) {
        int index = indexOf(order);
        if(index!=-1){
            orderArray[index]=order;
            return true;
        }
        return false;
    }

    @Override
    public int indexOf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

import java.util.HashMap;
import java.util.Map;

public class order_manager {

    private Map<String, order> orderMap = new HashMap<>();

    public void addOrder(String address, order order) {
        if (orderMap.containsKey(address)) {
            throw new order_already_added_exception();
        }
        orderMap.put(address, order);
    }

    public order getOrder(String address) {
        return orderMap.get(address);
    }

    public void deleteOrder(String address) {
        orderMap.remove(address);
    }

    public void addToOrder(String address, item item) {
        orderMap.get(address).add(item);
    }

    public order[] getOrdersArray() {
        return orderMap.values().toArray(new order[0]);
    }

    public int getTotal() {
        int total = 0;
        for (order order : orderMap.values()) {
            total += order.costTotal();
        }
        return total;
    }

    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (order order : orderMap.values()) {
            quantity += order.itemQuantity(itemName);
        }
        return quantity;
    }
}
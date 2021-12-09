public interface OrdersManager {
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem item);
    Order getOrder();
    int ordersCostSummary();
    int ordersQuantity();
}
public interface order {
    boolean add(item item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    item[] getItems();
    boolean remove(String itemName);
    int removeAll(String itemName);
    item[] sortedItemByCostDesc();
    int costTotal();
}
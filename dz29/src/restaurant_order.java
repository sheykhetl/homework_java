public class restaurant_order implements order {

    private item[] items;

    public restaurant_order(item[] items) {
        this.items = items;
    }

    @Override
    public int itemsQuantity() {
        return items.length;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (item item: items) {
            if (item.getName().equals(itemName)) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public item[] getItems() {
        return items;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for (item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public boolean add(item item) {
        return false;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public item[] sortedItemByCostDesc() {
        return new item[0];
    }
}
package LLD.structural.adapter;

public abstract class GroceryItem {

    private String name;
    private String storename;

    public GroceryItem(String name, String storename) {
        this.name = name;
        this.storename = storename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreName() {
        return storename;
    }

    public void setStoreName(String restaurantName) {
        this.storename = restaurantName;
    }
}

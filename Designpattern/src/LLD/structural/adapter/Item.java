package LLD.structural.adapter;

public abstract class Item {

    private String name;
    private String restaurantName;

    public Item(String name, String restaurantName) {
        this.name = name;
        this.restaurantName = restaurantName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}

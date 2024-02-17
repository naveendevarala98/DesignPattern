package LLD.structural.adapter;


/**
 * This class helps in convert grocery item to item
 */
public class GroceryAdapter extends Item{

    GroceryItem groceryItem;

    public GroceryAdapter(GroceryItem item){
        super(item.getName(), item.getStoreName());
    }
}

package LLD.structural.adapter;

public class adaptermain {

    public static void main(String[] args) {
        swiggystore swiggystore = new swiggystore();
        Item item1 = new FoodItem("paneer","abcrestaurant");

        swiggystore.addItem(item1);

        Item item2 = new FoodItem("rice","defrestaurant");

        swiggystore.addItem(item2);

        swiggystore.getItems().forEach(i->System.out.println(i.getName()));

        //to add grocery item
        //grocery item has different types of attributes, it has to be converted to item , because
        //swiggy store accepts oly item
        //converts grocery item to item
        Item item3 = new GroceryAdapter(new GroceryProduct("dal","qwetrade"));

        swiggystore.addItem(item3);

        swiggystore.getItems().forEach(i->System.out.println(i.getName()));





    }
}

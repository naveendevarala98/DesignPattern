package LLD.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class swiggystore {

    List<Item> l = new ArrayList<>();

    public void addItem(Item item){
        this.l.add(item);
    }

    public List<Item> getItems(){
        return l;
    }
}

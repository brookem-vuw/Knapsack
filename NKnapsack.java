package ks;

import java.util.ArrayList;
import java.util.List;

public class NKnapsack extends Knapsack {

    int n;      //max number of items in an 0-N knapsack.
    List<Item> itemList;

    public NKnapsack(int weight) {
        super(weight);
    }

    @Override
    public void run(){
        this.updateList(itemList);
        this.generateTable(itemList);
    };

    public void updateList(List<Item> items){
        List<Item> newItems = new ArrayList<Item>();
        for (int i = 0; i < items.size(); i++){
            for (int j = 0; j < n; j++){
                newItems.add(items.get(i));
            }
        }
        itemList = newItems;
    }
}

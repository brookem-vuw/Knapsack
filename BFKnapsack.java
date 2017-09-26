package ks;

import java.util.ArrayList;
import java.util.List;

/**
 * Brute-Force knapsack for COMP361
 * Extends the knapsack structure from core part one
 * but implements its own methods and fields for determining
 * the permutations.
 */
public class BFKnapsack extends Knapsack{

    List<Item> itemList;
    public int maxItems;       //max items allowed in a given pack
    int n;                     //max number of items in an 0-N knapsack.

    public BFKnapsack(int weight) {
        super(weight);
    }

    public List<List<Item>> permuteList(){
        return permuteList();
    }

    public List<List<Item>> permuteList(List<Item> prefix, List<Item> rest){
    return null;
    }

    public void updateList(List<Item> items){
        List<Item> newItems = new ArrayList<Item>();
        for (int i = 0; i < items.size(); i++){
            for (int j = 0; j < n; j++){
                newItems.add(items.get(i));
            }
        }
        itemList = newItems;
    }

    @Override
    public void run(){

    }
}

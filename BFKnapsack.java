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

    public int maxItems;       //max items allowed in a given pack

    public BFKnapsack(int weight) {
        super(weight);
    }

    public List<List<Item>> permuteList(){
        return permuteList();
    }

    public List<List<Item>> permuteList(List<Item> prefix, List<Item> rest){
    return null;
    }

    @Override
    public void run(){

    }
}

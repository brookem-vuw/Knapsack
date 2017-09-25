package ks;

import java.util.List;
import java.util.ArrayList;

public class Knapsack {

    //--FIELDS--//
    private int maxWeight;
    private int noItems;
    private List<Item> itemList;
    private Pack[][] packTable;

    public Knapsack( int weight){
        genList();
        this.noItems = itemList.size();
        this.maxWeight = weight;
        this.packTable = new Pack[maxWeight][noItems];
        run();
    }

    public void run(){
        generateTable(itemList);
        //finding the maximum for a given weight.
        Pack best = new Pack();
        for (int i = 0; i < noItems; i++){
            if (packTable[maxWeight-1][i].maxValue > best.maxValue){
                best = packTable[maxWeight-1][i];
            }
        }
        System.out.println("Best: " + best.print());
    }

    /**
     * generateTable creates the dynamic programming table, calculating each possible configuration
     * at each weight and storing them for future reference.
     */
    public void generateTable(List<Item> items){
        this.packTable = new Pack[maxWeight][noItems];

        for (int w = 0; w < maxWeight; w++){
            for (int i = 0; i < noItems; i++) {
                //pick out an item to look at
                Item item = items.get(i);
                if (w == 0 || i == 0) {                                    //set edges to 0
                    packTable[w][i] = new Pack();
                } else {
                    if ((item.weight + packTable[w][i - 1].weight) > w) {  //this is over weight limit
                        packTable[w][i] = new Pack(packTable[w][i - 1]);
                    } else {                                               //this is under weight limit
                        if (packTable[w][i - 1].maxValue > (packTable[w - 1][i - 1].maxValue + item.value)) {
                            packTable[w][i] = new Pack(packTable[w][i - 1]);
                        } else {                                           //this has increased value with the new item
                            packTable[w][i] = new Pack(packTable[w][i - 1], item);
                        }
                    }
                }
            }
        }
        //print out the table for clarity
        for (int w = 0; w < maxWeight; w++){
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < noItems; i++){
                Pack pack = packTable[w][i];
                line.append(" " + packTable[w][i].maxValue);
            }
            System.out.println(line);

        }
        //System.out.println("Pack: " + packTable[maxWeight-1][noItems-1].print());
    }

    public void genList (){
        this.itemList = new ArrayList<Item>();
        itemList.add(new Item("pen", 1, 1));
        itemList.add(new Item("knife", 2, 1));
        itemList.add(new Item("case", 3, 2));
        itemList.add(new Item("lunch", 2, 3));
        itemList.add(new Item("bottle", 1, 3));


    }

    public static void main(String[] args) {
	    new Knapsack(6);
    }
}

package ks;

public class Item {

    public String name;
    public int value;
    public int weight;
    public double valWeight;

    public Item(String n, int v, int w){
        this.name = n;
        this.value = v;
        this.weight = w;
        valWeight = value/weight;
    }

    @Override
    public String toString(){
        return (name + ", w: " + weight + ", v: " + value + " val per weight: " + valWeight);
    }

}

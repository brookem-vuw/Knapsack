package ks;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    public List<Item> contents = new ArrayList<>();
    public int maxValue;
    public int weight;
    public boolean empty;

    public Pack(Pack p, Item i){
        this.empty = false;
        this.contents = p.contents;
        this.contents.add(i);

        maxValue = p.maxValue + i.value;
        weight = p.weight + i.weight;
    }

    public Pack (Pack p){
        this.empty = false;
        this.contents = p.contents;
        maxValue = p.maxValue;
        weight = p.weight;
    }

    public Pack (Item i){
        this.empty = false;
        this.contents.add(i);
        maxValue = i.value;
        weight = i.weight;
    }

    public Pack (){
        this.empty = true;
        this.maxValue = 0;
    }

    public String print(){
        StringBuilder p = new StringBuilder();
        if (!this.empty){
        for (Item i : contents){
            p.append(i.name + " ");
        }
        return p.toString(); }

        else return "Empty.";
    }
}

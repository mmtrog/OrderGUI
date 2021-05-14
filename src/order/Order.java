package order;

import media.disc.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//import utils.*;
import media.*;


public class Order {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int nbOrdered = 0; 

    //***************************** Add and Remove methods *****************************

    public int addOrdered() {    
        nbOrdered++;
        return nbOrdered;
    }

    public int removeOrdered() {
        if (nbOrdered > 0) {
            nbOrdered--;
        }
        return nbOrdered;
    }

    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("Your item is successfully added: ");
        System.out.print(media.getTitle() + " ### " + media.getCost());
        System.out.println(totalCost()); 
    }

    public void addCompact(CompactDisc cd) {
        itemsOrdered.add(cd);
        System.out.println("Your item is successfully added: ");
        System.out.println(cd.getClass() + " ### " + cd.getTitle() + " ### " + cd.getCost());
        System.out.println("Track info: ");
        //cd.printTrackList();
        System.out.println(totalCost());
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
        System.out.println("Your item is successfully removed: ");
        System.out.print(media.getTitle() + " ### " + media.getCost());
        System.out.println(totalCost());
    }

    public void removeMediaBuyNumber (int number) {
        number--;
        itemsOrdered.remove(number);
        System.out.println("Total cost: " + totalCost());
    }

    public void clearMediaList() {
        itemsOrdered.clear();
    }

    //***************************** Total cost method *****************************

    public float totalCost() {
        float totalCost = 0.0f;
        for (Media mediaCheck: itemsOrdered) {
            totalCost += mediaCheck.getCost();
        }
        return totalCost;
    }
    
    //***************************** Getter and Setter methods *****************************
    
    public int countItemOrdered() {
        return itemsOrdered.size();
    }

    public int getNbOrdered() {
        return nbOrdered;
    }

    public void setNbOrdered(int nbOrdered) {
        this.nbOrdered = nbOrdered;
    }
    //********************************* Print list method **********************************
    public void printList() {
        int count = 0;
        System.out.println("\n********** Number " + nbOrdered + "**********");
        for(Media mediaCheck : itemsOrdered) {
            count++;
            System.out.print(count + ": ");
            System.out.print(mediaCheck.getTitle() + " ### " + mediaCheck.getCategory() + " ### " + mediaCheck.getCost() + "\n");
        }
        System.out.println("Total cost: " + totalCost());
    }
}
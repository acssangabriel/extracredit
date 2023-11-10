/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_muo_sangabrielas;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index <= itemList.size()) {
        earnings += itemList.get(index).getCost();
        System.out.printf("%s sold %s for %.1f. \n",
               this.name, itemList.get(index).getName(), itemList.get(index).getCost());
    } else {
        System.out.println("There are only " + itemList.size() + " items in " 
                + name +".");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    double earningsOrig = earnings;
    itemList.forEach(n -> {
        if (n.getName() == name){
            earnings += n.getCost();
            System.out.printf("%s sold %s for %.1f. \n",
               this.name, n.getName(), n.getCost());
        }
    });
    if(earningsOrig == earnings){
        System.out.printf("%s doesn't sell %s. \n", this.name, name);
    }
  }
  
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if(itemList.contains(i)){
        earnings += i.getCost();
        System.out.printf("%s sold %s for %.1f. \n",
               this.name, i.getName(), i.getCost());
    }
    else {
        System.out.printf("%s doesn't sell %s. \n", this.name, i.getName());
    }
  }
  
  public void addItem(Item i){
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    itemList.forEach(n -> {
        if (n.getType() == type){
            System.out.println(n.getName());
        }
    });
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    itemList.forEach(n -> {
        if (n.getCost() <= maxCost){
            System.out.println(n.getName());
        }
    });
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    itemList.forEach(n -> {
        if (n.getCost() >= minCost){
            System.out.println(n.getName());
        }
    });
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    storeList.forEach((n) -> System.out.println(n.getName() + ": " + n.getEarnings()));
  }
}

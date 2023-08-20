/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmmanagement;

/**
 *
 * @author yusuf
 */
public class FarmCase {
    
    private static int milk = 10;
    private static int bal = 10;
    private static int egg = 10;
    private static FarmCase farmCase;
    private static int cash = 0;
    private static int milkPrice = 25;
    private static int honeyPrice = 30;
    private static int eggPrice = 15;
    private static int cowPrice = 1000;
    private static int chickenPrice = 100;
    private static int beePrices = 250;

    public static int getHoneyPrice() {
        return honeyPrice;
    }

    public static int getEggPrice() {
        return eggPrice;
    }
    

    public static int getMilkPrice() {
        return milkPrice;
    }

  

    public static int getCash() {
        return cash;
    }

    public static void addCash(int cash) {
        FarmCase.cash += cash;
    }
    
    
    public static FarmCase getFarmCase(){
        if(farmCase == null){
            farmCase = new FarmCase();
        }
        return farmCase;
    }
    
    static public int getMilk(){
        return milk;
    }
    
    static public int getBal(){
        return bal;
    }
    
    static public int getEgg(){
        return egg;
    }
    
    static public void addMilk(int x){
        milk += x;
    }
    static public void deleteMilk(int x){
        milk -= x;
    }
     static public void addHoney(int x){
        bal += x;
    }
    static public void deleteHoney(int x){
        bal -= x;
    }
     static public void addEgg(int x){
        egg += x;
    }
    static public void deleteEgg(int x){
        egg -= x;
    }

    public static int getCowPrice() {
        return cowPrice;
    }

    public static int getChickenPrice() {
        return chickenPrice;
    }

    public static int getBeePrices() {
        return beePrices;
    }
    
    
    
}

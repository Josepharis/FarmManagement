/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmmanagement;

import java.util.Random;

public class Animal {
    private int id;
    private String type;
    private String gender;
    private int age;
    private String product;
    private int product_status;
    private int deliveryTimeRan;
    private int yasamSuresi;
    private int uretimSayisi;
    private static int totalCount=0;
    public Animal(int id, String type, String gender, int age, String product, int product_status) {
        this.id=id;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.product = product;
        this.product_status = product_status;
        Random delivery=new Random();
        //this.deliveryTimeRan=delivery.nextInt(4)+1; 
        this.deliveryTimeRan = 1;
        this.yasamSuresi = delivery.nextInt(50) +10 + (int) System.currentTimeMillis()/1000;  
        this.uretimSayisi=0;
        totalCount++;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getProduct_status() {
        return product_status;
    }

    public void setProduct_status(int product_status) {
        this.product_status = product_status;
    }
    
    public void addProduct(int product){
        this.product_status += product;
    }
     
    public int getDeliveryTimeRandom(){
        return this.deliveryTimeRan;
    }
    public int getYasamSuresi(){
        return this.yasamSuresi;
    }
    
    public static int getTotalCount(){
        return totalCount;
    }
    
}

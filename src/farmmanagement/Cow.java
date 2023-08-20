/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmmanagement;

/**
 *
 * @author yusuf
 */
public class Cow extends Animal{
    private static int count = 0;
    public Cow(int id, String type, String gender, int age, String product, int product_status) {
        super(id, type, gender, age, product, product_status);
        count++;
    }
    
    public static int getCount(){
        return count;
    }

    public Cow() {
        super(0, null, null, 0, null, 0);
    }
    public void die(){
      count--;
    }
    
    
}   

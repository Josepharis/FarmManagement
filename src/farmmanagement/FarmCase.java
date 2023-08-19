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
    private static int milk;
    private static int bal;
    private static int egg;
    
    public int getMilk(){
        return milk;
    }
    
    public int getBal(){
        return bal;
    }
    
    public int getEgg(){
        return egg;
    }
    
    public void setMilk(int x){
        milk += x;
    }
}

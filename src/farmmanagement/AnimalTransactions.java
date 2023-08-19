/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmmanagement;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author yusuf
 */

public class AnimalTransactions {
    private Connection con =null;
    private Statement statement = null;
    private PreparedStatement preparedStatement=null;
    public ArrayList<Animal> bringAnimals() {
    ArrayList<Animal> cikti=new ArrayList<Animal>();
    
        try {
            statement = con.createStatement();
            String query= "Select * From animal";
            ResultSet rs =statement.executeQuery(query);
            while (rs.next()) {
                int id=rs.getInt("id");
                 String gender=rs.getString("gender");
                String type=rs.getString("type");
                int age=rs.getInt("age");
                int product_status=rs.getInt("productionstatus");
                String product=rs.getString("product");
                cikti.add(new Animal(id,type, gender, age, product, product_status));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(AnimalTransactions.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
}
    public AnimalTransactions(){
                String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_name+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = (Connection) DriverManager.getConnection(url, Database.user_name, Database.password);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
}
    
    public void addAnimal(String type,String gender ,String age,String product,String productionstatus){
            String query="Insert Into animal (type,gender,age,product,productionstatus) VALUES(?,?,?,?,?)";
        try {
            preparedStatement= con.prepareStatement(query);
            
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, gender);
            preparedStatement.setString(3, age);
            preparedStatement.setString(4, product);
            preparedStatement.setString(5, productionstatus);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnimalTransactions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteAnimal(int id){
    String query ="Delete from animal where id= ?";
        try {
            preparedStatement=con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeLargeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnimalTransactions.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

  
    
}

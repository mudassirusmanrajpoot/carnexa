

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
 
public class Singelton_Pattern {

    public void print(){
         try (
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/carnexa","root","")){  
           Statement   stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer");
        while(rs.next()){
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getString(4));
        }
    }
catch(Exception e){ 
    System.out.println(e);
} 
    }
    
  
        
    
     public boolean Sigup(String Name,String Gamil,double CNIC,String password){
         try ( 
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/carnexa","root","")){  
         Statement stmt=con.createStatement();
         String sql = "INSERT INTO `customer` (`Name`, `Gmail`,`Cnic`,`Password`) VALUES ('"+Name+"' , '"+Gamil+"' , '"+CNIC+"' , '"+password +"')";
         int rowsAffected = stmt.executeUpdate(sql);
         return true;
    }
catch(Exception e){ 
    System.out.println(e);
    return false;
} 
    }
     
     public boolean login(String Gmail,String password){
         try (
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/carnexa","root","")){  
         Statement stmt=con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM `customer` WHERE Gmail='" + Gmail + "' AND Password='" + password + "'");
         while(rs.next()){
          System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getString(4));
         if(rs.getString(2).equals(Gmail)&&rs.getString(4).equals(password)){
             return true;
         }
          }
         return false;
    }
catch(Exception e){ 
    return false;
} 
    }
     
     
      public boolean delete(String gmail){
         try (
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/carnexa","root","")){  
           Statement   stmt=con.createStatement();
           String sql = "DELETE FROM `customer` WHERE `gmail` = '"+gmail+"'";
           int rowsAffected = stmt.executeUpdate(sql);
           return true;
    }
catch(Exception e){ 
    System.out.println(e);
    return false;
} 
    }
      
      
      public boolean booking(String Gmail,String Car_Category,String Registeration_Number,int Model_Year,String Appointement,String Appointement_ID){
         //status 0 for booking and 1 if booking done
          try (
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/carnexa","root","")){  
         Statement stmt=con.createStatement();
         String sql = "INSERT INTO `bookings` (`Gmail`, `Car_Category`,`Registeration_Number`,`Model_Year`,`Appointement`,`Appointement_ID`,`Status`) VALUES ('"+Gmail+"' , '"+Car_Category+"' , '"+Registeration_Number+"' , '"+Model_Year +"' , '"+Appointement+"' , '"+Appointement_ID+"' , '0"+"')";
         int rowsAffected = stmt.executeUpdate(sql);
         return true;
    }
catch(Exception e){ 
    System.out.println(e);
    return false;
} 
    }
      
         public ArrayList<String> search_by_tokken(String a){
         try (
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/carnexa","root","")){  
           Statement   stmt=con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT Registeration_Number,Model_Year,Appointement,Car_Category FROM `bookings` WHERE Appointement_ID='" + a +"'");
       ArrayList<String> arr=new ArrayList<String>();
         while(rs.next()){
       arr.add(rs.getString(1));
       arr.add(rs.getString(2));
       arr.add(rs.getString(3));
       arr.add(rs.getString(4));
        }
       return arr;
    }
catch(Exception e){ 
    System.out.println(e);
    System.out.println("Mistake");
   return null;
} 
    }
    
     public ArrayList<String> Appointement_History(String Gmail){
         try (
         Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/carnexa","root","")){  
           Statement   stmt=con.createStatement();
      //   ResultSet rs = stmt.executeQuery("SELECT Registeration_Number,Model_Year,Appointement,Car_Category FROM `bookings` WHERE Appointement_ID='" + a +"'");
       ResultSet rs = stmt.executeQuery("SELECT Registeration_Number,Appointement_ID,Model_Year,Appointement,Car_Category FROM `bookings` WHERE Gmail='" + Gmail+ "'");
       ArrayList<String> arr=new ArrayList<String>();
      while(rs.next()){
     // System.out.println(+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+"   "+rs.getString(4));
      arr.add(rs.getString(1));
      arr.add(rs.getString(2));
      arr.add(rs.getString(3));
      arr.add(rs.getString(4));
      arr.add(rs.getString(5));
        }
       return arr;
    }
catch(Exception e){ 
    System.out.println(e);
    System.out.println("Mistake");
   return null;
} 
    }
         
}

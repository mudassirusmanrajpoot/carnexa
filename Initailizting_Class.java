/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSPAK
 */
public class Initailizting_Class {
    public static void main(String[] args){
        Screen obj=new Screen();
        obj.setVisible(true);
        Login h=new Login();
        try{
          for(int i=0;i<=100;i++ ) {
              Thread.sleep(15);
              obj.label.setText("Loading  "+i+"%");
              obj.Bar.setValue(i);
              if(i==100){
                  obj.setVisible(false);
                  h.setVisible(true);
              }
          }
        }
        catch(Exception e){
            System.out.println("Bug detetced in splah screen");
        }
    }
}

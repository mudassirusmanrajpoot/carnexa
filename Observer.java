/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSPAK
 */
public class Observer {
    public void notify_all(String a){
        System.out.println("Notifing everyone about: "+a);
    }
    
    public void notify_admin(String a){
        System.out.println("Admin notified about: "+a);
    }
    
}

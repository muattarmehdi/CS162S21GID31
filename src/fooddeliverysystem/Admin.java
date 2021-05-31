/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;

/**
 *
 * @author hussa
 */
public class Admin {
    
    public static String Email="admin@gmail.com";
    public static String Password="admin123";
    public int funds;
    public int totalemployees;
    public int totalorders;

    public int getTotalemployees() {
        return totalemployees;
    }

    public int getTotalorders() {
        return totalorders;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = this.funds+funds;
    }
    
    
}

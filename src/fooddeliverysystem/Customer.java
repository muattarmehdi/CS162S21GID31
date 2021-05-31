/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hussa
 */
public class Customer extends Person{
    
    private String Id;
    private String Type;
    private String pin;
    private int spendings;
    private Order currentorder;
    private Product Favourite;
    private ArrayList<Order> allorders;
    private ArrayList<Complaint> complaints;

    Customer(){
    }
    
    Customer(String name,Date date,String address,String contactno,String email,String password,String id,String Type,String pin){
    
        this.setName(name);
        this.setAddress(address);
        this.setDOB(date);
        this.setContactno(contactno);
        this.setEmail(email);
        this.setPassword(password);
        this.Id=id;
        this.Type=Type;
        this.pin=pin;
    }
    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getSpendings() {
        return spendings;
    }

    public void setSpendings(int spendings) {
        this.spendings = this.spendings+spendings;
    }

    public Order getCurrentorder() {
        return currentorder;
    }

    public void setCurrentorder(Order currentorder) {
        this.currentorder = currentorder;
    }

    public Product getFavourite() {
        return Favourite;
    }

    public void setFavourite(Product Favourite) {
        this.Favourite = Favourite;
    }

    public ArrayList<Order> getAllorders() {
        return allorders;
    }

    public void setAllorders(ArrayList<Order> allorders) {
        this.allorders = allorders;
    }

    public ArrayList<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(ArrayList<Complaint> complaints) {
        this.complaints = complaints;
    }
    
            
    
}

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
public class Rider extends Employee{
    
    private String Title;
    private Vehicle vehicle;
    private ArrayList<Order> orders;

    Rider (){
    
    }
    Rider (String name,Date date,String address,String contactno,String email,String password,String id,String cnic,int Salary,String title){
        this.setName(name);
        this.setAddress(address);
        this.setDOB(date);
        this.setContactno(contactno);
        this.setEmail(email);
        this.setPassword(password);
        this.setId(id);
        this.setCNIC(cnic);
        this.setSalary(Salary);
        this.Title=title;
    }
    
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    
}

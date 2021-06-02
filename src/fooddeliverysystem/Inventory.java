/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author hussa
 */
public class Inventory {
    
    private static Inventory instance;
    
    public static Inventory getInstance(){
    
        if(instance == null)
        {
            instance= new Inventory();
        }
        return instance;
    } 
    
    private static LinkedList<Seller> sellers = new LinkedList<>();
    private static LinkedList<Rider> riders = new LinkedList<>();
    private static LinkedList<Clerk> clerks = new LinkedList<>();
    private static LinkedList<Customer> customers = new LinkedList<>();
    private static ArrayList<Vehicles> vehicles = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Complaint> complaints = new ArrayList<>();
    private static ArrayList<Outlet> outlets = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();

    public LinkedList<Seller> getSellers() {
        return sellers;
    }

    public LinkedList<Rider> getRiders() {
        return riders;
    }

    public LinkedList<Clerk> getClerks() {
        return clerks;
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Vehicles> getVehicles() {
        return vehicles;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Complaint> getComplaints() {
        return complaints;
    }

    public ArrayList<Outlet> getOutlets() {
        return outlets;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    
    
}

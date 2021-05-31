/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;
import java.util.ArrayList;
/**
 *
 * @author hussa
 */
public class Outlet {
    
    private String Name;
    private String Id;
    private String Type;
    private String Promo;
    private Seller seller;
    private double Rating;
    private boolean status;
    private ArrayList<Product> products;
    private ArrayList<Order> currentorders;
    private ArrayList<Order> completedorder;
    private ArrayList<Complaint> complaints;
    private ArrayList<Complaint> reviews;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public String getPromo() {
        return Promo;
    }

    public void setPromo(String Promo) {
        this.Promo = Promo;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double Rating) {
        this.Rating = Rating;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getCurrentorders() {
        return currentorders;
    }

    public void setCurrentorders(ArrayList<Order> currentorders) {
        this.currentorders = currentorders;
    }

    public ArrayList<Order> getCompletedorder() {
        return completedorder;
    }

    public void setCompletedorder(ArrayList<Order> completedorder) {
        this.completedorder = completedorder;
    }

    public ArrayList<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(ArrayList<Complaint> complaints) {
        this.complaints = complaints;
    }

    public ArrayList<Complaint> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Complaint> reviews) {
        this.reviews = reviews;
    }
    
    
}

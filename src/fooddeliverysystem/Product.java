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
public class Product {
    
    private String Id;
    private String Name;
    private String Type;
    private String Description;
    private int price;
    private boolean availability;
    private double rating;
    private ArrayList<Complaint> reviews;

    Product()
    {
    }
    
    Product (String id,String Name,String type,String description,int price,boolean avl){
        this.Id=id;
        this.Name=Name;
        this.Type=type;
        this.Description=description;
        this.price=price;
        this.availability=avl;
    }
    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Complaint> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Complaint> reviews) {
        this.reviews = reviews;
    }
    
    
    
}

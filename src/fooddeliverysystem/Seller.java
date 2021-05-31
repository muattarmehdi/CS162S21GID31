/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;
import java.util.Date;
/**
 *
 * @author hussa
 */
public class Seller extends Person{
    
    private String Id;
    private String CNIC;
    private String OutletId;
    private double commision;

    Seller(){
    
    }
    
    Seller(String name,Date date,String address,String contactno,String email,String password,String id,String CNIC,String cnic,double com){
        this.setName(name);
        this.setAddress(address);
        this.setDOB(date);
        this.setContactno(contactno);
        this.setEmail(email);
        this.setPassword(password);
        this.Id=id;
        this.CNIC=cnic;
        this.commision=com;
    }
    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getOutletId() {
        return OutletId;
    }

    public void setOutletId(String OutletId) {
        this.OutletId = OutletId;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }
    
    
}

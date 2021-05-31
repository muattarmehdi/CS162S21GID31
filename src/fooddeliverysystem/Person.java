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
public class Person {
    
    private String Name;
    private Date DOB;
    private String Address;
    private String Contactno;
    private String Email;
    private String Password;
    private String Creditcard;

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContactno() {
        return Contactno;
    }

    public void setContactno(String Contactno) {
        this.Contactno = Contactno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCreditcard() {
        return Creditcard;
    }

    public void setCreditcard(String Creditcard) {
        this.Creditcard = Creditcard;
    }
    
    
    
}

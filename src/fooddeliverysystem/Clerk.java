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
public class Clerk extends Employee{
    
    private String Title;

    Clerk (){
    
    }
    Clerk (String name,Date date,String address,String contactno,String email,String password,String id,String cnic,int Salary,String title){
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
    
    
}

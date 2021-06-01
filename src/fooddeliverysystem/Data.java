/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;

/**
 *
 * @author Syed Muattar Mehdi Zaidi
 * @author Hussain Shahzad
 */
import javax.swing.*;
public abstract class Data 
{
    public abstract void add(Object obj);
    public abstract void edit(Object obj);
    public abstract void delete(Object obj);
    public abstract void view();
    
    
    public boolean nameValidator(String name)
    {
        boolean flag = false;
        int size = name.length();
        
        for(int i = 0 ; i < size ; i++)
        {
            if((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) == ' '))
            {
                flag = true;
            }
            else
            {
                flag = false;
                break;
            }
        
        }
        return flag;
    }
    
    public boolean numberValidator(String number)
    {
        boolean flag = false;
        
        for(int i = 0; i < number.length(); i++)
        {
            if(number.charAt(i) >= '0' && number.charAt(i) <= '9')
                flag = true;
            else
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    /**
     * 
     * @param id The value of id will be validated by the rules followed in the body of the method.
     * @return flag The method will return a boolean value to give the result of validation.
     */
    public boolean idValidator(String id)
    {
        boolean flag = false;
        int size = id.length();
        
        if(size < 3)
        {
            return false;
        }
        
        for(int i = 0 ; i < 2; i++)
        {
            if(id.charAt(i) >= 'A' && id.charAt(i) <= 'Z')
                flag = true;
            else
            {
                System.out.println("You have entered first two letters of id wrong. Please try again.");
                return false;
            }
        }
        
        for(int i = 2 ; i < id.length(); i++)
        {
            if(id.charAt(i) >= '0' && id.charAt(i) <= '9')
                flag = true;
            else
            {
                flag  = false;
                System.out.println("You have entered the number part of id in wrong format. Please try again");
                break;
            }
        }
        return flag;
    }
    
    public boolean contactValidator(String contactNumber)
    {
        int size = contactNumber.length();
        boolean flag = false;
        
        if((size != 11) && (contactNumber.charAt(0) != '0') && (contactNumber.charAt(1) != '3'))
            return flag;
        else
        {
            for(int i = 2 ; i < size; i++)
            {
                if(contactNumber.charAt(i) >= '0' && contactNumber.charAt(i) <= '9')
                    flag = true;
                else
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag; 
    }
    
    public boolean cardValidator(String card)
    {
        boolean flag = false;
        int size = card.length();
        
        if(size != 16)
        {
            JOptionPane.showMessageDialog(null, "The length of credit card number is incorrect. Please try again.");
            return false;
        }
        else
        {    
            for(int i = 0 ; i < card.length(); i++)
            {
                if(card.length() >= '0' && card.length() <= '9')
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "You have entered the credit card number in wrong format. Please try again. ");
                    break;
                }
            }
        }
            return flag;
    }
    
    public boolean emailValidator(String email)
    {
        boolean flag = false;
        int size = email.length();
        int asterik = 0;
        int countTillAsterik = 0;
        int countAfterAsterik = 0;
        int dot = 0;
        
        for(int i = 0 ; i < size; i++)
        {
            if(email.charAt(i) == '@')
            {
                asterik = i;
                break;
            }
            else
            {    
                JOptionPane.showMessageDialog(null, "Email should contain @ character. Please try again.");
                return false;
            }
        }
        
        if(asterik != 0)
        {
            for(int i = 0 ; i < asterik ; i++)
                countTillAsterik++;
            for(int i = asterik ; i < size ; i++)
                countAfterAsterik++;
        }
        
        if(countTillAsterik <= 8)
        {    
            JOptionPane.showMessageDialog(null, "First part of email should be more than 8 characters");
            return false;
        }
        
        for(int i = countTillAsterik ; i < size; i++)
        {
            if(email.charAt(i) == '.')
            {   
                flag = true;
                dot = i;
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Part after @ must contain a \".\". Please try again.");
                flag = false;
            }
        }
        if((flag == true) && ((email.substring(dot, size).equals("com"))))
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        
        return flag;
    }
    
}

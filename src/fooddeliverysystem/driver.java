/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;

/**
 *
 * @author Hussain Shahzad
 * @author Syed Muattar Mehdi Zaidi
 */
import javax.swing.*;
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          // TODO code application logic here
        WelcomePage p= new WelcomePage();
        startForm.getInstance().goTo(p);
        startForm.getInstance().setVisible(true);
    }
    
}

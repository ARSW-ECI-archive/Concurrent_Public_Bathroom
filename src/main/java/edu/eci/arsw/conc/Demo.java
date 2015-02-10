/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.conc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bath b=new Bath();
        ClientThread ct=new ClientThread("juan", b);
        ClientThread ct2=new ClientThread("luis", b);
        ClientThread ct3=new ClientThread("manuel", b);
        
        ct.start();
        ct2.start();
        ct3.start();
        
        
    }
    
}

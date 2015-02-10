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
public class Bath {
    
    public void openDoor(){
        System.out.println(Thread.currentThread().getName()+" opens the door");
        
    }

    public void openToiletCover(){
        System.out.println(Thread.currentThread().getName()+" opens the toilet");
    }

    public void useToilet(){
        try {
            System.out.println(Thread.currentThread().getName()+" is downloading");
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Bath.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void flushToilet(){
        System.out.println(Thread.currentThread().getName()+" flushhhhhhhhh");
    }
    
    
    public void closeToiletCover(){
        System.out.println(Thread.currentThread().getName()+" closes the toilet");
    }

    public void closeDoor(){
        System.out.println(Thread.currentThread().getName()+" closes the door");
    }
    
}

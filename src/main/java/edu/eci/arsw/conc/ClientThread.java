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
public class ClientThread extends Thread{
    
    private Bath bath;

    public ClientThread(String name, Bath b) {
        super(name);
        this.bath=b;
    }
        
    
    public void run(){
        
            bath.openDoor();
            bath.openToiletCover();
            bath.useToilet();
            bath.flushToilet();
            bath.closeToiletCover();
            bath.closeDoor();
            
        
        
    }
    
    
}

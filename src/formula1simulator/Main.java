/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

import java.util.ArrayList;

/**
 *
 * @author weslley
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Car> cars = new ArrayList();
       
       cars.add(new Car("Ferrari",1)); 
       cars.add(new Car("Williams",1));
       
       Run run = new Run(cars, "Malasia");
       
       run.initRace();
       
       
      
      
    }
    
}

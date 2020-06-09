/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

/**
 *
 * @author weslley
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car []cars = new Car[2];
       
       cars[0] = new Car("Ferrari",1);
       cars[1] = new Car("Williams",1);;
       
       Run run = new Run(cars, "Malasia");
       
       run.initRace();
       
       
      
      
    }
    
}

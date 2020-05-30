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
       Car car1 = new Car(100,"Ferrari",1,0,0);
       Car car2 = new Car(100,"Williams",1,0,0);
       
       car1.start();
       car2.start();
       
    }
    
}

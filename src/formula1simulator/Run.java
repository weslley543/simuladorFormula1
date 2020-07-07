/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author weslley
 */
public class Run  {
    public ArrayList <Car> cars;
    public String gpPlace;
   
    
    public Run(ArrayList cars, String place){
        this.cars = cars;
        this.gpPlace = place;
    }
    
    public void initRace(){
        for (Car car : cars) {
            
            car.start();
        }
        
        
        
        // Deixar as threads trabalharem e implemantar uma interface para controlar 
        
      

          while(cars.get(0).isAlive() || cars.get(1).isAlive()){
             //System.out.println("Threads rodando");
              System.out.println("Carro1: " + cars.get(0).getFuel() + "Carro2: " + cars.get(1).getFuel() ); 
            
          }
           
          Collections.sort(cars);
        

    }
    
}

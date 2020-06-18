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
public class Run {
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
        
//        while(cars[1].isAlive() || cars[0].isAlive()){
//            System.out.println("Thread rodando");
//        };

          while(cars.get(0).isAlive() || cars.get(1).isAlive()){
              //System.out.println("Threads rodando");
          }
        
          Collections.sort(cars);
          
          
          for(int i = 0 ; i<cars.size(); i++){
              System.out.println(cars.get(i).endRun);
          }
    }
    
}

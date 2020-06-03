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
public class Run {
    public Car []cars;
    public String gpPlace;
    
    
    public Run(Car [] cars, String place){
        this.cars = cars;
        this.gpPlace = place;
    }
    
    public void initRun(){
       
        while(this.cars[0].runState == true){
            if(this.cars[0].state == 0){
               
                
            }
        }
    }
}

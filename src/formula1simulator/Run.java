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
    
    public void initRace(){
        for(int i=0 ; i<cars.length ; i++){
            cars[i].start();
        }
        int terminados = 2, i = 0;
        
        while(i<terminados){
            System.out.println("While");
            if(cars[0].runState == false){
                i++;
                System.out.println(i);
            }
            if(cars[1].runState == false){
                i++;
                System.out.println(i);
            }
        }
        
        System.out.println("For final");
        for(i = 0 ; i<cars.length ; i++){
            System.out.println(cars[i].endRun);
        }
        
    }
    
    public void race(){
        
    }
}

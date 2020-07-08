/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

import java.util.Comparator;
import java.util.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author weslley
 */
public class Car extends Thread implements Comparable <Car>, EventListener {
    private int identificador;
    private String team;
    private int round;
    private float fuel;
    private int state;
    private boolean runState;
    private boolean whelsState;
    long endRun;
    private String event; 
    
    public Car(String team, int id){
        this.fuel = 1.0f;
        this.team = team;
        this.state = 0;
        this.round =0;
        this.whelsState = true;
        this.event = "";
    }
    
    /**
     *
     */
    @Override
    public void run(){
        int i = this.round;
        int rounds = 50;
        long ini = System.currentTimeMillis();
        this.runState = true;
        while(i<rounds){
        
            this.state = (int)Math.floor(Math.random()*2);
            
            switch (this.state){
                case 0 :   
                    this.state = (int)Math.floor(Math.random()*3);
                    switch(this.state){
                        case 0 :
                            this.setEvent("Chuva");
                            {
                                try {
                                    this.sleep(50);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                            
                        case 1 :
                            this.setEvent("Neblina");
                            {
                                try {
                                    this.sleep(100);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 2 : 
                            this.setEvent("Chuva com granizo");
                            {
                               try {
                                this.sleep(200);
                               } catch (InterruptedException ex) {
                                   Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                    }
                    break;
                    
               
                case 1 : 
                    if(this.fuel<0.2){
                        this.setEvent("Reabastecendo");
                        try {
                            Car.sleep(1000);
                            this.putFuel();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        this.setEvent("Troca de Pneu");
                         try {
                            this.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                break;
                
                 
            }
            
            this.fuel = this.fuel * (float)Math.random()/0.9f;
            i++;
            
        }
       
        this.runState = false;
        
    }
    
    public void putFuel(){
        this.setFuel(round);    }
    public int identificador() {
        return identificador;
    }

    public void setId(int id) {
        this.identificador = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    
    public void setEvent(String event){
        this.event = event;
    }
    
    public String getEvent(){
        return this.event;
    }

    @Override
    public int compareTo(Car t) {
        if(this.endRun < t.endRun){
         return -1;
        }
        if(this.endRun> t.endRun){
            return 1;
        }
        
        return 0;
    }

   

    

    
}

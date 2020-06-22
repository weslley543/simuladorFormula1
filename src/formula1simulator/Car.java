/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author weslley
 */
<<<<<<< HEAD
public class Car extends Thread {
    
    int identificador, round, fuel, state;
    String team;

    
    public Car(int fuel, String team, int id, int state, int round){
        this.fuel = fuel;
=======
public class Car extends Thread implements Comparable <Car> {
    int identificador;
    String team;
    int round;
    float fuel;
    int state;
    boolean runState;
    boolean whelsState;
    long endRun;
    
    public Car(String team, int id){
        this.fuel = 1.0f;
>>>>>>> b3b2d2a2c03dafd3bc8b378e3ee25aef199a3b82
        this.team = team;
        this.state = 0;
        this.round =0;
        this.whelsState = true;
        
        
    }
    
    /**
     *
     */
    @Override
    public void run(){
        int i = this.round;
        int rounds = 50;
<<<<<<< HEAD
        
        while(i<rounds){
            this.state = (int)(Math.random()*3)%2;           
            switch (this.state){
                case 0 : System.out.println(this.team + " - Parado"); break;
                case 1 : System.out.println(this.team +" - Correndo");break;
                case 2 : System.out.println(this.team +" - PitStop");break;
=======
        long ini = System.currentTimeMillis();
        while(i<rounds){
        
            this.state = (int)Math.floor(Math.random()*3);
            
            switch (this.state){
                case 0 :  break;
                case 1 : break;
                case 2 : 
                    if(this.fuel<0.2){
                        try {
                            Car.sleep(1000);
                            this.putFuel();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                break;
>>>>>>> b3b2d2a2c03dafd3bc8b378e3ee25aef199a3b82
            }
            
            this.fuel = this.fuel * (float)Math.random()/0.9f;
         
            i++;
            
        }
        
        this.endRun = System.currentTimeMillis() - ini;
    }
    
    public void putFuel(){
        this.fuel = 1.0f;
    }
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

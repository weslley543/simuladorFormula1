/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

import java.util.Comparator;
import java.util.EventListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author weslley
 */
public class Car extends Thread implements  EventListener {

    private int identificador;
    private String team;
    private int round;
    private int fuel;
    private int state;
    private boolean runState;
    private boolean turnState;
    private String event;

    public Car(String team, int id) {
        this.fuel = 100;
        this.team = team;
        this.state = 0;
        this.round = 0;
        this.turnState = false;
        this.event = "";
        
    }

    /**
     *
     */
    @Override
    public void run() {
        int i = this.round;
        int round = 50;
        long ini = System.currentTimeMillis();
        
        while (this.round <50) {
            this.setTurnState(false);
            this.state = (int) Math.floor(Math.random() * 2);
            
            if (this.fuel < 20) {
                this.setEvent("Reabastecendo");
                try {
                    Car.sleep(50);
                    this.putFuel();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Car.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            } else {
                this.setEvent("Troca de Pneu");
                try {
                    this.sleep(125);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Car.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
            
            Random aux = new Random();
           
            this.setFuel(aux.nextInt(100));
            this.round++;
            this.setTurnState(true);
        }

    }

    public void putFuel() {
        this.setFuel(round);
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

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEvent() {
        return this.event;
    }

    public boolean isTurnState() {
        return turnState;
    }

    public void setTurnState(boolean turnState) {
        this.turnState = turnState;
    }

    

}

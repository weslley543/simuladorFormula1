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
public class Car extends Thread {
    int identificador;
    String team;
    int round;
    int fuel;
    int state;
    public Car(int fuel, String team, int id, int state, int round){
        this.fuel = fuel;
        this.team = team;
        this.state = 0;
        this.round =0;
    }
    
    /**
     *
     */
    @Override
    public void run(){
        int i = this.round;
        int rounds = 50;
        while(i<rounds){
            this.state = (int)(Math.random()*3)%2;
            
            switch (this.state){
                case 0 : System.out.println(this.team + "Parado"); break;
                case 1 : System.out.println(this.team +"Correndo");break;
                case 2 : System.out.println(this.team +"PitStop");break;
            }
            
            i++;
            
        }
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
}

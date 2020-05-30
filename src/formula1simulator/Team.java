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
public class Team {
    String name;
    Pilot []pilots;
    Engineer []engineers;
    Mechanic []mechanics;
    Car []cars;

    public Team(String name, Pilot []pilots, Engineer [] engineers,
            Mechanic []mechanics, Car [] cars) {
        this.name = name;
        this.pilots = pilots;
        this.engineers=engineers;
        this.mechanics = mechanics;
        this.cars=cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pilot[] getPilots() {
        return pilots;
    }

    public void setPilots(Pilot[] pilots) {
        this.pilots = pilots;
    }

    public Engineer[] getEngineers() {
        return engineers;
    }

    public void setEngineers(Engineer[] engineers) {
        this.engineers = engineers;
    }

    public Mechanic[] getMechanics() {
        return mechanics;
    }

    public void setMechanics(Mechanic[] mechanics) {
        this.mechanics = mechanics;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
    
    
}

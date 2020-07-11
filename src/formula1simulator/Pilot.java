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
public class Pilot extends Person {
    Car pilotCar;
    Engineer pilotEnginner;
    int Pontuation;
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
    public Pilot(String name, int age, Car pilotCar, Engineer pilotEnginner) {
        super(name, age);
        this.pilotCar = pilotCar;
        this.pilotEnginner = pilotEnginner;
    }
    
}

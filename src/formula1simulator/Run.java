/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author weslley
 */
public class Run {

    public ArrayList<Car> cars;
    public String gpPlace;
    public String wheater;
    public int state;
    public String[] carEvents;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public String getGpPlace() {
        return gpPlace;
    }

    public void setGpPlace(String gpPlace) {
        this.gpPlace = gpPlace;
    }

    public String getWheater() {
        return wheater;
    }

    public void setWheater(String wheater) {
        this.wheater = wheater;
    }

    public Run(ArrayList cars, String place) {
        this.cars = cars;
        this.gpPlace = place;
        this.carEvents = new String[2];
    }

    public String[] returnEevents() {
        return carEvents;
    }

    public void setEevents(String car1, String car2) {
        this.carEvents[0] = car1;
        this.carEvents[1] = car2;
    }

    public Boolean initRace() {
        for (Car car : cars) {

            car.start();
        }
        Boolean terminou = false;
        while (cars.get(0).isAlive() || cars.get(1).isAlive()) {
            System.out.println(cars.get(0).getEvent());
            setEevents(cars.get(0).getEvent(),cars.get(1).getEvent());
            this.state = (int) Math.floor(Math.random() * 2);
            //System.out.println(this.getWheater());
            switch (this.state) {
                case 0:
                    this.state = (int) Math.floor(Math.random() * 3);
                    switch (this.state) {
                        case 0:
                            this.setWheater("Chuva");
                             {
                                try {
                                    cars.get(0).sleep(50);
                                    cars.get(1).sleep(50);

                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Car.class.getName())
                                            .log(Level.SEVERE, null, ex);
                                }
                            }
                            break;

                        case 1:
                            this.setWheater("Neblina");
                             {
                                try {
                                    cars.get(0).sleep(100);
                                    cars.get(1).sleep(100);

                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Car.class.getName())
                                            .log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 2:
                            this.setWheater("Chuva com granizo");
                             {
                                try {
                                    cars.get(0).sleep(200);
                                    cars.get(1).sleep(200);

                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Car.class.getName())
                                            .log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                    }
                    break;
            }

        }

        terminou = false;
        return terminou;
    }

}

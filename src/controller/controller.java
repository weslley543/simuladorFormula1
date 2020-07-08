/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import formula1simulator.Car;
import java.util.ArrayList;


/**
 *
 * @author GustavoS
 */
public class controller {
    
    static ArrayList <Car> cars = new ArrayList();
    
    
    public static void main(String[] args) {
       cars.add(new Car("Ferrari",1)); 
       cars.add(new Car("Williams",1));
    }
    
    
    public  int test(){
        return 1+2;
    }
    
    public int weather(){
        return 1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import formula1simulator.Car;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author GustavoS
 */
public class controller {
    
    static ArrayList <Car> cars = new ArrayList();
    static int nVoltas=3 , cont = 0;
    static Random random = new Random();
    
    public static void main(String[] args) {
       cars.add(new Car("Ferrari",1)); 
       cars.add(new Car("Williams",1));
    }
    
    
    public  int test(){
        return 1+2;
    }
    
    public int weather(){
        return random.nextInt(3);
    }
    
    
    public String getCarStatus(){
        return "Correndo";
    }
    
   
    public void setTotalVoltas(){
      nVoltas = Integer.valueOf(JOptionPane.showInputDialog("Insira o total de voltas"));
    }
    
    public int getTotalVolta(){
        return nVoltas;
    }
    
    public void countVoltas(int count){
        cont ++;
        if(cont == nVoltas){
           JOptionPane.showMessageDialog(null,"Corrida Terminou");
        }
    }
    
    public int getCount(){
        return cont;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1simulator;

import java.util.Random;

/**
 *
 * @author GustavoS
 */
public class progressBar extends Thread {
    
 public float valor = 1;   
  
 public float getValor(){
     if(valor < 0) return 0;
     return this.valor;
 }
 
 public void setValor(float lessFuel){
     this.valor = this.valor - lessFuel;
 }
    
 @Override
 public void run(){
 
 }

    
    
 
}

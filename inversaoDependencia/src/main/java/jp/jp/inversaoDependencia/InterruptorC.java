/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.inversaoDependencia;

/**
 *
 * @author João Paulo
 */
public class InterruptorC {
    
    public void ligaDesliga(IDispositivo dispositivo){
        if(!dispositivo.getLigada()){
            dispositivo.liga();
            System.out.println(dispositivo + " ON");
        }    
        else{
            dispositivo.desliga(); 
            System.out.println(dispositivo + " OFF");
        }
    }
    
    
}

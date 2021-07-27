/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import jp.jp.inversaoDependencia.IDispositivo;
import jp.jp.inversaoDependencia.InterruptorC;
import jp.jp.inversaoDependencia.LampadaC;
import jp.jp.inversaoDependencia.TV;

/**
 *
 * @author João Paulo
 */
public class Principal {
     
    public static void main(String[] args){
    
        try{
     
            InterruptorC inc = new InterruptorC();
            IDispositivo lac = new LampadaC();
            IDispositivo tv = new TV();
            
            inc.ligaDesliga(tv);
            inc.ligaDesliga(lac);
            inc.ligaDesliga(tv);  
            
            
        }catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    
    
    
    
    }
    
    
}

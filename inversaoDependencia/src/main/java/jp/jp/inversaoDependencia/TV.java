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
public class TV implements IDispositivo {
    
    private boolean ligada = true;
    
    @Override
    public void liga(){
        this.ligada = true;
    }
    
    @Override
    public void desliga(){
        this.ligada = false;
    }

    @Override
    public boolean getLigada() {
        return ligada;
    }
    
    @Override
    public String toString(){
        return "TV";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yathzee;

/**
 *
 * @author Nabil Amimer
 */
public class Des extends Valeur{
    
    public Des(){
        this.valeur = (int) ((Math.random() * (6 - 1)) + 1);
    }
    
    @Override
    public String toString(){
        return "" + this.valeur;
    }
    
}

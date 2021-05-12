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

public class ValeureEnfant extends Valeur {
    
    public ValeureEnfant(int i){
        this.valeur = i;
    }
    
    public String toString(){
        String s = "" + valeur;
        return s;
    }
}

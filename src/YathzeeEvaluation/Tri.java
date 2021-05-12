/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YathzeeEvaluation;

import java.util.ArrayList;
import yathzee.Valeur;

/**
 *
 * @author Nabil Amimer
 */
public class Tri {
    
    public static ArrayList<Valeur> selectionTri(ArrayList<Valeur> liste){
        int indexMin; 
        
        for(int i = 0; i < liste.size(); i++){
            indexMin = i;
            for(int j = i+1; j < liste.size(); j++){
                if(liste.get(j).get() < liste.get(indexMin).get()){
                    indexMin = j;
                }
            }
            Valeur valeurMin = liste.get(indexMin);
            liste.set(indexMin, liste.get(i));
            liste.set(i, valeurMin);
        }
        
        return liste;
    }
    
    public static ArrayList<Valeur> insertionTri(ArrayList<Valeur> liste){
        int n = liste.size();
        for (int i = 1; i < n; ++i) {
            Valeur v = liste.get(i);
            int j = i - 1;
 
            while (j >= 0 && liste.get(j).get() > v.get()) {
                    liste.set(j+1, liste.get(j));
                    j = j - 1;
            }
            liste.set(j + 1, v);
        } 
        return liste;
    }
    
    public static ArrayList<Valeur> BulleTri(ArrayList<Valeur> liste){
        int n = liste.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++)
                if(liste.get(j).get() > liste.get(j + 1).get()){
                    
                    Valeur temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j+1, temp);
                }     
        }
        return liste;
    } 
    
    private static int nombreAleatoire(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public static ArrayList<Valeur> triAleatoire(ArrayList<Valeur> liste){
        int chiffre = nombreAleatoire(1, 3);
        switch(chiffre){
            case 1:
                return selectionTri(liste);
            case 2:
                return insertionTri(liste);
            case 3:
                return BulleTri(liste);   
            default:
                break;
        }
        return null;
    }
    
}

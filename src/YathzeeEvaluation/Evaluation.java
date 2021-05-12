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
public class Evaluation {
     
    public static int testAs(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int pointage = 0;
        for(Valeur v: liste){
            if(v.get() == 1) pointage ++;
        }
        return pointage * 1;
    }   
    
    public static int testDeux(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int pointage = 0;
        for(Valeur v: liste){
            if(v.get() == 2) pointage ++;
        }
        return pointage * 2;
    }   
    
    public static int testTrois(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int pointage = 0;
        for(Valeur v: liste){
            if(v.get() == 3) pointage ++;
        }
        return pointage * 3;
    }   
    
    public static int testQuatre(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int pointage = 0;
        for(Valeur v: liste){
            if(v.get() == 4) pointage ++;
        }
        return pointage * 4;
    }   
    
    public static int testCinq(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int pointage = 0;
        for(Valeur v: liste){
            if(v.get() == 5) pointage ++;
        }
        return pointage * 5;
    }   
    
    public static int testSix(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int pointage = 0;
        for(Valeur v: liste){
            if(v.get() == 6) pointage ++;
        }
        return pointage * 6;
    }  
    
    public static int testBrelan(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int nombreDeFoisDansLaListe = 0;
        int valeurChercher = 0;
        for(int i = 0; i < liste.size(); i++){
            valeurChercher = liste.get(i).get();
            for(int j = i; j < liste.size(); j++){
                if(valeurChercher == liste.get(j).get()) nombreDeFoisDansLaListe++;
            }
            if(nombreDeFoisDansLaListe != 3) nombreDeFoisDansLaListe = 0;
            else break;
        }
        if(nombreDeFoisDansLaListe != 3)valeurChercher = 0;
        
        return valeurChercher*3;
    }
    
    public static int testCarre(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int nombreDeFoisDansLaListe = 0;
        int valeurChercher = 0;
        for(int i = 0; i < liste.size(); i++){
            valeurChercher = liste.get(i).get();
            for(int j = i; j < liste.size(); j++){
                if(valeurChercher == liste.get(j).get()) nombreDeFoisDansLaListe++;
            }
            if(nombreDeFoisDansLaListe != 4) nombreDeFoisDansLaListe = 0;
            else break;
        }
        if(nombreDeFoisDansLaListe != 4)valeurChercher = 0;
        
        return valeurChercher*4;
    }
    
    public static int testFull(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int tousParreil = testYathzee(liste);
        if(tousParreil == 50) return 25;
        
        int nombre1Apparence = 0;
        int nombre2Apparence = 0;
        int nombre1 = liste.get(0).get();
        int nombre2 = liste.get(4).get();
        
        for(int i = 0; i < liste.size(); i++){
            int n = liste.get(i).get();
            if(nombre1 == n) nombre1Apparence++;
            if(nombre2 == n) nombre2Apparence++;
        }
        
        if(nombre1Apparence == 3 && nombre2Apparence == 2) return 25;
        else if(nombre1Apparence == 2 && nombre2Apparence == 3)return 25;
        else return 0;
    }
    
    public static int testPetiteSuite(ArrayList<Valeur> liste){
        boolean petiteSuite = false;
        liste = Tri.triAleatoire(liste);
        liste = trouverDoublePourPetiteSuite(liste);
        int n = liste.get(0).get();
        int[] comb1 = {1 , 2 , 3 , 4};
        int[] comb2 = {2 , 3 , 4 , 5};
        int[] comb3 = {3 , 4 , 5 , 6};
        
        if(n == 1){
            petiteSuite = true;
            for(int i = 0; i < 4; i++){
                if(liste.get(i).get() != comb1[i])petiteSuite = false;
            }
        }else if(n == 2){
            petiteSuite = true;
            for(int i = 0; i < 4; i++){
                int n1 = liste.get(i).get();
                if(n1 != comb2[i])petiteSuite = false;
            }
        }else if(n == 3){
            petiteSuite = true;
            for(int i = 0; i < 4; i++){
                if(liste.get(i).get() != comb3[i])petiteSuite = false;
            }
        }

        if(petiteSuite) return 30;
        else return 0;
    }
    
    public static int testGrandeSuite(ArrayList<Valeur> liste){
        boolean grandeSuite = false;
        liste = Tri.triAleatoire(liste);
        int n = liste.get(0).get();
        int[] comb1 = {1,2,3,4,5};
        int[] comb2 = {2,3,4,5,6};
        
        if(n == 1){
            grandeSuite = true;
            for(int i = 0; i < 5; i++){
                if(liste.get(i).get() != comb1[i])grandeSuite = false;
            }
        }else if(n == 2){
            grandeSuite = true;
            for(int i = 0; i < 5; i++){
                int n1 = liste.get(i).get();
                if(n1 != comb2[i])grandeSuite = false;
            }
        }
        
        if(grandeSuite) return 40;
        else return 0;
    }
    
    public static int testYathzee(ArrayList<Valeur> liste){
        boolean Yathzee = true;
        liste = Tri.triAleatoire(liste);
        int n = liste.get(0).get();
        
        for(int i = 0; i < liste.size(); i++){
            if(n != liste.get(i).get()) Yathzee = false;
        }
        if(Yathzee) return 50;
        else return 0;
    }
    
    public static int testChance(ArrayList<Valeur> liste){
        int sommeTotale = 0;
        for(int i = 0; i < liste.size(); i++){
            sommeTotale += liste.get(i).get();
        }
        return sommeTotale;
    }    
    
    
    //pour simplifier la tache pour la petite suite
    public static ArrayList<Valeur> trouverDoublePourPetiteSuite(ArrayList<Valeur> liste){
        liste = Tri.triAleatoire(liste);
        int n = liste.size();
        for(int i = 0; i < n - 1; i++ ){
            if(liste.get(i).get() == liste.get(i + 1).get()){
                Valeur temp = liste.get(i);
                int indexDoublon = i+1;
                liste.remove(indexDoublon);
                liste.add(temp);
                break;
            }
        }
        
        return liste;
    }
    
}

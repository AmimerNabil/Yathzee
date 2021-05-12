/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yathzee;

import YathzeeEvaluation.Evaluation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nabil Amimer
 */
public class Jeux {

    ArrayList<Joueur> listeDeJoueur = new ArrayList<>();
    private boolean partieFini = false;
    Scanner scan = new Scanner(System.in);
    
    public Jeux(int nombreDeJoueur){
        if(nombreDeJoueur < 2){
            nombreDeJoueur = 2;
            System.out.println("Le nombre de joueur minimum est de deux");
        }else if(nombreDeJoueur > 4){
            nombreDeJoueur = 4;
            System.out.println("Le nombre de joueur maximum est de deux");
        }

        for(int i = 0; i<nombreDeJoueur; i++){
            listeDeJoueur.add(new Joueur());
        }
    }
    
    public void commencer(){
        while(!partieFini){
            for(Joueur j: listeDeJoueur){
                System.out.println("C'est au tour du joueur " + j.getNumeroDuJoueur());
                ArrayList<Valeur> des = lancerLesDes();
                for(int i = 0; i < 2; i++){
                    montrerDes(des);
                    System.out.print("Entrez un x pour chaque dé que vous voulez garder:");
                    String entree = scan.nextLine();
                    while(entree.length() != 5){
                       System.out.print("Entrez un x pour chaque dé que vous voulez garder:"); 
                       entree = scan.nextLine();
                    }
                    if(entree.equalsIgnoreCase("xxxxx")) break;
                    else{
                        relancerLesDes(entree, des);
                    }
                }
                montrerDes(des);
                choisirUneEntreeTexte();
                int choix = -1;
                while(choix == -1){
                    choix = scan.nextInt();
                }
                choixSurComposition(choix, des, j);
                j.Joue();
                System.out.println("Résultats après avoir joué le tour : ");
                System.out.println(j);
                estCeQueFinit();
            }
        }
        
    }
    
    private void choisirUneEntreeTexte(){
        System.out.println("Choisir une des entrées: \n"
                + "1: 1\n"
                + "2: 2\n"
                + "3: 3\n"
                + "4: 4\n"
                + "5: 5\n"
                + "6: 6\n"
                + "7: Brelan\n"
                + "8: Carré \n"
                + "9: Full\n"
                + "10: Petite\n"
                + "11: Grande\n"
                + "12: Yam\n"
                + "13: Chance\n");
    }
    
    private int choixSurComposition(int i, ArrayList<Valeur> liste, Joueur j){
        int score = 0;
        
        switch(i){
              case 1: 
                if(j.getUnScore().equalsIgnoreCase("")){
                    score = Evaluation.testAs(liste);
                    j.setUnScore(Integer.toString(score));
                }else score = -1;
                break;
            case 2: 
                if(j.getDeuxScore().equalsIgnoreCase("")){
                    score = Evaluation.testDeux(liste);
                    j.setDeuxScore(Integer.toString(score));
                }else score = -1;
                break;
            case 3: 
                if(j.getTroisScore().equalsIgnoreCase("")){
                    score =  Evaluation.testTrois(liste);
                    j.setTroisScore(Integer.toString(score));
                }else score = -1;
                break;
            case 4: 
                if(j.getQuatreScore().equalsIgnoreCase("")){
                    score =  Evaluation.testQuatre(liste);
                    j.setQuatreScore(Integer.toString(score));
                }else score = -1;
                break;
            case 5: 
                if(j.getCinqScore().equalsIgnoreCase("")){
                    score =  Evaluation.testCinq(liste);
                    j.setCinqScore(Integer.toString(score));
                }else score = -1;
                break;
            case 6: 
                if(j.getSixScore().equalsIgnoreCase("")){
                    score =  Evaluation.testSix(liste);
                    j.setSixScore(Integer.toString(score));
                }else score = -1;
                break;
            case 7: 
                if(j.getBrelanScore().equalsIgnoreCase("")){
                    score =  Evaluation.testBrelan(liste);
                    j.setBrelanScore(Integer.toString(score));
                }else score = -1;
                break;
            case 8: 
                if(j.getCarreScore().equalsIgnoreCase("")){
                    score =  Evaluation.testCarre(liste);
                    j.setCarreScore(Integer.toString(score));
                }else score = -1;
                break;
            case 9: 
                if(j.getFullScore().equalsIgnoreCase("")){
                    score =  Evaluation.testFull(liste);
                    j.setFullScore(Integer.toString(score));
                }else score = -1;
                break;
            case 10: 
                if(j.getPetiteSuiteScore().equalsIgnoreCase("")){
                    score =  Evaluation.testPetiteSuite(liste);
                    j.setPetiteSuiteScore(Integer.toString(score));
                }else score = -1;
                break;
            case 11: 
                if(j.getGrandeSuiteScore().equalsIgnoreCase("")){
                    score =  Evaluation.testGrandeSuite(liste);
                    j.setGrandeSuiteScore(Integer.toString(score));
                }else score = -1;
                break;
            case 12: 
                if(j.getYathzeeScore().equalsIgnoreCase("")){
                    score =  Evaluation.testYathzee(liste);
                    j.setYathzeeScore(Integer.toString(score));
                }else score = -1;
                break;
            case 13: 
                if(j.getChanceScore().equalsIgnoreCase("")){
                    score =  Evaluation.testChance(liste);
                    j.setChanceScore(Integer.toString(score));
                }else score = -1;
                break;
            default:
                return 0;
        }        
       
        return score;
    }
    
    private ArrayList<Valeur> lancerLesDes(){
        ArrayList<Valeur> listeDes = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            listeDes.add(new Des());
        }
        return listeDes;
    }
    
    private void relancerLesDes(String choix , ArrayList<Valeur> liste){
        for(int i = 0; i < 5; i++){
            if(choix.charAt(i) != 'x'){
                System.out.println("this happened ");
                liste.set(i, new Des());
            }
        }
    }
    
    private void estCeQueFinit(){
        boolean finit = true;
        for(Joueur j: listeDeJoueur){
            if(!j.isFinit()){
                finit = false;
            }
        }
         if(finit) partieFini = true;
         else partieFini = false;
    }
    
    private void montrerDes(ArrayList<Valeur> liste){
        System.out.println("["+liste.get(0)+","+liste.get(1) + "," +liste.get(2) + "," +liste.get(3) + "," +liste.get(4) + "]");
    }
}

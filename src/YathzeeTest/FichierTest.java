/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YathzeeTest;

import YathzeeEvaluation.Evaluation;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import yathzee.ValeureEnfant;
import yathzee.Valeur;

/**
 *
 * @author Nabil Amimer
 */
public class FichierTest {
        
    public static boolean valider(){
        
        boolean valide = true;
        try{
            File fichierTest = new File("test.txt");
            Scanner ligneScanner = new Scanner(fichierTest);
            while(ligneScanner.hasNext()){
                String ligne = ligneScanner.nextLine();
                Scanner scan = new Scanner(ligne);
                
                //creation des valeurs
                ValeureEnfant v1 = new ValeureEnfant(scan.nextInt());
                ValeureEnfant v2 = new ValeureEnfant(scan.nextInt());
                ValeureEnfant v3 = new ValeureEnfant(scan.nextInt());
                ValeureEnfant v4 = new ValeureEnfant(scan.nextInt());
                ValeureEnfant v5 = new ValeureEnfant(scan.nextInt());
                
                String test = scan.next();
                test = test.toUpperCase();
                int score = scan.nextInt();
                
                //creation du arraylist
                ArrayList<Valeur> liste = new ArrayList<>();
                liste.add(v1);liste.add(v2);liste.add(v3);liste.add(v4);liste.add(v5);

                //test de toutes les combinaison
                if(tester(liste, test) != score) valide = false;
            }
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return valide;
    }
    
    private static int tester(ArrayList<Valeur> liste, String test){
        switch(test){
            case "UN": 
                return Evaluation.testAs(liste);
            case "DEUX": 
                return Evaluation.testDeux(liste);
            case "TROIS": 
                return Evaluation.testTrois(liste);
            case "QUATRE": 
                return Evaluation.testQuatre(liste);
            case "CINQ": 
                return Evaluation.testCinq(liste);
            case "SIX": 
                return Evaluation.testSix(liste);
            case "CARRE": 
                return Evaluation.testCarre(liste);
            case "FULL": 
                return Evaluation.testFull(liste);
            case "PETITE_SUITE": 
                return Evaluation.testPetiteSuite(liste);
            case "GRANDE_SUITE": 
                return Evaluation.testGrandeSuite(liste);
            case "YAM": 
                return Evaluation.testYathzee(liste);
            case "CHANCE": 
                return Evaluation.testChance(liste);
            case "BRELAN": 
                return Evaluation.testBrelan(liste);
            default:
                return 0;
        }
    }
    
}

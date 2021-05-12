/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yathzee;

import YathzeeTest.FichierTest;
import java.util.Scanner;

/**
 *
 * @author Nabil Amimer
 */
public class Yathzee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (FichierTest.valider()) {
            System.out.println("tout est ok!");
            System.out.println("____________________________________________");

            Scanner scan = new Scanner(System.in);
            System.out.print("Combien de joueur vont jouer? : ");
            int nombre = scan.nextInt();

            Jeux j = new Jeux(nombre);
            j.commencer();
        } else {
            System.out.println("Rien ne fonctionne!");
        }

    }
}

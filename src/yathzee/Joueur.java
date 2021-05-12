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
public class Joueur {
    
    //score
    private String unScore;
    private String deuxScore;
    private String troisScore;
    private String quatreScore;
    private String cinqScore;
    private String sixScore;
    private String brelanScore;
    private String carreScore;
    private String fullScore;
    private String petiteSuiteScore;
    private String grandeSuiteScore;
    private String YathzeeScore;
    private String ChanceScore;
    
    //bonus score et total
    private int bonusScore;
    private int total;
    
    //numero du joueur
    private int numeroDuJoueur;
    private static int compteur = 1;
   
    
    //Est-il termine
    private boolean finit = false;
    private int nombreDeTourJoue = 0;
    
    public Joueur(){
        unScore = "";
        deuxScore  = "";
        troisScore = "";
        quatreScore = "";
        cinqScore = "";
        sixScore = "";
        brelanScore = "";
        carreScore = "";
        fullScore = "";
        petiteSuiteScore = "";
        grandeSuiteScore = "";
        YathzeeScore = "";
        ChanceScore = "";
    
        bonusScore = 0;
        total = 0;
        
        numeroDuJoueur = compteur;
        compteur++;
    }
    
    
    @Override
    public String toString(){


        String s = "Joueur " + numeroDuJoueur + "\n"
                + "-----Scores-----\n"
               + "1: "+unScore+"\n"
                + "2: "+deuxScore+"\n"
                + "3: "+troisScore+"\n"
                + "4: "+quatreScore+"\n"
                + "5:  "+cinqScore+"\n"
                + "6: "+sixScore+"\n"
                + "brelon: "+brelanScore+"\n"
                + "carré: "+carreScore+"\n"
                + "Full: "+fullScore+"\n"
                + "petit: "+petiteSuiteScore+"\n"
                + "grand: "+grandeSuiteScore+"\n"
                + "Yam: "+YathzeeScore+"\n"
                + "Chance: "+ChanceScore+"\n"
                 + "-----Scores-----\n";
        
        return s;
    }
    
    public void Joue(){
        if(!finit){
            nombreDeTourJoue ++;
            if(nombreDeTourJoue == 13) finit = true;
        }
    }

    public String getUnScore() {
        return unScore;
    }

    public void setUnScore(String unScore) {
        this.unScore = unScore;
    }

    public String getDeuxScore() {
        return deuxScore;
    }

    public void setDeuxScore(String deuxScore) {
        this.deuxScore = deuxScore;
    }

    public String getTroisScore() {
        return troisScore;
    }

    public void setTroisScore(String troisScore) {
        this.troisScore = troisScore;
    }

    public String getQuatreScore() {
        return quatreScore;
    }

    public void setQuatreScore(String quatreScore) {
        this.quatreScore = quatreScore;
    }

    public String getCinqScore() {
        return cinqScore;
    }

    public void setCinqScore(String cinqScore) {
        this.cinqScore = cinqScore;
    }

    public String getSixScore() {
        return sixScore;
    }

    public void setSixScore(String sixScore) {
        this.sixScore = sixScore;
    }

    public String getBrelanScore() {
        return brelanScore;
    }

    public void setBrelanScore(String brelanScore) {
        this.brelanScore = brelanScore;
    }

    public String getCarreScore() {
        return carreScore;
    }

    public void setCarreScore(String carreScore) {
        this.carreScore = carreScore;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public String getPetiteSuiteScore() {
        return petiteSuiteScore;
    }

    public void setPetiteSuiteScore(String petiteSuiteScore) {
        this.petiteSuiteScore = petiteSuiteScore;
    }

    public String getGrandeSuiteScore() {
        return grandeSuiteScore;
    }

    public void setGrandeSuiteScore(String grandeSuiteScore) {
        this.grandeSuiteScore = grandeSuiteScore;
    }

    public String getYathzeeScore() {
        return YathzeeScore;
    }

    public void setYathzeeScore(String YathzeeScore) {
        this.YathzeeScore = YathzeeScore;
    }

    public String getChanceScore() {
        return ChanceScore;
    }

    public void setChanceScore(String ChanceScore) {
        this.ChanceScore = ChanceScore;
    }

    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Joueur.compteur = compteur;
    }

    public int getNombreDeTourJoue() {
        return nombreDeTourJoue;
    }

    public void setNombreDeTourJoue(int nombreDeTourJoue) {
        this.nombreDeTourJoue = nombreDeTourJoue;
    }

    
    

    public int getBonusScore() {
        return bonusScore;
    }

    public void setBonusScore(int bonusScore) {
        this.bonusScore = bonusScore;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumeroDuJoueur() {
        return numeroDuJoueur;
    }

    public boolean isFinit() {
        return finit;
    }

    public void setFinit(boolean finit) {
        this.finit = finit;
    }
    
    
}

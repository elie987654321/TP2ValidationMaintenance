package model.Joueurs;

import model.Carte;

import java.util.ArrayList;

public class Joueur2 implements JoueurProduit{

    // Attributs
    private ArrayList<Carte> mainDu21;
    private int points;

    // Constructeur par défaut
    public Joueur2() {
        this.mainDu21 = new ArrayList<Carte>();
        this.points = 0;
    }

    // Constructeur complet
    public Joueur2(ArrayList<Carte> mainDu21, int points) {
        this.mainDu21 = mainDu21;
        this.points = points;
    }

    // Accesseurs et mutateurs
    public ArrayList<Carte> getMainDu21() {
        return mainDu21;
    }

    public String getMainDu21Bien() {
        String test = "";
        for (Carte carte:
                this.mainDu21) {
            test += "\n"+carte;
        }
        return test;
    }

    public void setMainDu21(ArrayList<Carte> mainDu21) {
        this.mainDu21 = mainDu21;
    }

    public int getPoints() {
        return points;
    }


    // Methodes
    public void piger(Carte carte){
        this.mainDu21.add(carte);
        this.points += carte.getValeur();
    }

    // Tostring
    @Override
    public String toString() {
        return "App.Joueur{" +
                "mainDu21=" + mainDu21 +
                ", points=" + points +
                '}';
    }
}

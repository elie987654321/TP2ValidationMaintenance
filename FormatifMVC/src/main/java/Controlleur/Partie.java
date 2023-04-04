package Controlleur;

import Model.Joueur;
import Model.Paquet;

public class Partie {

    // Attributs
    private Joueur banquier;
    private Joueur joueur;
    private Paquet paquet;

    // Constructeur
    public Partie() {
        this.banquier = new Joueur();
        this.joueur = new Joueur();
        this.paquet = new Paquet();
        this.paquet.initPaquet();
    }

    // Accesseurs et mutateurs
    public Joueur getBanquier() {
        return banquier;
    }

    public void setBanquier(Joueur banquier) {
        this.banquier = banquier;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Paquet getPaquet() {
        return paquet;
    }

    public void setPaquet(Paquet paquet) {
        this.paquet = paquet;
    }

    public void DistribuerCartesInitials() {
        this.PigerCarteJoueur();
        this.PigerCarteJoueur();
        this.PigerCarteBanquier();
        this.PigerCarteBanquier();
    }

    // J pour joueur, B pour banquier
    public char DeciderVainqueur() {
        if (joueur.getPoints() > 21) {
            return 'B';
        } else if (banquier.getPoints() > 21) {
            return 'J';
        } else if (joueur.getPoints() > banquier.getPoints()) {
            return 'J';
        } else {
            return 'B';
        }
    }

    public void PigerCarteBanquier() {
        banquier.piger(paquet.piger());

    }

    public void PigerCarteJoueur() {
        joueur.piger(paquet.piger());

    }
}
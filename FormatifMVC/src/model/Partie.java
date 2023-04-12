package model;

import model.Joueurs.*;
import model.Joueurs.JoueurCreateur;

public class Partie {

    // Attributs
    private JoueurProduit joueur1;
    private JoueurProduit joueur2;
    private JoueurProduit joueur3;
    private JoueurProduit joueur4;
    private Paquet paquet;

    // Constructeur
    public Partie() {

        JoueurCreateur factory = new JoueurCreateur();

        this.joueur1 = factory.CreerJoueur(1);
        this.joueur2 = factory.CreerJoueur(2);
        this.joueur3 = factory.CreerJoueur(3);
        this.joueur4 = factory.CreerJoueur(4);
        this.paquet = new Paquet();
        this.paquet.initPaquet();
    }



    public JoueurProduit getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur1 joueur1) {
        this.joueur1 = joueur1;
    }

    public JoueurProduit getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur2 joueur2) {
        this.joueur2 = joueur2;
    }

    public JoueurProduit getJoueur3() {
        return joueur3;
    }

    public void setJoueur3(Joueur3 joueur3) {
        this.joueur3 = joueur3;
    }

    public JoueurProduit getJoueur4() {
        return joueur4;
    }

    public void setJoueur4(Joueur1 joueur4) {
        this.joueur4 = joueur4;
    }

    public Paquet getPaquet() {
        return paquet;
    }

    public void setPaquet(Paquet paquet) {
        this.paquet = paquet;
    }

    // Methodes
    public void DistribuerCartesInitials() {

        this.PigerCarteJoueur1();
        this.PigerCarteJoueur1();

        this.PigerCarteJoueur2();
        this.PigerCarteJoueur2();

        this.PigerCarteJoueur3();
        this.PigerCarteJoueur3();

        this.PigerCarteJoueur4();
        this.PigerCarteJoueur4();

    }

    // J pour joueur, B pour banquier
    public char DeciderVainqueur(Joueur1 joueur) {
            return 'N';//TODO develloper
    }


    public Carte PigerCarteJoueur1() {
       return this.joueur1.piger(paquet.piger());
    }


    public Carte PigerCarteJoueur2() {
        return this.joueur2.piger(paquet.piger());
    }

    public Carte PigerCarteJoueur3() {
        return this.joueur3.piger(paquet.piger());
    }

    public Carte PigerCarteJoueur4() {
        return this.joueur4.piger(paquet.piger());
    }
}
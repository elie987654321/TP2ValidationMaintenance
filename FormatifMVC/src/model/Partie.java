package model;

public class Partie {

    // Attributs
    private Joueur banquier;
    private Joueur joueur1;
    private Joueur joueur2;
    private Joueur joueur3;
    private Joueur joueur4;
    private Joueur joueur5;
    private Paquet paquet;

    // Constructeur
    public Partie() {
        this.banquier = new Joueur();
        this.joueur1 = new Joueur();
        this.joueur2 = new Joueur();
        this.joueur3 = new Joueur();
        this.joueur4 = new Joueur();
        this.joueur5 = new Joueur();
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

    public Joueur getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public Joueur getJoueur3() {
        return joueur3;
    }

    public void setJoueur3(Joueur joueur3) {
        this.joueur3 = joueur3;
    }

    public Joueur getJoueur4() {
        return joueur4;
    }

    public void setJoueur4(Joueur joueur4) {
        this.joueur4 = joueur4;
    }

    public Joueur getJoueur5() {
        return joueur5;
    }

    public void setJoueur5(Joueur joueur5) {
        this.joueur5 = joueur5;
    }

    public Paquet getPaquet() {
        return paquet;
    }

    public void setPaquet(Paquet paquet) {
        this.paquet = paquet;
    }

    // Methodes
    public void DistribuerCartesInitials() {
        this.PigerCarteJoueur();
        this.PigerCarteJoueur();

/*        this.PigerCarteJoueur(this.joueur2);
        this.PigerCarteJoueur(this.joueur2);

        this.PigerCarteJoueur(this.joueur3);
        this.PigerCarteJoueur(this.joueur3);

        this.PigerCarteJoueur(this.joueur4);
        this.PigerCarteJoueur(this.joueur4);

        this.PigerCarteJoueur(this.joueur5);
        this.PigerCarteJoueur(this.joueur5);*/

        this.PigerCarteBanquier();
        this.PigerCarteBanquier();
    }

    // J pour joueur, B pour banquier
    public char DeciderVainqueur(Joueur joueur) {
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
        this.banquier.piger(paquet.piger());

    }

    public void PigerCarteJoueur() {
        this.joueur1.piger(paquet.piger());

    }
}
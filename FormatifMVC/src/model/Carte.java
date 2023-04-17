package model;

import EnumPerso.EnumsCartes;

import java.nio.file.Paths;

public class Carte {

    // Attributs
    private int valeur;

    private EnumsCartes.RangCartes rang;
    private EnumsCartes.TypesCartes type;


    // Constructeur
    public Carte(EnumsCartes.TypesCartes type, EnumsCartes.RangCartes rang, int valeur) {
        this.type = type;
        this.rang = rang;
        this.valeur = valeur;
    }

    @Override
    public boolean equals(Object o)
    {
        Carte autreCarte = (Carte) o;

        return (this.rang == autreCarte.getRang()) && (this.valeur == autreCarte.getValeur());
    }

    // Accesseurs et mutateurs
    public EnumsCartes.RangCartes getRang()
    {
        return this.rang;
    }

    public void setRang(EnumsCartes.RangCartes rang)
    {
        this.rang = rang;
    }

    public String getNom()
    {
        return this.rang + " de " + this.valeur;
    }

    //Pas sur si ok de mettre ça la car ça depend du nom et de l'emplacement de tout les fichiers d'image
    public String getPath()
    {
        //plus facile a debugger avec variable si probleme de path
        String path = Paths.get("").toAbsolutePath().toString() + "/src/images/paquet/" + this.rang + "_" + this.type + ".png";
        return path;

    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    // ToString
    @Override
    public String toString() {
        return "Rang:" + this.rang + "Valeur:" + this.type;
    }
}

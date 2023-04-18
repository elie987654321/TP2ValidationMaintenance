package model;

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

    // Accesseurs et mutateurs
    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public EnumsCartes.RangCartes getRang()
    {
        return this.rang;
    }

    public void setRang(EnumsCartes.RangCartes rang) {
        this.rang = rang;
    }

    public EnumsCartes.TypesCartes getType() {
        return type;
    }

    public void setType(EnumsCartes.TypesCartes type) {
        this.type = type;
    }

    // Methodes
    //Pas sur si ok de mettre ça la car ça depend du nom et de l'emplacement de tout les fichiers d'image
    public String getPath()
    {
        //plus facile a debugger avec variable si probleme de path
        String path = Paths.get("").toAbsolutePath().toString() + "/src/main/resources/images/paquet/" + this.rang + "_" + this.type + ".png";
        return path;

    }

    // Overrides
    // equals
    @Override
    public boolean equals(Object o)
    {
        Carte autreCarte = (Carte) o;

        return (this.rang == autreCarte.getRang()) && (this.valeur == autreCarte.getValeur()) && (this.type == autreCarte.getType());
    }

    // toString
    @Override
    public String toString() {
        return "Rang:" + this.rang + "Valeur:" + this.type;
    }
}

package Model;

public class Carte {

    // Attributs
    private String nom;
    private int valeur;

    // Constructeur
    public Carte(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    @Override
    public boolean equals(Object o)
    {
        Carte autreCarte = (Carte) o;

        return (this.nom == autreCarte.getNom()) && (this.valeur == autreCarte.getValeur());
    }

    // Accesseurs et mutateurs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
        return nom + " " +valeur;
}
}

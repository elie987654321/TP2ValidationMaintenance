package model.Joueurs;

import model.Carte;

import java.util.ArrayList;

public class JoueurDecorateur implements JoueurProduit
{
    JoueurProduit joueurProduit;

    public JoueurDecorateur(JoueurProduit joueur)
    {
        this.joueurProduit = joueur;
    }

    @Override
    public ArrayList<Carte> getMainDu21() {
        return joueurProduit.getMainDu21();
    }

    @Override
    public String getMainDu21Bien() {
        return joueurProduit.getMainDu21Bien();
    }

    @Override
    public void setMainDu21(ArrayList<Carte> mainDu21) {
        joueurProduit.setMainDu21(mainDu21);
    }

    @Override
    public int getPoints() {
        return joueurProduit.getPoints();
    }

    @Override
    public Carte piger(Carte carte) {
        return joueurProduit.piger(carte);
    }

    @Override
    public String getNom()
    {
        return joueurProduit.getNom();
    }

    @Override
    public void setNom(String nom)
    {
        joueurProduit.setNom(nom);
    }

    public String GetTexteVictoire()
    {
        return joueurProduit.getNom() + "!!! YAY";
    }
}

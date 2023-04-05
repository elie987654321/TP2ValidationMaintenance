package model.Joueurs;

import model.Carte;

import java.util.ArrayList;

public interface JoueurProduit {



    public ArrayList<Carte> getMainDu21() ;

    public String getMainDu21Bien();

    public void setMainDu21(ArrayList<Carte> mainDu21) ;


    public int getPoints();



    public void piger(Carte carte);


    @Override
    public String toString();
}

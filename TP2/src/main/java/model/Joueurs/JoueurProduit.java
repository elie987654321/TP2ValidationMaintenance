package model.Joueurs;

import model.Carte;

import java.util.ArrayList;

public interface JoueurProduit {

    ArrayList<Carte> getMainDu21() ;

    String getMainDu21Bien();

    void setMainDu21(ArrayList<Carte> mainDu21) ;

    int getPoints();

    Carte piger(Carte carte);

    @Override
    String toString();

}

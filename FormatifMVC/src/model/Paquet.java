package model;

import EnumPerso.EnumsCartes;

import java.util.ArrayList;

public class Paquet {

    // Attributs
    private ArrayList<Carte> paquet;

    // Enum


    // Constructeur
    public Paquet() {
        this.paquet = new ArrayList<Carte>();
    }

    // Accesseur
    public ArrayList<Carte> getCartes() {
        return paquet;
    }

    // Methodes
    // Met 52 cartes dans le paquet
    public void initPaquet(){
        int point = 1;

        for (EnumsCartes.RangCartes rang : EnumsCartes.RangCartes.values()) {

            if (rang == EnumsCartes.RangCartes.AS){
                point = 11;
            }
            else if (rang == EnumsCartes.RangCartes.VALET || rang == EnumsCartes.RangCartes.REINE ||rang == EnumsCartes.RangCartes.ROI){
                point = 10;
            }
            else {
                point++;
            }

            this.paquet.add(new Carte(EnumsCartes.TypesCartes.trefle, rang, point));
            this.paquet.add(new Carte( EnumsCartes.TypesCartes.pique, rang, point));
            this.paquet.add(new Carte( EnumsCartes.TypesCartes.coeur, rang, point));
            this.paquet.add(new Carte( EnumsCartes.TypesCartes.carreau, rang, point));
        }
    }

    // Choisi une carte aléatoire dans le paquet, l'enleve du paquet et la retourne
    public Carte piger() {

        if (this.paquet.size() != 0) {
            // Choisi un index aléatoire
            int index = (int) (Math.random() * this.paquet.size());

            Carte cartePigee = paquet.get(index);
            this.paquet.remove(index);

            return cartePigee;
        } else {
            System.out.println("Le paquet est vide");
            return null;
        }
    }
}

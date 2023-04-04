package Model;

import java.util.ArrayList;

public class Paquet {

    // Attributs
    private ArrayList<Carte> paquet;

    // Enum
    public enum Rang
    {
        DEUX,
        TROIS,
        QUATRE,
        CINQ,
        SIX,
        SEPT,
        HUIT,
        NEUF,
        DIX,
        VALET,
        DAME,
        ROI,
        AS
    }

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

        for (Paquet.Rang rang : Paquet.Rang.values()) {

            if (rang == rang.AS){
                point = 11;
            }
            else if (rang == rang.VALET || rang == rang.DAME ||rang == rang.ROI){
                point = 10;
            }
            else {
                point++;
            }

            this.paquet.add(new Carte(rang + " DE PIQUE ♠", point));
            this.paquet.add(new Carte(rang + " DE TREFLE ♣", point));
            this.paquet.add(new Carte(rang + " DE CARREAU ♦", point));
            this.paquet.add(new Carte(rang + " DE COEUR ♥", point));
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

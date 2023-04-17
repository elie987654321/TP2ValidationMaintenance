package model.Joueurs;

public class JoueurCreateur {
    public JoueurProduit CreerJoueur(int numJoueur)
    {
        if(numJoueur == 1)
        {
            return new Joueur1();
        }
        else if(numJoueur == 2)
        {
            return new Joueur2();
        }
        else if(numJoueur == 3)
        {
            return new Joueur3();
        }
        else if(numJoueur == 4)
        {
            return new Joueur4();
        }
        else
        {
            return null;
        }
    }
}

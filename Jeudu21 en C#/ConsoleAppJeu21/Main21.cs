using System;
using System.Collections.Generic;

using PaquetDeCartes;

public class Main21
{
    private List<Carte> mainDe21;
    private Paquet paquet; // on lie la main à un paquet

    public Main21(Paquet paquet, int nbCarte)
    {
        this.paquet = paquet;
        this.mainDe21 = new List<Carte>();
        for (int i = 0; i < nbCarte; i++)
        {
            this.piger();
        }
    }

    /// <summary>
    /// Piger, c'est prendre une carte dans le paquet et l'ajouter dans sa main.
    /// On ajoute une carte seulement s'il reste des cartes dans le paquet. Sinon, on ne fait rien.
    /// </summary>
    /// <returns> la carte pigée dans le paquet et ajoutée dans la main. </returns>
    public Carte piger()
    {
        Carte cPige = paquet.piger();
        if (cPige != null)
        {
            mainDe21.Add(cPige);
        }
        return cPige;
    }

    /// <summary>
    /// Retourne le nombre de carte dans le paquet.
    /// </summary>
    /// <returns> le nombre de carte dans le paquet </returns>
    public int NbCarte
    {
        get
        {
            return mainDe21.Count;
        }
    }

    /// <summary>
    /// Donne la carte à l'indice.
    /// </summary>
    /// <param name="indice"> l'indice de la carte à retourner. L'indice 0 étant la première carte de la main </param>
    /// <returns> la carte à l'indice ou null si l'indice est négatif ou dépasse le nombre de carte dans la main - 1 </returns>
    public Carte voir(int indice)
    {
        Carte carte = null;

        if (0 <= indice && indice < mainDe21.Count)
        {
            carte = mainDe21[indice]; // on devrait peut-être la clonner mais bon...
        }

        return carte;
    }

    public int ValeurMainDe21
    {
        get
        {
            int valeur = 0;
            foreach (Carte c in mainDe21)
            {
                valeur += getValeurCarte21(c);
            }
            return valeur;
        }
    }

    public bool main21Perdante()
    {
        return ValeurMainDe21 > 21;
    }

    public bool main21Gagnante()
    {
        return ValeurMainDe21 == 21;
    }

    public bool main21GagnanteOuPerdante()
    {
        return main21Perdante() || main21Gagnante();
    }


    private string MainDe21
    {
        get
        {
            string str = "";
            int position = 1;

            foreach (Carte c in mainDe21)
            {
                str += position++ + " - " + c + "\n";
            }
            return str;
        }
    }

    public override string ToString()
    {
        int valeurJeu = ValeurMainDe21;
        string strResultat = main21Perdante() ? " 21 est dépassé." : 21 - valeurJeu + " pour dépasser.";
        return MainDe21 + "valeur du jeu 21 : " + valeurJeu + " -> " + strResultat + "\n";
    }


    /// <summary>
    /// Retourne selon les règles du 21 simplifiées la valeur de la carte. (voir l'énoncé du travail)
    /// </summary>
    /// <param name="carte"> la carte dont un veut connaître la valeur </param>
    /// <returns> la valeur de la carte. </returns>
    private int getValeurCarte21(Carte carte)
    {
        int valeur;
        switch (carte.Rang)
        {
            case Rang.AS:
                valeur = 11;
                break;
            case Rang.DEUX:
                valeur = 2;
                break;
            case Rang.TROIS:
                valeur = 3;
                break;
            case Rang.QUATRE:
                valeur = 4;
                break;
            case Rang.CINQ:
                valeur = 5;
                break;
            case Rang.SIX:
                valeur = 6;
                break;
            case Rang.SEPT:
                valeur = 7;
                break;
            case Rang.HUIT:
                valeur = 8;
                break;
            case Rang.NEUF:
                valeur = 9;
                break;
            default:
                valeur = 10;
                break;
        }
        return valeur;
    }
}

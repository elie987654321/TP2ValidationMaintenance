using System;
using Utilitaires;

namespace PaquetDeCartes
{
    /// <summary>
    /// Classe représentant un jeu de cartes.
    /// </summary>
    public class Paquet
    {
        /// <summary>
        /// Paquet de cartes.
        /// </summary>
        private Carte[] paquet;
        private int nbCartePiges;

        /// <summary>
        /// Constructeur.
        /// </summary>
        public Paquet(bool melange)
        {
            // Initialisation des cartes du paquet.
            this.paquet = new Carte[Enum.GetValues(typeof(Rang)).Length * Couleur.values.Length];
            this.nbCartePiges = 0;
            remplirPaquet();

            if (melange)
            {
                //Mélange le jeu de cartes
                melanger();
            }
        }

        private void remplirPaquet()
        {
            Carte c;
            int iPaquet = 0;
            foreach (Couleur couleur in Couleur.values)
            {
                foreach (Rang rang in Enum.GetValues(typeof(Rang)))
                {
                    c = new Carte(rang, couleur);
                    this.paquet[iPaquet++] = c;
                }
            }
        }

        /// <summary>
        /// Echange deux cartes d'un paquet.
        /// </summary>
        /// <param name="i"> L'indice de la première carte à échanger. </param>
        /// <param name="j"> L'indice de la seconde carte à échanger. </param>
        private void permuter(int i, int j)
        {
            Carte temp;
            temp = this.paquet[i];
            this.paquet[i] = this.paquet[j];
            this.paquet[j] = temp;
        }

        /// <summary>
        /// Mélange les cartes du paquet.
        /// </summary>
        private void melanger()
        {
            for (int i = 0; i < this.paquet.Length; i++)
            {
                permuter(i, Util.getAleatoireEntreBorne(0, i));
            }
        }


        /// <summary>
        /// Piger une carte dans le paquet.
        /// </summary>
        /// <returns> Retourne la carte suivante du paquet ou null si toutes les cartes ont été pigées. </returns>
        public Carte piger()
        {
            Carte pige = null;

            if (this.nbCartePiges < this.paquet.Length)
            {
                pige = this.paquet[this.nbCartePiges++];
            }

            return pige;
        }


    }

}
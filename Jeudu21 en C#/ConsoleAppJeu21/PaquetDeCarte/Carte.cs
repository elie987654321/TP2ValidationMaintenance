namespace PaquetDeCartes
{
	/// <summary>
	/// <para>Classe représentant une carte de jeu.</para>
	/// </summary>
	public class Carte
	{
	   /// <summary>
	   /// Le rang de la carte. </summary>
	   private Rang rang;
	   /// <summary>
	   /// La couleur de la carte. </summary>
	   private Couleur couleur;


	   /// <summary>
	   /// <para>Constructeur de carte.</para> </summary>
	   /// <param name="rang"> Le rang de la carte. </param>
	   /// <param name="couleur"> La couleur de la carte. </param>
	   public Carte(Rang rang, Couleur couleur)
	   {
		  this.rang = rang;
		  this.couleur = couleur;
	   }

	   /// <summary>
	   /// <para>Retourne le rang de la carte.</para> </summary>
	   /// <returns> Renvoie le rang de la carte. </returns>
	   public Rang Rang
	   {
		   get
		   {
			  return this.rang;
		   }
	   }


	   /// <summary>
	   /// <para>Retourne la couleur de la carte.</para> </summary>
	   /// <returns> Renvoie la couleur de la carte. </returns>
	   public Couleur Couleur
	   {
		   get
		   {
			  return this.couleur;
		   }
	   }


	   /// <summary>
	   /// <para>Retourne une représentation de la carte.</para> </summary>
	   /// <returns> Renvoie une représentation de la carte. </returns>
	   public override string ToString()
	   {
		  return this.rang + " " + this.couleur;
	   }
	}

}
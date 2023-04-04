using System.Collections.Generic;

namespace PaquetDeCartes
{
	/// <summary>
	/// Couleur de la carte.
	/// </summary>

	public class Couleur
	{
		public static readonly Couleur PIQUE = new Couleur("PIQUE", "♠");
		public static readonly Couleur TREFLE = new Couleur("TREFLE", "♣");
		public static readonly Couleur CARREAU = new Couleur("CARREAU", "♦");
		public static readonly Couleur COEUR = new Couleur("COEUR", "♥");

		public static readonly Couleur[] values = { PIQUE, TREFLE, CARREAU, COEUR };

		public string nom { get; private set; }
		public string symbole { get; private set; }

		Couleur(string nom, string symbole)
		{
			this.nom = nom;
			this.symbole = symbole;
		}

		public override string ToString()
		{
			return this.symbole;
		}
	}

}
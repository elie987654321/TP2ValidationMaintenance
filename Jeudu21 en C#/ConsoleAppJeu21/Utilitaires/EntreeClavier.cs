using System;

namespace Utilitaires
{

	public class EntreeClavier
	{
		/// <summary>
		/// Méthode permettant de lire un entier au clavier.
		/// </summary>
		/// <param name="question"> Reçoit en paramètre la question à demander à l'utilisateur </param>
		/// <returns> Un nombre entier correspondant à la réponse donnée par l'utilisateur (int) </returns>
		public static int lireEntier(string question)
		{
			int reponse;
			reponse = int.Parse(lireString(question));
			return reponse;
		}

		/// <summary>
		/// Méthode permettant de lire un nombre réel au clavier.
		/// </summary>
		/// <param name="question"> Reçoit en paramètre la question à demander à l'utilisateur </param>
		/// <returns> Un nombre réel correspondant à la réponse donnée par l'utilisateur (double) </returns>
		public static double lireReel(string question)
		{
			double reponse;
			reponse = double.Parse(lireString(question));
			return reponse;
		}

		/// <summary>
		/// Méthode permettant de lire une chaîne de caractère à la console
		/// </summary>
		/// <param name="question"> Reçoit en paramètre la question à demander à l'utilisateur </param>
		/// <returns> Une chaîne de caractère contenant la réponse entrée au clavier par l'utilisateur (String) </returns>
		public static string lireString(string question)
		{
			string reponse;

            Console.Write(question);
			reponse = Console.ReadLine(); //lecture de la reponse

			return reponse;
		}

		/// <summary>
		///*
		/// Saisit au clavier une réponse de l'usager au clavier. La réponse doit être un caractère présent dans la
		/// chaine valeursValides sans tenir compte de la casse. Dans le cas contraire, la question est reposée indéfiniment.
		/// L'usager peut entrer plusieurs lettres, mais seule la première lettre entrée est considérée.
		/// </summary>
		/// <param name="question"> la question posé à l'usager (exemple : "Votre sexe (m ou f)? " </param>
		/// <param name="valeursValides"> la chaine qui comprend les lettres acceptés (exemple : "mf") </param>
		/// <returns> le caractère saisi au clavier par l'usager. Ce caractère est nécessairement parmis ceux
		/// envoyés dans valeursValides. On retourne dans tous les cas la minuscule correspondante. </returns>
		public static char saisirCaractere(string question, string valeursValides)
		{
			char c = ' ';
			string reponse;
			bool estInvalide = true;

			valeursValides = valeursValides.ToLower();

			do
			{
				reponse = lireString(question);
				if (reponse.Length > 0)
				{
					c = reponse.ToLower()[0];
					estInvalide = valeursValides.IndexOf(c) == -1;
				}
				if (estInvalide)
				{
					Console.WriteLine("Entrez un choix valide (" + valeursValides + ")");
				}
			} while (estInvalide);
			return c;
		}
	}

}
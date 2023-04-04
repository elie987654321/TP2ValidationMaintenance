using System;
using Paquet = PaquetDeCartes.Paquet;
using Utilitaires;

public class Partie21
{
	private Paquet paquet;
	private Main21 jeuBanquier;
	private Main21 jeuJoueur;

	public Partie21()
	{
		this.paquet = new Paquet(true);
		this.jeuBanquier = new Main21(this.paquet, 2);
		this.jeuJoueur = new Main21(this.paquet, 2);
	}

	public void jouer()
	{
		bool gameOver;
		bool banquierAJoue = false;

		gameOver = debuterPartie();
		if (!gameOver)
		{
			gameOver = faireJouerLeJoueur();
			if (!gameOver)
			{
				faireJouerLeBanquier();
				banquierAJoue = true; //si le banquier a joué les messages sont traités différement
			}
		}
		if (!banquierAJoue)
		{
			afficherMessagePartieTermine();
		}
	}


	/// <summary>
	///*
	/// </summary>
	/// <returns> Vrai si 1 des 2 joueurs (joueur ou banquier) ou les 2 ont une main gagnante ou perdante </returns>
	private bool debuterPartie()
	{
		afficherJeuBanquier();
		afficherJeuJoueur();

		return jeuJoueur.main21GagnanteOuPerdante() || jeuBanquier.main21GagnanteOuPerdante();
	}

	/// <summary>
	///*
	/// </summary>
	/// <returns> Vrai si le joueur a une main gagnante ou perdante. </returns>
	private bool faireJouerLeJoueur()
	{
		char c;

		do
		{
            c = EntreeClavier.saisirCaractere("(C)onserver son jeu ou (d)emander une carte ? ", "cd");

			if (c == 'd')
			{
				jeuJoueur.piger();
				afficherJeuJoueur();
			}
		} while (c != 'c' && !jeuJoueur.main21GagnanteOuPerdante());

		return jeuJoueur.main21GagnanteOuPerdante();
	}

	private void faireJouerLeBanquier()
	{
		while ((jeuBanquier.ValeurMainDe21 < jeuJoueur.ValeurMainDe21) && jeuBanquier.ValeurMainDe21 < 21)
		{
			Console.WriteLine("Le banquier pige... \n");
			jeuBanquier.piger();
			afficherJeuBanquier();
		}

		//message de fin
		if (jeuBanquier.ValeurMainDe21 <= 21)
		{
			Console.WriteLine("Vous avez perdu: votre main est plus faible.");
		}
		else
		{
			Console.WriteLine("Vous avez gagné! Le banquier a dépassé 21.");
		}
	}

	private void afficherJeuBanquier()
	{
		Console.WriteLine("Jeu du banquier : \n" + jeuBanquier);
	}

	private void afficherJeuJoueur()
	{
		Console.WriteLine("Votre jeu : \n" + jeuJoueur);
	}

	private void afficherMessagePartieTermine()
	{
		if (jeuJoueur.main21Gagnante())
		{
			Console.WriteLine("Vous avez gagné!");
		}
		else if (jeuJoueur.main21Perdante())
		{
			Console.WriteLine("Vous avez perdu en dépassant 21 !");
		}

		if (jeuBanquier.main21Gagnante())
		{
			Console.WriteLine("Le banquier a gagné!");
		}
		else if (jeuBanquier.main21Perdante())
		{
			Console.WriteLine("Le banquier a perdu en dépassant 21 !");
		}
	}
 }

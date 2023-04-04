using System;
using System.Text;
using Utilitaires;

public class App21
{
	private Partie21 p;

	public App21()
	{
		char c;
		Console.OutputEncoding = Encoding.UTF8;

		do
		{
			p = new Partie21();
			p.jouer();
			c = EntreeClavier.saisirCaractere("Voulez-vous jouer une autre partie ? (o/n) ", "on");
		} while (c == 'o');
		Console.WriteLine("Au revoir!");
	}
}

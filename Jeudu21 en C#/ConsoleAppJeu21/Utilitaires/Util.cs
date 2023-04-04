using System;
using System.Collections.Generic;
using System.Text;

namespace Utilitaires
{
    class Util
    {
        /// <summary>
        /// Retourne une valeur aléatoire entre min et max inclusivement.
        /// </summary>
        /// <param name="min"> valeur minimum à retourner </param>
        /// <param name="max"> valeur maximum à retourner </param>
        /// <returns> valeur aléatoire entre min et max inclusivement </returns>
        public static int getAleatoireEntreBorne(int min, int max)
        {
            Random rnd = new Random();
            int nb = rnd.Next(min, max);

            return nb;
        }
    }
}

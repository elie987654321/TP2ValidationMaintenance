package model.Joueurs;

import model.Carte;
import model.EnumsCartes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoueurDecorateurTest {

    private JoueurProduit joueurTest;
    private JoueurDecorateur joueurDecorateurTest;

    @BeforeEach
    public void initJoueursTest() {
        joueurTest = new Joueur1(); // or any other implementation of JoueurProduit
        joueurDecorateurTest = new JoueurDecorateur(joueurTest);
    }

    @Test
    public void piger_uneCarte_retourneLaCarte() {
        // GIVEN
        Carte carte = new Carte(EnumsCartes.TypesCartes.coeur, EnumsCartes.RangCartes.AS, 11);

        // WHEN
        Carte cartePigee = joueurDecorateurTest.piger(carte);

        // THEN
        assertEquals(carte, cartePigee);
    }


    @Test
    public void getTexteVictoire_unNomDUnJoueur_retourneUnString() {
        // GIVEN
        joueurTest.setNom("John");

        // WHEN
        String actual = joueurDecorateurTest.GetTexteVictoire();

        // THEN
        assertEquals("John!!!!!!!!!!!", actual);
    }
}
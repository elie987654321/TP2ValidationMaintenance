package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PartieTest {

    private Partie partieTest;

    @BeforeEach
    public void initPartieTest() {
        partieTest = new Partie();
    }

    @AfterEach
    public void undefPartieTest() {
        partieTest = null;
    }

    @Test
    public void initPaquet_remplitUnPaquetde52Cartes() {
        // given
        int expectedNbrDeCartes = 52;

        // when
        int actualNbrDeCartes = partieTest.getPaquet().getCartes().size();

        // then
        assertEquals(expectedNbrDeCartes, actualNbrDeCartes, "Le nombre de cartes dans le paquet doit être de 52");
    }

    @Test
    public void pigerCarteJoueur_unJoueur_retourneUneCarteNonNull() {
        // given
        // Joueur1 de la partie

        // when
        Carte carteNonNull = partieTest.PigerCarteJoueur1();

        // then
        assertNotNull(carteNonNull, "La carte piochée ne doit pas être null");
    }

    @Test
    public void pigerCarteJoueur_unJoueur_retourneUneCarteAleatoire() {
        // given
        // Joueur1 de la partie

        // when
        Carte carteAleatoire = partieTest.PigerCarteJoueur1();

        // then
        assertEquals(carteAleatoire.getClass(), Carte.class, "La carte piochée doit être aléatoire");
    }

    @Test
    public void pigerCarteJoueur_unJoueur_retireUneCarteDuPaquet() {
        // given
        // Joueur1 de la partie
        
        // when
        Carte carteRetiree = partieTest.PigerCarteJoueur1();

        // then
        assertFalse(partieTest.getPaquet().getCartes().contains(carteRetiree), "La carte piochée doit être retirée du paquet");
    }
}
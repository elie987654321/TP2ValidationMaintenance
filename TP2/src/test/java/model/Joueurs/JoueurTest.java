package model.Joueurs;

import model.Carte;
import model.EnumsCartes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class JoueurTest {

    private Joueur1 joueurTest;

    @BeforeEach
    public void initJoueurTest() {
        joueurTest = new Joueur1();
    }

    @AfterEach
    public void undefJoueurTest() {
        joueurTest = null;
    }

    @Test
    public void piger_uneCarte_ajouteLaCarteDansLaMainDu21DuJoueur() {
        // Given
        Carte carte = new Carte(EnumsCartes.TypesCartes.coeur, EnumsCartes.RangCartes.AS, 11);

        // When
        joueurTest.piger(carte);

        // Then
        Assertions.assertEquals(1, joueurTest.getMainDu21().size());
    }

    @Test
    public void piger_uneCarte_retourneLaCarte() {
        // Given
        Carte carte = new Carte(EnumsCartes.TypesCartes.coeur, EnumsCartes.RangCartes.AS, 11);

        // When
        Carte cartePigee = joueurTest.piger(carte);

        // Then
        Assertions.assertEquals(carte, cartePigee);
    }

    @Test
    public void piger_uneCarte_ajouteLesPointsDeLaCarteAuPointsDuJoueur() {
        // Given
        Carte carte = new Carte(EnumsCartes.TypesCartes.coeur, EnumsCartes.RangCartes.AS, 11);

        // When
        joueurTest.piger(carte);

        // Then
        Assertions.assertEquals(carte.getValeur(), joueurTest.getPoints());
    }

    @Test
    public void toString_uneListeDeCartesDuJoueur_RetourneUnString() {
        // Given
        ArrayList<Carte> mainDu21 = new ArrayList<>();
        mainDu21.add(new Carte(EnumsCartes.TypesCartes.pique, EnumsCartes.RangCartes.ROIS, 10));
        mainDu21.add(new Carte(EnumsCartes.TypesCartes.trefle, EnumsCartes.RangCartes.REINE, 10));
        joueurTest.setMainDu21(mainDu21);

        // When
        String mainDu21Bien = joueurTest.getMainDu21Bien();

        // Then
        Assertions.assertEquals("\nRang:ROIS"+"Valeur:pique"+"\nRang:REINE"+"Valeur:trefle", mainDu21Bien);
    }
}
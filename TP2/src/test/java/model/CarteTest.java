package model;

import model.EnumsCartes.RangCartes;
import model.EnumsCartes.TypesCartes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarteTest {

    @Test
    public void getPath_uneCarte_retourneSonPathDImage() {
        // GIVEN
        Carte carte = new Carte(TypesCartes.coeur, RangCartes.AS, 1);

        // WHEN
        String cartePath = carte.getPath();

        // THEN
        assertEquals(Paths.get("").toAbsolutePath().toString() + "/src/main/resources/images/paquet/AS_coeur.png", cartePath);
    }

    @Test
    public void TestEqualsVraisSiNomEtValeurIdentiques()
    {
        //GIVEN
        Carte carteTest1 = new Carte(TypesCartes.coeur, RangCartes.AS,  11);
        Carte carteTest2 = new Carte(TypesCartes.coeur, RangCartes.AS,  11);

        //WHEN
        boolean carteEgal = carteTest1.equals(carteTest2);

        //THEN
        Assertions.assertTrue(carteEgal);
    }

    @Test
    public void TestEqualsFauxSiDeuxNomDifferent()
    {
        //GIVEN
        Carte carteTest1 = new Carte(TypesCartes.coeur, RangCartes.AS,  11);
        Carte carteTest2 = new Carte(TypesCartes.carreau, RangCartes.ROI,  10);

        //WHEN
        boolean carteEgal = carteTest1.equals(carteTest2);

        //THEN
        Assertions.assertFalse(carteEgal);
    }

    @Test
    public void TestEqualsFauxSiDeuxValeursDifferentes()
    {
        //GIVEN
        Carte carteTest1 = new Carte(TypesCartes.coeur, RangCartes.AS,  11);
        Carte carteTest2 = new Carte(TypesCartes.carreau, RangCartes.ROI,  10);

        //WHEN
        boolean carteEgal = carteTest1.equals(carteTest2);

        //THEN
        Assertions.assertFalse(carteEgal);
    }

    @Test
    public void toString_uneCarte_retourneUnString() {
        // GIVEN
        Carte carte = new Carte(TypesCartes.coeur, RangCartes.AS, 11);

        // WHEN
        String carteString = carte.toString();

        // THEN
        assertEquals("Rang:ASValeur:coeur", carteString);
    }
}
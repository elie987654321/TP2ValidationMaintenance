package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaquetTest {

    private Paquet paquetTest;

    @BeforeEach
    public void initPaquetTest() {
        paquetTest = new Paquet();
    }

    @AfterEach
    public void undefPaquetTest() {
        paquetTest = null;
    }

    @Test
    void initPaquet_remplitUnPaquetde52Cartes() {
        // GIVEN
        int nombreDeCartes = 0;

        // WHEN
        paquetTest.initPaquet();
        for(Carte carte : paquetTest.getCartes()) {
            if (carte  instanceof Carte){
                nombreDeCartes++;
            }
        }

        // THEN
        assertEquals(nombreDeCartes, 52);
        for(Carte carte : paquetTest.getCartes())
        {
            System.out.println(carte.getRang() + " "+ carte.getType());
        }
    }

    @Test
    void piger_unPaquet_retourneUneCarteAleatoire() {
        // GIVEN
        paquetTest.initPaquet();

        // WHEN
        Carte resultat = paquetTest.piger();

        // THEN
        Assertions.assertEquals(resultat.getClass(), Carte.class);
        System.out.println(resultat.getRang() + " "+ resultat.getType());
    }

    @Test
    void piger_unPaquetVide_retourneNull() {
        // GIVEN

        // WHEN
        Carte resultat = paquetTest.piger();

        // THEN
        Assertions.assertEquals(resultat, null);
    }

    @Test
    void piger_unPaquet_enleveLaCarteDuPaquet() {
        // GIVEN
        paquetTest.initPaquet();
        int nombreDeCartes = 0;

        // WHEN
        Carte resultat = paquetTest.piger();
        for(Carte carte : paquetTest.getCartes()) {
            if (carte != resultat) {
                nombreDeCartes++;
            }
        }

        // THEN
        assertEquals(nombreDeCartes, 51);
        System.out.println("La carte enlevee " + resultat.getRang() + " "+ resultat.getType() + "\n");
        System.out.println("Le reste du paquet:");
        for(Carte carte : paquetTest.getCartes())
        {
            System.out.println(carte.getRang() + " "+ carte.getType());
        }
    }
}
package model.Joueurs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JoueurCreateurTest {

    private JoueurCreateur joueurCreateurTest;

    @BeforeEach
    public void initJoueurCreateurTest() {
        joueurCreateurTest = new JoueurCreateur();
    }

    @AfterEach
    public void undefJoueurCreateurTest() {
        joueurCreateurTest = null;
    }

    @Test
    public void creerJoueur_unIntValant1_retourneJoueur1() {
        // given
        int numeroDuJoueur = 1;

        // when
        JoueurProduit joueurProduit = joueurCreateurTest.CreerJoueur(numeroDuJoueur);

        // then
        assertTrue(joueurProduit instanceof Joueur1);
    }

    @Test
    public void creerJoueur_unIntValant2_retourneJoueur2() {
        // given
        int numeroDuJoueur = 2;

        // when
        JoueurProduit joueurProduit = joueurCreateurTest.CreerJoueur(numeroDuJoueur);

        // then
        assertTrue(joueurProduit instanceof Joueur2);
    }

    @Test
    public void creerJoueur_unIntValant3_retourneJoueur3() {
        // given
        int numeroDuJoueur = 3;

        // when
        JoueurProduit joueurProduit = joueurCreateurTest.CreerJoueur(numeroDuJoueur);

        // then
        assertTrue(joueurProduit instanceof Joueur3);
    }

    @Test
    public void creerJoueur_unIntValant4_retourneJoueur4() {
        // given
        int numeroDuJoueur = 4;

        // when
        JoueurProduit joueurProduit = joueurCreateurTest.CreerJoueur(numeroDuJoueur);

        // then
        assertTrue(joueurProduit instanceof Joueur4);
    }

    @Test
    public void creerJoueur_unIntValant5_retourneJoueurNull() {
        // given
        int numeroDuJoueur = 5;

        // when
        JoueurProduit joueurProduit = joueurCreateurTest.CreerJoueur(numeroDuJoueur);

        // then
        assertNull(joueurProduit);
    }
}
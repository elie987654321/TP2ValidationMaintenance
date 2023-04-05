package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.Joueurs.Joueur1;
import model.Joueurs.JoueurCreateur;
import model.Joueurs.JoueurProduit;
import model.*;

public class GameGraphicalController{

    private Partie partie = new Partie();

    // Joueur 1
    @FXML
    private Text joueur1;
    @FXML
    private Text pointJoueur1;
    @FXML
    private Text carteJoueur1;
    @FXML
    private Button conserverJoueur1;
    @FXML
    private Button demanderJoueur1;
    @FXML
    private ImageView carte1Joueur1;
    @FXML
    private ImageView carte2Joueur1;
    @FXML
    private ImageView carte3Joueur1;
    @FXML
    private ImageView carte4Joueur1;
    @FXML
    private ImageView carte5Joueur1;

    // Joueur 2
    @FXML
    private Text joueur2;
    @FXML
    private Text pointJoueur2;
    @FXML
    private Text carteJoueur2;
    @FXML
    private Button conserverJoueur2;
    @FXML
    private Button demanderJoueur2;

    // Joueur 3
    @FXML
    private Text joueur3;
    @FXML
    private Text pointJoueur3;
    @FXML
    private Text carteJoueur3;
    @FXML
    private Button conserverJoueur3;
    @FXML
    private Button demanderJoueur3;

    // Joueur 4
    @FXML
    private Text joueur4;
    @FXML
    private Text pointJoueur4;
    @FXML
    private Text carteJoueur4;
    @FXML
    private Button conserverJoueur4;
    @FXML
    private Button demanderJoueur4;

    // Tour
    @FXML
    private Text tour;

    @FXML
    private ImageView croupier;

    @FXML
    private ImageView paquetDeCartes;

    @FXML
    private void handleButtonClickDemanderJoueur1(ActionEvent event) {
        System.out.println("demander joueur 1");
    }
    @FXML
    private void handleButtonClickConserverJoueur1(ActionEvent event) {
        System.out.println("conserver joueur 1");

    }

    @FXML
    private void handleButtonClickDemanderJoueur2(ActionEvent event) {
        System.out.println("demander joueur 2");
    }
    @FXML
    private void handleButtonClickConserverJoueur2(ActionEvent event) {
        System.out.println("conserver  joueur 2");

    }

    @FXML
    private void handleButtonClickDemanderJoueur3(ActionEvent event) {
        System.out.println("demander joueur 3");
    }
    @FXML
    private void handleButtonClickConserverJoueur3(ActionEvent event) {
        System.out.println("conserver joueur 3");

    }

    @FXML
    private void handleButtonClickDemanderJoueur4(ActionEvent event) {
        System.out.println("demander joueur 4");
    }
    @FXML
    private void handleButtonClickConserverJoueur4(ActionEvent event) {
        System.out.println("conserver joueur 4");

    }

    private void InitializerPartie()
    {
        //Distribution des cartes
        DonnerCarteJoueur1(partie.PigerCarteJoueur1());
        DonnerCarteJoueur2(partie.PigerCarteJoueur2());
        DonnerCarteJoueur3(partie.PigerCarteJoueur3());
        DonnerCarteJoueur4(partie.PigerCarteJoueur4());
        DonnerCarteJoueur1(partie.PigerCarteJoueur1());
        DonnerCarteJoueur2(partie.PigerCarteJoueur2());
        DonnerCarteJoueur3(partie.PigerCarteJoueur3());
        DonnerCarteJoueur4(partie.PigerCarteJoueur4());

    }

    private void DonnerCarteJoueur1(Carte carte)
    {

    }

    private void DonnerCarteJoueur2(Carte carte)
    {

    }

    private void DonnerCarteJoueur3(Carte carte)
    {

    }

    private void DonnerCarteJoueur4(Carte carte)
    {

    }

    private void DeclareVainqueur(JoueurProduit vainqueur)
    {

    }

    @FXML
    private void initialize() {
        JoueurCreateur factory = new JoueurCreateur();
        JoueurProduit joueur = factory.CreerJoueur(4);

        carte1Joueur1.setImage(new Image("images/paquetDeCartes/3_of_hearts.png"));
        carte2Joueur1.setImage(new Image("images/paquetDeCartes/3_of_hearts.png"));
        carte3Joueur1.setImage(new Image("images/paquetDeCartes/3_of_hearts.png"));
        carte4Joueur1.setImage(new Image("images/paquetDeCartes/3_of_hearts.png"));

        croupier.setImage(new Image("images/croupier.png"));
        paquetDeCartes.setImage(new Image("images/paquetdecartes.png"));

        conserverJoueur1.setOnAction(this::handleButtonClickConserverJoueur1);
        demanderJoueur1.setOnAction(this::handleButtonClickDemanderJoueur1);

        conserverJoueur2.setOnAction(this::handleButtonClickConserverJoueur2);
        demanderJoueur2.setOnAction(this::handleButtonClickDemanderJoueur2);

        conserverJoueur3.setOnAction(this::handleButtonClickConserverJoueur3);
        demanderJoueur3.setOnAction(this::handleButtonClickDemanderJoueur3);

        conserverJoueur4.setOnAction(this::handleButtonClickConserverJoueur4);
        demanderJoueur4.setOnAction(this::handleButtonClickDemanderJoueur4);

    }
}

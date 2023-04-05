package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import model.Joueurs.Joueur1;
import model.Joueurs.JoueurCreateur;
import model.Joueurs.JoueurProduit;
import model.Partie;

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
    private void handleButtonClickCDemander(ActionEvent event) {
        System.out.println("demander");
    }    @FXML
    private void handleButtonClickConserver(ActionEvent event) {
        System.out.println("conserver");

    }

    @FXML
    private void handleButtonClickCDemanderJoueur2(ActionEvent event) {
        System.out.println("demander");
    }    @FXML
    private void handleButtonClickConserverJoueur2(ActionEvent event) {
        System.out.println("conserver");

    }


    @FXML
    private void handleButtonClickConserverJOueur3(ActionEvent event) {
        System.out.println("conserver");

    }

    @FXML
    private void handleButtonClickDemanderJoueur4(ActionEvent event) {
        System.out.println("demander");
    }

    private void InitializerPartie()
    {
        

        pointJoueur1.setText(String.valueOf(partie.getJoueur1().getPoints()));
        carteJoueur1.setText(partie.getJoueur1().getMainDu21Bien());
        conserverJoueur1.setOnAction(this::handleButtonClickConserver);
        demanderJoueur1.setOnAction(this::handleButtonClickCDemander);
        pointJoueur2.setText(String.valueOf(partie.getJoueur1().getPoints()));
        carteJoueur2.setText(partie.getJoueur1().getMainDu21Bien());
        conserverJoueur2.setOnAction(this::handleButtonClickConserver);
        demanderJoueur2.setOnAction(this::handleButtonClickCDemander);
        pointJoueur3.setText(String.valueOf(partie.getJoueur1().getPoints()));
        carteJoueur3.setText(partie.getJoueur1().getMainDu21Bien());
        conserverJoueur3.setOnAction(this::handleButtonClickConserver);
        demanderJoueur3.setOnAction(this::handleButtonClickCDemander);
        pointJoueur4.setText(String.valueOf(partie.getJoueur1().getPoints()));
        carteJoueur4.setText(partie.getJoueur1().getMainDu21Bien());
        conserverJoueur4.setOnAction(this::handleButtonClickConserver);
        demanderJoueur4.setOnAction(this::handleButtonClickCDemander);

        JoueurCreateur factory = new JoueurCreateur();
        JoueurProduit joueur = factory.CreerJoueur(4);

    }

    @FXML
    private void initialize() {

        int i = 0;
    }

}

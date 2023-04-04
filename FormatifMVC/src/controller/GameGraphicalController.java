package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import model.Partie;

public class GameGraphicalController{

    private Partie partie = new Partie();

    @FXML
    private Button conserverLeJeu;

    @FXML
    private Button demanderUneCarte;

    @FXML
    private Text carteBanquier;

    @FXML
    private void handleButtonClickConserver(ActionEvent event) {
        System.out.println("conserver");

    }

    @FXML
    private void handleButtonClickCDemander(ActionEvent event) {
        System.out.println("demander");
        partie.PigerCarteJoueur();
        pointJoueur1.setText(String.valueOf(partie.getJoueur1().getPoints()));
        carteJoueur1.setText(partie.getJoueur1().getMainDu21Bien());
    }

    @FXML
    private Text pointJoueur1;

    @FXML
    private Text pointBanquier;

    @FXML
    private Text carteJoueur1;

    @FXML
    private void initialize() {
        partie.DistribuerCartesInitials();
        pointJoueur1.setText(String.valueOf(partie.getJoueur1().getPoints()));
        pointBanquier.setText(String.valueOf(partie.getBanquier().getPoints()));
        carteJoueur1.setText(partie.getJoueur1().getMainDu21Bien());
        carteBanquier.setText(partie.getBanquier().getMainDu21Bien());
        conserverLeJeu.setOnAction(this::handleButtonClickConserver);
        demanderUneCarte.setOnAction(this::handleButtonClickCDemander);
    }

}

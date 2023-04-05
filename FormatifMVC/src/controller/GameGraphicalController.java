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

    private boolean joueur1EnAttente = true;
    private boolean joueur2EnAttente = true;
    private boolean joueur3EnAttente = true;
    private boolean joueur4EnAttente = true;

    private boolean joueur1Depasser = false;
    private boolean joueur2Depasser = false;
    private boolean joueur3Depasser = false;
    private boolean joueur4Depasser = false;

    private boolean partieTerminer;

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
    private ImageView croupier;

    @FXML
    private ImageView paquetDeCartes;


    @FXML
    private void handleButtonClickDemanderJoueur1(ActionEvent event) {
        if(!joueur1EnAttente && !joueur1Depasser && !partieTerminer)
        {
            DonnerCarteJoueur1(partie.PigerCarteJoueur1());
            joueur1EnAttente = true;
        }

        if(joueur1EnAttente && joueur2EnAttente && joueur3EnAttente && joueur4EnAttente)

        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;
        }

        if(partie.getJoueur1().getPoints() >= 21)
        {
            partieTerminer = true;
            partie.getJoueur1();
        }
    }




    @FXML
    private void handleButtonClickConserverJoueur1(ActionEvent event) {
        joueur1EnAttente = true;
    }


    @FXML
    private void handleButtonClickDemanderJoueur2(ActionEvent event) {
        if(!joueur2EnAttente && !joueur2Depasser && !partieTerminer)
        {
            DonnerCarteJoueur2(partie.PigerCarteJoueur2());
            joueur2EnAttente = true;
        }

        if(joueur1EnAttente && joueur2EnAttente && joueur3EnAttente && joueur4EnAttente)

        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;
        }

        if(partie.getJoueur2().getPoints() >= 21)
        {
            partieTerminer = true;
            partie.getJoueur2();

        }
    }
    @FXML
    private void handleButtonClickConserverJoueur2(ActionEvent event) {
        joueur2EnAttente = true;
    }


    @FXML
    private void handleButtonClickDemanderJoueur3(ActionEvent event) {
        if(!joueur3EnAttente && !joueur3Depasser && !partieTerminer)
        {
            DonnerCarteJoueur3(partie.PigerCarteJoueur3());
            joueur3EnAttente = true;
        }

        if(joueur1EnAttente && joueur2EnAttente && joueur3EnAttente && joueur4EnAttente)

        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;
        }

        if(partie.getJoueur3().getPoints() >= 21)
        {
            partieTerminer = true;

            DeclareVainqueur(partie.getJoueur3());
        }

    }

    @FXML
    private void handleButtonClickConserverJoueur3(ActionEvent event) {
        this.joueur3EnAttente = true;
    }

    @FXML
    private void handleButtonClickDemanderJoueur4(ActionEvent event) {
        if(!joueur4EnAttente && !joueur4Depasser && !partieTerminer)
        {
            DonnerCarteJoueur4(partie.PigerCarteJoueur4());
            joueur3EnAttente = true;
        }

        if(joueur1EnAttente && joueur2EnAttente && joueur3EnAttente && joueur4EnAttente)

        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;
        }

        if(partie.getJoueur4().getPoints() >= 21)
        {
            partieTerminer = true;
            DeclareVainqueur(partie.getJoueur4());
        }

    }

    @FXML
    private void handleButtonClickConserverJoueur4(ActionEvent event) {
        this.joueur3EnAttente = true;
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
        croupier.setImage(new Image("images/croupier.png"));
        paquetDeCartes.setImage(new Image("images/paquetdecartes.png"));
        partie.DistribuerCartesInitials();
        pointJoueur1.setText(String.valueOf(partie.getJoueur1().getPoints()));
        carteJoueur1.setText(partie.getJoueur1().getMainDu21Bien());
        conserverJoueur1.setOnAction(this::handleButtonClickConserverJoueur1);
        demanderJoueur1.setOnAction(this::handleButtonClickDemanderJoueur1);
        conserverJoueur2.setOnAction(this::handleButtonClickConserverJoueur2);
        demanderJoueur2.setOnAction(this::handleButtonClickDemanderJoueur2);
        conserverJoueur3.setOnAction(this::handleButtonClickConserverJoueur3);
        demanderJoueur3.setOnAction(this::handleButtonClickDemanderJoueur3);
        conserverJoueur4.setOnAction(this::handleButtonClickConserverJoueur4);
        demanderJoueur4.setOnAction(this::handleButtonClickDemanderJoueur4);
        JoueurCreateur factory = new JoueurCreateur();
        JoueurProduit joueur = factory.CreerJoueur(4);

        int i = 0;
    }

}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
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
    public Text joueur1;
    @FXML
    private Text pointJoueur1;

    private int nbCarteJoueur1 = 0;

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
    @FXML
    private ImageView carte6Joueur1;

    // Joueur 2
    @FXML
    public Text joueur2;

    private int nbCarteJoueur2 = 0;
    @FXML
    private Text pointJoueur2;
    @FXML
    private Button conserverJoueur2;
    @FXML
    private Button demanderJoueur2;
    @FXML
    private ImageView carte1Joueur2;
    @FXML
    private ImageView carte2Joueur2;
    @FXML
    private ImageView carte3Joueur2;
    @FXML
    private ImageView carte4Joueur2;
    @FXML
    private ImageView carte5Joueur2;
    @FXML
    private ImageView carte6Joueur2;

    // Joueur 3
    @FXML
    public Text joueur3;

    private int nbCarteJoueur3 = 0;
    @FXML
    private Text pointJoueur3;
    @FXML
    private Button conserverJoueur3;
    @FXML
    private Button demanderJoueur3;
    @FXML
    private ImageView carte1Joueur3;
    @FXML
    private ImageView carte2Joueur3;
    @FXML
    private ImageView carte3Joueur3;
    @FXML
    private ImageView carte4Joueur3;
    @FXML
    private ImageView carte5Joueur3;
    @FXML
    private ImageView carte6Joueur3;

    // Joueur 4
    @FXML
    public Text joueur4;

    private int nbCarteJoueur4 = 0;
    @FXML
    private Text pointJoueur4;
    @FXML
    private Button conserverJoueur4;
    @FXML
    private Button demanderJoueur4;
    @FXML
    private ImageView carte1Joueur4;
    @FXML
    private ImageView carte2Joueur4;
    @FXML
    private ImageView carte3Joueur4;
    @FXML
    private ImageView carte4Joueur4;
    @FXML
    private ImageView carte5Joueur4;
    @FXML
    private ImageView carte6Joueur4;

    // Tour
    @FXML
    private Text tour;

    // Dealer
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
        System.out.println("conserver");

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
        System.out.println("demander");
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
        nbCarteJoueur1++;
        switch(nbCarteJoueur1)
        {
            case 1 :
                this.carte1Joueur1.setImage(new Image(carte.getPath()));
                break;
            case 2 :
                this.carte2Joueur1.setImage(new Image(carte.getPath()));
                break;
            case 3 :
                this.carte3Joueur1.setImage(new Image(carte.getPath()));
                break;
            case 4 :
                this.carte4Joueur1.setImage(new Image(carte.getPath()));
                break;
            case 5 :
                this.carte5Joueur1.setImage(new Image(carte.getPath()));
                break;
            case 6 :
                this.carte6Joueur1.setImage(new Image(carte.getPath()));
                break;
            default:
                break;
        }
    }

    private void DonnerCarteJoueur2(Carte carte)
    {
        nbCarteJoueur2++;
        switch(nbCarteJoueur2)
        {
            case 1 :
                this.carte1Joueur2.setImage(new Image(carte.getPath()));
                break;
            case 2 :
                this.carte2Joueur2.setImage(new Image(carte.getPath()));
                break;
            case 3 :
                this.carte3Joueur2.setImage(new Image(carte.getPath()));
                break;
            case 4 :
                this.carte4Joueur2.setImage(new Image(carte.getPath()));
                break;
            case 5 :
                this.carte5Joueur2.setImage(new Image(carte.getPath()));
                break;
            case 6 :
                this.carte6Joueur2.setImage(new Image(carte.getPath()));
                break;
            default:
                break;
        }
    }

    private void DonnerCarteJoueur3(Carte carte)
    {
        nbCarteJoueur3++;
        switch(nbCarteJoueur3)
        {
            case 1 :
                this.carte1Joueur3.setImage(new Image(carte.getPath()));
                break;
            case 2 :
                this.carte2Joueur3.setImage(new Image(carte.getPath()));
                break;
            case 3 :
                this.carte3Joueur3.setImage(new Image(carte.getPath()));
                break;
            case 4 :
                this.carte4Joueur3.setImage(new Image(carte.getPath()));
                break;
            case 5 :
                this.carte5Joueur3.setImage(new Image(carte.getPath()));
                break;
            case 6 :
                this.carte6Joueur3.setImage(new Image(carte.getPath()));
                break;
            default:
                break;
        }
    }

    private void DonnerCarteJoueur4(Carte carte)
    {
        nbCarteJoueur4++;
        switch(nbCarteJoueur4)
        {
            case 1 :
                this.carte1Joueur4.setImage(new Image(carte.getPath()));
                break;
            case 2 :
                this.carte2Joueur4.setImage(new Image(carte.getPath()));
                break;
            case 3 :
                this.carte3Joueur4.setImage(new Image(carte.getPath()));
                break;
            case 4 :
                this.carte4Joueur4.setImage(new Image(carte.getPath()));
                break;
            case 5 :
                this.carte5Joueur4.setImage(new Image(carte.getPath()));
                break;
            case 6 :
                this.carte6Joueur4.setImage(new Image(carte.getPath()));
                break;
            default:
                break;
        }
    }

    private void DeclareVainqueur(JoueurProduit vainqueur)
    {

    }

    @FXML
    private void initialize() {

        croupier.setImage(new Image("images/croupier.png"));
        paquetDeCartes.setImage(new Image("images/paquetdecartes.png"));
        partie.DistribuerCartesInitials();

        InitializerPartie();

        JoueurCreateur factory = new JoueurCreateur();
        JoueurProduit joueur = factory.CreerJoueur(4);
    }
}
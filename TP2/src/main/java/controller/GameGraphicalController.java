package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.Carte;
import model.Joueurs.JoueurCreateur;
import model.Joueurs.JoueurProduit;
import model.Partie;

import java.util.ArrayList;

public class GameGraphicalController{
    private boolean joueur1ConserveTourPrecedent = false;
    private boolean joueur2ConserveTourPrecedent = false;
    private boolean joueur3ConserveTourPrecedent = false;
    private boolean joueur4ConserveTourPrecedent = false;


    private int joueur1DernierTourConserver  =  -1;
    private int joueur2DernierTourConserver  =  -1;
    private int joueur3DernierTourConserver  =  -1;
    private int joueur4DernierTourConserver  =  -1;


    private boolean joueur1EnAttente = false;
    private boolean joueur2EnAttente = false;
    private boolean joueur3EnAttente = false;
    private boolean joueur4EnAttente = false;

    private boolean joueur1Depasser = false;
    private boolean joueur2Depasser = false;
    private boolean joueur3Depasser = false;
    private boolean joueur4Depasser = false;

    private boolean joueur1Conserve = false;
    private boolean joueur2Conserve = false;
    private boolean joueur3Conserve = false;
    private boolean joueur4Conserve = false;

    private boolean partieTerminer;

    private Partie partie;


    private boolean joueur1HorsJeu;

    private boolean joueur2HorsJeu;

    private boolean joueur3HorsJeu;

    private boolean joueur4HorsJeu;

    private boolean duel;

    private boolean joueur1ConserveDuel;
    private boolean joueur2ConserveDuel;
    private boolean joueur3ConserveDuel;
    private boolean joueur4ConserveDuel;



    // Joueur 1
    @FXML
    public Text joueur1;
    @FXML
    private Text pointJoueur1;
    @FXML
    private Text joueur1Elimine;
    @FXML
    private Text conserverErreur1;

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
    @FXML
    private Text joueur2Elimine;
    @FXML
    private Text conserverErreur2;
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
    @FXML
    private Text joueur3Elimine;
    @FXML
    private Text conserverErreur3;

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
    @FXML
    private Text joueur4Elimine;
    @FXML
    private Text conserverErreur4;

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

    private int tourInteger;

    // Dealer
    @FXML
    private ImageView croupier;
    @FXML
    private ImageView paquetDeCartes;

    private int compteurTour = 1;

    @FXML
    private Text gagnant;

    private boolean joueur1DemanderCeTour;

    private boolean joueur2DemanderCeTour;

    private boolean joueur3DemanderCeTour;

    private boolean joueur4DemanderCeTour;

    @FXML
    private void handleButtonClickDemanderJoueur1(ActionEvent event) {
        if(!(joueur1DernierTourConserver == tourInteger) && (!joueur1DemanderCeTour) && (!joueur1Depasser) && (!joueur1ConserveDuel ))
        {
            joueur1DemanderCeTour = true;
            DonnerCarteJoueur1(partie.PigerCarteJoueur1());

            if(partie.getJoueur1().getPoints() > 21)
            {
                joueur1Depasser = true;
            }
        }

        GestionFinTour();
        GestionFinPartie();
/*
        conserverErreur1.setText("");

        if(!joueur1EnAttente && !joueur1Depasser && !joueur1Conserve && !partieTerminer)
        {
            DonnerCarteJoueur1(partie.PigerCarteJoueur1());
            joueur1EnAttente = true;
        }

        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }

        if(tourTermine() && !partieTerminer)
        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;

            compteurTour++;
            tour.setText("Tour "+Integer.toString(compteurTour));
        }

        if(partie.getJoueur1().getPoints() >= 21)
        {
            joueur1Depasser = true;
            joueur1Elimine.setText("Éliminé");
            conserverJoueur1.setDisable(true);
            demanderJoueur1.setDisable(true);
        }

        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }*/
    }

    @FXML
    private void handleButtonClickConserverJoueur1(ActionEvent event) {
        if(duel == false && !(joueur1DernierTourConserver == tourInteger - 1))
        {
            joueur1DernierTourConserver = tourInteger;
        }
        else if(duel == true)
        {
            joueur1ConserveDuel = true;
        }
/*
        joueur1Conserve = true;

        if(joueur1ConserveTourPrecedent || !joueur1Conserve){
            joueur1ConserveTourPrecedent = false;
            conserverErreur1.setText("Vous ne pouvez pas conserver deux tour de suite");

        }else if (!joueur1Conserve){
            joueur1ConserveTourPrecedent = true;
            conserverErreur1.setText("");

        }

        if(partieTermine())
        {
            AfficherVainqueurs(GetVainqueurs());
        }
        */

        GestionFinTour();
        GestionFinPartie();
    }


    @FXML
    private void handleButtonClickDemanderJoueur2(ActionEvent event) {
        if(!(joueur2DernierTourConserver == tourInteger) && (!joueur2DemanderCeTour) && (!joueur2Depasser) && (!joueur2ConserveDuel ))
        {
            joueur2DemanderCeTour = true;
            DonnerCarteJoueur2(partie.PigerCarteJoueur2());

            if(partie.getJoueur2().getPoints() > 21)
            {
                joueur2Depasser = true;
            }
        }

        GestionFinTour();
        GestionFinPartie();
                /*
        conserverErreur2.setText("");

        if(!joueur2EnAttente && !joueur2Depasser && !joueur2Conserve && !partieTerminer)
        {
            DonnerCarteJoueur2(partie.PigerCarteJoueur2());
            joueur2EnAttente = true;
        }

        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }

        if(tourTermine() && !partieTerminer)
        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;

            compteurTour++;
            tour.setText("Tour "+Integer.toString(compteurTour));
        }

        if(partie.getJoueur2().getPoints() >= 21)
        {
            joueur2Depasser = true;
            joueur2Elimine.setText("Éliminé");
            conserverJoueur2.setDisable(true);
            demanderJoueur2.setDisable(true);
        }

        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }*/
    }
    @FXML
    private void handleButtonClickConserverJoueur2(ActionEvent event) {
/*
        joueur2Conserve = true;

        if(joueur2ConserveTourPrecedent || !joueur2Conserve){
            joueur2ConserveTourPrecedent = false;
            conserverErreur2.setText("Vous ne pouvez pas conserver deux tour de suite");

        }else if (!joueur2Conserve) {
            joueur2ConserveTourPrecedent = true;
            conserverErreur2.setText("");

        }

        if(partieTermine())
        {
            AfficherVainqueurs(GetVainqueurs());
        }*/

        if(duel == false && !(joueur2DernierTourConserver == tourInteger - 1))
        {
            joueur2DernierTourConserver = tourInteger;
        }
        else if(duel == true)
        {
            joueur2ConserveDuel = true;
        }


        GestionFinTour();
        GestionFinPartie();
    }


    @FXML
    private void handleButtonClickDemanderJoueur3(ActionEvent event) {
        if(!(joueur3DernierTourConserver == tourInteger) && (!joueur3DemanderCeTour) && (!joueur3Depasser) && (!joueur3ConserveDuel ))
        {
            joueur3DemanderCeTour = true;
            DonnerCarteJoueur3(partie.PigerCarteJoueur3());

            if(partie.getJoueur3().getPoints() > 21)
            {
                joueur3Depasser = true;
            }
        }

        GestionFinTour();
        GestionFinPartie();

        /*
        conserverErreur3.setText("");

        if(!joueur3EnAttente && !joueur3Depasser && !joueur3Conserve && !partieTerminer)
        {
            DonnerCarteJoueur3(partie.PigerCarteJoueur3());
            joueur3EnAttente = true;
        }

        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }

        if(tourTermine() && !partieTerminer)
        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;

            compteurTour++;
            tour.setText("Tour "+Integer.toString(compteurTour));
        }

        if(partie.getJoueur3().getPoints() >= 21)
        {
            joueur3Depasser = true;
            joueur3Elimine.setText("Éliminé");
            conserverJoueur3.setDisable(true);
            demanderJoueur3.setDisable(true);
        }

        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }*/
    }

    @FXML
    private void handleButtonClickConserverJoueur3(ActionEvent event) {
/*
        joueur3Conserve = true;

/*        if(joueur3ConserveTourPrecedent || !joueur3Conserve){
            joueur3ConserveTourPrecedent = false;
            conserverErreur3.setText("Vous ne pouvez pas conserver deux tour de suite");

        }else if (!joueur1Conserve) {
            joueur3ConserveTourPrecedent = true;
            conserverErreur3.setText("");

        }*/
/*
        if(partieTermine())
        {
            AfficherVainqueurs(GetVainqueurs());
        }*/

        if(duel == false &&!(joueur3DernierTourConserver == tourInteger - 1))
        {
            joueur3DernierTourConserver = tourInteger;
        }
        else if(duel == true)
        {
            joueur3ConserveDuel = true;
        }

        GestionFinTour();
        GestionFinPartie();
    }

    @FXML
    private void handleButtonClickDemanderJoueur4(ActionEvent event) {
        if(!(joueur4DernierTourConserver == tourInteger) && (!joueur4DemanderCeTour) && (!joueur4Depasser) && (!joueur4ConserveDuel ))
        {
            joueur4DemanderCeTour = true;
            DonnerCarteJoueur4(partie.PigerCarteJoueur4());

            if(partie.getJoueur4().getPoints() > 21)
            {
                joueur4Depasser = true;
            }
        }

        GestionFinTour();
        GestionFinPartie();
/*
        conserverErreur4.setText("");

        if(!joueur4EnAttente && !joueur4Depasser && !joueur4Conserve && !partieTerminer)
        {
            DonnerCarteJoueur4(partie.PigerCarteJoueur4());
            joueur4EnAttente = true;
        }
        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }

        if(tourTermine() && !partieTerminer)
        {
            joueur1EnAttente = false;
            joueur2EnAttente = false;
            joueur3EnAttente = false;
            joueur4EnAttente = false;

            compteurTour++;
            tour.setText("Tour "+Integer.toString(compteurTour));
        }

        if(partie.getJoueur4().getPoints() >= 21)
        {
            joueur4Depasser = true;
            joueur4Elimine.setText("Éliminé");
            conserverJoueur4.setDisable(true);
            demanderJoueur4.setDisable(true);
        }
        if(partieTermine())
        {
            partieTerminer = true;
            AfficherVainqueurs(GetVainqueurs());
        }*/
    }

    @FXML
    private void handleButtonClickConserverJoueur4(ActionEvent event) {
/*
        joueur4Conserve = true;

/*        if(joueur4ConserveTourPrecedent || !joueur4Conserve){
            joueur4ConserveTourPrecedent = false;
            conserverErreur4.setText("Vous ne pouvez pas conserver deux tour de suite");

        }else if (!joueur1Conserve) {
            joueur4ConserveTourPrecedent = true;
            conserverErreur4.setText("");

        }*/
/*
        if(partieTermine())
        {
            AfficherVainqueurs(GetVainqueurs());
        }*/
        if(duel == false && !(joueur4DernierTourConserver == tourInteger - 1))
        {
            joueur4DernierTourConserver = tourInteger;
        }
        else if(duel == true)
        {
            joueur4ConserveDuel = true;
        }

        GestionFinTour();
        GestionFinPartie();
    }

    public void GestionFinPartie()
    {
        if(PartieTermine())
        {
            AfficherVainqueurs(GetVainqueurs());
        }
    }

    private void GestionFinTour()
    {
        if(IsTourTermine())
        {
            joueur1DemanderCeTour = false;
            joueur2DemanderCeTour = false;
            joueur3DemanderCeTour = false;
            joueur4DemanderCeTour = false;
            tourInteger++;
            tour.setText(Integer.toString(tourInteger));
        }
    }


    private boolean IsTourTermine()
    {
        return
                (joueur1DemanderCeTour || joueur1DernierTourConserver == tourInteger)
                &&
                (joueur2DemanderCeTour || joueur2DernierTourConserver == tourInteger)
                &&
                (joueur3DemanderCeTour || joueur3DernierTourConserver == tourInteger)
                &&
                (joueur4DemanderCeTour || joueur4DernierTourConserver == tourInteger);
    }


    private void GestionnairePartie()
    {
        InitializerPartie();
        JoueurCreateur factory = new JoueurCreateur();
        JoueurProduit joueur = factory.CreerJoueur(4);
    }

    private void InitializerPartie()
    {
        partie = new Partie();
        tourInteger = 1;
        tour.setText(Integer.toString(tourInteger));

         //Distribution des cartes
        DonnerCarteJoueur1(partie.PigerCarteJoueur1());
        DonnerCarteJoueur1(partie.PigerCarteJoueur1());
        DonnerCarteJoueur2(partie.PigerCarteJoueur2());
        DonnerCarteJoueur2(partie.PigerCarteJoueur2());
        DonnerCarteJoueur3(partie.PigerCarteJoueur3());
        DonnerCarteJoueur3(partie.PigerCarteJoueur3());
        DonnerCarteJoueur4(partie.PigerCarteJoueur4());
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

        this.pointJoueur1.setText(Integer.toString(this.partie.getJoueur1().getPoints()));
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

        this.pointJoueur2.setText(Integer.toString(this.partie.getJoueur2().getPoints()));
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
        this.pointJoueur3.setText(Integer.toString(this.partie.getJoueur3().getPoints()));
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

        this.pointJoueur4.setText(Integer.toString(this.partie.getJoueur4().getPoints()));
    }

    private ArrayList<String> GetVainqueurs()
    {
        int pointJoueur1Decision = joueur1Depasser ? 0 : partie.getJoueur1().getPoints();
        int pointJoueur2Decision = joueur2Depasser ? 0 : partie.getJoueur2().getPoints();
        int pointJoueur3Decision = joueur3Depasser ? 0 : partie.getJoueur3().getPoints();
        int pointJoueur4Decision = joueur4Depasser ? 0 : partie.getJoueur4().getPoints();

        int maximum = Math.max(pointJoueur1Decision, pointJoueur2Decision);
        maximum = Math.max(maximum, pointJoueur3Decision);
        maximum = Math.max(maximum, pointJoueur4Decision);

        ArrayList<String> lesVainqueurs = new ArrayList<String>();

        if( pointJoueur1Decision == maximum)
        {
            lesVainqueurs.add(joueur1.getText());
        }
        if(pointJoueur2Decision == maximum)
        {
            lesVainqueurs.add(joueur2.getText());
        }
        if(pointJoueur3Decision == maximum)
        {
            lesVainqueurs.add((joueur3.getText()));
        }
        if(pointJoueur4Decision == maximum)
        {
            lesVainqueurs.add(joueur4.getText());
        }

        return lesVainqueurs;
    }

    private void AfficherVainqueurs(ArrayList<String> listeVainqueurs)
    {
        String vainqueurs = "VAINQUEUR  \n";

        for (String v: listeVainqueurs)
        {
            vainqueurs += v;
            vainqueurs += "\n";
        }

        gagnant.setText(vainqueurs);
    }

    private boolean PartieTermine()
    {
        return
                ( joueur1Depasser || joueur1ConserveDuel)
                &&
                ( joueur2Depasser || joueur2ConserveDuel)
                &&
                ( joueur3Depasser || joueur3ConserveDuel)
                &&
                ( joueur4Depasser || joueur4ConserveDuel);
    }

    @FXML
    private void initialize() {
        demanderJoueur1.setOnAction(this::handleButtonClickDemanderJoueur1);
        demanderJoueur2.setOnAction(this::handleButtonClickDemanderJoueur2);
        demanderJoueur3.setOnAction(this::handleButtonClickDemanderJoueur3);
        demanderJoueur4.setOnAction(this::handleButtonClickDemanderJoueur4);

        conserverJoueur1.setOnAction(this::handleButtonClickConserverJoueur1);
        conserverJoueur2.setOnAction(this::handleButtonClickConserverJoueur2);
        conserverJoueur3.setOnAction(this::handleButtonClickConserverJoueur3);
        conserverJoueur4.setOnAction(this::handleButtonClickConserverJoueur4);

        croupier.setImage(new Image("/images/croupier.png"));
        paquetDeCartes.setImage(new Image("/images/paquetdecartes.png"));

        GestionnairePartie();
    }
}
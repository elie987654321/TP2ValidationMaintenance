package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameController extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Choix des noms");

        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("../view/ChoixDesNoms.fxml"));

        Scene scene = new Scene(fxmlLoader1.load(), 674, 443);
        primaryStage.setScene(scene);
        primaryStage.show();
/*
        //===
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Jeu du 21");

        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("/view/Game.fxml"));

        Scene scene2 = new Scene(fxmlLoader2.load(), 1320, 919);
        secondaryStage.setScene(scene2);
        secondaryStage.show();
*/

    }




    public static void main(String args[]) {
        launch(args);
/*
        Scanner scanner = new Scanner(System.in);
        String rejouer = "";

        do {
            // Phase 1
            String entree = "";
            // Initialisation de la partie
            Partie partie = new Partie();
            partie.DistribuerCartesInitials();

            // Premieres cartes du banquier
            System.out.println("Jeu du banquier :");
            for (int i = 0; i < partie.getBanquier().getMainDu21().size(); i++) {
                System.out.println(i+1+" - "+partie.getBanquier().getMainDu21().get(i));
            }
            if (partie.getBanquier().getPoints() > 21){
                System.out.println("valeur du jeu 21: "+ partie.getBanquier().getPoints()+ " -> "+ "21 est depassé.\n");
            }else {
                System.out.println("valeur du jeu 21: "+ partie.getBanquier().getPoints()+ " -> "+ (21 - partie.getBanquier().getPoints())+ " pour depasser.\n");
            }

            // Premieres cartes du joueur
            System.out.println("Votre jeu:");
            for (int i = 0; i < partie.getJoueur().getMainDu21().size(); i++) {
                System.out.println(i+1+" - "+partie.getJoueur().getMainDu21().get(i));
            }
            if (partie.getJoueur().getPoints() > 21){
                System.out.println("valeur du jeu 21: "+ partie.getJoueur().getPoints()+ " -> "+ "21 est depassé.\n");
            }else {
                System.out.println("valeur du jeu 21: "+ partie.getJoueur().getPoints()+ " -> "+ (21 - partie.getJoueur().getPoints())+ " pour depasser.\n");
            }


            // Un vainqueur?
            String message = "";

            if (partie.getBanquier().getPoints() == 21 || partie.getJoueur().getPoints() > 21){
                message = "Le banquier a gagné !";

            } else if (partie.getJoueur().getPoints() == 21 || partie.getBanquier().getPoints() > 21) {
                message = "Vous avez gagné !";

            }

            // Phase 2
            if (message.equals("")){

                // Entrée du joueur
                do{
                    System.out.println("(c)onserver son jeu ou (d)emander une carte ?");
                    entree = scanner.nextLine();

                    if(entree.equals("d")){
                        partie.PigerCarteJoueur();
                        for (int i = 0; i < partie.getJoueur().getMainDu21().size(); i++) {
                            System.out.println(i+1+" - "+partie.getJoueur().getMainDu21().get(i));
                        }
                        if (partie.getJoueur().getPoints() > 21){
                            System.out.println("valeur du jeu 21: "+ partie.getJoueur().getPoints()+ " -> "+ "21 est depassé.\n");
                        }else {
                            System.out.println("valeur du jeu 21: "+ partie.getJoueur().getPoints()+ " -> "+ (21 - partie.getJoueur().getPoints())+ " pour depasser.\n");
                        }
                    }
                }
                while (!entree.equals("c") && !(partie.getJoueur().getPoints() > 21) && !(partie.getJoueur().getPoints() == 21));

                // Phase 3
                if(!(partie.getBanquier().getPoints() > partie.getJoueur().getPoints()) && !(partie.getJoueur().getPoints() > 21) && !(partie.getBanquier().getPoints() == partie.getJoueur().getPoints())) {
                    System.out.println("Le banquier pige...");
                    do {
                        partie.PigerCarteBanquier();

                    }
                    while (!(partie.getBanquier().getPoints() == 21) && !(partie.getBanquier().getPoints() > partie.getJoueur().getPoints()));

                    for (int i = 0; i < partie.getBanquier().getMainDu21().size(); i++) {
                        System.out.println(i + 1 + " - " + partie.getBanquier().getMainDu21().get(i));
                    }
                    System.out.println("Le banquier a "+ partie.getBanquier().getPoints());
                }
            }
            else {
                System.out.println(message);
            }
            if (message.equals("")){
                char vainqueur = partie.DeciderVainqueur();
                if (vainqueur == 'J'){
                    System.out.println("Vous avez gagné !");
                }
                else {
                    System.out.println("Le banquier a gagné !");
                }
            }

            do {
                // Rejouer?
                System.out.println("\nVoulez-vous jouer une autre partie ? (o/n)");
                rejouer = scanner.nextLine();
            }
            while(!rejouer.equals("o") && !rejouer.equals("n"));

        }
        while (rejouer.equals("o"));
*/
    }
}

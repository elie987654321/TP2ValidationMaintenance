package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChoixDesNomsController {


    @FXML
    private TextField nomJoueur1;
    @FXML
    private TextField nomJoueur2;
    @FXML
    private TextField nomJoueur3;
    @FXML
    private TextField nomJoueur4;
    @FXML
    private Button commencer;

    @FXML
    private void handleButtonClickCommencer(ActionEvent event) {
        try{
            Stage primaryStage = new Stage();

            primaryStage.setTitle("Jeu du 21");

            FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/view/Game.fxml"));
            Scene scene = new Scene(fxmlLoader1.load());
            GameGraphicalController gameGraphicalController = (GameGraphicalController) fxmlLoader1.getController();

            // Validation des noms
            int i = 0;

            if(nomJoueur1.getText() != "" && !nomJoueur1.getText().equals(nomJoueur2.getText()) && !nomJoueur1.getText().equals(nomJoueur3.getText()) && !nomJoueur1.getText().equals(nomJoueur4.getText())){
                gameGraphicalController.joueur1.setText(nomJoueur1.getText());
                i++;
            }

            if(nomJoueur2.getText() != "" && !nomJoueur2.getText().equals(nomJoueur1.getText()) && !nomJoueur2.getText().equals(nomJoueur3.getText()) && !nomJoueur2.getText().equals(nomJoueur4.getText())){
                gameGraphicalController.joueur2.setText(nomJoueur2.getText());
                i++;
            }

            if(nomJoueur3.getText() != "" && !nomJoueur3.getText().equals(nomJoueur1.getText()) && !nomJoueur3.getText().equals(nomJoueur2.getText()) && !nomJoueur3.getText().equals(nomJoueur4.getText())){
                gameGraphicalController.joueur3.setText(nomJoueur3.getText());
                i++;
            }

            if(nomJoueur4.getText() != "" && !nomJoueur4.getText().equals(nomJoueur1.getText()) && !nomJoueur4.getText().equals(nomJoueur2.getText()) && !nomJoueur4.getText().equals(nomJoueur3.getText())){
                gameGraphicalController.joueur4.setText(nomJoueur4.getText());
                i++;
            }
            
            if(i==4){
                primaryStage.setScene(scene);
                primaryStage.show();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChoixDesNomsGraphicalController {

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
    private void handleButtonClickCommencer(ActionEvent event) throws Exception {
        try{
            Stage primaryStage = new Stage();

            primaryStage.setTitle("Jeu du 21");

            FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/view/Game.fxml"));
            Scene scene = new Scene(fxmlLoader1.load());

            primaryStage.setScene(scene);
            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

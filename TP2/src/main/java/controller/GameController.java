package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameController extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Choix des noms");

        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/view/ChoixDesNoms.fxml"));

        Scene scene = new Scene(fxmlLoader1.load());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}

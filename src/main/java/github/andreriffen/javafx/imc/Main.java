package github.andreriffen.javafx.imc;

import github.andreriffen.javafx.imc.plugin.javafx.fxml.FXMLLoader;
import github.andreriffen.javafx.imc.plugin.javafx.scene.Parent;
import github.andreriffen.javafx.imc.plugin.javafx.scene.Scene;
import github.andreriffen.javafx.imc.plugin.javafx.stage.Stage;
import github.andreriffen.javafx.imc.plugin.javafx.application.Application;

import java.io.IOException;

/**
 *
 * @author Andre Riffen
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
        } catch (IOException ex) {
            System.out.println("N�o foi poss�vel carregar o formul�rio");
        }

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Incr�vel Calculadora de IMC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

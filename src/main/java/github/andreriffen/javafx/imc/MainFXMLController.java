package github.andreriffen.javafx.imc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author Andr� Riffen
 */
public class MainFXMLController implements Initializable {

    @FXML
    private TextField tfPeso;
    @FXML
    private TextField tfAltura;
    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnLimpar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtnCalcular(ActionEvent event) {
        try {
            double peso = Double.parseDouble(tfPeso.getText());
            double altura = Double.parseDouble(tfAltura.getText().replace(",", ".")); // Tratamento para substituir v�rgula por ponto
            double imc = calcularIMC(peso, altura);
            exibirResultado(imc);
        } catch (NumberFormatException e) {
            exibirAlerta("Erro", "Por favor, insira valores v�lidos para peso e altura.");
        }
    }

    @FXML
    private void handleBtnLimpar(ActionEvent event) {
        tfPeso.setText("");
        tfAltura.setText("");
    }

    private double calcularIMC(double peso, double altura) {
        // F�rmula do IMC: IMC = peso / (altura * altura)
        return peso / (altura * altura);
    }

    private void exibirResultado(double imc) {
        String mensagem = String.format("Seu IMC �: %.2f", imc);
        exibirAlerta("Resultado", mensagem);
    }

    private void exibirAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}

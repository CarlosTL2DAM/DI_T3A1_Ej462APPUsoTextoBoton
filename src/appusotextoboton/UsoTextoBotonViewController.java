/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Carlos Torres Liñán
 */
public class UsoTextoBotonViewController implements Initializable {

    @FXML
    private Label resultado;
    @FXML
    private CampoTextoBoton campotexto1;
    @FXML
    private CampoTextoBoton campotexto2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void pulsadoBoton1(ActionEvent event) {
        resultado.setText("Se ha grabado: " + campotexto1.getText());
    }

    @FXML
    private void pulsadoBoton2(ActionEvent event) {
        resultado.setText("Se ha grabado: " + campotexto2.getText());
    }
       
}

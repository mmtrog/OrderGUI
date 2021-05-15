package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mySQL.dataCDPlay;

public class playCDController {

    @FXML private Button backHome;

    @FXML
    public void backHomeAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));        
        Stage window = (Stage) backHome.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
    

    @FXML private TextField textInput;
    @FXML private Button btnConfirm;
    @FXML private Button nextButton;
    @FXML private Button previousButton;
    @FXML private Label label;
    

    @FXML
    public void btnConfirmAction() {
        label.setText(dataCDPlay.getData(textInput.getText()));
    }

    @FXML 
    public void btnNextAction() {
        int count;
        if(textInput.getText().equals("")) {
            count = 0;
        }
        else {
            count = Integer.parseInt(textInput.getText());
        }
        count++;
        textInput.setText(Integer.toString(count));
        btnConfirmAction();
    }

    @FXML 
    public void btnPreviousAction() {
        int count;
        if(textInput.getText().equals("")) {
            count = 0;
        }
        else {
            count = Integer.parseInt(textInput.getText());
            if (count <= 0) {
            }
            else {
                count--;
                textInput.setText(Integer.toString(count));
                btnConfirmAction();
            }
        }
    }
    
}

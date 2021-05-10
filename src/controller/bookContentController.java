package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mySQL.dataBookContent;

public class bookContentController {

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
    @FXML private TextArea content;


    @FXML
    public void btnConfirmAction() {
        content.setText(dataBookContent.getData(textInput.getText()));
    }


    
}

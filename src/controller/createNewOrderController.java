package controller;

import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class createNewOrderController {
    
    @FXML private Button backHome;

    @FXML
    public void backHomeAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));        
        Stage window = (Stage) backHome.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
}

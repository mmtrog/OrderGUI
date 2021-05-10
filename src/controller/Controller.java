package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Controller{
    
    
    @FXML private Button exitButton;
    @FXML
    public void exitButtonAction() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @FXML private MenuButton Book;
    
    @FXML
    public void bookContentAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BookContent.fxml"));        
        Stage window = (Stage) Book.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }


    @FXML 
    public void listOfBookAction() throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("BookList.fxml"));        
        Stage window = (Stage) Book.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
    
    @FXML private MenuButton manageOrdersButton;
    
    @FXML 
    public void createNewOrderAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CreateNewOrder.fxml"));        
        Stage window = (Stage) manageOrdersButton.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }   

    @FXML 
    public void listItemOfOrderAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ListItemOfOrder.fxml"));        
        Stage window = (Stage) manageOrdersButton.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

} 
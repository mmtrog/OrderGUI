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
    
    // Exit
    @FXML private Button exitButton;
    @FXML
    public void exitButtonAction() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }


    // Book
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
    

    // DVD
    @FXML private MenuButton dvd;
    @FXML
    public void listOfDVDAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DVDList.fxml"));        
        Stage window = (Stage) Book.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    } 
    @FXML
    public void playDVDAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PlayDVD.fxml"));        
        Stage window = (Stage) Book.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    // CD
    @FXML private MenuButton cd;
    @FXML
    public void listOfCDAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CDList.fxml"));        
        Stage window = (Stage) Book.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
    @FXML
    public void listOfTrackAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TrackList.fxml"));        
        Stage window = (Stage) Book.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
    @FXML
    public void playTrackAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PlayCD.fxml"));        
        Stage window = (Stage) Book.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    // Manage Orders 
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

    
    // Manage Items 
    @FXML MenuButton manageItemsButton;



}

    
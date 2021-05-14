package controller;

import mySQL.*;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import media.disc.DigitalVideoDisc;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class dvdListController implements Initializable{

    @FXML private Button backHome;

    @FXML
    public void backHomeAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));        
        Stage window = (Stage) backHome.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    

    @FXML private TableView<DigitalVideoDisc> table;
    @FXML private TableColumn<DigitalVideoDisc, Integer> id; 
    @FXML private TableColumn<DigitalVideoDisc, String> title;
    @FXML private TableColumn<DigitalVideoDisc, String> category;
    @FXML private TableColumn<DigitalVideoDisc, String> director;
    @FXML private TableColumn<DigitalVideoDisc, Float> length;
    @FXML private TableColumn<DigitalVideoDisc, Float> cost;


    @Override
    public void initialize(URL location, ResourceBundle resource) {
        
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        director.setCellValueFactory(new PropertyValueFactory<>("director"));
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        length.setCellValueFactory(new PropertyValueFactory<>("length"));
        
        ObservableList<DigitalVideoDisc> list = dataDVDList.getData();
        table.setItems(list);
    }
}
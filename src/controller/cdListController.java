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
import media.disc.CompactDisc;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class cdListController implements Initializable{

    @FXML private Button backHome;

    @FXML
    public void backHomeAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));        
        Stage window = (Stage) backHome.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    

    @FXML private TableView<CompactDisc> table;
    @FXML private TableColumn<CompactDisc, Integer> id; 
    @FXML private TableColumn<CompactDisc, String> title;
    @FXML private TableColumn<CompactDisc, String> category;
    @FXML private TableColumn<CompactDisc, String> director;
    @FXML private TableColumn<CompactDisc, String> artist;
    @FXML private TableColumn<CompactDisc, Float> length;
    @FXML private TableColumn<CompactDisc, Float> cost;


    @Override
    public void initialize(URL location, ResourceBundle resource) {
        
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        director.setCellValueFactory(new PropertyValueFactory<>("director"));
        artist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        length.setCellValueFactory(new PropertyValueFactory<>("length"));
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        
        ObservableList<CompactDisc> list = dataCDList.getData();
        table.setItems(list);
    }
}
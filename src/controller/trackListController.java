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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import media.disc.Track;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class trackListController implements Initializable {

    @FXML private Button backHome;

    @FXML
    public void backHomeAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));        
        Stage window = (Stage) backHome.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    @FXML private TableView<Track> table;
    @FXML private TableColumn<Track, Integer> id;
    @FXML private TableColumn<Track, String> title;
    @FXML private TableColumn<Track, Float> length;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        length.setCellValueFactory(new PropertyValueFactory<>("length"));
        
        ObservableList<Track> list = dataTrackList.getData();
        table.setItems(list);
    }
}
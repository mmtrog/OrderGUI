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
import media.Book;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class bookListController implements Initializable{

    @FXML private Button backHome;

    @FXML
    public void backHomeAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));        
        Stage window = (Stage) backHome.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    

    @FXML private TableView<Book> table;
    @FXML private TableColumn<Book, Integer> id; 
    @FXML private TableColumn<Book, String> title;
    @FXML private TableColumn<Book, String> category;
    @FXML private TableColumn<Book, String> authorsList;
    @FXML private TableColumn<Book, Float> cost;


    @Override
    public void initialize(URL location, ResourceBundle resource) {
        
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        authorsList.setCellValueFactory(new PropertyValueFactory<>("authorsList"));
        
        ObservableList<Book> list = dataBookList.getData();
        table.setItems(list);
    }
}
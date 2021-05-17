package controller;

import mySQL.*;

import java.sql.*;
import java.util.Iterator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import media.Media;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class orderController {
    private Float totalCostCount = 0f;

    static final String DB_URL = "jdbc:mysql://localhost:3306/prj_aims";
    static final String USER = "root";
    static final String PASS = "Qu@nghuy123";

    private ObservableList<Media> tableOrder = FXCollections.observableArrayList();

    @FXML private Button backHome;

    @FXML
    public void backHomeAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));        
        Stage window = (Stage) backHome.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    @FXML private RadioButton bookRadioButton;
    @FXML private RadioButton dvdRadioButton;
    @FXML private RadioButton cdRadioButton;

    @FXML private RadioButton bookRadioButton1;
    @FXML private RadioButton dvdRadioButton1;
    @FXML private RadioButton cdRadioButton1;
    

    @FXML private TextField addMedia;
    @FXML private TextField removeMedia;
    @FXML private TextField totalCost;

    @FXML private Button addMediaButton;
    @FXML private Button removeMediaButton;

    @FXML private TableView<Media> table = new TableView<Media>();
    @FXML private TableColumn<Media, Integer> id; 
    @FXML private TableColumn<Media, String> type;
    @FXML private TableColumn<Media, String> title;
    @FXML private TableColumn<Media, String> category;
    @FXML private TableColumn<Media, Float> cost;


    public ObservableList<Media> getData(String type, String id) {
        ObservableList<Media> list = FXCollections.observableArrayList();
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id, type, title, category, cost from media where type = " + "'" + type + "' " + "and id = " + id)
            ) 
            {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    list.add(new Media(rs.getInt("id"), rs.getString("type"), rs.getString("title"), rs.getString("category"), rs.getFloat("cost")));
                }
            } 
            catch (SQLException e) {
                System.out.println("Oops, error!");
                e.printStackTrace();
            }
        return list;
    }

    @FXML 
    public void addMedia() {
        String typeChoose = "";
        if (bookRadioButton.isSelected()) {
            typeChoose = "book";   
        }
        if (dvdRadioButton.isSelected()) {
            typeChoose = "dvd";   
        }
        if (cdRadioButton.isSelected()) {
            typeChoose = "cd";   
        }

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        
        ObservableList<Media> data = this.getData(typeChoose, addMedia.getText());
        tableOrder.addAll(data);
        table.setItems(tableOrder);

        Float count = 0f;
        Iterator<Media> iterator = tableOrder.iterator();
        while (iterator.hasNext()) {
            Media mediaCheck = (Media)iterator.next();
            count += mediaCheck.getCost();
        }
        totalCostCount = count;
        totalCost.setText(Float.toString(totalCostCount));
    }

    @FXML
    public void removeMedia() {
        String typeChoose = "";
        if (bookRadioButton1.isSelected()) {
            typeChoose = "book";   
        }
        if (dvdRadioButton1.isSelected()) {
            typeChoose = "dvd";   
        }
        if (cdRadioButton1.isSelected()) {
            typeChoose = "cd";   
        }


        Iterator<Media> iterator = tableOrder.iterator();
        while (iterator.hasNext()) {
            Media mediaCheck = (Media)iterator.next();
            if (mediaCheck.getType().equals(typeChoose) && mediaCheck.getId() == Integer.parseInt(removeMedia.getText())) {
                iterator.remove();
                totalCostCount -= mediaCheck.getCost();
                break;
            }
        }

        if (tableOrder.isEmpty()) {
            totalCostCount = 0f;
        }

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        table.setItems(tableOrder);

        totalCost.setText(Float.toString(totalCostCount));
    }
}
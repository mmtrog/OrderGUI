import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Order Application");
        Parent homeRoot = FXMLLoader.load(getClass().getResource("controller/home.fxml"));
        Scene home = new Scene(homeRoot);
        primaryStage.setScene(home);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

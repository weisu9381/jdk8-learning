package fx.jfxBrowser.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class Main extends Application {

    private static String FXML = "/fxml/";

    private static Stage stage;
    /**共享视图*/
    private static StackPane stackPane = new StackPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource(FXML + "MainFXML.fxml"));
        stackPane.getChildren().add(root);

        Scene scene = new Scene(stackPane);
        primaryStage.setTitle("JFX Browser");
        primaryStage.setScene(scene);
        primaryStage.show();
        stage = primaryStage;
        Notifications.create().title("Pin Activation").text("You are going to access Pro-Verion.").hideAfter(Duration.seconds(3)).showInformation();
    }

    public Stage getStage(){
        return stage;
    }

    public StackPane getStackPane(){return stackPane;}

    public static void main(String[] args) {
        launch(args);
    }
}

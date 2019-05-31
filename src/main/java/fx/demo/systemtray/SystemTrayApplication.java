package fx.demo.systemtray;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * 目的: 窗口最小化,再执行关闭窗口的操作, 整个stage就起不来了
 */
public class SystemTrayApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button= new Button("你好啊");
        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(300.0);
        primaryStage.setHeight(200.0);
        primaryStage.setX(1000);
        primaryStage.setY(800);

        primaryStage.show();
        MySystemTray.getInstance().listen(primaryStage);
        primaryStage.setOnCloseRequest(event -> {
            MySystemTray.getInstance().hide(primaryStage);
            if(primaryStage.isIconified()){
                primaryStage.setIconified(false);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}

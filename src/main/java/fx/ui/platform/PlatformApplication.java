package fx.ui.platform;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class PlatformApplication extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                System.out.printf("开启线程：当前线程名字是:"+ Thread.currentThread().getName());
                for(int i = 0; i < 100; i++){
                        System.out.println("i="+i);
                }
                Platform.exit();
            }
        });
        System.out.printf("开启线程:"+ Thread.currentThread().getName());
        Platform.setImplicitExit(false);
        primaryStage.show();

    }
}

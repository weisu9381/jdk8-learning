package fx.test;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 窗口 Stage
 */
public class StageTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("窗口的标题");
        primaryStage.getIcons().add(new Image("/static/fx/shield.png")); //设置窗口图标
        //primaryStage.setIconified(true); //最小化
        //primaryStage.setMaximized(true); //最大化
        primaryStage.close();  //关闭窗口
        primaryStage.setWidth(500); //宽
        primaryStage.setHeight(400); //高
        primaryStage.setResizable(true);  //设置窗口大小是否可调整
        primaryStage.setMaxWidth(800);
        primaryStage.setMaxHeight(700);
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {  //监听窗口高度变化
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("旧值: "+oldValue+",新值: " + newValue);
                System.out.println("当前高度是:" + primaryStage.getHeight());
            }
        });
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {  //监听窗口宽度变化
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("旧值: "+oldValue+",新值: " + newValue);
                System.out.println("当前宽度是:" + primaryStage.getWidth());
            }
        });
        primaryStage.show();  //显示窗口
    }
    public static void main(String[] args){
        launch(args);
    }
}

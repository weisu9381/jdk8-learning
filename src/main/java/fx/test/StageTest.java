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
        primaryStage.setOpacity(0.5); //设置透明度
        primaryStage.setAlwaysOnTop(true); //窗口置顶
        primaryStage.setX(100);  //窗口左上角位置
        primaryStage.setY(100);  //窗口右上角位置
        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {  //监听窗口高度变化
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前高度是:" + primaryStage.getHeight());
            }
        });
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {  //监听窗口宽度变化
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前宽度是:" + primaryStage.getWidth());
            }
        });
        primaryStage.xProperty().addListener(new ChangeListener<Number>() {  //监听窗口位置变化
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前x是:" + primaryStage.getX());
            }
        });
        primaryStage.yProperty().addListener(new ChangeListener<Number>() {  //监听窗口位置变化
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前y是:" + primaryStage.getY());
            }
        });
        primaryStage.show();  //显示窗口
    }
    public static void main(String[] args){
        launch(args);
    }
}

package es.ieslosmontecillos.di_t1a1_shanshangfeng;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*
 * @author: Shangfeng Shan
 * @date:  ${date}
 * */
public class Form_FXCSS extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //cargar el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        //crear la escena y aplicar el CSS
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

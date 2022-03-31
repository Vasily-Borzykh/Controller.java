package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

//public class Main extends Application {
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) {
//        VBox vbox = new VBox(20);
//        Scene scene = new Scene(vbox, 400, 400);
//        stage.setScene(scene);
//        DatePicker startDatePicker = new DatePicker();
//        DatePicker endDatePicker = new DatePicker();
//
//        startDatePicker.setValue(LocalDate.now());
//        endDatePicker.setValue(startDatePicker.getValue().plusDays(1));
//
//        vbox.getChildren().add(new Label("Start Date:"));
//        vbox.getChildren().add(startDatePicker);
//        vbox.getChildren().add(new Label("End Date:"));
//        vbox.getChildren().add(endDatePicker);
//        stage.show();
//    }
//}

public class Main extends Application {

    int clicks = 0;



    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/app.fxml"));
        Scene scene = new Scene(root, 900, 900);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("sample/Icon.png"));;
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}



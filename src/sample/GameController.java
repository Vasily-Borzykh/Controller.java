package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;

public class GameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button free;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button exit;

    @FXML
    void initialize() {
        one.setOnAction(event -> {
        });
        two.setOnAction(event -> {
            System.out.println("2");
        });
        free.setOnAction(event -> {
            System.out.println("3");
        });
        exit.setOnAction(event -> {
            System.exit(0);
        });

    }

}

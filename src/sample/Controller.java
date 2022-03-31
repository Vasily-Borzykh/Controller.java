package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Controller {

    int m = 2;
    int dayLeft = 0;
    int dayRight = 5;
    int days = 1;
    int totalDays = 0;
    int needJ = 0;
    int danyaJ = 0;
    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane gridpane;

    @FXML
    private Text month;

    @FXML
    private Text totalDays1;

    @FXML
    private Button right;

    @FXML
    private Button left;


    @FXML
    void initialize() {
        gridpane.add(new Label("понедельник"), 0, 0);
        gridpane.add(new Label("вторник"), 1, 0);
        gridpane.add(new Label("среда"), 2, 0);
        gridpane.add(new Label("четверг"), 3, 0);
        gridpane.add(new Label("пятница"), 4, 0);
        gridpane.add(new Label("суббота"), 5, 0);
        gridpane.add(new Label("воскресенье"), 6, 0);
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        month.setText(months[m]);
        if (months[m] == "январь" || months[m] == "март" || months[m] == "май" || months[m] == "июль" || months[m] == "август" || months[m] == "октябрь" || months[m] == "декабрь") {
            month.setText(months[m]);
            for (int i = 1; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (days < 32) {
                        if (i == 1 && j < dayRight) {
                            j = dayRight;
                        }
                        if (days == 1) {
                            danyaJ = j;
                        }
                        gridpane.add(new Text("" + days), j, i);
                        days++;
                        needJ = j;
                    }
                }
            }
            dayRight = needJ + 1;
            if (dayRight == 7) {
                dayRight = 0;
            }
            totalDays -= days + 1;
            days = 1;
            dayLeft = needJ - 3;
            if(dayLeft == -1) {
                dayLeft = 6;
            }
            if(dayLeft == -2) {
                dayLeft = 5;
            }
            if(dayLeft == -3) {
                dayLeft = 4;
            }
        }
        if (months[m] == "апрель" || months[m] == "июнь" || months[m] == "ноябрь" || months[m] == "сентябрь") {
            month.setText(months[m]);
            for (int i = 1; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (days < 31) {
                        if (i == 1 && j < dayRight) {
                            j = dayRight;
                        }
                        if (days == 1) {
                            danyaJ = j;
                        }
                        gridpane.add(new Text("" + days), j, i);
                        days++;
                        needJ = j;
                    }
                }
            }
            dayRight = needJ + 1;
            if (dayRight == 7) {
                dayRight = 0;
            }
            totalDays -= days + 1;
            days = 1;
            dayLeft = needJ - 2;
            if(dayLeft == -1) {
                dayLeft = 6;
            }
            if(dayLeft == -2) {
                dayLeft = 5;
            }
        }
        if (months[m] == "февраль") {
            month.setText(months[m]);
            for (int i = 1; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (days < 29) {
                        if (i == 1 && j < dayRight) {
                            j = dayRight;
                        }
                        if (days == 1) {
                            danyaJ = j;
                        }
                        gridpane.add(new Text("" + days), j, i);
                        days++;
                        needJ = j;
                    }
                }
            }
            dayRight = needJ + 1;
            if (dayRight == 7) {
                dayRight = 0;
            }
            totalDays -= days + 1;
            days = 1;
            dayLeft = needJ;
        }
        right.setOnAction(actionEvent -> {
            m++;
            if (m == 12) {
                m = 0;
            }
            gridpane.getChildren().clear();
            if (months[m] == "январь" || months[m] == "март" || months[m] == "май" || months[m] == "июль" || months[m] == "август" || months[m] == "октябрь" || months[m] == "декабрь") {
                month.setText(months[m]);
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (days < 32) {
                            if (i == 1 && j < dayRight) {
                                j = dayRight;
                            }
                            if (days == 1) {
                                danyaJ = j;
                            }
                            gridpane.add(new Text("" + days), j, i);
                            days++;
                            needJ = j;
                        }
                    }
                }
                dayRight = needJ + 1;
                if (dayRight == 7) {
                    dayRight = 0;
                }
                totalDays -= days + 1;
                days = 1;
                dayLeft = needJ - 3;
                if (dayLeft == -1) {
                    dayLeft = 6;
                }
                if (dayLeft == -2) {
                    dayLeft = 5;
                }
                if (dayLeft == -3) {
                    dayLeft = 4;
                }
            }
            if (months[m] == "апрель" || months[m] == "июнь" || months[m] == "ноябрь" || months[m] == "сентябрь") {
                month.setText(months[m]);
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (days < 31) {
                            if (i == 1 && j < dayRight) {
                                j = dayRight;
                            }
                            if (days == 1) {
                                danyaJ = j;
                            }
                            gridpane.add(new Text("" + days), j, i);
                            days++;
                            needJ = j;
                        }
                    }
                }
                dayRight = needJ + 1;
                if (dayRight == 7) {
                    dayRight = 0;
                }
                totalDays -= days + 1;
                days = 1;
                dayLeft = needJ - 2;
                if (dayLeft == -1) {
                    dayLeft = 6;
                }
                if (dayLeft == -2) {
                    dayLeft = 5;
                }
            }
            if (months[m] == "февраль") {
                month.setText(months[m]);
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (days < 29) {
                            if (i == 1 && j < dayRight) {
                                j = dayRight;
                            }
                            if (days == 1) {
                                danyaJ = j;
                            }
                            gridpane.add(new Text("" + days), j, i);
                            days++;
                            needJ = j;
                        }
                    }
                }
                dayRight = needJ + 1;
                if (dayRight == 7) {
                    dayRight = 0;
                }
                totalDays -= days + 1;
                days = 1;
                dayLeft = needJ;
            }
            totalDays1.setText("" + totalDays);
        });
        left.setOnAction(actionEvent -> {
            m--;
            if (m == -1) {
                m = 11;
            }
            Node node = new Node();
            gridpane.getChildren().clear();
            if (months[m] == "январь" || months[m] == "март" || months[m] == "май" || months[m] == "июль" || months[m] == "август" || months[m] == "октябрь" || months[m] == "декабрь") {
                month.setText(months[m]);
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (days < 32) {
                            if (i == 1 && j < dayLeft) {
                                j = dayLeft;
                            }
                            if (days == 1) {
                                danyaJ = j;
                            }
                            gridpane.add(new Text("" + days), j, i);
                            days++;
                            needJ = j;
                        }
                    }
                }
                dayRight = needJ + 1;
                if (dayRight == 7) {
                    dayRight = 0;
                }
                totalDays -= days + 1;
                days = 1;
                dayLeft = needJ - 3;
                if (dayLeft == -1) {
                    dayLeft = 6;
                }
                if (dayLeft == -2) {
                    dayLeft = 5;
                }
                if (dayLeft == -3) {
                    dayLeft = 4;
                }
            }
            if (months[m] == "апрель" || months[m] == "июнь" || months[m] == "ноябрь" || months[m] == "сентябрь") {
                month.setText(months[m]);
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (days < 31) {
                            if (i == 1 && j < dayLeft) {
                                j = dayLeft;
                            }
                            if (days == 1) {
                                danyaJ = j;
                            }
                            gridpane.add(new Text("" + days), j, i);
                            days++;
                            needJ = j;
                        }
                    }
                }
                dayRight = needJ + 1;
                if (dayRight == 7) {
                    dayRight = 0;
                }
                totalDays -= days + 1;
                days = 1;
                dayLeft = needJ - 2;
                if (dayLeft == -1) {
                    dayLeft = 6;
                }
                if (dayLeft == -2) {
                    dayLeft = 5;
                }
            }
            if (months[m] == "февраль") {
                month.setText(months[m]);
                for (int i = 1; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (days < 29) {
                            if (i == 1 && j < dayLeft) {
                                j = dayLeft;
                            }
                            if (days == 1) {
                                danyaJ = j;
                            }
                            gridpane.add(new Text("" + days), j, i);
                            days++;
                            needJ = j;
                        }
                    }
                }
                dayRight = needJ + 1;
                if (dayRight == 7) {
                    dayRight = 0;
                }
                totalDays -= days + 1;
                days = 1;
                dayLeft = needJ;
            }
            totalDays1.setText("" + totalDays);
        });
    }
}




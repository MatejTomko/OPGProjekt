package Klient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class KlientController {
    @FXML public TextField server_ip;
    @FXML public TextField port;
    @FXML public TextField name;
    @FXML public String sPort;



    public void onClick() throws IOException {
        System.out.println("Clicked");
        Data.ip = server_ip.getText();
        this.sPort = port.getText();
        Data.name = name.getText();
        Data.port = Integer.parseInt(sPort);


        Stage stage;
        stage = (Stage) server_ip.getScene().getWindow();
        //Parent parent = FXMLLoader.load(getClass().getResource("room.fxml"));
        Parent root = FXMLLoader.load(Prihlasenie.class.getResource("room.fxml"));
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle(Data.name);
        stage.setOnCloseRequest(e-> {
            //e.consume();
            Room.th.stop();
            System.exit(0);
        });
        stage.setResizable(false);

        stage.show();
    }
    public void OnAction(ActionEvent event) {
    }



}
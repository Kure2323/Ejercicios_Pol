package org.example.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.nio.Buffer;

public class HelloController {

    static int contador;


    @FXML
    private Label welcomeText;

    @FXML
    private Button sumar1;
    @FXML
    private Label contador_etiqueta;

    public void irAPantalla2() throws IOException {
        HelloApplication.setRoot("pantalla2");
    }


    @FXML
    public void initialize() {

        Contador contador = new Contador();

        sumar1.setOnAction(e -> {
            contador.contar();
            System.out.println(contador.getContador());
            contador_etiqueta.setText(Integer.toString(contador.getContador()));

        });

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
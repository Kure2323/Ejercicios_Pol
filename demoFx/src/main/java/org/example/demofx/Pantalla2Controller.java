package org.example.demofx;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Pantalla2Controller {


    public void irAPantallaAnterior() throws IOException {
        HelloApplication.setRoot("hello-view");
    }

    private ObservableList<Bocadillo> listaBocadillos = FXCollections.observableArrayList();

    @FXML
    private TextField nombreTextField;
    @FXML
    private TextField precioTextField;
    @FXML
    private TableColumn<Bocadillo,String> nombreTable;
    @FXML
    private TableColumn<Bocadillo,Double> precioTable;
    @FXML
    private TableView<Bocadillo> tablaBocadillos;


    @FXML
    public void initialize() {
        // enlazamos columnas con propiedades del objeto Persona
        nombreTable.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        precioTable.setCellValueFactory(data -> new javafx.beans.property.SimpleDoubleProperty(data.getValue().getPrecio()).asObject());

        // asignamos la lista al TableView
        tablaBocadillos.setItems(listaBocadillos);
    }

    public void guardarBocadillos() {

        String nombre = nombreTextField.getText();

        double precio;

        try {
            precio = Double.parseDouble(precioTextField.getText());
        } catch (Exception e) {
            System.out.println("Precio inválido.");
            return;
        }

        Bocadillo bocadillo = new Bocadillo(nombre, precio);

        System.out.println("Bocadillo creado: " + bocadillo.getNombre() + " con precio " + bocadillo.getPrecio());

        listaBocadillos.add(bocadillo);

        nombreTextField.clear();
        precioTextField.clear();


    }


}

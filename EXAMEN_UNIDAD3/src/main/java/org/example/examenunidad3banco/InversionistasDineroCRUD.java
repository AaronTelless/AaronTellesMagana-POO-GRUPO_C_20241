package org.example.examenunidad3banco;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class InversionistasDineroCRUD {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private TextField txtInversionistaNombre;
    @FXML private DatePicker datePickerFechaMovimiento;
    @FXML private TextField txtCantidadIngresar;
    @FXML private ListView<InversionistasDinero> listaInversionistasMovimientos;

    @FXML private Button btnDepositar;
    @FXML private Button btnActualizar;
    @FXML private Button btnEliminar;
    @FXML private Button btnCerrarSesion;


    public void initialize (URL url, ResourceBundle rb) {
        listaInversionistasMovimientos.setItems(GerenteMaderoCRUD.inversionistasMovimientos);

        listaInversionistasMovimientos.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<InversionistasDinero>() { //Crear una especie de instancia que hereda ChangeListener para poder redefinir los métodos abstractos
            @Override
            public void changed(ObservableValue<? extends InversionistasDinero> observableValue, InversionistasDinero inversionistaAnterior, InversionistasDinero inversionistaSeleccionado) {

                if (inversionistaSeleccionado != null) {
                    System.out.println("Elemento seleccionado");
                    System.out.println("Inversionista: " + inversionistaAnterior);

                    txtInversionistaNombre.setText(inversionistaSeleccionado.getNombre());
                    datePickerFechaMovimiento.setValue(LocalDate.parse(inversionistaSeleccionado.getFechaMovimiento()));
                    txtCantidadIngresar.setText(inversionistaSeleccionado.getCantidadIngresar());

                    btnDepositar.setDisable(true);
                }

            }
        });

    }

    @FXML
    public void depositarBoton(ActionEvent event) throws IOException {

        Object evtInversionistasDineroCRUDMadero = event.getSource();

        if (evtInversionistasDineroCRUDMadero.equals(btnDepositar)) {
            if (txtInversionistaNombre.getText().isEmpty() || datePickerFechaMovimiento.getValue().toString().isEmpty() || txtCantidadIngresar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos.", "ERROR CAMPOS FALTANTES", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println("$" + txtCantidadIngresar.getText() + " ingresados a nombre de " + txtInversionistaNombre.getText());
                GerenteMaderoCRUD.inversionistasMovimientos.add(
                        new InversionistasDinero(txtInversionistaNombre.getText(),
                                datePickerFechaMovimiento.getValue().toString(),
                                txtCantidadIngresar.getText()
                        )
                );
            }
        }
    }

    @FXML
    private void cambiarVerMovimientos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MovimientosInversionistas.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void cambiarVolver(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InversionistasCRUDG.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void actualizarBoton(){
        System.out.println("Moviemiento de: " + txtInversionistaNombre.getText() + " actualizado.");
        GerenteMaderoCRUD.inversionistasMovimientos.set(
                listaInversionistasMovimientos.getSelectionModel().getSelectedIndex(), //Para obtener el objeto seleccionado
                new InversionistasDinero(txtInversionistaNombre.getText(),
                        datePickerFechaMovimiento.getValue().toString(),
                        txtCantidadIngresar.getText()
                )
        );
        limpiarBoton();
    }

    @FXML
    public void limpiarBoton(){

        txtInversionistaNombre.setText(null);
        datePickerFechaMovimiento.setValue(null);
        txtCantidadIngresar.setText(null);

        btnActualizar.setDisable(true);
        btnEliminar.setDisable(true);

        listaInversionistasMovimientos.getSelectionModel().clearSelection();
    }

    @FXML
    public void eliminarBoton(){
        System.out.println("Movimiento de: " + txtInversionistaNombre.getText() + " eliminado.");
        GerenteMaderoCRUD.empleadosCapturistas.remove(listaInversionistasMovimientos.getSelectionModel().getSelectedIndex());

    }

    public void cerrarSesion(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Cerrar Sesión");
        alert.setHeaderText("Estás a punto de cerrar sesión.");
        alert.setContentText("¿Seguro que deseas salir?");

        if (alert.showAndWait().get() == ButtonType.OK){
            Parent root = FXMLLoader.load(getClass().getResource("MaderoInicioSesión.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            System.out.println("Haz cerrado sesión");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }


}
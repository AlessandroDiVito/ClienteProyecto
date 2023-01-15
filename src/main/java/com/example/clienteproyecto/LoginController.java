package com.example.clienteproyecto;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.SliderSkin;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.util.List;

public class LoginController {


    public TextField nickname;



    public void botonLogin(ActionEvent actionEvent) {
        String nick = nickname.getText();
        ListaClientes.nickname = nick;
        ListaClientes.listaCliente.add(nick);

        System.out.println(nickname.getText());
        //TODO si hay uno con el mismo nombre, no puedes entrar

        entrarFormulario();
        cerrarLogin(actionEvent);
    }

    public void entrarFormulario() {
        // Código para abrir la ventana Fomulario
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chatLocal.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 611.0, 440.0);
        } catch (IOException e) {
            System.err.println("Error");
        }
        Stage newStage = new Stage();
        newStage.setTitle("Chat");
        newStage.getIcons().add(new Image("/chat.png"));
        newStage.setScene(scene);
        newStage.show();

        newStage.setOnCloseRequest(e -> {
            Platform.exit();
            System.exit(0);
        });
    }

    private void cerrarLogin(Event event) {
        // Código para cerrar la ventana de Login, la cual hacemos uso de Node y Window
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Object eventSource = event.getSource();
        Node sourceAsNode = (Node) eventSource;
        Scene oldScene = sourceAsNode.getScene();
        Window window = oldScene.getWindow();
        Stage stage = (Stage) window;
        stage.hide();
    }
}
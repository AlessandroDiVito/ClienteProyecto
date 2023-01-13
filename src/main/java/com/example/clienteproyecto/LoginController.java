package com.example.clienteproyecto;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.List;

public class LoginController {


    public TextField nickname;


    public void botonLogin(ActionEvent actionEvent) {
        ListaClientes listaClientes = new ListaClientes(nickname.getText());
        System.out.println(nickname.getText());
    }
}
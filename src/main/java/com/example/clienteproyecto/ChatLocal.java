package com.example.clienteproyecto;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatLocal {
    public TextArea textoArea;

    public TextField textField;
    public Label usuariosConectados;

    String nick = ListaClientes.nickname;

    public void initialize(){
        System.out.println(nick);

        //ListaClientes.listaCliente.add(nick);


    }

    public void BotonEnviar(ActionEvent actionEvent) {
        int port = 5010; // Puerto por el que escucha
        InetAddress destino = null; // localhost
        try {
            destino = InetAddress.getByName("localhost");
            String texto = textField.getText();
            byte[] mensaje = texto.getBytes(); //codificarlo a bytes para enviarlo
            //construyo el datagrama a enviar
            DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, port);
            DatagramSocket socket = new DatagramSocket(6010); // puerto local que no tiene que ver nada con destino
            socket.send(envio);//envio datagrama a destino y port
            socket.close();

            textoArea.setText(textoArea.getText() + "\n" + nick + ": " + texto);
            textField.setText("");
        } catch (IOException e) {
            System.err.println("Ha ocurrido un error al enviar el mensaje");

        }
    }

}

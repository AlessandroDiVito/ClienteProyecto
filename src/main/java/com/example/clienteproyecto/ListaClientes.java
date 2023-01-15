package com.example.clienteproyecto;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaClientes {
    // Hilos, cuidado que podemos necesitarlo
    protected static String nickname;
    protected static InetAddress ipCliente;
    protected static LinkedList<String> listaCliente;


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



}

package com.example.clienteproyecto;

import java.net.InetAddress;
import java.util.List;

public class ListaClientes {
    // Hilos, cuidado que podemos necesitarlo
    public String nickname;
    public InetAddress ipCliente;
    public List<String> listaCliente;


    public ListaClientes(String nickname){
        setNickname(nickname);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public InetAddress getIpCliente() {
        return ipCliente;
    }

    public void setIpCliente(InetAddress ipCliente) {
        this.ipCliente = ipCliente;
    }

    public List<String> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<String> listaCliente) {
        this.listaCliente = listaCliente;
    }

}

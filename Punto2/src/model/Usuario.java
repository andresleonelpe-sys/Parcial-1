package model;

import strategy.EstrategiaNotificacion;

public class Usuario {
    private String nombre;
    private String usuario;
    private EstrategiaNotificacion estrategia;
 
    public Usuario(String nombre, String usuario, EstrategiaNotificacion estrategia) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.estrategia = estrategia;
    }
    public void setEstrategia(EstrategiaNotificacion estrategia) {
        this.estrategia = estrategia;
    }
    public void notificar(String mensaje) {
        estrategia.enviar(mensaje, this.usuario);
    }
    public String getNombre() {
        return nombre;
    }
}

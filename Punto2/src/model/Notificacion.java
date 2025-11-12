package model;

public class Notificacion {
    private String mensaje;
    private String tipo;

    public Notificacion(String mensaje, String tipo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
    }
    public String getMensaje() {
        return mensaje;
    }
    public String getTipo() {
        return tipo;
    }
    

}

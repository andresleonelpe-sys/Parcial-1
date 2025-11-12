package service;

import model.Notificacion;
import model.Usuario;
import java.util.List;

public class GestorNotificaciones {
    public void enviarNotificaciones(List<Usuario> usuarios, Notificacion notificacion) {
        for (Usuario u : usuarios) {
            u.notificar(notificacion.getMensaje());
        }
    }

}

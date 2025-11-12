    import model.Notificacion;
    import model.Usuario;
    import service.GestorNotificaciones;
    import strategy.*;
    import java.util.Arrays;
    import java.util.List;

    public class App{
        public static void app (String[] args){
            Usuario u1 = new Usuario("Ana", "ana@example.com", new EstrategiaEmail());
            Usuario u2 = new Usuario("Luis", "555-1234", new EstrategiaSMS());
            Usuario u3 = new Usuario("Marta", "marta@example.com", new EstrategiaPush());
            List<Usuario> usuarios = Arrays.asList(u1, u2, u3);

            GestorNotificaciones gestor = new GestorNotificaciones();
            Notificacion notificacion = new Notificacion("¡Tienes una nueva notificacion!", null);
            gestor.enviarNotificaciones(usuarios, notificacion);

            u1.setEstrategia(new EstrategiaPush());
            Notificacion notificacion2 = new Notificacion("¡Tu estrategia de notificación ha cambiado!", null);
            gestor.enviarNotificaciones(Arrays.asList(u1), notificacion2);

        };
    }


package strategy;

public class EstrategiaPush implements EstrategiaNotificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando notificación push a " + destinatario + ": " + mensaje);
    }

}

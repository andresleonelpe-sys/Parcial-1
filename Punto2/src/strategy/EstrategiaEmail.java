package strategy;

public class EstrategiaEmail implements EstrategiaNotificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}
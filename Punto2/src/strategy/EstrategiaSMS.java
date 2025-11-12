package strategy;

public class EstrategiaSMS implements EstrategiaNotificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }

}

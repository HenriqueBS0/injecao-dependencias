public class App {
    public static void main(String[] args) throws Exception {
        Alerta a = new Alerta(new NotificacaoWhatsApp());
        System.out.println(a.dispararAlerta());
    }
}

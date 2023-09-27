public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario = new UsuarioJuego("Jak", "0123");
        usuario.aumentarPuntaje();
        usuario.recibirBonus(5.52);
        System.out.println(usuario.getPuntaje());
    }
}
public class Main {
    public static void main(String[] args) {
        Piedra piedra = new Piedra();
        Papel papel = new Papel();
        Tijera tijera = new Tijera();

        System.out.println();
        System.out.println("Piedra, Papel o Tijeras!");
        System.out.println();

        System.out.println(papel.compareTo(piedra));
    }
}
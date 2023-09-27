import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PARTE 1 - Ejercitación Integer,String
        String cadena1 = "Cabeza";
        String cadena2 = "Cabeza";
        if (cadena1.equals(cadena2)) {
            System.out.println("Los Strings son iguales");
        } else {
            System.out.println("Los Strings son distintos");
        }

        Integer integer1 = 5;
        Integer integer2 = 5;
        int valorComparacion = integer1.compareTo(integer2);
        if (valorComparacion == 1) {
            System.out.println(integer1 + " es mayor que " + integer2);
        } else if (valorComparacion == -1) {
            System.out.println(integer1 + " es menor que " + integer2);
        } else {
            System.out.println(integer1 + " es igual a " + integer2);
        }

        // PARTE 2 - Ejercitación Scanner
        String nombre;
        String apellido;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("La tercer letra de su nombre (" + nombre + ")" +" es: " + nombre.charAt(2) + ".");

        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();
        System.out.println("La tercer letra de su apellido (" + apellido + ")" +" es: " + apellido.charAt(2) + ".");
    }
    // PARTE 3 - Ejercitación funciones
    public static boolean esDivisible(int num, int divisor) {
        boolean condicion = false;
        if (num % divisor == 0) {
            condicion = true;
        }
        return condicion;
    }
}
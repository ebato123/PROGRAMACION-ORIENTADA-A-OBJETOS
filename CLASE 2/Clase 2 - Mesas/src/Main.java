import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        int valorIngresado;
        Scanner scanner;
        scanner = new Scanner(System.in);

//        System.out.println("Números Primos");
//        System.out.println("Ingrese un valor numérico: ");
//        valorIngresado = scanner.nextInt();
//        numeroPrimo(valorIngresado);

//        // Ejercicio 2
//        System.out.println("Número Mayor");
//        System.out.println("Ingrese el valor A");
//        int valorA = scanner.nextInt();
//        System.out.println("Ingrese el valor B");
//        int valorB = scanner.nextInt();
//        System.out.println("Ingrese el valor C");
//        int valorC = scanner.nextInt();
//
//        System.out.println("El número mayor es: " + maximoEntreTresNumeros(valorA, valorB, valorC));

        // Ejercicio 3
        System.out.println("Cadenas de Texto Distintas");
        System.out.println("Ingrese el primer texto: ");
        String texto1 = scanner.nextLine();
        System.out.println("Ingrese el segundo texto: ");
        String texto2 = scanner.nextLine();

        System.out.println(cadenasDeTextoDistintas(texto1, texto2));
        if(cadenasDeTextoDistintas(texto1, texto2)){
            System.out.println("Los textos ingresados son los mismos.");
        }else{
            System.out.println("Los textos ingresados son distintos.");
        }

    }

    // Ejercicio 1
    public static void numeroPrimo(int numero){
        int contador = 0;
        for(Integer i = 1; i <= numero; i++) {
            if(esDivisible(numero, i)){
                contador ++;
            }
        }
        if(contador == 2){
            System.out.println("Es un número primo.");
        }else{
            System.out.println("No es un número primo.");
        }
    }

    // Ejercicio Clase Asincrónica
    public static boolean esDivisible(int num, int divisor) {
        boolean condicion = false;
        if (num % divisor == 0) {
            condicion = true;
        }
        return condicion;
    }

    // Ejercicio 2
    public static Integer maximoEntreTresNumeros(Integer numeroA, Integer numeroB, Integer numeroC){
        Integer numeroMayor = 0;
        Integer[] numeros = new Integer[3];
        numeros[0] = numeroA;
        numeros[1] = numeroB;
        numeros[2] = numeroC;

        for(Integer numero : numeros) {
            if (numero > numeroMayor){
                numeroMayor = numero;
            }
        }
        return numeroMayor;
    }

    // Ejercicio 3
    public static Boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        boolean resultado = false;
        unTextoA = unTextoA.toUpperCase();
        unTextoB = unTextoB.toUpperCase();
        if(unTextoA.equals(unTextoB)){
            resultado = true;
        }
        return resultado;
    }
}
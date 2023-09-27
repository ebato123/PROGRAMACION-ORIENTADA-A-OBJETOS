public class Main {
    public static void main(String[] args) {
        int numero1 = 500;
        int numero2 = 4;
        if(numero1 % numero2 == 0){
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        }else {
            System.out.println("El resultado contiene decimales.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Nave naveEspacial = new Nave(15, 25, 'n', 1, 200.0);
        Nave naveEspacialEnemiga = new Nave(56, 84, 'k', 2, 180.5);
        Asteroide asteroide = new Asteroide(5, 40, 's', 3, 90);
        Asteroide asteroide2 = new Asteroide(89, 124, 'o', 3, 134);


        System.out.println(naveEspacial.hashCode());
        System.out.println();
        System.out.println(naveEspacialEnemiga.hashCode());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(naveEspacial.toString());
        System.out.println();
        System.out.println(naveEspacialEnemiga.toString());
        System.out.println();
        System.out.println("¿Son iguales naveEspacial y naveEspacialEnemiga?: " + naveEspacial.equals(naveEspacialEnemiga));
        System.out.println("No, porque tienen identificadores distintos.");
        System.out.println();
        System.out.println(asteroide.toString());
        System.out.println();
        System.out.println(asteroide2.toString());
        System.out.println();
        System.out.println("¿Son iguales asteroide y asteroide2?: " + asteroide.equals(asteroide2));
        System.out.println("Sí, porque tienen identificadores iguales.");


    }
}
public class Main {
    public static void main(String[] args) {
        Cliente melisa = new Cliente(456, "Cholda", 44973360, 274497336);
        Cliente elian = new Cliente(723, "Moisés", 44872955, 234488729);

        Cuenta cuentaMelisa1 = new CuentaCorriente(melisa, 5000.0, 10000.0);
        Cuenta cuentaElian1 = new CajaDeAhorro(elian, 50000.0, 10);
        Cuenta cuentaElian2 = new CuentaCorriente(elian, 2000.0, 20000.0);

//        System.out.println();
//        System.out.println(cuentaMelisa1.toString());
//        System.out.println();
//        cuentaMelisa1.depositarDinero(10000.0);
//        System.out.println();
//        System.out.println(cuentaMelisa1.toString());
//        System.out.println();
//        cuentaMelisa1.retirarDinero(16000.0);
//        System.out.println(cuentaMelisa1.toString());
//        System.out.println();
//        cuentaMelisa1.retirarDinero(9000.0);
//        System.out.println(cuentaMelisa1.toString());
//        System.out.println();
//        cuentaMelisa1.retirarDinero(1.0);
//        System.out.println(cuentaMelisa1.toString());
//        System.out.println();
//
//        System.out.println();
//        System.out.println(cuentaElian1.toString());
//        System.out.println();
//        cuentaElian1.depositarDinero(5000.0);
//        System.out.println();
//        System.out.println(cuentaElian1.toString());
//        System.out.println();
//        ((CajaDeAhorro)cuentaElian1).cobrarInteres(2000.0);
//        System.out.println(cuentaElian1.toString());
//        System.out.println();
//        ((CajaDeAhorro)cuentaElian1).cobrarInteres(4000.0);
//        System.out.println(cuentaElian1.toString());
//        System.out.println();
//        ((CajaDeAhorro)cuentaElian1).cobrarInteres(3000.0);
//        System.out.println(cuentaElian1.toString());
//        System.out.println();

        System.out.println(cuentaElian1.equals(cuentaMelisa1));
        System.out.println(cuentaElian1.equals(cuentaElian1));
        System.out.println(cuentaElian1.equals(cuentaElian2));

    }
}
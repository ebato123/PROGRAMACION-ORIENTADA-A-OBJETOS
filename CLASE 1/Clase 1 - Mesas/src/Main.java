public class Main {
    public static void main(String[] args) {
        // Propiedades de la Mascota
        String nombre;
        int edad = 0;
        String tipoEdad = "años";
        double cantidadComida = 0;
        String tipoComida = "";
        String respuesta = "";

        // Definiendo PROPIEDADES
        nombre = "Silvestre";

        // CONDICIONALES
        switch (nombre){
            case "Manchitas":
                edad = 2;
                cantidadComida = 1.5;
                tipoComida = "kg";
                respuesta = "guau guau";
            break;
            case "Nemo":
                edad = 1;
                cantidadComida = 140;
                tipoComida = "g";
                respuesta = "glu glu";
            break;
            case "Silvestre":
                edad = 3;
                cantidadComida = 0.5;
                tipoComida = "kg";
                respuesta = "miau";
            break;
            case "Manuelita":
                edad = 12;
                cantidadComida = 300;
                tipoComida = "g";
                respuesta = "pehuajó";
            break;
            case "Gardel":
                edad = 1;
                cantidadComida = 350;
                tipoComida = "g";
                respuesta = "pio pio";
            break;
            default:
                respuesta = "Ingrese un nombre válido.";
        }
        if(edad == 1){
            tipoEdad = "año";
        }

        // OUTPUTS
        System.out.println(nombre + " tiene " + edad + " " + tipoEdad + ".");
        System.out.println(nombre + " come " + cantidadComida + tipoComida + " y hace " + respuesta + ".");
    }
}

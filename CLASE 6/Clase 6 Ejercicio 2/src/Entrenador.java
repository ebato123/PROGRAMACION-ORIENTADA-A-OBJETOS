public class Entrenador extends MiembroEquipo{
    public Entrenador(String nombre, int edad) {
        super(nombre, edad);
    }

    public void dirigirEntrenamiento(){
        System.out.println("El entrenador " + getNombre() + " dirige el entrenamiento.");
    }

    public void diseñarTactica(){
        System.out.println("El entrenador " + getNombre() + " dirige una táctica.");
    }
}

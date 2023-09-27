public class Fisioterapeuta extends MiembroEquipo{
    public Fisioterapeuta(String nombre, int edad) {
        super(nombre, edad);
    }

    public void realizarControl(Futbolista futbolista){
        System.out.println("El fisioterapeuta " + getNombre() + " realiza un chequeo sobre el futbolista " + futbolista.getNombre() + ".");
    }
}

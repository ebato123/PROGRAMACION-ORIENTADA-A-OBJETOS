public class Presidente extends MiembroEquipo{
    public Presidente(String nombre, int edad){
        super(nombre, edad);
    }

    public void supervisar(Equipo equipo){
        System.out.println("El presidente " + getNombre() + " está supervisando al equipo " + equipo.getNombre() + ".");
    }

    public void realizarActividadAdministrativa(){
        System.out.println("El presidente " + getNombre() + " está realizando actividades administrativas.");
    }
}

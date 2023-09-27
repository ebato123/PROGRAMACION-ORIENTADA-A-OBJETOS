public class Manager extends MiembroEquipo{
    public Manager(String nombre, int edad) {
        super(nombre, edad);
    }
    public void compararEstadisticas(Equipo equipo1, Equipo equipo2){
        if(equipo1.getPartidosGanados() > equipo2.getPartidosGanados()){
            System.out.println("Los resultados son positivos. El equipo " + equipo1.getNombre() + " cuenta con " + equipo1.getPartidosGanados() + " partidos ganados a comparación del equipo " + equipo2.getNombre() + ", que cuenta con " + equipo2.getPartidosGanados() + " partidos ganados.");
        }else if(equipo1.getPartidosGanados() == equipo2.getPartidosGanados()){
            System.out.println("Los resultados fueron parciales.");
        }else{
            System.out.println("Los resultados son negativos. El equipo " + equipo1.getNombre() + " cuenta con " + equipo1.getPartidosGanados() + " partidos ganados a comparación del equipo " + equipo2.getNombre() + ", que cuenta con " + equipo2.getPartidosGanados() + " partidos ganados.");
        }
    }

    public void informarEstadoEquipo(){
        System.out.println("El equipo está listo para el siguiente partido.");
    }
}



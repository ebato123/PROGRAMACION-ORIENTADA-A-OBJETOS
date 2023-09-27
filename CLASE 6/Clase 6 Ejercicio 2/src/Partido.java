import java.util.Random;
public class Partido {
    private Double hora;
    private String ubicacion;
    private Equipo[] equipos;

    Random NumeroAleatorio = new Random();
    private int numeroAleatorio = NumeroAleatorio.nextInt(5);

    public Partido(Double hora, String ubicacion, Equipo[] equipos) {
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.equipos = equipos;
    }

    public Double getHora() {
        return hora;
    }

    public void setHora(Double hora) {
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;

    }

    public void obtenerResultado(Equipo equipo1, Equipo equipo2){
        Integer resultado = numeroAleatorio;
        if(resultado == 2 || resultado == 4){
            System.out.println("El partido fue GANADO por el equipo " + equipo1.getNombre() +".");
            equipo1.setPartidosGanados(equipo1.getPartidosGanados() + 1);
        }else if(resultado == 1 || resultado == 3){
            System.out.println("El partido fue GANADO por el equipo " + equipo2.getNombre() +".");
            equipo2.setPartidosGanados(equipo2.getPartidosGanados() + 1);
        }else {
            System.out.println("El resultado del partido fue de un EMPATE.");
        }
    }
}

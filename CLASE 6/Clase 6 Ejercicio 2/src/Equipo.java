public class Equipo {
    //
    private String nombre;
    private Futbolista[] futbolistas;
    private Presidente presidente;
    private Entrenador[] entrenadores;
    private Fisioterapeuta[] fisioterapeutas;

    private Manager manager;
    private Integer partidosGanados = 0;

    // CONSTRUCTOR
    public Equipo(String nombre, Futbolista[] futbolistas, Presidente presidente, Entrenador[] entrenadores, Fisioterapeuta[] fisioterapeutas, Manager manager) {
        this.nombre = nombre;
        this.futbolistas = futbolistas;
        this.presidente = presidente;
        this.entrenadores = entrenadores;
        this.fisioterapeutas = fisioterapeutas;
        this.manager = manager;
    }

    // SOBREESCRITURA
    @Override
    public String toString(){
        return "\n"
                + "Jugador 1: " + futbolistas[0].getNombre() + "\n"
                + "Jugador 2: " + futbolistas[1].getNombre() + "\n"
                + "Jugador 3: " + futbolistas[2].getNombre() + "\n"
                + "Jugador 4: " + futbolistas[3].getNombre() + "\n"
                + "Jugador 5: " + futbolistas[4].getNombre() + "\n";
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Futbolista[] getFutbolistas() {
        return futbolistas;
    }

    public void setFutbolistas(Futbolista[] futbolistas) {
        this.futbolistas = futbolistas;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public Entrenador[] getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenador[] entrenadores) {
        this.entrenadores = entrenadores;
    }

    public Fisioterapeuta[] getFisioterapeutas() {
        return fisioterapeutas;
    }

    public void setFisioterapeutas(Fisioterapeuta[] fisioterapeutas) {
        this.fisioterapeutas = fisioterapeutas;
    }

    public Integer getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(Integer partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    // MÉTODOS
    public void jugarPartido(Partido partido, Equipo equipo1, Equipo equipo2){
        System.out.println("El partido se jugó a las " + partido.getHora() + "hs.");
        System.out.println("El partido fue en " + partido.getUbicacion() + ".");
        partido.obtenerResultado(equipo1, equipo2);
    }

    public void entrenar(Entrenador entrenador, Equipo equipo){
        System.out.println("El equipo " + getNombre() + " se compone de los siguientes jugadores: " + equipo.toString());
        System.out.println("El entrenador " + entrenador.getNombre() + " está entrenando al equipo " + getNombre() + ".");
    }
}

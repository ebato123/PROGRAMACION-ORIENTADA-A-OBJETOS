public class UsuarioJuego {
    // ATRIBUTOS
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    // CONSTRUCTOR
    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    // GETTERS & SETTERS
    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // MÉTODOS
    public void aumentarPuntaje(){
        this.puntaje ++;
    }

    public void aumentarNivel(){
        this.nivel ++;
    }

    public void recibirBonus(double bonus){
        this.puntaje += bonus;
    }
}

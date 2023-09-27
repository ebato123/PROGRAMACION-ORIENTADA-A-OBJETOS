public class Nave extends Objeto{
    private double velocidad;
    private int vida = 100;

    public Nave(int posx, int posy, char direccion, int objetoId,double velocidad) {
        super(posx, posy, direccion, objetoId);
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        String direccion;
        switch (getDireccion()){
            case 'n':
                direccion = "Norte";
                break;
            case 's':
                direccion = "Sur";
                break;
            case 'e':
                direccion = "Este";
                break;
            case 'o':
                direccion = "Oeste";
                break;
            default:
                direccion = getDireccion() + " (dirección inválida)";
        }
        return "Características de la Nave: " + '\n' +
                "Vida: " + getVida() + '\n' +
                "Velocidad: " + getVelocidad() + '\n' +
                "Posición X: " + getPosx() + '\n' +
                "Posición Y: " + getPosy() + '\n' +
                "Dirección: " + direccion + '\n' +
                "ID de la Nave: " + this.hashCode() + '\n';
    }

    @Override
    public void irA(int x, int y, char direccion){
        // código de movimiento
    }

    public void girar(char direccion){
        // código para girar
    }

    public void restaVida(int valor){
        this.vida -= valor;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

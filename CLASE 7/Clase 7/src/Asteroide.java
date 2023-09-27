public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int objetoId,int lesion) {
            super(posx, posy, direccion, objetoId);
            this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        // código de movimiento
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
        return "Características del Asteroide: " + '\n' +
                "Lesión: " + getLesion() + '\n' +
                "Posición X: " + getPosx() + '\n' +
                "Posición Y: " + getPosy() + '\n' +
                "Dirección: " + direccion + '\n' +
                "ID de la Nave: " + this.hashCode() + '\n';
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}

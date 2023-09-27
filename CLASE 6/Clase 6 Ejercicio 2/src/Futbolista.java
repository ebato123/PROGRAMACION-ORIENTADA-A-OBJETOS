public class Futbolista extends MiembroEquipo{
    private String posicion;
    private String status;
    public Futbolista(String nombre, int edad, String posicion, String status){
        super(nombre, edad);
        this.posicion = posicion;
        this.status = status;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

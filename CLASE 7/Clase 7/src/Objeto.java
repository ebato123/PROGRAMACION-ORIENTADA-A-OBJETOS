import java.util.Objects;

abstract class Objeto {
    private int posx;
    private int posy;
    private char direccion;
    private int objetoId;
    public Objeto(int posx, int posy, char direccion, int objetoId){
       this.posx = posx;
       this.posy = posy;
       this.direccion = direccion;
       this.objetoId = objetoId;
    }

    public void irA(int x, int y, char direccion){
        // código de movimiento
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash *= objetoId;
        hash *= hash;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return objetoId == objeto.objetoId;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public int getObjetoId() {
        return objetoId;
    }

    public void setObjetoId(int objetoId) {
        this.objetoId = objetoId;
    }
}


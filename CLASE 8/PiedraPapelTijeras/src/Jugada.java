public abstract class Jugada implements Comparable<Jugada> {

    @Override
    public int compareTo(Jugada o) {
        int resultado = 0;

        if (this instanceof Piedra) {
            if (o instanceof Tijera) {
                resultado = 1;
            } else if (o instanceof Papel) {
                resultado = -1;
            }
        }
        if (this instanceof Papel) {
            if (o instanceof Piedra) {
                resultado = 1;
            } else if (o instanceof Tijera) {
                resultado = -1;
            }
        }
        if (this instanceof Tijera) {
            if (o instanceof Papel) {
                resultado = 1;
            } else if (o instanceof Piedra) {
                resultado = -1;
            }
        }
        return resultado;
    }
}

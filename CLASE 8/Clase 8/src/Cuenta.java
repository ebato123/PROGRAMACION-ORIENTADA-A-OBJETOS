import java.util.Objects;

public abstract class Cuenta {
    private Cliente cliente;
    private Double saldo;

    public Cuenta(Cliente cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public abstract void retirarDinero(Double dinero);

    public void depositarDinero(Double deposito){
        saldo += deposito;
    }

    public Double informarSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cuenta cuenta)) return false;
        return Objects.equals(cliente, cuenta.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente);
    }
}

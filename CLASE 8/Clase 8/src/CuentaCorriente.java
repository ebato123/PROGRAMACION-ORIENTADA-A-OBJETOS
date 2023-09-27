public class CuentaCorriente extends Cuenta{
    private Double limiteDescubierto;
    private Double descubierto = limiteDescubierto;
    private Double deudaDescubierto = 0.0;

    public CuentaCorriente(Cliente cliente, Double saldo, Double limiteDescubierto) {
        super(cliente, saldo);
        this.limiteDescubierto = limiteDescubierto;
        this.descubierto = limiteDescubierto;
    }

    public void retirarDinero(Double dinero) {
        Double saldoMasMontoAuto = (super.informarSaldo()+this.descubierto);
        if(super.informarSaldo()<dinero){
            if(saldoMasMontoAuto>=dinero){
                this.descubierto = saldoMasMontoAuto - dinero;
                this.deudaDescubierto = this.limiteDescubierto - this.descubierto;
                super.setSaldo(0.0);
            }else{
                System.out.println("No es posible retirar esa cantidad de dinero. Saldo y Descubierto insuficientes.");
            }
        }else {
            Double nuevoSaldo = super.informarSaldo() - dinero;
            super.setSaldo(nuevoSaldo);
        }
    }

    @Override
    public String toString() {
        return "CUENTA N°" + super.getCliente().getNroCliente() + " (" + super.getCliente().getApellido() + ")" + '\n'
                + "Tipo: Cuenta Corriente" + '\n'
                + "Saldo: " + super.informarSaldo() + '\n'
                + "Descubierto: " + this.descubierto + '\n'
                + "Deuda Descubierto: " + this.deudaDescubierto;
    }
}

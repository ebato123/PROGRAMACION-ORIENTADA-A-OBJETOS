public class CajaDeAhorro extends Cuenta{
    private int tasaInteres;
    private Double interesGenerado;
    private Double interesDisponible;

    public CajaDeAhorro(Cliente cliente, Double saldo, int tasaInteres) {
        super(cliente, saldo);
        this.tasaInteres = tasaInteres;
        this.interesGenerado = ((super.informarSaldo()/100)*tasaInteres);
        this.interesDisponible = interesGenerado;
    }

    @Override
    public void retirarDinero(Double dinero) {
        if(dinero>super.informarSaldo()){
            System.out.println("No es posible retirar esa cantidad de dinero, saldo insuficiente.");
        }else{
            super.setSaldo(super.informarSaldo()-dinero);
        }
    }

    public void cobrarInteres(Double monto){
        if(monto>this.interesDisponible){
            System.out.println("El monto ingresado excede el interes disponible.");
        }
        else{
            super.setSaldo(super.informarSaldo()+this.interesDisponible);
            this.interesDisponible -= monto;
        }
    }

    @Override
    public String toString() {
        return "CUENTA N°" + super.getCliente().getNroCliente() + " (" + super.getCliente().getApellido() + ")" + '\n'
                + "Tipo: Caja de Ahorro" + '\n'
                + "Saldo: " + super.informarSaldo() + '\n'
                + "Interes Generado: " + interesGenerado + '\n'
                + "Interes Disponible: " + interesDisponible;

    }


}

public class Cliente {
    private Integer nroCliente;
    private String apellido;
    private Integer dni;
    private Integer cuit;

    public Cliente(Integer nroCliente, String apellido, Integer dni, Integer cuit) {
        this.nroCliente = nroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public void retirarDinero(Cuenta cuenta, Double dinero){
        cuenta.retirarDinero(dinero);
    }

    public Integer getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(Integer nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
        
    }
}


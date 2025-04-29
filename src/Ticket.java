

abstract class Ticket {
    protected String codigo;
    protected double precio;
    protected String fechaEmision;

    public Ticket(String codigo, double precio, String fechaEmision) {
        this.codigo = codigo;
        this.precio = precio;
        this.fechaEmision = fechaEmision;
    }
}
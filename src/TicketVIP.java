

class TicketVIP extends Ticket {
    private String beneficios;

    public TicketVIP(String codigo, double precio, String fechaEmision, String beneficios) {
        super(codigo, precio, fechaEmision);
        this.beneficios = beneficios;
    }
}
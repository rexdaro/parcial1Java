

class Incidente {
    private String fecha;
    private String descripcion;
    private EstadoIncidente estado;
    private Atraccion atraccion;
    private Visitante visitante;

    public Incidente(String fecha, String descripcion, EstadoIncidente estado, Atraccion atraccion, Visitante visitante) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.atraccion = atraccion;
        this.visitante = visitante;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoIncidente getEstado() {
        return estado;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }
}

import java.util.List;
import java.util.ArrayList;


class Reporte {
    private int id;
    private String detalles;
    private String fechaEmision;
    private List<Incidente> incidentes;

    public Reporte(int id, String detalles, String fechaEmision) {
        this.id = id;
        this.detalles = detalles;
        this.fechaEmision = fechaEmision;
        this.incidentes = new ArrayList<>();
    }

    public void agregarIncidente(Incidente incidente) {
        incidentes.add(incidente);
    }
}
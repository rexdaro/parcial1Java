
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class EmpleadoSeguridad {
    private String nombre;
    private Set<String> especialidades;
    private List<Incidente> incidentesAtendidos;

    public EmpleadoSeguridad(String nombre) {
        this.nombre = nombre;
        this.especialidades = new HashSet<>();
        this.incidentesAtendidos = new ArrayList<>();
    }

    public void agregarEspecialidad(String especialidad) {
        especialidades.add(especialidad);
    }

    public void agregarIncidente(Incidente incidente) {
        incidentesAtendidos.add(incidente);
    }

    public void mostrarIncidentesReportados() {
        for (Incidente incidente : incidentesAtendidos) {
            System.out.println("Atracción: " + incidente.getAtraccion().getNombre());
            System.out.println("Fecha: " + incidente.getFecha());
            System.out.println("Descripción: " + incidente.getDescripcion());
            System.out.println("Estado: " + incidente.getEstado());
            System.out.println("--------");
        }
    }
}
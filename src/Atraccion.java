import java.util.List;
import java.util.ArrayList;


abstract class Atraccion {
    private String nombre;
    private TipoAtraccion tipo;
    private int duracionMinutos;
    private int visitantesEnCola;
    private List<Horario> horariosDisponibles;
    private List<Mantenimiento> mantenimientos;
    private List<Tecnico> tecnicosAsignados;

    public Atraccion(String nombre, TipoAtraccion tipo, int duracionMinutos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracionMinutos = duracionMinutos;
        this.visitantesEnCola = 0;
        this.horariosDisponibles = new ArrayList<>();
        this.mantenimientos = new ArrayList<>();
        this.tecnicosAsignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int calcularTiempoDeEspera() {
        return duracionMinutos * visitantesEnCola;
    }

    public void setVisitantesEnCola(int cantidad) {
        this.visitantesEnCola = cantidad;
    }

    public void agregarHorario(Horario h) {
        horariosDisponibles.add(h);
    }

    public void agregarMantenimiento(Mantenimiento m) {
        mantenimientos.add(m);
    }

    public void agregarTecnico(Tecnico t) {
        tecnicosAsignados.add(t);
    }
}

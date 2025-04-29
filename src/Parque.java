import java.util.List;
import java.util.ArrayList;


class Parque {
    private String nombre;
    private String direccion;
    private String horarioApertura;
    private String horarioCierre;
    private List<Atraccion> atracciones;

    public Parque(String nombre, String direccion, String horarioApertura, String horarioCierre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.atracciones = new ArrayList<>();
    }

    public void agregarAtraccion(Atraccion atraccion) {
        atracciones.add(atraccion);
    }

    public Atraccion obtenerAtraccionMasVisitada() {
        Atraccion max = null;
        int maxCola = -1;
        for (Atraccion a : atracciones) {
            if (a.calcularTiempoDeEspera() > maxCola) {
                maxCola = a.calcularTiempoDeEspera();
                max = a;
            }
        }
        return max;
    }
}

import java.util.List;
import java.util.ArrayList;


class Visitante {
    private String nombre;
    private String dni;
    private int edad;
    private List<Entrada> listaEntradas;
    private Ticket ticket;

    public Visitante(String nombre, String dni, int edad, Ticket ticket) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ticket = ticket;
        this.listaEntradas = new ArrayList<>();
    }

    public void agregarEntrada(Entrada entrada) {
        listaEntradas.add(entrada);
    }
}
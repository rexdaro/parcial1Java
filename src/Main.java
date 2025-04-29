

public class Main {
    public static void main(String[] args) {
        TicketGeneral ticketGeneral = new TicketGeneral("TG1", 100.0, "2025-04-29");
        TicketVIP ticketVIP = new TicketVIP("TV1", 200.0, "2025-04-29", "Acceso rápido");

        Visitante visitante1 = new Visitante("Manuel", "96092745", 27, ticketGeneral);
        Visitante visitante2 = new Visitante("Rossalis", "96095745", 28, ticketVIP);

        visitante1.agregarEntrada(new Entrada("2025-04-29", "10:00"));
        visitante2.agregarEntrada(new Entrada("2025-04-29", "10:30"));

        Atraccion mecanica = new AtraccionMecanica("carrucel", 5);
        Atraccion acuatica = new AtraccionAcuatica("barco pirata", 3);
        Atraccion infantil = new AtraccionInfantil("carritos chocones", 2);

        mecanica.setVisitantesEnCola(10);
        acuatica.setVisitantesEnCola(5);
        infantil.setVisitantesEnCola(7);

        Horario h1 = new Horario("Lunes", "10:00", "12:00");
        mecanica.agregarHorario(h1);
        acuatica.agregarHorario(h1);
        infantil.agregarHorario(h1);

        Tecnico tecnico1 = new Tecnico("Hernan", "Electrónica y reparaciones manuales");
        mecanica.agregarTecnico(tecnico1);

        Mantenimiento mantenimiento = new Mantenimiento("2025-04-30", "revision preventiva");
        mecanica.agregarMantenimiento(mantenimiento);

        EmpleadoSeguridad emp = new EmpleadoSeguridad("pedro");
        emp.agregarEspecialidad("Primeros Auxilios");
        emp.agregarEspecialidad("Evacuación");

        Incidente incidente1 = new Incidente("2025-04-29", "golpe y fractura", EstadoIncidente.REPORTADO, mecanica, visitante1);
        Incidente incidente2 = new Incidente("2025-04-29", "Mareos y vomitos", EstadoIncidente.RESUELTO, acuatica, visitante2);

        emp.agregarIncidente(incidente1);
        emp.agregarIncidente(incidente2);

        Reporte reporte = new Reporte(1, "Reporte diario", "2025-04-29");
        reporte.agregarIncidente(incidente1);
        reporte.agregarIncidente(incidente2);

        Parque parque = new Parque("PARQUE MORTAL 4 SA", "SAN MARTIN 1285", "09:00", "18:00");
        parque.agregarAtraccion(mecanica);
        parque.agregarAtraccion(acuatica);
        parque.agregarAtraccion(infantil);

        Atraccion masVisitada = parque.obtenerAtraccionMasVisitada();
        System.out.println("LA ATRACCION MAS USADA FRECUENTEMENTE ES: " + masVisitada.getNombre());

        emp.mostrarIncidentesReportados();
    }
}

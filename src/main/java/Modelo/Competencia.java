/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Competencia {
    private String nombreEvento;
    public Equipo[] equipos;
    private int cantidadEquipos;

    public Competencia(String nombreEvento, int maxEquipos) {
        this.nombreEvento = nombreEvento;
        this.equipos = new Equipo[maxEquipos];
        this.cantidadEquipos = 0;
    }
    
    public Competencia(String nombreEvento) {
        this(nombreEvento, 10); 
    }

    public void agregarEquipo(Equipo e) {
        if (cantidadEquipos < equipos.length) {
            equipos[cantidadEquipos] = e;
            cantidadEquipos++;
        } else {
            System.out.println("No se pueden agregar más equipos.");
        }
    }

    public String generarReporte() {
        String info = "Competencia: " + nombreEvento + "\n";
        for (int i = 0; i < cantidadEquipos; i++) {
            info += equipos[i].obtenerDatosEquipo() + "\n";
        }
        return info;
    }

    public String podio() {
        int totalCompetidores = 0;
        for (int i = 0; i < cantidadEquipos; i++) {
            totalCompetidores += equipos[i].getCantidadCompetidores();
        }

        Competidor[] todos = new Competidor[totalCompetidores];
        int index = 0;
        for (int i = 0; i < cantidadEquipos; i++) {
            Equipo equipo = equipos[i];
            for (int j = 0; j < equipo.getCantidadCompetidores(); j++) {
                todos[index] = equipo.getCompetidor(j);
                index++;
            }
        }

        for (int i = 0; i < todos.length - 1; i++) {
            for (int j = i + 1; j < todos.length; j++) {
                if (todos[j].getPuntos() > todos[i].getPuntos()) {
                    Competidor temp = todos[i];
                    todos[i] = todos[j];
                    todos[j] = temp;
                }
            }
        }

        String resultado = "PODIO - " + nombreEvento + "\n";
        if (totalCompetidores == 0) {
            resultado += "No hay competidores registrados.\n";
        } else {
            for (int i = 0; i < totalCompetidores && i < 3; i++) {
                Competidor c = todos[i];
                resultado += (i + 1) + ". " + c.getNombre() + " - Puntos: " + c.getPuntos() + "\n";
            }
        }

        return resultado;
    }
}


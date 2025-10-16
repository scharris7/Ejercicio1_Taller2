/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Equipo {
    private String nombre;
    private String pais;
    private Competidor[] competidores;
    private int cantidadCompetidores;

    public Equipo(String nombre, String pais, int maxCompetidores) {
        this.nombre = nombre;
        this.pais = pais;
        this.competidores = new Competidor[maxCompetidores];
        this.cantidadCompetidores = 0;
    }
    
    public Equipo(String nombre, String pais) {
        this(nombre, pais, 10); 
    }

    public void agregarCompetidor(Competidor c) {
        if (cantidadCompetidores < competidores.length) {
            competidores[cantidadCompetidores] = c;
            cantidadCompetidores++;
        } else {
            System.out.println("No se pueden agregar más competidores en este equipo.");
        }
    }
    
    public Competidor[] getCompetidores() {
        return competidores;
    }

    public String obtenerDatosEquipo() {
        String info = "Equipo: " + nombre + " (" + pais + ")\n";
        for (int i = 0; i < cantidadCompetidores; i++) {
            info += " - " + competidores[i].obtenerDatos() + "\n";
        }
        return info;
    }

    public int getCantidadCompetidores() {
        return cantidadCompetidores;
    }

    public Competidor getCompetidor(int index) {
        return competidores[index];
    }
}


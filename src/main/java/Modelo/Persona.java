/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Persona {
    String nombre;
    private int edad;
    private String pais;

    public Persona(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    public String obtenerDatos() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", País: " + pais;
    }

    @Override
    public String toString() {
        return obtenerDatos();
    }
}

    


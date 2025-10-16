/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Competidor extends Persona {
    private int rankingMundial;
    private double estatura;
    private double peso;
    private int puntos;

    public Competidor(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso) {
        super(nombre, edad, pais);
        this.rankingMundial = rankingMundial;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = 0;
    }
    
    public void actualizarRanking(int puntosObtenidos) {
        this.puntos += puntosObtenidos;
        this.rankingMundial -= puntosObtenidos / 10;
    }

    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() +
               ", Ranking: " + rankingMundial +
               ", Estatura: " + estatura +
               ", Peso: " + peso +
               ", Puntos: " + puntos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

}

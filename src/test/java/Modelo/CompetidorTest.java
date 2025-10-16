/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolas Castaño
 */
public class CompetidorTest {
    @Test
    public void testActualizarRanking() {
        System.out.println("Prueba del método actualizarRanking()");

        Competidor competidor = new Competidor("Juan", 25, "Colombia", 20, 1.75, 70.0);
        competidor.actualizarRanking(30);

        int puntosEsperados = 30;
        int puntosCalculados = competidor.getPuntos();

        assertEquals(puntosEsperados, puntosCalculados);
    }

    @Test
    public void testObtenerDatos() {
        System.out.println("Prueba del método obtenerDatos()");

        Competidor competidor = new Competidor("Luis", 28, "España", 15, 1.80, 75.0);
        String datos = competidor.obtenerDatos();

        assertTrue(datos.contains("Luis"));
        assertTrue(datos.contains("España"));
    }
}

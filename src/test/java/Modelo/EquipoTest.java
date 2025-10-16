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
public class EquipoTest {
    @Test
    public void testAgregarCompetidor() {
        System.out.println("Prueba del método agregarCompetidor()");

        Equipo equipo = new Equipo("Team Colombia", "Colombia");
        Competidor competidor = new Competidor("Pedro", 23, "Colombia", 10, 1.70, 68);

        equipo.agregarCompetidor(competidor);

        int cantidadEsperada = 1;
        int cantidadObtenida = equipo.getCantidadCompetidores();

        assertEquals(cantidadEsperada, cantidadObtenida);
    }

    @Test
    public void testObtenerDatosEquipo() {
        System.out.println("Prueba del método obtenerDatosEquipo()");

        Equipo equipo = new Equipo("Team España", "España");
        Competidor c = new Competidor("Carlos", 26, "España", 8, 1.78, 72);
        equipo.agregarCompetidor(c);

        String resultado = equipo.obtenerDatosEquipo();
        assertTrue(resultado.contains("Team España"));
        assertTrue(resultado.contains("Carlos"));
    }
}
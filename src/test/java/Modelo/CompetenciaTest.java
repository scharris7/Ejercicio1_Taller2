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
public class CompetenciaTest {
    @Test
    public void testGenerarReporteYpodio() {
        System.out.println("Ejecutando prueba de integración entre Competencia, Equipo y Competidor...");

        Competencia mundial = new Competencia("Mundial de Ciclismo Cali");
        Equipo e1 = new Equipo("Team Colombia", "Colombia");
        Equipo e2 = new Equipo("Team España", "España");

        mundial.agregarEquipo(e1);
        mundial.agregarEquipo(e2);

        Competidor c1 = new Competidor("Juan", 25, "Colombia", 10, 1.75, 70);
        Competidor c2 = new Competidor("Pedro", 22, "Colombia", 15, 1.80, 75);
        Competidor c3 = new Competidor("Luis", 27, "España", 8, 1.73, 72);

        e1.agregarCompetidor(c1);
        e1.agregarCompetidor(c2);
        e2.agregarCompetidor(c3);

        c1.actualizarRanking(20);
        c2.actualizarRanking(10);
        c3.actualizarRanking(30);

        String reporte = mundial.generarReporte();
        String podio = mundial.podio();

        assertTrue(reporte.contains("Team Colombia"));
        assertTrue(reporte.contains("Luis"));
        assertTrue(podio.contains("PODIO"));
        assertTrue(podio.contains("Luis"));
    }
}
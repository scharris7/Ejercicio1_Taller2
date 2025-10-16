/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Modelo.Competencia;
import Modelo.Competidor;
import Modelo.Equipo;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castaño
 */
public class main {

    public static void main(String[] args) {
        
    Competencia mundial = new Competencia("Mundial de Ciclismo Cali");
        boolean salir = false;

        do {
            String opcion = JOptionPane.showInputDialog("""
                    MENÚ PRINCIPAL
                    1. Agregar equipo
                    2. Agregar competidor
                    3. Ver reporte
                    4. Ver podio
                    5. Salir
                    """);

            switch (opcion) {
                case "1" -> {
                    String nombre = JOptionPane.showInputDialog("Nombre del equipo:");
                    String pais = JOptionPane.showInputDialog("País del equipo:");
                    mundial.agregarEquipo(new Equipo(nombre, pais));
                }
                case "2" -> {
                    if (mundial == null) break;
                    String nombre = JOptionPane.showInputDialog("Nombre competidor:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    String pais = JOptionPane.showInputDialog("País:");
                    int ranking = Integer.parseInt(JOptionPane.showInputDialog("Ranking mundial:"));
                    double est = Double.parseDouble(JOptionPane.showInputDialog("Estatura:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
                    Competidor c = new Competidor(nombre, edad, pais, ranking, est, peso);

                    String eqNombre = JOptionPane.showInputDialog("Nombre del equipo al que pertenece:");
                        for (Equipo e : mundial.equipos) {
                        if (e.getCompetidores() != null && e.obtenerDatosEquipo().contains(eqNombre)) {
                            e.agregarCompetidor(c);
                        }
                    }
                }
                case "3" -> JOptionPane.showMessageDialog(null, mundial.generarReporte());
                case "4" -> JOptionPane.showMessageDialog(null, mundial.podio());
                case "5" -> salir = true;
                default -> JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (!salir);
    }
}


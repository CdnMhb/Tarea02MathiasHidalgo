/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tarea02mhb;
import javax.swing.JOptionPane;

/**
 *
 * @author mathi
 */
public class Menu {
private SistemaPrestamo sistema;

    public Menu() {
        sistema= new SistemaPrestamo();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion= Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE PRÉSTAMO DE EQUIPOS\n\n"
                    + "1. Consultar catálogo\n"
                    + "2. Prestar equipo\n"
                    + "3. Devolver equipo\n"
                    + "4. Consultar multas\n"
                    + "5. Mostrar resumen\n"
                    + "6. Salir\n\n"
                    + "Digite una opción:"));
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, sistema.obtenerCatalogo());
                    break;
                case 2:
                    int posPrestar = Integer.parseInt(JOptionPane.showInputDialog(
                            sistema.obtenerCatalogo() + "\nDigite la posición a prestar:"));
                    JOptionPane.showMessageDialog(null, sistema.prestarEquipo(posPrestar));
                    break;
                case 3:
                    int posDevolver = Integer.parseInt(JOptionPane.showInputDialog(
                            sistema.obtenerCatalogo() + "\nDigite la posición a devolver:"));
                    int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite los días de atraso:"));
                    JOptionPane.showMessageDialog(null, sistema.devolverEquipo(posDevolver, dias));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, sistema.obtenerMultas());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, sistema.obtenerResumen());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inexistente. Digite un número del 1 al 6.");
            }
        } while (opcion != 6);
    }
}

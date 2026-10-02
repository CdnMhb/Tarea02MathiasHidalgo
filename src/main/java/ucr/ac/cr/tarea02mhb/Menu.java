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
                    
                case 2:
                    
                case 3:
                    
                case 4:
                    
                case 5:
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inexistente. Digite un número del 1 al 6.");
            }
        } while (opcion != 6);
    }
}

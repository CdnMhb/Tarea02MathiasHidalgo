/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tarea02mhb;

/**
 *
 * @author mathi
 */
public class SistemaPrestamo {
    private Equipo[] equipos= new Equipo[5];
    private int[] diasAtraso= new int[5];

    public SistemaPrestamo() {
        equipos[0]= new Equipo("EQ01", "Cámara DSLR", "Cámara", 500);
        equipos[1]= new Equipo("EQ02", "Trípode", "Soporte", 500);
        equipos[2]= new Equipo("EQ03", "Micrófono", "Audio", 500);
        equipos[3]= new Equipo("EQ04", "Tableta gráfica", "Diseño", 500);
        equipos[4]= new Equipo("EQ05", "Kit de iluminación", "Iluminación", 800);
    }
}

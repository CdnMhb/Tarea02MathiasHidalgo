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
    
    public boolean validarPosicion(int posicion) {
        return posicion >= 1 && posicion <= equipos.length;
    }

    public String obtenerCatalogo() {
        String salida= "Catálogo de equipos:\n";
        for (int i = 0; i < equipos.length; i++) {
            salida += (i + 1) + ". " + equipos[i].obtenerInformacion() + "\n";
        }
        return salida;
    }

    public String prestarEquipo(int posicion) {
        if (!validarPosicion(posicion)) {
            return "Posición inválida. Debe estar entre 1 y " + equipos.length + ".";
        }
        Equipo equipo = equipos[posicion - 1];
        if (!equipo.isDisponible()) {
            return "El equipo " + equipo.getNombre() + " ya está prestado.";
        }
        equipo.prestar();
        diasAtraso[posicion - 1]= 0;
        return "Equipo prestado: " + equipo.getNombre();
    }

    public String devolverEquipo(int posicion, int dias) {
        if (!validarPosicion(posicion)) {
            return "Posición inválida. Debe estar entre 1 y " + equipos.length + ".";
        }
        if (dias < 0) {
            return "Los días de atraso no pueden ser negativos.";
        }
        Equipo equipo = equipos[posicion - 1];
        if (equipo.isDisponible()) {
            return "El equipo " + equipo.getNombre() + " no está prestado.";
        }
        equipo.devolver();
        diasAtraso[posicion - 1]= dias;
        return "Equipo devuelto: " + equipo.getNombre()
                + "\nDías de atraso: " + dias
                + "\nMulta: ₡" + equipo.calcularMulta(dias);
    }

    public String obtenerMultas() {
        String salida = "Multas del último préstamo:\n";
        for (int i = 0; i < equipos.length; i++) {
            salida += (i + 1) + ". " + equipos[i].getNombre()
                    + " - Días: " + diasAtraso[i]
                    + " - Multa: ₡" + equipos[i].calcularMulta(diasAtraso[i]) + "\n";
        }
        return salida;
    }

    public String obtenerResumen() {
        int disponibles = 0;
        int prestados = 0;
        int totalDias = 0;
        int totalMultas = 0;
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i].isDisponible()) {
                disponibles++;
            } else {
                prestados++;
            }
            totalDias += diasAtraso[i];
            totalMultas += equipos[i].calcularMulta(diasAtraso[i]);
        }
        return "Resumen:\n"
                + "Equipos disponibles: " + disponibles + "\n"
                + "Equipos prestados: " + prestados + "\n"
                + "Total de días de atraso: " + totalDias + "\n"
                + "Total de multas: ₡" + totalMultas;
    }
}

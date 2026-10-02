/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tarea02mhb;

/**
 *
 * @author mathi
 */
public class Equipo {
    private String codigo;
    private String nombre;
    private String tipo;
    private boolean disponible;
    private int tarifaMulta;

    public Equipo(String codigo, String nombre, String tipo, int tarifaMulta) {
        this.codigo= codigo;
        this.nombre= nombre;
        this.tipo= tipo;
        this.tarifaMulta= tarifaMulta;
        this.disponible= true;
    }
    
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public int getTarifaMulta() { return tarifaMulta; }
    public void setTarifaMulta(int tarifaMulta) { this.tarifaMulta = tarifaMulta; }

    public void prestar() {
        disponible= false;
    }

    public void devolver() {
        disponible= true;
    }

    public String obtenerInformacion() {
        String estado= disponible ? "Disponible" : "Prestado";
        return codigo + " - " + nombre + " - " + tipo + " - " + estado;
    }

    public int calcularMulta(int diasAtraso) {
        return diasAtraso * tarifaMulta;
    }
}

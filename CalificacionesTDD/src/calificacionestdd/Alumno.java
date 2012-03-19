/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionestdd;

/**
 *
 * @author EDGE XIII
 */
public class Alumno {
    
    private String codigo;
    private String nombre;
    private String modalidad;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
 
    public Alumno(String codigo, String nombre, String modalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modalidad = modalidad;
    }
    
}

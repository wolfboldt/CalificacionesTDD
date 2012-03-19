/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionestdd;

import java.util.ArrayList;

/**
 *
 * @author EDGE XIII
 */
public class Profesor {
    private ArrayList<Alumno> alumnos;
    
    public Profesor(){
        alumnos = new ArrayList<Alumno>();
    }
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
    
    public void registrarAlumno(String codigo, String nombre, String modalidad){
        for (Alumno alumno : alumnos){
            if (alumno.getCodigo().equals(codigo))
                throw new RuntimeException();
        }
        Alumno alumno = new Alumno (codigo, nombre, modalidad);
        alumnos.add(alumno);
    }
        
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import calificacionestdd.Profesor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EDGE XIII
 */
public class ProfesorTest {
    Profesor profesor = new Profesor();
    
    @Test
    public void profesorSinAlumnos(){
        assertEquals(0, profesor.getAlumnos().size());
    }
    @Test
    public void profesorConUnAlumno(){
        profesor.registrarAlumno("u20102010","Felipe Ramirez","Libre");
        assertEquals(1,profesor.getAlumnos().size());
    }
    @Test
    public void profesorConVariosAlumnos(){
        profesor.registrarAlumno("20102010", "Felipe Ramirez", "Libre");
        profesor.registrarAlumno("u20102020", "Elias Ramirez", "Regular");
        profesor.registrarAlumno("u20102030", "Deborah Ramirez", "Libre");
        assertEquals(3,profesor.getAlumnos().size());
    }
    @Test
    public void registrarAlumnos(){
        assertEquals(0,profesor.getAlumnos().size());
        profesor.registrarAlumno("u20102010", "Felipe Ramirez", "Libre");
        assertEquals(1, profesor.getAlumnos().size());
        profesor.registrarAlumno("20102010", "Felipe Ramirez", "Libre");
        profesor.registrarAlumno("u20102020", "Elias Ramirez", "Regular");
        profesor.registrarAlumno("u20102030", "Deborah Ramirez", "Libre");
        assertEquals(4,profesor.getAlumnos().size());
    }
   @Test
   public void registrarAlumnosConCodigoRepetido(){
        assertEquals(0,profesor.getAlumnos().size());
        profesor.registrarAlumno("u20102010", "Felipe Ramirez", "Libre");
        assertEquals(1, profesor.getAlumnos().size());
        profesor.registrarAlumno("20102010", "Felipe Ramirez", "Libre");
        profesor.registrarAlumno("u20102020", "Elias Ramirez", "Regular");
        profesor.registrarAlumno("u20102030", "Deborah Ramirez", "Libre");
        assertEquals(4,profesor.getAlumnos().size());
        try{
            profesor.registrarAlumno("u20102010", "Felipe Ramirez", "Libre");
            fail();
        }catch (Exception ex){
            
        }
   }
    
    public ProfesorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

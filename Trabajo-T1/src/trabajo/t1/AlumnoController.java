
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.t1;

import java.util.ArrayList;

/**
 *
 * @author UCA40408
 */
public class AlumnoController {
    ArrayList<Alumno> lista = new ArrayList<>();
    
    void agregarAlumno(Alumno alumno){
        try{
            lista.add(alumno);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    
    void mostrarRegistro(){
        for (Alumno i : lista){
            i.mostrar();
        }
    }
}

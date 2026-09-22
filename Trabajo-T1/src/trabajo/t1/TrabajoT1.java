/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.t1;

import java.util.Scanner;

/**
 *
 * @author UCA40408
 */
public class TrabajoT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno p= new Alumno();
        String rpta="s";
        AlumnoController c= new AlumnoController();
        System.out.println("Su primer estado del objeto");
        while(rpta.equals("s")){
                  
            System.out.println("Ingrese el tipo de documento");
            String tp = sc.nextLine();
            p.setTipo_doc(tp);

            System.out.println("Ingrese el número de documento");
            String num = sc.nextLine();
            p.setNum_doc(num);

            System.out.println("Ingrese el nombre");
            String n= sc.nextLine();
            p.setNombre(n);

            System.out.println("Ingresar situacion socioeconomica");
            String nro= sc.nextLine();
            p.setNivel_economico(nro);
                     
            c.agregarAlumno(p);
            System.out.println("Desea agregar otra persona: s/n ");
            rpta=sc.nextLine();
        }   
        c.mostrarRegistro();
    }
    
    public void Menu(int opcion, AlumnoController controlador){
    Alumno generico = new Alumno();
    Scanner scanner = new Scanner(System.in);
    switch (opcion) {
        case 1:
            System.out.println("Indique los datos del estudiante a agregar: ");
            
        case 2:
            agregarEstudiante(generico, controlador);
        case 3:
            System.out.println("Mostrando todos los estudiantes agregados hasta el momento: ");
            controlador.listarEstudiantes();
        }
    }
    
    public void agregarEstudiante(Alumno generico, AlumnoController controlador){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Indique el nombre: ");
        
    }
}

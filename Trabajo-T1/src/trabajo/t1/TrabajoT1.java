/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.t1;

import java.util.HashSet;
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
        int opcion = 0;
        AlumnoController c = new AlumnoController();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Opciones: ");
            System.out.println("1. Agregar estudiante - 2. Calcular Pension Estudiante - 3. Ver todos los estudiantes - 0. Salir");
            opcion = scanner.nextInt();
            Menu(opcion, c);
        }while(opcion != 0);
    }
    
    public static void Menu(int opcion, AlumnoController controlador){
    Alumno generico = new Alumno();
    Scanner scanner = new Scanner(System.in);
    switch (opcion) {
        case 1:
            try{
                System.out.println("Indique los datos del estudiante a agregar: ");
                Alumno agregado = agregarEstudiante(generico, controlador);
                controlador.agregarAlumno(agregado);
                break;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        case 2:
            try{
                System.out.println("Indique la pension del estudiante del que desea calcular la pension: ");
                String alum_dni = scanner.nextLine();
                Alumno alum = controlador.buscarEstudiante(alum_dni);
                int pension = alum.calcularPensionFinal(alum.getTipo_beca(), alum.getNivel_economico());
                System.out.println("La pension es de: " + pension);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            break;
        case 3:
            System.out.println("Mostrando todos los estudiantes agregados hasta el momento: ");
            controlador.mostrarRegistro();
            break;
        }
    }
    
    public static Alumno agregarEstudiante(Alumno generico, AlumnoController controlador){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Indique el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Indique el tipo de documento (Seleccione una opcion): ");
        System.out.println("1. DNI - 2. Carnet");
        int opt = scanner.nextInt();
        String tipo_doc = "";
        switch (opt) {
            case 1:
                tipo_doc = "DNI";
                System.out.println("Se uso dni");
                break;
            case 2: 
                tipo_doc = "Carnet";
                break;
        }
        System.out.println("Indique el numnero de documento: ");
        scanner.nextLine();
        String num = scanner.nextLine();
        
        System.out.println("Indique el nivel socioeconomico (Seleccione una opcion): ");
        System.out.println("1. A - 2. B - 3. C");
        opt = scanner.nextInt();
        String nivel_econ = "";
        switch (opt) {
            case 1:
                nivel_econ = "A";
                break;
            case 2: 
                nivel_econ = "B";
                break;
            case 3: 
                nivel_econ = "C";
                break;
        }
        
        System.out.println("Indique el tipo de beca (Seleccione una opcion): ");
        System.out.println("1. Completa - 2. Parcial");
        opt = scanner.nextInt();
        String tipo_beca = "";
        switch (opt) {
            case 1:
                tipo_beca = "Completa";
                break;
            case 2: 
                tipo_beca = "Parcial";
                break;
        }
        
        generico.setNombre(nombre);
        generico.setTipo_doc(tipo_doc);
        generico.setNum_doc(num);
        generico.setNivel_economico(nivel_econ);
        generico.setTipo_beca(tipo_beca);
        
        return generico;
    }
}

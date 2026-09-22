/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.t1;

/**
 *
 * @author UCA40408
 */
public class Alumno {
    private String nombre;
    private String tipo_doc;
    private String num_doc;
    private String nivel_economico;
    private String tipo_beca;

    public Alumno() {
    }

    public Alumno(String nombre, String tipo_doc, String num_doc, String nivel_economico, String tipo_beca) {
        this.nombre = nombre;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
        this.nivel_economico = nivel_economico;
        this.tipo_beca = tipo_beca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public void setNum_doc(String num_doc) {
        if(this.tipo_doc.equals("DNI")){
            if (validarDNI(num_doc)){
                this.num_doc = num_doc;
            }else{
                System.out.println("Valor invalido");
            }
        }else if(this.tipo_doc.equals("Carnet")){
            if (validarCarnet(num_doc)){
                this.num_doc = num_doc;
            }else{
                System.out.println("Valor invalido");
            }
        }
    }

    public void setNivel_economico(String nivel_economico) {
        this.nivel_economico = nivel_economico;
    }

    public void setTipo_beca(String tipo_beca) {
        this.tipo_beca = tipo_beca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public String getNivel_economico() {
        return nivel_economico;
    }

    public String getTipo_beca() {
        return tipo_beca;
    }
    
    Boolean validarDNI(String num_doc){
        if(num_doc.length() == 8){
            return true;
        }
        return false;
    }
    
    Boolean validarCarnet(String num_doc){
        if(num_doc.length() == 11){
            return true;
        }
        return false;
    }
    
    
}

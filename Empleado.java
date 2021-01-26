/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;

/**
 *
 * @author EquipoB
 */
public class Empleado {
    String nombre;
    int numEmpleado;
    String contrasena;
    int grado;
    
    
    public Empleado (){
    }
    
    
    /**
     * contiene las variables que utilizaremos
     * @param nombre
     * @param numEmpleado
     */
    public Empleado(String nombre, int numEmpleado, String contrasena, int grado){
        this.nombre=nombre;
        this.numEmpleado=numEmpleado;
        this.contrasena=contrasena;
        this.grado=grado;
        
        
    }

    
    /**
     * metodo getNombre que regresa el nombre
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * devuelve la vriable una vez asignado su valor 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo getEmpleado que regresa el numero del empleado
     * @return numEmpleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * devuelve la vriable una vez asignado su valor 
     * @param numEmpleado 
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return contrasena tipo String
     */
    public String getContrasena() {
        return contrasena;
    }
    
    /**
     * 
     * @param contrasena  setContraseña tipo String
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
/**
 * 
 * @return grado tipo int 
 */
    public int getGrado() {
        return grado;
    }
/**
 * 
 * @param grado setGrado grado tipo int
 */    
    
    public void setGrado(int grado) {
        this.grado = grado;
    }
 /***
  * 
  * @return Empleado metodo toString tipo String
  */   
    
    @Override

    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado +  '}';
    }
       

   
}
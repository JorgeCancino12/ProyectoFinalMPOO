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
public class AparatoAmbiente {
    
    boolean reproduciendo;
    String cancion;
    boolean encender;
    
/**
 * 
 */
    public AparatoAmbiente() {
    }
/**
 * 
 * @param reproduciendo reproduciendo tipo boolean
 * @param cancion cancion tipo String
 * @param encender encender tipo boolean 
 */
    public AparatoAmbiente(boolean reproduciendo, String cancion, boolean encender) {
        this.reproduciendo = reproduciendo;
        this.cancion = cancion;
        this.encender = encender;
    }
/**
 * 
 * @return reproduciendo metodo isReproduciendo 
 */
    public boolean isReproduciendo() {
        return reproduciendo;
    }
/**
 * 
 * @param reproduciendo setPresupuesto reproduciendo tipo booleano
 */
    public void setReproduciendo(boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }
/**
 * 
 * @return cancion metodo getCancion
 */
    public String getCancion() {
        return cancion;
    }
/**
 * 
 * @param cancion setCancion cancion tipo String
 */
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
/**
 * 
 * @return encender tipo boolean
 */
    public boolean isEncender() {
        return encender;
    }
/**
 * 
 * @param encender setEncender tipo boolean
 */
    public void setEncender(boolean encender) {
        this.encender = encender;
    }
/**
 * 
 * @return toString Aparato ambiente tipo String
 */
    @Override
    public String toString() {
        return "AparatoAmbiente{" + "reproduciendo=" + reproduciendo + ", cancion=" + cancion + ", encender=" + encender + '}';
    }
    /**
     * cambia encender tipo boolean
     */
    void encender(){
        if(encender=true){
            System.out.println("el aparato ambiente esta encendido");
            encender=true;
            }else{
            System.out.println("el aparato ambiente esta apagado");
            encender = false;
        }
    }
    
    /**
     * cambia reproduciendo tipo boolean
     */
    void reproduccion(){
        if(reproduciendo==true){
            System.out.println("el aparato ambiente esta reprouciendo ");
            reproduciendo=true;
            }else{
            System.out.println("el aparato ambiente esta pausado");
           reproduciendo=false;
        }
    
    }

   
    
    
}

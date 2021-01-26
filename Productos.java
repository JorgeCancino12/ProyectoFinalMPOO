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
public class Productos {
    String nombreProducto;
    int codigoBarra;
    float precio;
    
    public Productos(){
    }
    /**
     * 
     * @param nombreProducto nombreProducto tipo String
     * @param codigoBarra codigoBarra tipo int
     * @param precio precio tipo float
     */
    public Productos(String nombreProducto, int codigoBarra, float precio){
        this.nombreProducto=nombreProducto;
        this.codigoBarra=codigoBarra;
        this.precio=precio;
    }
    /**
     * 
     * @return nombreProducto metodo getNombreProducto
     */
    public String getNombreProducto(){
        return nombreProducto;
    }
    /**
     * 
     * @param nombreProducto setNombreProducto nombreProducto tipo String 
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    /**
     * 
     * @return codigoBarra metodo getCodigoBarra
     */
    public float getCodigoBarra(){
        return codigoBarra;
    }
    /**
     * 
     * @param codigoBarra setCodigoBarras codigoBarra tipo int 
     */
    public void setCodigoBarras(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    
/**
 * 
 * @return precio metodo getPrecio
 */
    public float getPrecio(){
        return precio;
    }
    /**
     * 
     * @param precio setPrecio precio tipo float 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /**
     * 
     * @return Producto metodo toString tipo String
     */
    @Override

    public String toString() {
    return "Producto: " + nombreProducto + " su codigo de barras es: " + codigoBarra + "su precio es de: " + precio;
    }
    
    
}

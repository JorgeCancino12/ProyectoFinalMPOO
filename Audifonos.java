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
public class Audifonos extends Productos{
    String tipo;
    
    public Audifonos(){
    }
   /***
     * @param nombreProducto nombreProducto tipo String
     * @param codigoBarra codigoBarra tipo int
     * @param precio precio tipo float
     * @param tipo tipo de tipo String
    */ 
    public Audifonos(String nombreProducto, int codigoBarra, float precio, String tipo){
        super(nombreProducto, codigoBarra, precio);
        this.tipo = tipo;
    }

   /**
    * 
    * @return tipo metodo getTipo
    */     
    public String geTipo(){
        return tipo;
    }
    /**
     * 
     * @param tipo setTipo Tipo String
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   /**
    * 
    * @return Audifinos toString tipo String
    */ 
    @Override
    public String toString() {
        return super.toString() + " El tipo de audifonos es: " + tipo;
    }
    
        
    
}
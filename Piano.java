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
public class Piano extends Productos{
    String marca;
    String modelo;
    
    public Piano(){
    }
    /**
     * 
     * @param nombreProducto nombreProducto tipo String
     * @param codigoBarra codigoBarra tipo int
     * @param precio precio tipo float
     * @param marca marca tipo String
     * @param modelo modelo tipo String
     */
    public Piano(String nombreProducto, int codigoBarra, float precio,String marca,String modelo){
        super(nombreProducto, codigoBarra, precio);
        this.marca=marca;
        this.modelo=modelo;
        
    }
    /**
     * 
     * @return marca metodo getMarca
     */
    public String getMarca(){
        return marca;
    }
    /**
     * 
     * @param marca setMarca marca tipo String
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * 
     * @return modelo tipo String 
     */
    public String getModelo(){
        return modelo;
    }
    /**
     * 
     * @param modelo setModelo modelo tipo String
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * 
     * @return Pianp toString tipo String 
     */
    @Override
    public String toString() {
        return super.toString() + " La marca del piano es : " + marca + " modelo : " + modelo;
    }
    
    
    
}
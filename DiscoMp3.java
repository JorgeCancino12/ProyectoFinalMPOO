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
public class DiscoMp3 extends Productos{
    
    String artista;
    String album;
    int numeroCanciones;
    
    public DiscoMp3(){
        
    }
    /**
     * 
     * @param nombreProducto nombreProducto tipo String
     * @param codigoBarra codigoBarra tipo int
     * @param precio precio tipo float
     * @param artista artista tipo String
     * @param album album tipo String
     * @param numeroCanciones numeroCanciones tipo int
     */
    public DiscoMp3(String nombreProducto, int codigoBarra, float precio,String artista, String album ,int numeroCanciones){
        super(nombreProducto, codigoBarra, precio);
        this.artista = artista;
        this.album = album; 
        this.numeroCanciones = numeroCanciones;
    }
 /**
  * 
  * @return artista tipo String
  */       
    public String getArtista(){
        return artista;
    }
   /**
    * 
    * @param artista setArtista artista tipo String 
    */ 
    public void setArtista(String artista) {
        this.artista = artista;
    }
    /**
     * 
     * @return album tipo String
     */
    public String getAlbum(){
        return album;
    }
    /**
     * 
     * @param album setAlbum album tipo String
     */
    public void setAlbum(String album) {
        this.album = album;
    }
    /**
     * 
     * @return numeroCanciones tipo String
     */
    public int getNumeroCanciones(){
        return numeroCanciones;
    }
    /**
     * 
     * @param numeroCanciones setNumeroCanciones numeroCanciones tipo int
     */
    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }
    
    /**
     * 
     * @return DiscoMp3 toString tipo String
     */
    @Override
    public String toString() {
        return super.toString() + " El disco es de : " + artista + " album " + album + " y tiene " + numeroCanciones + "canciones";
    }
}
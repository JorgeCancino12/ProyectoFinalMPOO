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
public class VideoPlayer extends AparatoAmbiente {
    String calidadVideo;
    String tipo;
    public VideoPlayer() {
    } 
/**
 * 
 * @param calidadVideo calidadVideo tipo String
 * @param tipo tipo tipo String
 * @param reproduciendo reproduciendo tipo boolean
 * @param cancion cancion tipo String
 * @param encender encender tipo boolean 
 */
    public VideoPlayer(String calidadVideo, String tipo, boolean reproduciendo, String cancion, boolean encender) {
        super(reproduciendo, cancion, encender);
        this.calidadVideo = calidadVideo;
        this.tipo = tipo;
    }
/**
 * 
 * @return calidadVideo metodo getCalidadVideo 
 */
    public String getCalidadVideo() {
        return calidadVideo;
    }
/**
 * 
 * @param calidadVideo setCalidadVideo calidadVideo tipoString 
 */
    public void setCalidadVideo(String calidadVideo) {
        this.calidadVideo = calidadVideo;
    }
/**
 * 
 * @return tipo metodo getTipo
 */
    public String getTipo() {
        return tipo;
    }
/**
 * 
 * @param tipo setTipo tipo String
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/**
 * 
 * @param Video metodovideoR Video tipo String
 */
    void videoR(String Video){
        cancion=Video;
        System.out.println("se esta reproduciendo un video");
    }
    /**
     * 
     * @return VideoPlayer toString tipo String
     */
    @Override
    public String toString() {
         return super.toString()+ "VideoPlayer{" + "calidadVideo=" + calidadVideo + ", tipo=" + tipo + '}';
    }

   

    
    
    
    
    
    
}

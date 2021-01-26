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
public class MusicPlayer extends AparatoAmbiente {
 String tipo;

    public MusicPlayer() {
    }
/**
 * 
 * @param tipo tipo tipo String
 * @param reproduciendo reproduciendo tipo boolean
 * @param cancion cancion tipo String
 * @param encender encender tipo boolean 
 */
    public MusicPlayer(String tipo, boolean reproduciendo, String cancion, boolean encender) {
        super(reproduciendo, cancion, encender);
        this.tipo = tipo;
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
 * @param tipo tipo String 
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * 
     * @param song song de tipo String
     */
void cancionR(String song){
        cancion = song;
        System.out.println("se esta reproduciendo la cancion: "+ cancion);
    }
/**
 * 
 * @return MusicPlayer toString tipo String
 */
    @Override
    public String toString() {
         return super.toString()+ "MusicPlayer{" + "tipo=" + tipo + '}';
    }

    
    
    
  
    void cambiarC(String Ncancion){
        cancion = Ncancion;
        System.out.println("se esta reproduciendo la cancion: "+ cancion);
    }
}

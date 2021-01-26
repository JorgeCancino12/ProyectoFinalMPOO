/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author EquipoB
 */
public class Ticket {

    public Ticket() {
    }
    /**
     * 
     * @param tCarrito tCarritode tipo ArrayList 
     * @param Tprecio Tprecio tipo float
     */
     void crearTicket(ArrayList<String> tCarrito,float Tprecio){
         
         LocalTime startLocalTime = LocalTime.now();
   String Pago=tCarrito.toString();
   String carrito= "Ticket generado, fecha: " +LocalDate.now()+ "\n Hora: "+ LocalTime.now( )+ "\n" +Pago + "\n"+ "El monto a pagar es: "+Tprecio;
   
            try{
             String ruta = "C:/Users/Estudio/Documents/ticket.txt";
             File ticket = new File(ruta);
             if(!ticket.exists()){
                 ticket.createNewFile();
             }
             FileWriter tx = new FileWriter(ticket);
             BufferedWriter xt= new BufferedWriter(tx);
             xt.write(carrito);
             xt.close();
             
         }catch(IOException e){
             e.printStackTrace();
             System.out.println("Se creo Ticket");
         }
         
        
    }

}

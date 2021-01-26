/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.reflect.Array.get;
import java.util.ArrayList;
import static javax.swing.UIManager.get;
/**
/**
 *
 * @author EquipoB
 */
public class PROYECTOFINAL {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
        LocalTime startLocalTime = LocalTime.now();
        
        String texto = "";
	BufferedReader br;
        
        int i = 0;
        float sumaPrecios = 0 ;
        
        ArrayList<String> carrito = new ArrayList<String>();
        
        boolean salir = false;
        System.out.println("La fecha actual es: " +   LocalDate.now() +"       Hora " +  LocalTime.now( ));
        System.out.println("bienvenido ");
        
        Empleado empleado0 = new Empleado("Loxs",123,"LOXS", 3);
        Empleado empleado1 = new Empleado("jose",321,"loxs", 1);
        Empleado empleado2 = new Empleado("manco",234,"ll", 2);


        Audifonos producto0 = new Audifonos("Audifonos A50", 123, 4000,"headsets");
        DiscoMp3 producto1 = new DiscoMp3("Disco compacto",321, 1000,"Iron Maiden", "The Number of the Beast", 8);
        Piano producto2 = new Piano("Piano", 415, 18000, "yamaha", "cf" );
        
        VideoPlayer ap2Ambiente =new VideoPlayer();
        MusicPlayer ap1Ambiente = new MusicPlayer();
       
        ArrayList codigoBarras = new ArrayList();
        codigoBarras.add(producto0.getCodigoBarra());
        codigoBarras.add(producto1.getCodigoBarra());
        codigoBarras.add(producto2.getCodigoBarra());
        
        ArrayList <String> nombreProducto = new ArrayList();
        nombreProducto.add(producto0.getNombreProducto());
        nombreProducto.add(producto1.getNombreProducto());
        nombreProducto.add(producto2.getNombreProducto());
        
        ArrayList <Float> precioProducto = new ArrayList();
        precioProducto.add(producto0.getPrecio());
        precioProducto.add(producto1.getPrecio());
        precioProducto.add(producto2.getPrecio());
        
        
        ArrayList <String> toStrings = new ArrayList();
        toStrings.add(producto0.toString());
        toStrings.add(producto1.toString());
        toStrings.add(producto2.toString());
        
        //System.out.println(toStrings.get(1));
        
        ArrayList<String> nombreEmpleados = new ArrayList();
        nombreEmpleados.add(empleado0.getNombre());
        nombreEmpleados.add(empleado1.getNombre());
        nombreEmpleados.add(empleado2.getNombre());
                                    
        ArrayList<String> contrasenaEmpleados = new ArrayList();
        contrasenaEmpleados.add(empleado0.getContrasena());
        contrasenaEmpleados.add(empleado1.getContrasena());
        contrasenaEmpleados.add(empleado2.getContrasena());
        
        ArrayList numEmpleados = new ArrayList();
        numEmpleados.add(empleado0.getNumEmpleado());
        numEmpleados.add(empleado1.getNumEmpleado());
        numEmpleados.add(empleado2.getNumEmpleado());
        
        System.out.println("\n"+empleado0);
        System.out.println("\n"+empleado1);
        System.out.println("\n"+empleado2+"\n");
        
        ArrayList gradoEmpleados = new ArrayList();
        gradoEmpleados.add(empleado0.getGrado());
        gradoEmpleados.add(empleado1.getGrado());
        gradoEmpleados.add(empleado2.getGrado());
        
        ArrayList <String> toStringE;
        toStringE = new ArrayList();
        toStringE.add(empleado0.toString());
        toStringE.add(empleado1.toString());
        toStringE.add(empleado2.toString());
        
        //System.out.println(numEmpleados.get(1));
        while(!salir){
            
           System.out.println("1. Ingresar al sistema como trabajador");
           System.out.println("2. Ingresar al sistema como cliente");
           System.out.println("3. Buscar un articulo");
           System.out.println("4. Salir");
            
           System.out.println("Escribe una de las opciones");
           KeyboardInput in = new KeyboardInput(); 
           int opcion = in.readInteger();
           
           int j = 3;
           int k = 3;
            
            switch(opcion){
               
               
               case 1:
               
                    
                    System.out.println("Escribe el numero de empleado");
                    KeyboardInput in1 = new KeyboardInput(); 
                    int numEmpleado = in1.readInteger();
                    System.out.println("Escribe tu contraseña");
                    KeyboardInput in2 = new KeyboardInput(); 
                    String contrasena=in2.readString();

                    
                    if((numEmpleados.contains(numEmpleado)) && (contrasenaEmpleados.contains(contrasena)) && ( numEmpleados.indexOf(numEmpleado) == contrasenaEmpleados.indexOf(contrasena) )   ){
                    
                        int grado = (int) gradoEmpleados.get(numEmpleados.indexOf(numEmpleado));
                        
                        boolean salir1 = false;

                        while(!salir1){
                            
                            System.out.println("Bienvenido empleado con numero "+ numEmpleado + " esperamos poder ayudarte");
                            System.out.println("1. Cobrar");
                            System.out.println("2. Buscar");
                            System.out.println("3. Agregar o retirar objetos del inventario ");
                            System.out.println("4. Agrega o retira a un usuario ");
                            System.out.println("5.Iniciar Aparato Ambiente");
                            System.out.println("6. Salir");

                            System.out.println("Escribe una de las opciones");
                            KeyboardInput in3 = new KeyboardInput();
            
                            int opcion1 = in3.readInteger();
                            
                            switch(opcion1){
                                case 1:
                                    if(grado >= 2){
                                        System.out.println("Seccion de cobro ");
                                        
                                        Scanner sn = new Scanner(System.in);
                                        boolean salir5 = false;
                                        int opcion5 = 0; //Guardaremos la opcion del usuario

                                        while(!salir5){

                                            System.out.println("1. Agregar articulo");
                                            System.out.println("2. Retire un articulo");
                                            System.out.println("3. Ticket");
                                            System.out.println("4. Salir");

                                            System.out.println("Escribe una de las opciones");
                                            opcion5 = sn.nextInt();

                                            switch(opcion5){
                                                case 1 :
                                
                                                System.out.println("Aqui puede buscar productos por numero, despues de colocar el numero agregue .0");
                                                    KeyboardInput cb = new KeyboardInput(); 
                                                    float busquedacliente = cb.readFloat();
                                                    
                                                    
                                                    if(codigoBarras.contains(busquedacliente)){
                                                        
                                                       carrito.add(toStrings.get(codigoBarras.indexOf(busquedacliente)));
                                                       
                                                       System.out.println("El tamaño de la lista: " +carrito.size());
                                                       sumaPrecios += precioProducto.get(codigoBarras.indexOf(busquedacliente));
                                                      
                                                    }else{
                                                        System.out.println("Verifique el codigo de barras sea el correcto ");
                                                    }
                        
                          
                                                      
                                                   
                        
                                                    System.out.println("El carrito contiene los articulos: ");
                                                    for (String a : carrito){
                                                         a= carrito.indexOf(a) + " " + a;
                                                         
                                                         System.out.println( a );
                                                             }
                                                    
                                
                                                    break;
                                                  case 2:
                                
                                                    System.out.println("Digita el numero de articulo que desea eliminar (0,1,2...) ");
                                                    KeyboardInput rem = new KeyboardInput();
                                                    String b = rem.readString();
                                                    int z = Integer.parseInt(b);
                                                    carrito.remove(z);
                                                    System.out.println("Para confirmar la eliminacion de este articulo por favor dijite su codigo de barras");
                                                    KeyboardInput ep = new KeyboardInput(); 
                                                    float eliminarProducto = ep.readFloat();
                                                    
                                                    
                                                    if(codigoBarras.contains(eliminarProducto)){
                                                       
                                                       
                                                       System.out.println("El tamaño de la lista : " +carrito.size());
                                                        System.out.println("El producto eliminado fue: "+ toStrings.get(codigoBarras.indexOf(eliminarProducto)));
                                                       sumaPrecios -= precioProducto.get(codigoBarras.indexOf(eliminarProducto));
                                                      
                                                    }else{
                                                        System.out.println("Verifique el codigo de barras sea el correcto ");
                                                    }
                                                     
                                                    System.out.println("El carrito contiene los articulos: ");
                                                    for (String a : carrito){
                                                         a= carrito.indexOf(a) + " " + a;
                                                         
                                                         System.out.println( a );
                                                             }
                                                    break;
                                                 case 3:
                                                    System.out.println("realice el cobro");
                                                    Ticket tTicket = new Ticket();
                                                    tTicket.crearTicket(carrito, sumaPrecios);
                                                     System.out.println("Conservar este ticket como comprobante de labor de venta");
                                                    break;
                                                 case 4:
                                                    salir5=true;
                                                    break;
                                                 default:
                                                    System.out.println("Solo números entre 1 y 4");
                                            }

                                        }
   
                                    }
                                     break;
                                    
                                    case 2:
                                    System.out.println("Busca productos");
                                    
                                    Scanner sn = new Scanner(System.in);
                                    boolean salir3 = false;
                                    int opcion3; //Guardaremos la opcion del usuario

                                    while(!salir3){

                                        
                                        System.out.println("1. Buscar a partir de palabras");
                                        System.out.println("2. Salir");

                                        System.out.println("Escribe una de las opciones");
                                        opcion3 = sn.nextInt();

                                        switch(opcion3){
                                            
                                            case 1:
                                                System.out.println("Has seleccionado la opcion 1");

                                                System.out.println("Aqui puede buscar productos por su nombre");
                                                KeyboardInput in5 = new KeyboardInput(); 
                                                String busqueda1 = in5.readString();

                                                if(nombreProducto.contains(busqueda1)){
                                                    
                                                    System.out.println(toStrings.get(nombreProducto.indexOf(busqueda1)));
                                                }else{
                                                    System.out.println("Lo sentimos no encontramos el producto que busca vuelva a intentarlo o pregunte a algun vendedor ");
                                                    }

                                                break;
                                             case 2:
                                                salir3=true;
                                                break;
                                             default:
                                                System.out.println("Solo números entre 1 y 2");
                                        }

                                    }
                                    
                                    break;
                                 case 3:
                                    if(grado >=1){
                                        
                                        
                                        System.out.println("Agrega o retira un producto");
                                        
                                        Scanner sn3 = new Scanner(System.in);
                                        boolean salir4 = false;
                                        int opcion4 = 0; //Guardaremos la opcion del usuario

                                        while(!salir4){

                                            System.out.println("1. Retira un producto");
                                            System.out.println("2. Agrega un producto");
                                            System.out.println("3. Salir");

                                            System.out.println("Escribe una de las opciones");
                                            opcion4 = sn3.nextInt();

                                            switch(opcion4){
                                                case 1:
                                                    System.out.println("Retira un producto por su codigo de barras ");
                                                    KeyboardInput in5 = new KeyboardInput(); 
                                                    float retirar = in5.readFloat();
                                                    if(codigoBarras.contains(retirar)){
                                                        System.out.println("Se retira el producto: "+ toStrings.get(codigoBarras.indexOf(retirar))); 
                                                        int posicion = codigoBarras.indexOf(retirar) ;
                                                        nombreProducto.remove(posicion);
                                                        precioProducto.remove(posicion);
                                                        toStrings.remove(posicion);
                                                        codigoBarras.remove(posicion);
                                                        System.out.println("se ha retirado el producto correctamente");
                                                    }else{
                                                        System.out.println("Lo sentimos no encontramos el codigo de barras que busca verifique que sea el numero correcto");
                                                        }
                                                    
                                                    break;
                                                case 2:
                                                  
                                                    System.out.println("Ingrese el nombre del producto");
                                                    KeyboardInput in7 = new KeyboardInput(); 
                                                    String inNom = in7.readString();
                                                    
                                                    if(nombreProducto.contains(inNom)){
                                                    
                                                    System.out.println("ese nombre ya esta en uso");
                                                    }else{
                                                        //nombreProducto.add(k,inNom);
                                                        System.out.println("Ingrese el codigo de barras que tendra este producto");
                                                        KeyboardInput in8 = new KeyboardInput(); 
                                                        int inCodigo = in8.readInteger();
                                                           
                                                      if(codigoBarras.contains(inCodigo)){

                                                            System.out.println("Este codigo ya esta en uso ");
                                                        }else{
                                                            //codigoBarras.add(k, inCodigo);
                                                            System.out.println("ingrese el precio que tendra este producto");
                                                            
                                                            KeyboardInput in9 = new KeyboardInput(); 
                                                            float inPrecio = in9.readFloat();
                                                            
                                                            switch (k) {
                                                                case 3:
                                                                    Productos producto3 = new Productos(inNom,inCodigo,inPrecio);
                                                                    codigoBarras.add(producto3.getCodigoBarra());
                                                                    nombreProducto.add(producto3.getNombreProducto());
                                                                    precioProducto.add(producto3.getPrecio());
                                                                    toStrings.add(producto3.toString());
                                                                    k++;
                                                                    break;
                                                                case 4:
                                                                    Productos producto4 = new Productos(inNom,inCodigo,inPrecio);
                                                                    codigoBarras.add(producto4.getCodigoBarra());
                                                                    nombreProducto.add(producto4.getNombreProducto());
                                                                    precioProducto.add(producto4.getPrecio());
                                                                    toStrings.add(producto4.toString());
                                                                    k++;
                                                                    break;
                                                                case 5:
                                                                    Productos producto5 = new Productos(inNom,inCodigo,inPrecio);
                                                                    codigoBarras.add(producto5.getCodigoBarra());
                                                                    nombreProducto.add(producto5.getNombreProducto());
                                                                    precioProducto.add(producto5.getPrecio());
                                                                    toStrings.add(producto5.toString());
                                                                    k++;
                                                                    break;
                                                                case 6:
                                                                    Productos producto6 = new Productos(inNom,inCodigo,inPrecio);
                                                                    codigoBarras.add(producto6.getCodigoBarra());
                                                                    nombreProducto.add(producto6.getNombreProducto());
                                                                    precioProducto.add(producto6.getPrecio());
                                                                    toStrings.add(producto6.toString());
                                                                    k++;
                                                                    break;
                                                                case 7:
                                                                    Productos producto7 = new Productos(inNom,inCodigo,inPrecio);
                                                                    codigoBarras.add(producto7.getCodigoBarra());
                                                                    nombreProducto.add(producto7.getNombreProducto());
                                                                    precioProducto.add(producto7.getPrecio());
                                                                    toStrings.add(producto7.toString());
                                                                    k++;
                                                                    break;
                                                                case 8:
                                                                    Productos producto8 = new Productos(inNom,inCodigo,inPrecio);
                                                                    codigoBarras.add(producto8.getCodigoBarra());
                                                                    nombreProducto.add(producto8.getNombreProducto());
                                                                    precioProducto.add(producto8.getPrecio());
                                                                    toStrings.add(producto8.toString());
                                                                    k++;
                                                                    break;
                                                                case 9:
                                                                    Productos producto9 = new Productos(inNom,inCodigo,inPrecio);
                                                                    codigoBarras.add(producto9.getCodigoBarra());
                                                                    nombreProducto.add(producto9.getNombreProducto());
                                                                    precioProducto.add(producto9.getPrecio());
                                                                    toStrings.add(producto9.toString());
                                                                    k++;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                               
                                                                System.out.println("el producto fue registrado correctamente");
                                                               System.out.println(k);
                                                                
                                                                 
                                                                i++;
                                                                
                                            
                                                            }
                                                    
                                                    
                                                    }
                                                    
                                                    break;

                                                 case 3:
                                                    salir4=true;
                                                    break;
                                                 default:
                                                    System.out.println("Solo números entre 1 y 3");
                                            }

                                        }
                                        
                                        
                                        
                                        
                                    }else{
                                        System.out.println("Por favor verifique que tenga el grado para tener acceso a esta funcion ");
                                    }
                                    break;
                                    
                                    
                                case 4:
                                    if(grado==3){
                                    System.out.println("Agrega o retira a un usuario");
                                        
                                        Scanner sn3 = new Scanner(System.in);
                                        boolean salir4 = false;
                                        int opcion4 = 0; //Guardaremos la opcion del usuario

                                        while(!salir4){

                                            System.out.println("1. Retira a un usuario ");
                                            System.out.println("2. Agrega a un usuario ");
                                            System.out.println("3. Salir");

                                            System.out.println("Escribe una de las opciones");
                                            opcion4 = sn3.nextInt();

                                            switch(opcion4){
                                        
                                                    
                                                    case 1:
                                                    System.out.println("Retira un usuario por numero de trabajador ");
                                                    KeyboardInput in10 = new KeyboardInput(); 
                                                    int retirarU = in10.readInteger();
                                                    if(numEmpleados.contains(retirarU)){
                                                        //System.out.println("se retira "+ toStringE.get(nombreEmpleados.indexOf(retirarU)));
                                                        int posicion = numEmpleados.indexOf(retirarU) ;
                                                        nombreEmpleados.remove(posicion);
                                                        contrasenaEmpleados.remove(posicion);
                                                        numEmpleados.remove(posicion);
                                                        
                                                        System.out.println("se ha retirado al usuario correctamente");
                                                    }else{
                                                        System.out.println("Lo sentimos no encontramos el trabajador que busca verifique que sea el numero correcto");
                                                        }
                                                    
                                                    break;
                                                case 2:
                                                      
                                                    System.out.println("Para agregar a un empleado tendras que rellenar el siguiente formulario"
                                                            + "\n" + "Nota: considere que no poddra salir de esta opcion hasta que finalice con el registro");
                                                    
                                                    System.out.println("Ingrese el nombre del empleado: ");
                                                    KeyboardInput in6 = new KeyboardInput(); 
                                                    String nombreE = in6.readString();
                                                    
                                                    System.out.println("Ingrese su numero de emleado");
                                                    KeyboardInput in7 = new KeyboardInput(); 
                                                    int inNumE = in7.readInteger();
                                                    
                                                    if(numEmpleados.contains(inNumE)){
                                                    
                                                    System.out.println("este numero ya esta en uso");
                                                    }else{
                                                        System.out.println("Ingrese la contraseña que tendra este nuevo usuario de 4 caracteres como minimo");
                                                        KeyboardInput in8 = new KeyboardInput(); 
                                                        String inContrasena = in8.readString();

                                                        if(inContrasena.length() < 4){

                                                            System.out.println("ingrese una contraseña mayor a 3 caracteres");
                                                        }else{
                                                            System.out.println("ingrese el grado que tendra el empleado");
                                                            
                                                            KeyboardInput in9 = new KeyboardInput(); 
                                                            int inGrado = in9.readInteger();
                                                            
                                                            
                                                            if(inGrado >= 0 && inGrado <= 3){
                                                                switch (j) {
                                                                    case 3:
                                                                        Empleado empleado3 = new Empleado(nombreE,inNumE,inContrasena,inGrado);
                                                                        nombreEmpleados.add(empleado3.getNombre());
                                                                        contrasenaEmpleados.add(empleado3.getContrasena());
                                                                        numEmpleados.add(empleado3.getNumEmpleado());
                                                                        gradoEmpleados.add(empleado3.getGrado());
                                                                        toStringE.add(empleado3.toString());
                                                                        j++;
                                                                        break;
                                                                        case 4:
                                                                        Empleado empleado4 = new Empleado(nombreE,inNumE,inContrasena,inGrado);
                                                                        nombreEmpleados.add(empleado4.getNombre());
                                                                        contrasenaEmpleados.add(empleado4.getContrasena());
                                                                        numEmpleados.add(empleado4.getNumEmpleado());
                                                                        gradoEmpleados.add(empleado4.getGrado());
                                                                        toStringE.add(empleado4.toString());
                                                                        j++;
                                                                        break;
                                                                        case 5:
                                                                        Empleado empleado5 = new Empleado(nombreE,inNumE,inContrasena,inGrado);
                                                                        nombreEmpleados.add(empleado5.getNombre());
                                                                        contrasenaEmpleados.add(empleado5.getContrasena());
                                                                        numEmpleados.add(empleado5.getNumEmpleado());
                                                                        gradoEmpleados.add(empleado5.getGrado());
                                                                        toStringE.add(empleado5.toString());
                                                                        j++;
                                                                        break;
                                                                }

                                                                System.out.println("el usuario fue registrado correctamente");
                                                                System.out.println(j);
                                                                i++;
                                                                
                                                                
                                                                
                                                            }else{
                                                                System.out.println("solo valores de 0 a 3");
                                                            }


                                                            }
                                                    
                                                    
                                                    }
                                                    
                                                    break;

                                                 case 3:
                                                    salir4=true;
                                                    break;
                                                 default:
                                                    System.out.println("Solo números entre 1 y 3");
                                            }

                                        }
                                    
                                        
                                    } else{
                                        System.out.println("Lo siento no tienes el grado para agregar o retirar usuarios");
                                    }   
                                    
                                    break;
                                case 5: 
                                   System.out.println("Aparato de ambiente iniciado");
                                        
                                        Scanner sn7 = new Scanner(System.in);
                                        boolean salir5 = false;
                                        int opcion11 = 0; //Guardaremos la opcion del usuario

                                        while(!salir5){

                                            System.out.println("1. Usar MusicPlayer ");
                                            System.out.println("2. Usar VidePlayer ");
                                            System.out.println("3. Salir");
                                            //System.out.println(ap1Ambiente.encender);

                                            System.out.println("Escribe una de las opciones");
                                            opcion11 = sn7.nextInt();

                                            switch(opcion11){
                                                case 1:
                                                    do{
                                                    System.out.println("Music Player prendido");
                                                    ap1Ambiente.setEncender(true);
                                                    ap1Ambiente.setReproduciendo(true);
                                                    ap1Ambiente.setTipo("MusicPLayer");
                                                    System.out.println("Ingrese la cancion a escuchar");
                                                    KeyboardInput in11 = new KeyboardInput(); 
                                                    String nombreC = in11.readString();
                                                    ap1Ambiente.cancionR(nombreC);
                                                    ap1Ambiente.reproduccion();
                                                    
                                                    System.out.println("Quieres cambiar la cancion?   1:no    2:si");
                                                    KeyboardInput in12 = new KeyboardInput(); 
                                                    int inNumNC = in12.readInteger();
                                                    if(2!=inNumNC){
                                                        System.out.println("Quieres pausar la rola   1:no      2: si");
                                                        KeyboardInput in13 = new KeyboardInput(); 
                                                        int inNumP = in13.readInteger();
                                                        if(inNumP==2){
                                                            ap1Ambiente.setReproduciendo(false);
                                                            ap1Ambiente.reproduccion();
                                                            System.out.println("Quieres Reanudar   1:no    2:si");
                                                            KeyboardInput in14 = new KeyboardInput(); 
                                                            int inNumR = in14.readInteger();
                                                            if(inNumR==2){
                                                             ap1Ambiente.setReproduciendo(true); 
                                                             ap1Ambiente.reproduccion();
                                                             //System.out.println("Cancion "+nombreC+ " finalizo");
                                                            }else if(inNumR==1){
                                                        System.out.println("Quieres apagar    1:si      2 no");
                                                        KeyboardInput in15 = new KeyboardInput(); 
                                                        int inNumA = in15.readInteger();
                                                        
                                                        if(inNumA == 1){
                                                            ap1Ambiente.encender = false;
                                                            System.out.println(ap1Ambiente);
                                                        }
                                                        }
                                                    }    
                                                    
                                                    }
                                                        System.out.println("Cancion "+nombreC+ " finalizo");
                                                    }while(ap1Ambiente.encender);
                                                    
                                                    
                                                    break;
                                                case 2:
                                                    do{
                                                    System.out.println("VideoPlayer prendido");
                                                    ap2Ambiente.setEncender(true);
                                                    ap2Ambiente.setReproduciendo(true);
                                                    ap2Ambiente.setTipo("VideoPlayer");
                                                    System.out.println("Ingrese el video a reproducir"); 
                                                    KeyboardInput in11 = new KeyboardInput(); 
                                                    String nombreV = in11.readString();
                                                    ap2Ambiente.videoR(nombreV);
                                                    System.out.println("Y la calidad de este");
                                                    KeyboardInput in20 = new KeyboardInput(); 
                                                    String nombreCalidad = in20.readString();
                                                    ap2Ambiente.setCalidadVideo(nombreCalidad);    
                                                    ap2Ambiente.reproduccion();
                                                    
                                                    System.out.println("Quieres cambiar el video?   1:no    2:si");
                                                    KeyboardInput in12 = new KeyboardInput(); 
                                                    int inNumNC = in12.readInteger();
                                                    if(2!=inNumNC){
                                                        System.out.println("Quieres pausar el video   1:no      2: si");
                                                        KeyboardInput in13 = new KeyboardInput(); 
                                                        int inNumP = in13.readInteger();
                                                        if(inNumP==2){
                                                            ap2Ambiente.setReproduciendo(false);
                                                            ap2Ambiente.reproduccion();
                                                            System.out.println("Quieres Reanudar   1:no    2:si");
                                                            KeyboardInput in14 = new KeyboardInput(); 
                                                            int inNumR = in14.readInteger();
                                                            if(inNumR==2){
                                                                System.out.println("Quieres cambiar la resolucion 1:no  2:si");
                                                                KeyboardInput in21 = new KeyboardInput(); 
                                                                int inNumRes = in21.readInteger();
                                                                if(inNumRes==2){
                                                             System.out.println("Escriba la nueva resolucion");
                                                             KeyboardInput in22 = new KeyboardInput(); 
                                                             String inNumReso = in22.readString();  
                                                             ap2Ambiente.setCalidadVideo(inNumReso);
                                                             ap2Ambiente.setReproduciendo(true); 
                                                             ap2Ambiente.reproduccion();
                                                                }
                                                             
                                                            }else if(inNumR==1){
                                                        System.out.println("Quieres apagar    1:si      2 no");
                                                        KeyboardInput in15 = new KeyboardInput(); 
                                                        int inNumA = in15.readInteger();
                                                        
                                                        if(inNumA == 1){
                                                            ap2Ambiente.encender = false;
                                                            System.out.println(ap2Ambiente);
                                                        }
                                                        }
                                                    }    
                                                    
                                                    }
                                                        System.out.println("Video "+nombreV+ " finalizo");
                                                    }while(ap2Ambiente.encender);
                                                    
                                                    
                                                    break;
                                                case 3:
                                                    salir5=true;
                                                    break;
                                                default:
                                                  System.out.println("Solo números entre 1 y 2");  
                                            } 
                                    
                                        }
                                    break;
                                 case 6:
                                    salir1=true;
                                    break;
                                 default:
                                    System.out.println("Solo números entre 1 y 6");
                            }

                        }

                    }else{
                        System.out.println("la contrseña o el usuario no es correcto");
                    }
                   
                   break;
                   
               case 2:
                   
                   System.out.println("");

                   Scanner sn = new Scanner(System.in);
                    boolean salir2 = false;
                    int opcion2; //Guardaremos la opcion del usuario

                    while(!salir2){

                        System.out.println("1. Buscar a partir de su numero ");
                        System.out.println("2. Buscar a partir de palabras");
                        System.out.println("3. Ingrese un articulo");
                        System.out.println("4. Retire un articulo");
                        System.out.println("5. Pagar");
                        System.out.println("6. Salir");

                        System.out.println("Escribe una de las opciones");
                        opcion2 = sn.nextInt();

                        switch(opcion2){
                            case 1:
                                System.out.println("Has seleccionado la opcion 1");
                                
                                System.out.println("Aqui puede buscar productos por numero");
                                KeyboardInput in4 = new KeyboardInput(); 
                                float busqueda = in4.readFloat();
                                                
                                                
                                if(codigoBarras.contains(busqueda)){
                                                    
                                    System.out.println(toStrings.get(codigoBarras.indexOf(busqueda)));
                                    //System.out.println("El costo es: " + toStrings.get(precioProducto.indexOf(busqueda)));
                                    //precioProducto.get(1).get(0);
                                }else{
                                    System.out.println("Lo sentimos no encontramos el producto que busca vuelva a intentarlo o pregunte a algun vendedor ");
                                    }
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opcion 2");
                                
                                System.out.println("Aqui puede buscar productos por su nombre");
                                KeyboardInput in5 = new KeyboardInput(); 
                                String busqueda1;
                                busqueda1 = in5.readString();
                                
                                if(nombreProducto.contains(busqueda1)){
                                 
                                    System.out.println(toStrings.get(nombreProducto.indexOf(busqueda1)));
                                }else{
                                    System.out.println("Lo sentimos no encontramos el producto que busca vuelva a intentarlo o pregunte a algun vendedor ");
                                    }
                                
                                break;
                            case 3 :
                                
                                System.out.println("Aqui puede buscar productos por numero, despues de colocar el numero agregue .0");
                                                    KeyboardInput cb = new KeyboardInput(); 
                                                    float busquedacliente = cb.readFloat();
                                                    
                                                    
                                                    if(codigoBarras.contains(busquedacliente)){
                                                        
                                                       carrito.add(toStrings.get(codigoBarras.indexOf(busquedacliente)));
                                                       
                                                       System.out.println("El tamaño de la lista: " +carrito.size());
                                                       sumaPrecios += precioProducto.get(codigoBarras.indexOf(busquedacliente));
                                                      
                                                    }else{
                                                        System.out.println("Verifique el codigo de barras sea el correcto ");
                                                    }
                        
                                                    System.out.println("El carrito contiene los articulos: ");
                                                    for (String a : carrito){
                                                         a= carrito.indexOf(a) + " " + a;
                                                        System.out.println( a );
                                                             }
                                
                                break;
                            case 4:
                                
                                System.out.println("Digita el numero de articulo que desea eliminar (0,1,2...) ");
                                                    KeyboardInput rem = new KeyboardInput();
                                                    String b = rem.readString();
                                                    int z = Integer.parseInt(b);
                                                    carrito.remove(z);
                                System.out.println("Para confirmar la eliminacion de este articulo por favor dijite su codigo de barras");
                                                    KeyboardInput ep = new KeyboardInput(); 
                                                    float eliminarProducto = ep.readFloat();
                                                    
                                                    
                                                    if(codigoBarras.contains(eliminarProducto)){
                                                       
                                                       System.out.println("El tamaño de la lista: " +carrito.size());
                                                        System.out.println("El producto eliminado fue: "+ toStrings.get(codigoBarras.indexOf(eliminarProducto)));
                                                       sumaPrecios -= precioProducto.get(codigoBarras.indexOf(eliminarProducto));
                                                      
                                                    }else{
                                                        System.out.println("Verifique el codigo de barras sea el correcto ");
                                                    }
                                                     System.out.println("El carrito contiene los articulos: ");
                                                    for (String a : carrito){
                                                         a= carrito.indexOf(a) + " " + a;
                                                         System.out.println( a );
                                                             }
                                                    break;
                             
                            case 5:
                               Ticket nTicket = new Ticket();
                               nTicket.crearTicket(carrito, sumaPrecios);
                                System.out.println("Se creo ticket ");
                                                    break;
                              
                             case 6:
                                salir2=true;
                                
                                break;
                             default:
                                System.out.println("Solo números entre 1 y 6");
                        }

                    }
                   
                   break;
               case 3:
                   System.out.println("");

                   Scanner nn = new Scanner(System.in);
                    boolean salir3 = false;
                    int opcion3; //Guardaremos la opcion del usuario

                    while(!salir3){

                        System.out.println("1. Buscar a partir de su numero ");
                        System.out.println("2. Buscar a partir de palabras");
                        System.out.println("3. Salir");

                        System.out.println("Escribe una de las opciones");
                        opcion3 = nn.nextInt();

                        switch(opcion3){
                            case 1:
                                System.out.println("Has seleccionado la opcion 1");
                                
                                System.out.println("Aqui puede buscar productos por numero");
                                KeyboardInput in4 = new KeyboardInput(); 
                                float busqueda = in4.readFloat();
                                                
                                                
                                if(codigoBarras.contains(busqueda)){
                                                    
                                    System.out.println(toStrings.get(codigoBarras.indexOf(busqueda)));
                                }else{
                                    System.out.println("Lo sentimos no encontramos el producto que busca vuelva a intentarlo o pregunte a algun vendedor ");
                                    }
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opcion 2");
                                
                                System.out.println("Aqui puede buscar productos por su nombre");
                                KeyboardInput in5 = new KeyboardInput(); 
                                String busqueda1;
                                busqueda1 = in5.readString();
                                              
                                if(nombreProducto.contains(busqueda1)){
                                 
                                    System.out.println(toStrings.get(nombreProducto.indexOf(busqueda1)));
                                }else{
                                    System.out.println("Lo sentimos no encontramos el producto que busca vuelva a intentarlo o pregunte a algun vendedor ");
                                    }
                                
                                break;
                             
                             case 3:
                                salir3=true;
                                break;
                             default:
                                System.out.println("Solo números entre 1 y 3");
                        }

                    }
                   
                   break;
                
                case 4:
                   salir=true;
                   System.out.println("El tiempo que este programa estuvo siendo utilizado es de :" + Duration.between(startLocalTime, LocalTime.now()) + " segundos");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
            
       } 
    }

    private static int indexOf(float busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
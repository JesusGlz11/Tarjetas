
import java.util.Scanner;


public class MainTarjeta {
    
    public static void main (String args[]){
Scanner leer=new Scanner(System.in);


Tarjeta tarjeta;

int nCuenta, NIP, opcion, Deposito, retiro, Ap;
System.out.print("Ingrese su numero de cuenta: ");
nCuenta=leer.nextInt();

System.out.print("Ingrese su numero de NIP: ");
NIP=leer.nextInt();


tarjeta=new Tarjeta().verificarCuenta(nCuenta, NIP);
System.out.println(tarjeta.toString());

System.out.println();
System.out.println();

System.out.println("Tu nombre es el siguiente chavo:"+tarjeta.nombre);
        boolean salir = false;

 
             while(!salir){
           System.out.println("1.- Hacer un Deposito");
           System.out.println("2.- Hacer un retiro");
           System.out.println("3.- Eliminar apartado");
           System.out.println("4.- Imprimir datos de la cuenta");
           System.out.println("5.- salir");
            
           
         
           opcion = leer.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Ingrese el monto a depositar");
                   Deposito=leer.nextInt();
                   break;
               case 2:
                   System.out.println("Cuanto dinero va a retirar");
                    retiro=leer.nextInt();
                   break;
                case 3:
                   System.out.println("Que apartado quieres eliminar");
                    Ap=leer.nextInt();
                   break;
                case 4:
                   System.out.println("Imprimir datos de la cuenta");
                   System.out.println(tarjeta.toString());
                   break;
                   case 5:
                       System.out.println("BBye");
                   salir=true;
                   break;
                default:
                   System.out.println("");
           }

 }
    }
}


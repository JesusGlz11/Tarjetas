
import java.util.Scanner;


public class MainTarjeta {
    
    public static void main (String args[]){
Scanner leer=new Scanner(System.in);


Tarjeta tarjeta;

int nCuenta, NIP, opcion;
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
           if (tarjeta.mApartado > 0){
            System.out.println("3.- Eliminar apartado");
            }else{
                System.out.println("3.-Crear apartado");
            }
           System.out.println("4.- Imprimir datos de la cuenta");
           System.out.println("5.- salir");
            
           
         
           opcion = leer.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Ingrese el monto a depositar");
                   double Deposito = leer.nextDouble();
                    tarjeta.Deposito(Deposito);
                   break;
               case 2:
                   System.out.println("Cuanto dinero va a retirar");
                    double Retiro = leer.nextDouble();
                    tarjeta.verificarRetiro(Retiro);
                   break;
                case 3:
                   if(tarjeta.mApartado !=0){
                        tarjeta.Apartado();
                        System.out.println("Apartado eliminado");
                    }
                   else{
                        System.out.println("Cantidad a apartdar");
                        double apartado = leer.nextDouble();
                        tarjeta.VApartado(apartado);
                    }
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


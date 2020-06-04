
public class Tarjeta {
    int nCuenta;
    int nNip;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double mApartado;
    
    public Tarjeta (){ //constructor vacio
    
    }
    
    public Tarjeta(int nCuenta, int nNip, String nombre, int dia, int mes, int anio, int cv, double monto, double mApartado){
    this.nCuenta=nCuenta;
    this.nNip=nNip;
    this.nombre=nombre;
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
    this.cv=cv;
    this.monto=monto;
    this.mApartado=mApartado;
    }

    public Tarjeta verificarCuenta(int nCuenta, int NIP){
        if(nCuenta == 123123 && NIP == 1133){

            return new Tarjeta(123123, 1133, "Eduardo Diaz Flores", 31, 12, 2032, 543, 360, 45987.22 );

        }
        else if (nCuenta == 456789 && NIP == 3367){

            return new Tarjeta(456789, 3367, "Kevin Meza Gonzales", 31, 12, 2032, 544, 360, 5322.32);

        }
        else 
            return new Tarjeta();
    }
    
    public double Total(){
        return this.monto+this.mApartado;
    }
    
    @Override
    public String toString() {
        return "nCuenta=" + nCuenta + "\n nombre=" + nombre + "\n Fecha de vencimiento=" + dia + ", mes=" + mes + ", anio=" + anio + ", cv=" + cv + ", monto=" + monto + ", mApartado=" + mApartado + '}';
    }
    
    
}


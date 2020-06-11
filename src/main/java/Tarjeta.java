
public class Tarjeta {
    int nCuenta;
    int nNip;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double montoD;
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
    this.montoD=montoD;
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
    
    public void Deposito(double deposito)
    {
        this.montoD = this.montoD + deposito;
    }
    
   public void verificarRetiro(double retiro){
        if (retiro <= this.montoD ){
            retiro(retiro);
            System.out.println("Retiro hecho :D ");
            
        }
        else{
            System.out.println("No hay saldo D: ");
        }
    }
    public void retiro(double retiro){
        this.montoD = this.montoD - retiro;

    }
   public void Apartado(){
        this.montoD = this.montoD + this.mApartado;
        this.mApartado = 0;
    }
   public void VApartado(double apartado){
        if (apartado <= this.montoD){
            crearApartado(apartado);
            System.out.println("Apartado listo :D");
            
        }
        else{
            
            System.out.println("No hay saldo D: ");
        }
    }
   public void crearApartado(double apartado){
        this.mApartado=this.mApartado+apartado;
        this.montoD = this.montoD +  this.mApartado;
        
    }
    public double Total(){
        return this.montoD + this.mApartado;
        
    }
    
    @Override
    public String toString() {
        return "nCuenta = " + nCuenta + "\n nombre = " + nombre + "\n Fecha de vencimiento = " + dia + "/" + mes + "/" + anio + "\n cv = " + cv + "\n monto = " + montoD + "\n mApartado = " + mApartado +  "\n Total = "  + this.Total();
   
    }

    
    
    
    
    
    
    
    
    
    
    
    private void retirar(double retirar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    

    



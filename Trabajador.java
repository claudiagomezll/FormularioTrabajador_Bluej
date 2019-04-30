
import java.util.Scanner;


public class Trabajador

{
    public int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;
    
    Scanner teclado = new Scanner (System.in);
   
    public Trabajador()
    {    
    }
    
    public Trabajador( int id, String nombre, String direccion, String telefono, double sueldo)
    {
               
    this.id=id;
    this.nombre=nombre;
    this.direccion=direccion;
    this.telefono=telefono;
    this.sueldo=sueldo;
    }
    
   

    
    
    /**Metodo de acceso a la propiedad id*/
    public int getId(){
        return this.id;
    }//end method getId

    /**Metodo de modificación a la propiedad id*/
    public void setId(int id){
        this.id = id;
    }//end method setId

    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad direccion*/
    public String getDireccion(){
        return this.direccion;
    }//end method getDireccion

    /**Metodo de modificación a la propiedad direccion*/
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }//end method setDireccion

    /**Metodo de acceso a la propiedad telefono*/
    public String getTelefono(){
        return this.telefono;
    }//end method getTelefono

    /**Metodo de modificación a la propiedad telefono*/
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }//end method setTelefono

    /**Metodo de acceso a la propiedad sueldo*/
    public double getSueldo(){
        return this.sueldo;
    }//end method getSueldo

    /**Metodo de modificación a la propiedad sueldo*/
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }//end method setSueldo

    /**Metodo de acceso a la propiedad teclado*/
    public Scanner getTeclado(){
        return this.teclado;
    }//end method getTeclado

    /**Metodo de modificación a la propiedad teclado*/
    public void setTeclado(Scanner teclado){
        this.teclado = teclado;
    }//end method setTeclado

 }
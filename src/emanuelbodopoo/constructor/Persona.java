
package emanuelbodopoo.constructor;

/**
 *
 * @author Emanuel
 */
public class Persona {
    int dni;
    String nombre,apellido;
    
    public Persona(){
       this.dni=0;
       this.nombre="";
       this.apellido="";
       System.out.println("Creando Persona...");
    }
    public Persona(int dni){
        this();
        this.dni=dni;
    
    }
    
    public Persona(int dni, String nombre){
        this(dni);
        this.nombre= nombre;
         }
    
    public Persona(int dni, String nombre, String apellido){
        this(dni,nombre);
        this.apellido=apellido;
    }
    
    public void printing(){     
        
        System.out.println("\nDni:" + dni + "\nNombre:" + nombre + "\nApellido:" +apellido) ;
        
                
    }
}


package emanuelbodopoo.constructor;

/**
 *
 * @author Emanuel
 */
public class EmanuelBodoPOOConstructor {

    public static void main(String[] args) {
        
        Persona uno,dos,tres,cuatro;
        
        uno= new Persona();
        dos= new Persona(35786932);
        tres= new Persona(35786932,"Emanuel");
        cuatro= new Persona(35786932,"Emanuel","Bodo");
        
        uno.printing();
        dos.printing();
        tres.printing();
        cuatro.printing();
        
        
    }
    
}

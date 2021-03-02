 
package classes;

import classes.Persona;

public class Extranjero extends Persona {

    private String Correo;

    public Extranjero(String Correo, String nombre, int edad) {
        super(nombre, edad, null);
        this.Correo = Correo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
   
    
   
    
}

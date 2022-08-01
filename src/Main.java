/*
Para practicar la encapsulación:

        Crear clase Persona.

        Crear variables las privadas edad, nombre y telefono de la clase Persona.

        Crear gets y sets de cada propiedad.

        Crear un objeto persona en el main.

        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/

public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();

        miPersona.setNombre("Fran");
        miPersona.setEdad(29);
        miPersona.setTelefono(666666666);

        System.out.println("Nombre: " + miPersona.getNombre());
        System.out.println("Edad: " + miPersona.getEdad());
        System.out.println("Telefono: " + miPersona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int valor){
        this.edad = valor;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String valor){
        this.nombre = valor;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int valor){
        this.telefono = valor;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

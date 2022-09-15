public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(20);
        persona.setTelefono(650444999);
        persona.setNombre("Antonio");

        System.out.println("Me llamo " + persona.getNombre() + ", tengo " + persona.getEdad() + " años y mi teléfono es " + persona.getTelefono());

    }
}

class Persona{
    private int edad;
    private int telefono;
    private String nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}

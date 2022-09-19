/* EJERCICIOS TEMA 9: HERENCIA, POLIMORFISMO E INTERFACES

 */

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
            cliente.edad = 20;
            cliente.nombre = "Juan";
            cliente.telefono = 666888444;
            cliente.credito = 3000;

            trabajador.edad = 30;
            trabajador.nombre = "Sara";
            trabajador.telefono = 655777444;
            trabajador.salario = 2000;
        System.out.println("Hola me llamo " + cliente.nombre + " y tengo " + cliente.edad + " años, mi teléfono es " + cliente.telefono + " y por último mi crédito es de " + cliente.credito);
        System.out.println("Hola me llamo " + trabajador.nombre + " y tengo " + trabajador.edad + " años, mi teléfono es " + trabajador.telefono + " y por último mi salario es de " + trabajador.salario);

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}

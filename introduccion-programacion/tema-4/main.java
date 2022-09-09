public class Main {
    public static void main(String[] args) {
        //Declaro las variables para los siguientes ejercicios
        //Ejercicio 1
        int numero = -3;
        //Ejercicio 2
        int numeroWhile = 1;
        //Ejercicio 3
        int numerodoWhile = 3;
        //Ejercicio 4
        int numeroFor = 0;
        //Ejercicio 5
        String estacion = "verano";

        //Ejercicio 1: Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

        if (numero == 0) {
            System.out.println("El número es " + numero);
        } else if (numero < 0) {
            System.out.println("El número es " + numero + " y es negativo");
        } else if (numero > 0) {
            System.out.println("El número es " + numero + " y es positivo");
        }
        /* Ejercicio 2: Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.
         */

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El número se incrementa en uno y ahora es " + numeroWhile);
        }
        System.out.println("El número " +numeroWhile+" ya es mayor igual o mayor a 3");

        //Ejercicio 3: Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez

        do {
            System.out.println("El número es " + numerodoWhile);
            numerodoWhile++;
            System.out.println("El número se incrementa en uno y ahora es " + numerodoWhile);
        }while(numerodoWhile < 3);


        /* Ejercicio 4: Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
        se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/

        System.out.println("El número for es "+numeroFor+ " y es menor o igual que 3");
        for(numeroFor = 0; numeroFor <= 3; numeroFor++){
          System.out.println("El numero for es "+numeroFor+" y aún es menor o igual que 3");
        }
        System.out.println("El número for es "+numeroFor+" y por fin es mayor que 3");

        /* Ejercicio 5: para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación */

        switch(estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "inverno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion+" no es una estación");

        }
    }
}

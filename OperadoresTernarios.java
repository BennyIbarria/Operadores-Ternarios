import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {

        /* variable = condicion ? si_es verdadero:si es falso*/
        /*Paso1.- Se declara la variable
        * Paso2.- se iguala a una condicion
        * Paso3.- Se inserta el signo de pregunta
        * Paso4.- Se coloca el valor a retornar en caso de que la condicion se evalue como verdadero
        * Paso5.- Se colocan :
        * Paso6.- Se coloca el valor a retornar en caso de que*/

        /*String variable = 8==8 ? "Son iguales":"Son distintos";
        System.out.println("variable = " + variable);*/

        Scanner sc = new Scanner(System.in);
        double matematicas = 0.0;
        double biologia=0.0;
        double fisica=0.0;
        double promedio=0.0;

        System.out.println("Capture la calificación para matematicas en rango 0.0-10.0: ");
        matematicas = sc.nextDouble();

        System.out.println("Capture la calificación para biologia en rango 0.0-10.0: ");
        biologia = sc.nextDouble();

        System.out.println("Capture la calificación para matematicas en rango 0.0-10.0: ");
        fisica = sc.nextDouble();

        promedio = (matematicas+biologia+fisica)/3;

        String total = (promedio>5.9 ? "Aprobado" : "reprobado");
        System.out.println("El alumno está: " + total);
        System.out.println("su promedio es: " + promedio);


    }
}

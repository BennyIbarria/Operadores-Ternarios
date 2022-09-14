import javax.swing.*;
import java.util.InputMismatchException;

public class OperadoresTernariosGrafico {
    public static void main(String[] args) {

       double calificacionMatematicas=0, calificacionBiologia=0, calificacionFisica=0;

        try{
            String matematicas = JOptionPane.showInputDialog(null,"Capture la Calificación del alumno en Matematicas: ");
            calificacionMatematicas= Double.parseDouble(matematicas);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error al capturar el numero");
            main(args);
            System.exit(0);
        }
        try{
            String biologia = JOptionPane.showInputDialog(null, "Capture la calificación del alumno en Biologia: ");
            calificacionBiologia=Double.parseDouble(biologia);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error al capturar el numero");
            main(args);
            System.exit(0);
        }
        try{
            String fisica = JOptionPane.showInputDialog(null, "Capture la calificación del alumno en fisica: ");
            calificacionFisica=Double.parseDouble(fisica);
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Error al capturar el numero");
            main(args);
            System.exit(0);
        }
    double promedio=(calificacionMatematicas+calificacionBiologia+calificacionFisica)/3;

        String total = promedio>5.0 ? "Aprobado":"reprobado";
        JOptionPane.showMessageDialog(null, "El alumno está " + total);
        JOptionPane.showMessageDialog(null, "Su promedio es: " + promedio);
    }
}

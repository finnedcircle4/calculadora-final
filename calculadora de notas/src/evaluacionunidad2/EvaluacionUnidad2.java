package evaluacionunidad2;

import java.util.Scanner;

/**
 *
 * @author crixt
 */
public class EvaluacionUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notas[] = new float[5];
        CalculadoraNotas notasAlumno = new CalculadoraNotas(notas);
        Scanner lector = new Scanner(System.in);
        boolean salir = true;
        int i = 0;
        float nota = 0;
        int opcion = 0;
        System.out.println("Calculadora de notas");
        while (i < 5) {
            System.out.println("Ingrese la nota numero " + (i + 1) + ":");
            nota = lector.nextFloat();
            notas[i] = nota;
            i = i + 1;
        }
        while (salir) {
            System.out.println();
            System.out.println();
            System.out.println("Menu calculadora");
            System.out.println("1. Suma de las notas");
            System.out.println("2. Promedio de las notas");
            System.out.println("3. Nota mas alta");
            System.out.println("4. Nota mas baja");
            System.out.println("5. Moda");
            System.out.println("6. Notas de menor a mayor");
            System.out.println("7. Notas de mayor a menor");
            System.out.println("8. Estado del curso");
            System.out.println("9. Salir");
            System.out.println("Favor digite su opcion:");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de las notas es: " + notasAlumno.sumatoriaNotas());
                    break;
                case 2:
                    System.out.println("El promedio de las notas es: " + notasAlumno.promedioNotas());
                    break;
                case 3:
                    System.out.println("La nota mas alta es: " + notasAlumno.notaMasAlta());
                    break;
                case 4:
                    System.out.println("La nota mas baja es: " + notasAlumno.notaMasBaja());
                    break;
                case 5:
                    System.out.println("La nota que mas se repite es: " + notasAlumno.moda());
                    break;
                case 6:
                    System.out.println("Notas ordenadas de manera creciente : ");
                    notasAlumno.ordenarCreciente();
                    notasAlumno.mostrarNotas();

                    break;
                case 7:
                    System.out.println("Notas ordenadas de manera decreciente: ");
                    notasAlumno.ordenarDecreciente();
                    notasAlumno.mostrarNotas();
                    break;
                case 8:
                    System.out.println("El estado del curso es: " + notasAlumno.aprobacion());
                    break;
                case 9:
                    System.out.println("Saliendo de la calculadora...");
                    salir = false;
                    break;
            }
        }
    }
    
}
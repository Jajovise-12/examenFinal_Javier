package examenJunio;

import java.util.Arrays;
public class Principal {
   public static void main(String[] args) {
       Evaluacion eval1 = new Evaluacion(1, 4.5);
       Evaluacion eval2 = new Evaluacion(2, 3.8);
       Evaluacion eval3 = new Evaluacion(1, 4.2);
       Evaluacion eval4 = new Evaluacion(3, 5.0);
       Empleado emp1 = new Empleado("Juan", "Perez", "12345678A", Arrays.asList(eval1, eval2));
       Empleado emp2 = new Empleado("Maria", "Garcia", "87654321B", Arrays.asList(eval3, eval4));
       System.out.println("Datos del empleado 1:");
       System.out.println(emp1.getNombre() + " " + emp1.getApellidos() + ", DNI: " + emp1.getDNI());
       System.out.println("Promedio de calificaciones: " + emp1.calcularPromedioCalificaciones());
       System.out.println("Evaluaciones del mes 1: " + emp1.filtrarEvaluacionesPorMes(1));
       System.out.println("\nDatos del empleado 2:");
       System.out.println(emp2.getNombre() + " " + emp2.getApellidos() + ", DNI: " + emp2.getDNI());
       System.out.println("Promedio de calificaciones: " + emp2.calcularPromedioCalificaciones());
       System.out.println("Evaluaciones del mes 1: " + emp2.filtrarEvaluacionesPorMes(1));
   }
}
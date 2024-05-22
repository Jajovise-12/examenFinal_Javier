package examenMayo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Crear empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Borrar empleado por DNI");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearEmpleado(scanner);
                    break;
                case 2:
                    listarEmpleados();
                    break;
                case 3:
                    borrarEmpleadoPorDNI(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void crearEmpleado(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Número de empleado: ");
        int numeroEmpleado = scanner.nextInt();
        System.out.print("Complejidad: ");
        double complejidad = scanner.nextDouble();
        System.out.print("Calidad: ");
        double calidad = scanner.nextDouble();
        System.out.print("Proactividad: ");
        double proactividad = scanner.nextDouble();
        System.out.print("Compañerismo: ");
        double companerismo = scanner.nextDouble();

        Portfolio portfolio = new Portfolio(complejidad, calidad, proactividad, companerismo);
        Empleado empleado = new Empleado(nombre, dni, numeroEmpleado, portfolio);
        empleados.add(empleado);

        System.out.println("Empleado creado exitosamente.");
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados.");
        } else {
            for (Empleado emp : empleados) {
                System.out.println(emp.getNombre() + " - DNI: " + emp.getDni() + " - Número de empleado: " + emp.getNumeroEmpleado() + " - Media: " + emp.getPortfolio().media());
            }
        }
    }

    private static void borrarEmpleadoPorDNI(Scanner scanner) {
        System.out.print("DNI del empleado a borrar: ");
        String dni = scanner.nextLine();
        Empleado empleadoABorrar = null;
        for (Empleado emp : empleados) {
            if (emp.getDni().equals(dni)) {
                empleadoABorrar = emp;
                break;
            }
        }

        if (empleadoABorrar != null) {
            empleados.remove(empleadoABorrar);
            System.out.println("Empleado borrado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}


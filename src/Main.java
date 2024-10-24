import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado empleado1 = new Empleado("Kevin", 23, 360.40);

        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); //Limpia el buffer del scanner para la siguiente entrada
        System.out.println("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        Empleado empleado2 = new Empleado();
        empleado2.setNombre(nombre);
        empleado2.setEdad(edad);
        empleado2.setSalario(salario);

        System.out.println("Empleado con datos quemados:");
        empleado1.mostrarDatos();

        System.out.println("\nEmpleado con datos ingresados mediante setters:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());

    }
}
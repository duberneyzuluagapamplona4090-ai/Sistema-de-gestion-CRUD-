import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstudianteDAO dao = new EstudianteDAO();
        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE ESTUDIANTES ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Actualizar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = scanner.nextLine();

                    Estudiante nuevo = new Estudiante(0, nombre, email, carrera);
                    dao.guardar(nuevo);
                    break;

                case 2:
                    List<Estudiante> lista = dao.listar();
                    System.out.println("\n--- LISTA DE ESTUDIANTES ---");
                    for (Estudiante e : lista) {
                        System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre() + 
                                           " | Email: " + e.getEmail() + " | Carrera: " + e.getCarrera());
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ID del estudiante a modificar: ");
                    int idMod = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nomMod = scanner.nextLine();
                    System.out.print("Nuevo Email: ");
                    String emailMod = scanner.nextLine();
                    System.out.print("Nueva Carrera: ");
                    String carMod = scanner.nextLine();

                    Estudiante estudianteMod = new Estudiante(idMod, nomMod, emailMod, carMod);
                    dao.actualizar(estudianteMod);
                    break;

                case 4:
                    System.out.print("Ingrese el ID del estudiante a eliminar: ");
                    int idElim = scanner.nextInt();
                    dao.eliminar(idElim);
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static List<Persona> personas = new ArrayList<>();
    private static List<Perro> perrosDisponibles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1.Registrar personas");
            System.out.println("2.Registrar perros");
            System.out.println("3.Ver personas registradas");
            System.out.println("4.Ver personas disponibles");
            System.out.println("5.Adoptar perro");
            System.out.println("6.Consultar el perro mas viejo adoptado por una persona");
            System.out.println("7.Salir del programa");

            System.out.print("Ingrese una opcion:");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    registrarPerro();
                    break;
                case 3:
                    verPersonaRegistradas();
                    break;
                case 4:
                    verPerrosDisponibles();
                    break;
                case 5:
                    adoptarPerro();
                    break;
                case 6:
                    consultarPerroMasViejo();
                    break;
                case 7:
                  System.out.println("Saliendo del programa");
                  return;
                default:
                    System.out.println("Opcion invalida, vuelvalo a intentar");

            }

        }
    }

    public static void registrarPersona() {
        scanner.nextLine();
        System.out.print("Ingrese  el nombre:");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese  el apellido:");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el documento:");
        String documento = scanner.nextLine();

        personas.add(new Persona(nombre, apellido, edad, documento));
        System.out.println("Persona registrada con exito");
    }

    public static void registrarPerro() {
        scanner.nextLine();
        System.out.print("Ingrese la placa");
        String placa = scanner.nextLine();
        System.out.print("Ingrese  el nombre:");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la raza:");
        String raza = scanner.nextLine();
        System.out.print("Ingrese la edad :");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese  el tamano:");
        String tamano = scanner.nextLine();

        perrosDisponibles.add(new Perro(placa, nombre, raza, edad, tamano));
        System.out.println("Perro registrado con exito");
    }

    public static void verPersonaRegistradas() {
        scanner.nextLine();
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public static void verPerrosDisponibles() {
        scanner.nextLine();
        for (Perro perro : perrosDisponibles) {
            System.out.println(perro);
        }
    }

    public static void adoptarPerro() {
        scanner.nextLine();
        System.out.println("Ingresar el documento de la persona:");
        String documento = scanner.nextLine();
        Persona persona = buscarPersona(documento);
        if (persona != null) {
            System.out.println("Ingrese la placa del perro");
            String placa = scanner.nextLine();
            Perro perro = buscarPerro(placa);
            if (perro != null) {
                persona.adoptarPerro(perro);
                perrosDisponibles.remove(perro);
            } else {
                System.out.println("Perro no encontrado");
            }
        } else {
            System.out.println("Persona no encontrado");
        }

    }

    public static void consultarPerroMasViejo() {
        scanner.nextLine();
        System.out.println("Ingrese el doumento de la persona:");
        String documento = scanner.nextLine();
        Persona persona = buscarPersona(documento);
        if (persona != null) {
            Perro perroMasViejo = persona.perroMasGrande();
            if (perroMasViejo != null) {
                System.out.println(perroMasViejo);
            } else {
                System.out.println("La persona no tiene perros adoptados");
            }
        } else {
            System.out.println("Perro no encontrada");
        }
    }

    public static Persona buscarPersona(String documento) {
        for (Persona persona : personas) {
            if (persona.getDocumento().equals(documento)) {
                return persona;
            }
        }
        return null;
    }
    public static Perro buscarPerro(String placa) {
        for (Perro perro : perrosDisponibles) {
            if (perro.getPlaca().equals(placa)) {
                return perro;
            }
        }
        return null;
    }


}

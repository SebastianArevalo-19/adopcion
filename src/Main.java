//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static  List<Persona>personas = new ArrayList<>();
    private static List<Perro>perrosDisponibles = new ArrayList<>();
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("Menu:");
            System.out.println("1.Registrar personas");
            System.out.println("2.Registrar perros");
            System.out.println("3.Ver personas registradas");
            System.out.println("4.Ver personas disponibles");
            System.out.println("5.Adoptar perro");
            System.out.println("6.Consultar el perro mas viejo adoptado por una persona");
            System.out.println("7.Salir del programa");

            System.out.print("Ingrese una opcion");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    registrarPerro();
                    break;
                case 3:
                    verPerrosDisponibles();
                    break;
                case 4:
                    adoptarPerro();
                    break;
                case 5:
                    consultarPerroMasViejo();
                    break;
                case 6:

            }

        }
    }
    private static void registrarPersona(){
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
    public static void registrarPerro(){
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
    public static void verPerrosDisponibles(){
        for(Perro perro: perrosDisponibles){
            System.out.println("perro");
        }
    }
    private static  void adoptarPerro(){

    }
    public   static void  consultarPerroMasViejo(){

    }

}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {
      Scanner consola = new Scanner(System.in);
      // Definimos la lista fuera del ciclo while
      List<Personas> personas = new ArrayList<>();
      //Empezamos con el menu
      var salir=false;
      while(!salir) {
          mostrarMenu();
          try {
              salir = ejecutarOperacion(consola, personas);
          }catch(Exception e) {
              System.out.println("Ocurrió un error: " + e.getMessage());
          }
          System.out.println();
      }
    }

    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                1. Agregar
                2. Listar
                3. Salir
                """);

        System.out.print("Introduzca el número de la opción deseada: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Personas>personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // Revisamos la opcion proporcionada
        switch (opcion) {

            case 1 -> { //agregar personas
                System.out.println("Introduce el nombre: ");
                var name = consola.nextLine();
                System.out.println("Introduce el teléfono: ");
                var telefono = consola.nextLine();
                System.out.println("Introduce el email: ");
                var email = consola.nextLine();
                //Crear el objeto de tipo persona
                var persona = new Personas(name, telefono, email);
                //lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            } // fin case 1
            case 2 -> { // listar personas
                System.out.println("Listado de personas: ");
                //Mejora usando lambda y metodo de referencia
               // personas.forEach((persona) -> System.out.println(persona)) ;
                personas.forEach((System.out::println)); // método lambda abreviado, cuando queremos acceder a cada uno de esos objetos y pasarlos como parámetro al método println

            }
            case 3 -> {
                System.out.println("Hasta pronto... ");
                salir = true;
            }
            default -> System.out.println("Opción errónea: " + opcion);

        }   // fin switch
        return salir;
    }
}
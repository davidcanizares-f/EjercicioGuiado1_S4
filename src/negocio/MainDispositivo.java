package negocio;

public class MainDispositivo {

    public static void main() {

        System.out.println("\nNumero de Objetos antes de crearlos: " + Dispositivo.getTotalCreados());
        Dispositivo dispositivo1 = new Dispositivo("Laptop", "Computadora");

        System.out.println("Numero de Objetos luego de crear 1: " + Dispositivo.getTotalCreados());

        Dispositivo dispositivo2 = new Dispositivo("Televisor", "Dispositivo Multimedia");
        Dispositivo dispositivo3 = new Dispositivo("Impresora", "Impresion");

        System.out.println("Numero de Objetos luego de crear 3: " + Dispositivo.getTotalCreados());

        System.out.println("\n=== DISPOSITIVOS ====");
        System.out.println("ID: " + dispositivo1.getId());
        System.out.println("Nombre: " + dispositivo1.getNombre());
        System.out.println("Tipo: " + dispositivo1.getTipo());
        System.out.println("-----------------------------------------");

        System.out.println("ID: " + dispositivo2.getId());
        System.out.println("Nombre: " + dispositivo2.getNombre());
        System.out.println("Tipo: " + dispositivo2.getTipo());
        System.out.println("-----------------------------------------");

        System.out.println("ID: " + dispositivo3.getId());
        System.out.println("Nombre: " + dispositivo3.getNombre());
        System.out.println("Tipo: " + dispositivo3.getTipo());

        // Consultar el total de objetos creados
        System.out.println("\n====== RESULTADOS CONTADOR =====");
        System.out.println("Total de dispositivos creados: " + Dispositivo.getTotalCreados());

        /*System.out.println("--- Métodos Adicionales ---");
        dispositivo2.activar();
        dispositivo1.desactivar();


        System.out.println("\n--- Prueba de Datos Incorrectos ---");
        dispositivo1.setNombre("");
        System.out.println("Nombre Dispositivo 1: " + dispositivo1.getNombre());*/



    }
}
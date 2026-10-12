package negocio;
public class Dispositivo {


    private String nombre;
    private String tipo;
    private static int contador=0;
    private int id;


    public Dispositivo(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        contador ++;
        this.id = contador;

    }

    public static int getTotalCreados() {
        return contador;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }

    public int getId(){
        return id;
    }


    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            nombre = "s/n";
        }
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            tipo = "s/n";
        }
        this.tipo = tipo;
    }





    /*void activar() {
        System.out.println("> Activando " + nombre + "...");
        if (activo == false) {
            activo = true;
            System.out.println("El/la " + nombre + " se ha activado");
        } else {
            System.out.println("El/la " + nombre + " ya estaba activo");
        }
    }

    void desactivar() {
        System.out.println("> Desactivando " + nombre + "...");
        if (activo == true) {
            activo = false;
            System.out.println("El/la " + nombre + " se ha desactivado");
        } else {
            System.out.println("El/la " + nombre + " ya estaba desactivado");
        }
    }*/
}


    /*public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
    void mostrarEstado() {
        System.out.println(activo ? "Estado: Encendido" : "Estado: Apagado");
    }*/

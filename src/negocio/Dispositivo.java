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


}




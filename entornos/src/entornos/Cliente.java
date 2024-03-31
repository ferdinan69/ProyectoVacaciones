package entornos;

/**
 * Clase que representa un Cliente que realiza compras en una tienda.
 * 
 * @author Your Name
 * @version 1.0
 * @since 2024-03-29
 */
public class Cliente {
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Cliente.
     * 
     * @param nombre El nombre del cliente.
     * @param edad   La edad del cliente.
     */
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obtener el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la edad del cliente.
     * 
     * @return La edad del cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del cliente.
     * 
     * @param edad La nueva edad del cliente.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

package org.example.tfg.npc.modelo;

/**
 * Representa un ingrediente que puede ser parte de un pedido en el juego.
 * <p>
 * Esta clase es un modelo de datos simple (POJO) que contiene la información
 * básica de un ingrediente, como su nombre y descripción.
 *
 * @author Jaime
 * @version 1.0
 */
public class Ingrediente {
    /**
     * El nombre único del ingrediente (ej. "Tomate", "Cuerno de Unicornio").
     */
    private String nombre;
    /**
     * Una descripción textual del ingrediente, que puede ser mostrada al jugador.
     */
    private String descripcion;

    /**
     * Constructor para crear una nueva instancia de Ingrediente.
     *
     * @param nombre      El nombre para el ingrediente.
     * @param descripcion La descripción para el ingrediente.
     */
    public Ingrediente(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    /**
     * Devuelve el nombre de este ingrediente.
     *
     * @return Una cadena de texto con el nombre del ingrediente.
     */
    public String getNombre() {
        return nombre;
    }
}

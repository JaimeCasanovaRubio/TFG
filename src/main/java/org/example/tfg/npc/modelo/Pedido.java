package org.example.tfg.npc.modelo;

import java.util.ArrayList;

/**
 * Representa un pedido realizado por un NPC, que consiste en una lista de ingredientes.
 * <p>
 * Esta clase encapsula una colección de {@link Ingrediente} que define un pedido
 * específico que el jugador podría tener que completar.
 *
 * @author Jaime
 * @version 1.0
 */
public class Pedido {
    /**
     * La lista de ingredientes que componen este pedido.
     */
    private ArrayList<Ingrediente> ingredientes;

    /**
     * Constructor para crear un nuevo Pedido a partir de una lista de ingredientes.
     *
     * @param ingredientes Un {@link ArrayList} de {@link Ingrediente} que formarán el pedido.
     */
    public Pedido(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * Devuelve los ingredientes de este pedido como un array.
     * <p>
     * Se devuelve un array en lugar de la lista interna para evitar modificaciones
     * externas de la lista de ingredientes del pedido (encapsulación).
     *
     * @return Un array de {@link Ingrediente} con los ingredientes del pedido.
     */
    public Ingrediente[] getIngredientes() {
        return ingredientes.toArray(new Ingrediente[0]);
    }
}

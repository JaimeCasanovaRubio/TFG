package org.example.tfg.npc.modelo;

import org.example.tfg.npc.listas.ListaIngredientes;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Representa un modelo base para un Personaje No Jugador (NPC) en el juego.
 * Este modelo de NPC es capaz de generar y gestionar pedidos de ingredientes.
 *
 * @author Jaime
 * @version 1.0
 */
public class modeloNPC {
     /**
      * Gestor de la lista de ingredientes, utilizado para acceder a todos los ingredientes posibles.
      */
     private ListaIngredientes listaIngredientes = new ListaIngredientes();

    /**
     * Crea un nuevo pedido compuesto por 4 ingredientes aleatorios y únicos.
     * <p>
     * El método realiza los siguientes pasos:
     * <ol>
     *     <li>Carga la lista completa de ingredientes disponibles.</li>
     *     <li>Comprueba si hay suficientes ingredientes para crear un pedido (mínimo 4).</li>
     *     <li>Baraja la lista de ingredientes de forma aleatoria.</li>
     *     <li>Selecciona los primeros 4 ingredientes de la lista barajada.</li>
     *     <li>Crea un nuevo objeto {@link Pedido} con los ingredientes seleccionados.</li>
     *     <li>Imprime en la consola los ingredientes del pedido creado para verificación.</li>
     * </ol>
     * <p>
     * Este método asume la existencia de las siguientes clases y métodos:
     * <ul>
     *     <li>{@link org.example.tfg.npc.listas.ListaIngredientes#getIngredientes()} para obtener la lista de todos los ingredientes.</li>
     *     <li>Un constructor en la clase {@link Pedido} que acepta una {@code ArrayList<Ingrediente>}.</li>
     *     <li>Un método {@code getIngredientes()} en la clase {@link Pedido}.</li>
     *     <li>Un método {@code getNombre()} en la clase {@link Ingrediente}.</li>
     * </ul>
     */
    public void crearPedido(){
        // Esta línea carga todos los ingredientes posibles
        listaIngredientes.creacionIngredientes();

        // Obtenemos la lista de todos los ingredientes disponibles
        ArrayList<Ingrediente> todosLosIngredientes = new ArrayList<>(listaIngredientes.getIngredientes());

        // Comprobamos si hay suficientes ingredientes para hacer un pedido de 4
        if (todosLosIngredientes.size() < 4) {
            System.out.println("No hay suficientes ingredientes para crear un pedido.");
            return;
        }

        // Barajamos la lista de ingredientes de forma aleatoria
        Collections.shuffle(todosLosIngredientes);

        // Seleccionamos los primeros 4 ingredientes de la lista barajada
        ArrayList<Ingrediente> ingredientesSeleccionados = new ArrayList<>(todosLosIngredientes.subList(0, 4));

        // Ahora tienes 4 ingredientes aleatorios en la lista 'ingredientesSeleccionados'
        // Puedes usarlos para crear tu objeto Pedido.
        // (Asumo que la clase Pedido tiene un constructor que acepta una lista de ingredientes)
        Pedido nuevoPedido = new Pedido(ingredientesSeleccionados);

        // Para verificar, imprimimos los ingredientes del pedido.
        // (Asumo que Ingrediente tiene un método getNombre() y Pedido un getIngredientes())
        System.out.println("Pedido creado con los siguientes ingredientes:");
        for (Ingrediente ing : nuevoPedido.getIngredientes()) {
            System.out.println("- " + ing.getNombre());
        }
    }

}

package org.example.tfg.npc.listas;

import org.example.tfg.npc.modelo.Ingrediente;

import java.util.ArrayList;

/**
 * Gestiona la lista de todos los ingredientes disponibles en el juego.
 * <p>
 * Esta clase tiene la responsabilidad de instanciar y almacenar un conjunto
 * predefinido de ingredientes que se usarán en otras partes del juego, como en la
 * creación de pedidos para los NPCs.
 *
 * @author Jaime
 * @version 1.0
 */
public class ListaIngredientes {
    /**
     * Almacena las instancias de los ingredientes después de su creación.
     * <p>
     * <strong>Nota:</strong> Este campo es público para un acceso simplificado, pero se
     * recomienda encapsularlo y hacerlo privado en futuras revisiones para un mejor control.
     */
    public ArrayList<Ingrediente> ingredientes;

    /**
     * Inicializa y puebla la lista de ingredientes del juego.
     * <p>
     * Al invocar este método, se crea un conjunto fijo de ingredientes y se
     * añaden a la lista {@code ingredientes}. Si la lista ya contenía
     * elementos, estos se perderán, ya que la lista se instancia de nuevo.
     */
    public void creacionIngredientes(){

        Ingrediente tomate=new Ingrediente("tomate","Fruta roja, ácida triturable para hacer una salsa.");
        Ingrediente carneDinosaurio=new Ingrediente("Carne de Dinosaurio", "Carne dura, se pueden encontrar escamas o plumas en ella.");
        Ingrediente cuernoUnicornio= new Ingrediente("Cuerno de unicornio", "Duro material que multicolor, proveniente de un animal muy especial.");

        ingredientes=new ArrayList<>();
        ingredientes.add(tomate);
        ingredientes.add(carneDinosaurio);
        ingredientes.add(cuernoUnicornio);
    }

    /**
     * Devuelve la lista de ingredientes actualmente almacenada.
     *
     * @return Un {@link ArrayList} de objetos {@link Ingrediente}.
     *         <p>
     *         <strong>Importante:</strong> El valor devuelto puede ser {@code null} si el método
     *         {@link #creacionIngredientes()} no ha sido invocado previamente.
     */
    public ArrayList<Ingrediente> getIngredientes(){
        return ingredientes;
    }
}

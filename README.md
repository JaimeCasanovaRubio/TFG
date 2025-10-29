# Juego TFG en JavaFX

Este proyecto es un juego en desarrollo para un Trabajo de Fin de Grado (TFG), construido con JavaFX y gestionado con Maven.

## Autores

*   Jaime Casanova
*   Olga Marco

---

## Log de Progreso

Esta sección documentará el avance del proyecto a lo largo de los diferentes commits.

### Commit 1: Arquitectura Inicial y Navegación (Realizado por Jaime)

En este commit inicial, se ha establecido la arquitectura base para la navegación y la estructura del proyecto. Los puntos clave implementados son:

-   **Gestor de Escenas Centralizado**: Se ha creado la clase `ControlEscenas` para manejar la transición entre las diferentes pantallas de la aplicación de forma limpia y escalable.
-   **Estructura de Paquetes**: Se ha organizado el código respetando la estructura existente, separando las vistas (`.fxml`) de sus controladores (`.java`).
-   **Navegación Básica**: Se ha implementado la navegación funcional entre tres pantallas: el menú de inicio, la pantalla de controles y una pantalla de juego base.
-   **Configuración de Maven**: El archivo `pom.xml` está configurado para compilar y ejecutar el proyecto JavaFX correctamente.

### Commit 2: Implementación del Sistema de NPCs y Pedidos

Este commit introduce la lógica fundamental para los Personajes No Jugadores (NPCs) y el sistema de pedidos.
-   **Modelo de Datos de NPC:** Se han creado las clases `Ingrediente`, `Pedido` y `ListaIngredientes` para dar soporte al sistema.
-   **Generación de Pedidos:** La clase `modeloNPC` ahora contiene la lógica para generar un pedido aleatorio compuesto por 4 ingredientes únicos.
-   **Documentación Completa (JavaDoc):** Se ha documentado exhaustivamente todo el código nuevo y se ha mejorado y unificado el estilo de la documentación en las clases existentes.
-   **Modularidad Corregida:** Se ha actualizado el fichero `module-info.java` para exportar los nuevos paquetes del sistema de NPCs, permitiendo que la documentación se genere correctamente.

---

## Documentación (Javadoc)

El código fuente está documentado siguiendo el estándar Javadoc.

Para generar la documentación en formato HTML, ejecuta el siguiente comando de Maven en la raíz del proyecto:

```bash
mvn javadoc:javadoc
```

La documentación se generará en la carpeta `target/site/apidocs`. Puedes abrir el archivo `index.html` en tu navegador para explorarla.

## Requisitos

-   **JDK 21** o superior.
-   **Apache Maven**.

## Cómo Ejecutar el Proyecto

### Desde la Línea de Comandos (con Maven)

```bash
mvn clean javafx:run
```

### Desde un IDE (IntelliJ, Eclipse, etc.)

1.  Importa el proyecto como un proyecto Maven.
2.  Asegúrate de que el IDE usa el JDK 21.
3.  Busca la clase principal `org.example.tfg.Main` y ejecútala.
4.  **Importante**: Debes añadir la siguiente opción en la configuración de ejecución de tu IDE, en el campo **"VM Options"**:

    ```
    --enable-native-access=javafx.graphics
    ```

## Estructura del Proyecto

-   `src/main/java/org/example/tfg/`: Contiene las clases principales de la aplicación, como `Main.java` y el gestor de navegación `ControlEscenas.java`.
-   `src/main/java/org.example.tfg.controller/`: Contiene las clases controladoras para cada una de las vistas FXML.
-   `src/main/resources/org/example/tfg/views/`: Contiene los archivos de diseño de la interfaz de usuario (`.fxml`).
-   `pom.xml`: Define las dependencias del proyecto y la configuración de Maven.

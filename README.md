# Sistema de Gestión de Empleados con Herencia en POO

## Descripción del Proyecto
Este proyecto modela diferentes tipos de empleados en una empresa usando herencia en POO, facilitando la gestión diferenciada de roles y permitiendo una administración más flexible y escalable de los recursos humanos. La clase base "Empleado" agrupa los atributos y métodos comunes, mientras que "Desarrollador", "Gerente" y "Diseñador" añaden funcionalidades específicas a cada rol.

## Diagrama de Clases UML
El siguiente diagrama representa la estructura general del sistema, ilustrando la relación de herencia y los métodos principales de cada clase.

![Diagrama UML](diagrama.png)

```mermaid
classDiagram
    class Empleado {
        -nombre: String
        -id: int
        -salario: double
        +Empleado(nombre: String, id: int, salario: double)
        +trabajar()
        +mostrarInfo()
    }

    class Desarrollador {
        -lenguajePrincipal: String
        +Desarrollador(nombre: String, id: int, salario: double, lenguaje: String)
        +escribirCodigo()
        +trabajar()
    }

    class Diseñador {
        -herramientaPrincipal: String
        +Diseñador(nombre: String, id: int, salario: double, herramienta: String)
        +crearPrototipo()
        +trabajar()
    }

    class Gerente {
        -numSubordinados: int
        +Gerente(nombre: String, id: int, salario: double, numSubordinados: int)
        +coordinarEquipo()
        +trabajar()
    }

    Empleado <|-- Desarrollador
    Empleado <|-- Diseñador
    Empleado <|-- Gerente
````

## Justificación de Diseño

### ¿Por qué se eligió esa jerarquía de herencia?
Porque todos los empleados comparten atributos como nombre, ID y salario, y todos realizan una acción genérica llamada "trabajar". La herencia facilita la reutilización y extensión del código, evitando duplicidad y permitiendo agregar fácilmente nuevos tipos de empleados. El polimorfismo permite que cada rol implemente el método `trabajar()` de acuerdo a sus responsabilidades específicas, mejorando la flexibilidad y mantenibilidad del sistema.

### ¿Por qué se seleccionó cada TDA para cada tarea específica?
En esta versión, **NO se usan Estructuras de Datos Abstractas (TDA) complejas**, ya que el objetivo principal es demostrar la herencia y el polimorfismo. Los objetos se gestionan de manera individual. Para un sistema más robusto, se podría utilizar una colección como `ArrayList<Empleado>`, que permitiría almacenar múltiples empleados y aprovechar el polimorfismo, logrando así una mayor eficiencia al gestionar grandes cantidades de datos.

**Ejemplo:**
"Si el sistema creciera, sería adecuado usar una colección dinámica como ArrayList<Empleado>, que permite almacenar y manipular cualquier subclase de Empleado usando referencias a la clase base."

## Manual de Usuario

### Requisitos
- Tener instalado **Java JDK 8** o superior.

### Compilación y Ejecución
1. Abre una terminal en la carpeta del proyecto.
2. Compila el código:
   ```bash
   javac src/*.java

## Notas adicionales
Si el programa espera entrada del usuario, sigue las instrucciones que aparecerán en la consola.

En caso de errores, verifica que la ruta sea correcta y que todos los archivos .java estén en la carpeta indicada.

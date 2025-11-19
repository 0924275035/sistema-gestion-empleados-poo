# Sistema de Gestión de Empleados con Herencia en POO

## Descripción del Proyecto
Este proyecto modela diferentes tipos de empleados en una empresa usando herencia en POO. La clase base "Empleado" contiene atributos comunes, mientras que "Desarrollador", "Gerente" y "Diseñador" añaden funcionalidades específicas.

## Diagrama de Clases UML
![Diagrama UML](diagrama.png)


```mermaid
graph LR;
     
````


## Justificación de Diseño

### ¿Por qué se eligió esa jerarquía de herencia?
Porque todos los empleados comparten atributos como nombre, ID y salario, y todos realizan una acción genérica llamada "trabajar". La herencia permite reutilizar este código común y evitar duplicación, además de permitir extender fácilmente el sistema con nuevos roles.

### ¿Por qué se seleccionó cada TDA para cada tarea específica?
No se usaron estructuras de datos complejas (como listas, pilas o tablas hash) porque el enfoque del proyecto es demostrar **herencia**, no la gestión de colecciones. Los objetos se manejan individualmente. Si el sistema creciera, se podría usar una "ArrayList<Empleado>" para almacenar múltiples empleados, aprovechando el polimorfismo.

## Manual de Usuario

### Requisitos
- Tener instalado Java JDK 8 o superior.

### Compilación y Ejecución
1. Abre una terminal en la carpeta del proyecto.
2. Compila el código:
   ```bash
   javac src/*.java

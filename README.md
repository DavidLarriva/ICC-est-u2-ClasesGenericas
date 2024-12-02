# Clases Genéricas en Java

## Definición de Datos y Clases Genéricas
Las clases genéricas en Java son una característica que permite trabajar con tipos de datos definidos en tiempo de ejecución. Esto facilita la flexibilidad y reusabilidad en el código, permitiendo que las clases sean más dinámicas y seguras.

## ¿Por qué usar Clases Genéricas?
- **Flexibilidad**: Se adaptan a diferentes tipos de datos sin necesidad de modificar la estructura base.
- **Reusabilidad**: Evitan la duplicación de código al permitir un único diseño para múltiples casos.
- **Seguridad de tipos**: Los errores de tipo se detectan durante la compilación, reduciendo fallos en tiempo de ejecución.
- **Legibilidad**: El código es más claro, conciso y fácil de mantener.

## Parámetros de Tipo en Clases Genéricas
En Java, los parámetros genéricos permiten definir clases o métodos que operan con diferentes tipos de datos. Algunos de los más comunes son:

- **T**: Representa un "Tipo" genérico.
- **E**: Suele representar un "Elemento" en colecciones.
- **K** y **V**: Se utilizan para Claves (*Key*) y Valores (*Value*) en estructuras como Mapas.
- **?**: Tipo comodín, útil cuando no se conoce el tipo exacto.

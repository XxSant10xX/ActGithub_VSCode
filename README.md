# Explicación del Código Java

El siguiente código en Java es un programa simple de facturación que solicita la base imponible, el tipo de IVA y un código promocional al usuario para calcular el precio final de un producto.

## Funcionamiento del Programa

1. **Entrada de Datos:**
   - Utiliza la clase `Scanner` para obtener la entrada del usuario desde la consola.
   - Solicita al usuario que introduzca la base imponible (precio antes de impuestos).

2. **Selección del Tipo de IVA:**
   - Presenta al usuario opciones para el tipo de IVA (General, Reducido, Superreducido).
   - Utiliza un `switch` para asignar el porcentaje de IVA correspondiente según la opción seleccionada.

3. **Selección del Código Promocional:**
   - Presenta al usuario opciones de código promocional.
   - Utiliza otro `switch` para calcular el descuento basado en la opción seleccionada.

4. **Cálculo del Precio Final:**
   - Calcula el precio final teniendo en cuenta la base imponible, el IVA y el descuento.

5. **Salida de Resultados:**
   - Muestra el precio final al usuario.

## Consideraciones
- Si el usuario elige un tipo de IVA no válido, se aplica el 21% por defecto.
- Si el usuario selecciona un código promocional no válido, no se aplica ningún descuento.

Este programa es útil para entender los conceptos básicos de entrada de datos, toma de decisiones y cálculos simples en Java.

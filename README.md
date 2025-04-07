Resumen de principales funciones y personalizaciones implementadas
Esto mejora la experiencia del usuario desde el inicio.

# Menú interactivo ampliado
El menú principal incluye tres opciones:
1.Comprar entrada
2.Finalizar compra
3. Salir

# Carrito de compras implementado
Se creó una matriz de 100 filas y 4 columnas para almacenar:
Zona seleccionada
Precio zona
Descuento aplicado
Precio final

# Validación de zona y edad
Las zonas disponibles están personalizadas por precio.

A. Premium (12.000 > Precio Base + 2.000)
B. Media (Precio Base: 10.000)
C. Baja (8.000 > Precio Base - 2.000)

Se validan entradas inválidas y edades fuera de rango (menor a 0 o mayor a 120).

# Descuentos personalizados
* Se aplican dos tipos de descuentos usando estructuras condicionales if y else if:
15% si la edad es ≥ 60 años (adulto mayor)
10% si el usuario es estudiante (s)

# Detalle inmediato tras agregar entrada
* Luego de agregar una entrada al carrito, se muestra al usuario:
Precio zona
Descuento aplicado
Precio final de la entrada Ejemplo de salida:

# Resumen completo al finalizar compra
Al seleccionar la opción "Finalizar compra", el sistema:
* Muestra el detalle de cada entrada registrada.
* Calcula el total a pagar.
> Cierra el programa con un mensaje de agradecimiento.

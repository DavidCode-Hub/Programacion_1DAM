package inventario_Simulacro_Examen;

public @interface Enunciado {
	/*Crea el programa INVENTARIO para llevar el control de los artículos de un almacén. De
cada artículo se debe saber el código, la descripción, el precio de compra, el precio de
venta y el stock (número de unidades).
El menú del programa debe tener, al menos, las siguientes opciones:
1. Listado total
2. Listado stock
3. Alta
4. Baja
5. Modificación
6. Entrada de mercancía
7. Salida de mercancía
8. Otros
9. Salir
• Listado: Mostrará un listado con todos los artículos existentes en el almacén.
	a. El listado debe ser personalizado, mostrando la siguiente información:
	b. “------ Almacén Carrillo ---------. Los artículos de nuestro almacén son los
	siguientes: (código descripción preciocompra precioventa stock)”
		
• Listado stock: Mostrará un listado con todos los artículos del almacén con pocas
	existencias (menor a 2).
• Alta, Baja y Modificación:
	a. Corresponden al alta (entrada de un nuevo artículo en almacén. Alta de los
	artículos no existentes en el almacén)
b. Baja (elimina el artículo del almacén)
c. Modificación (modificar algún artículo existente en el almacén. Sólo
	podemos modificar la descripción, precio de compra, precio de venta y
	stock. Los datos se pedirán por teclado)
• La entrada y salida de mercancía supone respectivamente el incremento y
	decremento de stock de un determinado artículo. Hay que controlar que no se
	pueda sacar más mercancía de la que hay en el almacén. Hay que controlar que el
	artículo existe en nuestro almacén.
• En la opción Otros debe aparecer un submenú con las siguientes opciones:
a. Listado de todos los artículos que tienen en stock más de 4 unidades y un
	precio de venta superior a 100 euros.
b. Listado de todos los artículos que tienen una ganancia de más de 50 euros
	por unidad.
	 * */
}

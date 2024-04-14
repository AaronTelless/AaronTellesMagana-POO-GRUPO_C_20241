from datetime import date

class Producto:
    def __init__(self, nombre, precio, fecha_importacion, numero_serie, stock):
        self.nombre = nombre
        self.precio = precio
        self.fecha_importacion = fecha_importacion
        self.numero_serie = numero_serie
        self.stock = stock

    def agregar_stock(self, cantidad):
        if cantidad > 0:
            self.stock += cantidad
            print(f"{cantidad} unidades de {self.nombre} agregadas al stock.")
        else:
            print("La cantidad debe ser mayor que cero.")

    def eliminar_stock(self, cantidad):
        if cantidad > 0 and cantidad <= self.stock:
            self.stock -= cantidad
            print(f"{cantidad} unidades de {self.nombre} eliminadas del stock.")
        else:
            print("La cantidad no es válida o supera el stock disponible.")

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_precio(self):
        return self.precio

    def set_precio(self, precio):
        self.precio = precio

    def get_fecha_importacion(self):
        return self.fecha_importacion

    def set_fecha_importacion(self, fecha_importacion):
        self.fecha_importacion = fecha_importacion

    def get_numero_serie(self):
        return self.numero_serie

    def set_numero_serie(self, numero_serie):
        self.numero_serie = numero_serie

    def get_stock(self):
        return self.stock

    def set_stock(self, stock):
        self.stock = stock


class Electrodomestico(Producto):
    def __init__(self, nombre, precio, fecha_importacion, numero_serie, marca, modelo, stock):
        super().__init__(nombre, precio, fecha_importacion, numero_serie, stock)
        self.marca = marca
        self.modelo = modelo

    def get_marca(self):
        return self.marca

    def set_marca(self, marca):
        self.marca = marca

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo


class Limpieza(Producto):
    def __init__(self, nombre, precio, fecha_importacion, numero_serie, tipo, stock):
        super().__init__(nombre, precio, fecha_importacion, numero_serie, stock)
        self.tipo = tipo

    def get_tipo(self):
        return self.tipo

    def set_tipo(self, tipo):
        self.tipo = tipo


class Belleza(Producto):
    def __init__(self, nombre, precio, fecha_importacion, numero_serie, tipo_producto, stock):
        super().__init__(nombre, precio, fecha_importacion, numero_serie, stock)
        self.tipo_producto = tipo_producto

    def get_tipo_producto(self):
        return self.tipo_producto

    def set_tipo_producto(self, tipo_producto):
        self.tipo_producto = tipo_producto


class Alimento(Producto):
    def __init__(self, nombre, precio, fecha_importacion, numero_serie, fecha_caducidad, stock):
        super().__init__(nombre, precio, fecha_importacion, numero_serie, stock)
        self.fecha_caducidad = fecha_caducidad

    def get_fecha_caducidad(self):
        return self.fecha_caducidad

    def set_fecha_caducidad(self, fecha_caducidad):
        self.fecha_caducidad = fecha_caducidad


class Cliente:
    def __init__(self, nombre, direccion, telefono):
        self.nombre = nombre
        self.direccion = direccion
        self.telefono = telefono

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def get_telefono(self):
        return self.telefono

    def set_telefono(self, telefono):
        self.telefono = telefono


class Tienda:
    CONTRASENA_SEGURA = "CODYRHODES"

    def __init__(self):
        self.stock_productos = []
        self.clientes = []
        self.productos_vendidos = []

    def ejecutar_programa(self):
        es_contrasena_valida = False

        while not es_contrasena_valida:
            print("\n*** BIENVENIDO ***")
            contrasena = input("Ingresa la contraseña: ")

            if contrasena == self.CONTRASENA_SEGURA:
                es_contrasena_valida = True
                self.ejecutar_menu_sistema()
            else:
                print("\nContraseña incorrecta, intenta de nuevo")

    def ejecutar_menu_sistema(self):
        opcion = 0

        while opcion != 9:
            print("\n** BIENVENIDO AL SISTEMA DE ABARROTES JOHN CENA **")
            print("1. Registrar Producto")
            print("2. Registrar Cliente")
            print("3. Mostrar Productos")
            print("4. Mostrar Clientes")
            print("5. Eliminar Producto")
            print("6. Eliminar Cliente")
            print("7. Realizar compra")
            print("8. Ver productos vendidos")
            print("9. Salir")
            opcion = int(input("Selecciona una opción: "))

            if opcion == 1:
                self.registrar_producto()
            elif opcion == 2:
                self.registrar_cliente()
            elif opcion == 3:
                self.mostrar_productos()
            elif opcion == 4:
                self.mostrar_clientes()
            elif opcion == 5:
                self.eliminar_producto()
            elif opcion == 6:
                self.eliminar_cliente()
            elif opcion == 7:
                self.realizar_compra()
            elif opcion == 8:
                self.mostrar_productos_vendidos()
            elif opcion == 9:
                print("Saliendo del sistema...")
            else:
                print("Opción no válida")

    def registrar_producto(self):
        print("Ingrese el tipo de producto a registrar:")
        print("1. Electrodomestico")
        print("2. Limpieza")
        print("3. Belleza")
        print("4. Alimento")
        opcion_tipo = int(input())

        nombre = input("Ingrese el nombre del producto: ")
        precio = float(input("Ingrese el precio del producto: "))
        fecha_str = input("Ingrese la fecha de importación (YYYY-MM-DD): ")
        fecha_importacion = date.fromisoformat(fecha_str)
        numero_serie = input("Ingrese el número de serie: ")
        stock = int(input("Ingrese el stock del producto: "))

        if opcion_tipo == 1:
            marca = input("Ingrese la marca del electrodomestico: ")
            modelo = input("Ingrese el modelo del electrodomestico: ")
            electrodomestico = Electrodomestico(nombre, precio, fecha_importacion, numero_serie, marca, modelo, stock)
            self.stock_productos.append(electrodomestico)
            print("Electrodomestico registrado con éxito.")
        elif opcion_tipo == 2:
            tipo_limpieza = input("Ingrese el tipo de limpieza: ")
            limpieza = Limpieza(nombre, precio, fecha_importacion, numero_serie, tipo_limpieza, stock)
            self.stock_productos.append(limpieza)
            print("Producto de limpieza registrado con éxito.")
        elif opcion_tipo == 3:
            tipo_belleza = input("Ingrese el tipo de producto de belleza: ")
            belleza = Belleza(nombre, precio, fecha_importacion, numero_serie, tipo_belleza, stock)
            self.stock_productos.append(belleza)
            print("Producto de belleza registrado con éxito.")
        elif opcion_tipo == 4:
            fecha_caducidad = input("Ingrese la fecha de caducidad (YYYY-MM-DD): ")
            alimento = Alimento(nombre, precio, fecha_importacion, numero_serie, fecha_caducidad, stock)
            self.stock_productos.append(alimento)
            print("Alimento registrado con éxito.")
        else:
            print("Opción no válida")

    def registrar_cliente(self):
        nombre = input("Ingrese el nombre del cliente: ")
        direccion = input("Ingrese la dirección del cliente: ")
        telefono = input("Ingrese el teléfono del cliente: ")

        cliente = Cliente(nombre, direccion, telefono)
        self.clientes.append(cliente)
        print("Cliente registrado con éxito.")

    def mostrar_productos(self):
        if not self.stock_productos:
            print("No hay productos en stock.")
        else:
            print("\nProductos en stock:")
            for producto in self.stock_productos:
                print(f"{producto.get_nombre()} - Precio: {producto.get_precio()} - Stock: {producto.get_stock()}")

    def mostrar_clientes(self):
        if not self.clientes:
            print("No hay clientes registrados.")
        else:
            print("\nClientes registrados:")
            for cliente in self.clientes:
                print(f"Nombre: {cliente.get_nombre()} - Dirección: {cliente.get_direccion()} - Teléfono: {cliente.get_telefono()}")

    def eliminar_producto(self):
        nombre_producto = input("Ingrese el nombre del producto a eliminar: ")
        encontrado = False
        for producto in self.stock_productos:
            if producto.get_nombre().lower() == nombre_producto.lower():
                self.stock_productos.remove(producto)
                encontrado = True
                print("Producto eliminado con éxito.")
                break

        if not encontrado:
            print("Producto no encontrado en stock.")

    def eliminar_cliente(self):
        nombre_cliente = input("Ingrese el nombre del cliente a eliminar: ")
        encontrado = False
        for cliente in self.clientes:
            if cliente.get_nombre().lower() == nombre_cliente.lower():
                self.clientes.remove(cliente)
                encontrado = True
                print("Cliente eliminado con éxito.")
                break

        if not encontrado:
            print("Cliente no encontrado.")

    def realizar_compra(self):
        nombre_producto = input("Ingrese el nombre del producto que desea comprar: ")
        nombre_cliente = input("Ingrese el nombre del cliente que realiza la compra: ")
        producto_encontrado = False
        for producto in self.stock_productos:
            if producto.get_nombre().lower() == nombre_producto.lower() and producto.get_stock() > 0:
                producto_encontrado = True
                precio_producto = producto.get_precio()
                producto.eliminar_stock(1)
                self.productos_vendidos.append(producto)
                print(f"Producto: {nombre_producto} - Precio: {precio_producto}")
                print(f"Precio total de la compra: {precio_producto}")
                print(f"Producto '{nombre_producto}' comprado por '{nombre_cliente}'.")
                break

        if not producto_encontrado:
            print("Producto no encontrado o sin stock disponible.")

    def mostrar_productos_vendidos(self):
        if not self.productos_vendidos:
            print("No hay productos vendidos.")
        else:
            print("\nProductos vendidos:")
            for producto in self.productos_vendidos:
                print(f"{producto.get_nombre()} - Precio: {producto.get_precio()}")

# Ejecutar el programa
tienda = Tienda()
tienda.ejecutar_programa()

import random

class Usuario:
    def __init__(self, nombre, edad):
        self.id = random.randint(1, 1000)
        self.nombre = nombre
        self.edad = edad
        self.libros_rentados = []

    def rentar_libro(self, libro):
        self.libros_rentados.append(libro)
        libro.rentar()

    def devolver_libro(self, libro):
        if libro in self.libros_rentados:
            self.libros_rentados.remove(libro)
            libro.devolver()

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Edad: {self.edad}"

class Libro:
    def __init__(self, nombre, autor, cantidad):
        self._id = random.randint(1, 1000)
        self.nombre = nombre
        self.autor = autor
        self.cantidad = cantidad

    def rentar(self):
        if self.cantidad > 0:
            self.cantidad -= 1
        else:
            print("Ya no hay ejemplares disponibles de este libro.")

    def devolver(self):
        self.cantidad += 1

    def __str__(self):
        return f"ID: {self._id}, Nombre: {self.nombre}, Autor: {self.autor}, Cantidad: {self.cantidad}"

class Libreria:
    def __init__(self):
        self.usuarios = []
        self.libros = []

    def registrar_usuario(self, usuario):
        self.usuarios.append(usuario)

    def registrar_libro(self, libro):
        self.libros.append(libro)

    def rentar_libro(self, usuario, libro):
        usuario.rentar_libro(libro)

    def obtener_usuarios_con_libros_rentados(self):
        usuarios_con_libros_rentados = [usuario for usuario in self.usuarios if usuario.libros_rentados]
        return usuarios_con_libros_rentados

    def obtener_libros_no_rentados(self):
        libros_no_rentados = [libro for libro in self.libros if libro.cantidad > 0]
        return libros_no_rentados

    def obtener_libros_rentados(self):
        libros_rentados = [libro for libro in self.libros if libro.cantidad == 0]
        return libros_rentados

def mostrar_usuarios(usuarios):
    for i, usuario in enumerate(usuarios, start=1):
        print(f"{i}. {usuario}")

def mostrar_libros(libros):
    for i, libro in enumerate(libros, start=1):
        print(f"{i}. {libro}")

def EJERCICIO_LIBRERIA():
    libreria = Libreria()

    while True:
        print("\nMENU")
        print("1. Registrar Usuario")
        print("2. Registrar Libro")
        print("3. Rentar Libro")
        print("4. Listar Usuarios con Libros Rentados")
        print("5. Listar Libros no Rentados")
        print("6. Listar Libros Rentados")
        print("7. Salir")
        opcion = int(input("Ingrese la opcion deseada: "))

        if opcion == 1:
            nombre_usuario = input("Ingrese el nombre del usuario: ")
            edad_usuario = int(input("Ingrese la edad del usuario: "))
            nuevo_usuario = Usuario(nombre_usuario, edad_usuario)
            libreria.registrar_usuario(nuevo_usuario)
            print("Usuario registrado con exito. ID:", nuevo_usuario.id)

        elif opcion == 2:
            titulo_libro = input("Ingrese el titulo del libro: ")
            autor_libro = input("Ingrese el autor del libro: ")
            cantidad_libros = int(input("Ingrese la cantidad de libros: "))
            nuevo_libro = Libro(titulo_libro, autor_libro, cantidad_libros)
            libreria.registrar_libro(nuevo_libro)
            print("Libro registrado con exito.")

        elif opcion == 3:
            print("Usuarios:")
            mostrar_usuarios(libreria.usuarios)
            indice_usuario = int(input("Ingrese el indice del usuario: ")) - 1
            print("Libros:")
            mostrar_libros(libreria.libros)
            indice_libro = int(input("Ingrese el indice del libro: ")) - 1
            usuario_seleccionado = libreria.usuarios[indice_usuario]
            libro_seleccionado = libreria.libros[indice_libro]
            libreria.rentar_libro(usuario_seleccionado, libro_seleccionado)
            print("Libro rentado con exito. Cantidad restante:", libro_seleccionado.cantidad)

        elif opcion == 4:
            print("Usuarios con Libros Rentados:")
            usuarios_con_libros_rentados = libreria.obtener_usuarios_con_libros_rentados()
            mostrar_usuarios(usuarios_con_libros_rentados)

        elif opcion == 5:
            print("Libros no Rentados:")
            libros_no_rentados = libreria.obtener_libros_no_rentados()
            mostrar_libros(libros_no_rentados)

        elif opcion == 6:
            print("Libros Rentados:")
            libros_rentados = libreria.obtener_libros_rentados()
            mostrar_libros(libros_rentados)

        elif opcion == 7:
            print("Gracias por usar el sistema.")
            break

        else:
            print("Opcion no valida. Intente nuevamente.")

if __name__ == "__main__":
    EJERCICIO_LIBRERIA()



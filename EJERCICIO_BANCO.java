/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*Realizar dos metodos para poder agrerar o retirar dinero de la cuenta bancaria. Considerar la siguiente:
La cuenta bancaria debe de ser alguno de estos tipos: A,B o C y debe de incluirse al momento de dar de alta
el momento de registrar un usuario con una cuenta. Si se ingresa un valor diferente a esos 3, advertirle al
usuario y no permitir darlo de alta.

-Si el numero de cuenta es de tipo A la cuenta puede tener hasta $50,000
-Si el numero de cuenta es de tipo B la cuenta puede tener hasta $100,000
-Si el numero de cuenta es de tipo C la cuenta puede tener saldo ilimitado

-Al momento de retirar dinero de la cuenta el saldo minimo para la cuenta de tipo A es de $1,000
-Al momento de retirar dinero de la cuenta el saldo minimo para la cuenta de tipo B es de $5,000
-Al momento de retirar dinero de la cuenta el saldo minimo para la cuenta de tipo C es de $10,000
 */


package ejercicio_banco;

import java.util.Scanner;

public class EJERCICIO_BANCO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("\nBIENVENIDO AL BANCO DE RYAN GOSLING");
            System.out.println("1. Agregar Nuevo Empleado");
            System.out.println("2. Mostrar todos los Empleados y sus Cuentas");
            System.out.println("3. Mostrar Informacion de un Empleado y Operaciones");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int age = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salary = scanner.nextDouble();

                    Employee newEmployee = new Employee(name, age, salary);
                    banco.addEmployee(newEmployee);

                    System.out.println("Empleado agregado con exito.");
                    break;
                case 2:
                    System.out.println("Todos los Empleados y sus Cuentas:");
                    banco.showAllEmployees();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del empleado a buscar: ");
                    scanner.nextLine(); // Consumir la nueva línea pendiente
                    String searchName = scanner.nextLine();
                    Employee employee = banco.getEmployeeByName(searchName);
                    if (employee != null) {
                        banco.handleAccountOperations(employee, scanner);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }
}

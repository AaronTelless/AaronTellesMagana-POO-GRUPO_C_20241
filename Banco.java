/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Employee> employees; // Lista de empleados en el banco

    public Banco() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void showAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Empleado: " + employee.getName());
            System.out.println("Informacion: " + employee.getData());
            System.out.println("Cuentas Bancarias:");
            List<BankAccount> accounts = employee.getAccounts();
            for (BankAccount account : accounts) {
                System.out.println("Numero de cuenta: " + account.getAccountNumber());
                System.out.println("Tipo de cuenta: " + account.getAccountType());
                System.out.println("Saldo: " + account.getBalance());
            }
            System.out.println("-----------------------");
        }
    }

    public Employee getEmployeeByName(String employeeName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(employeeName)) {
                return employee;
            }
        }
        return null;
    }

    public void handleAccountOperations(Employee employee, Scanner scanner) {
        List<BankAccount> accounts = employee.getAccounts();

        if (accounts.size() > 0) {
            System.out.println("Seleccione una cuenta para operar:");
            for (int i = 0; i < accounts.size(); i++) {
                BankAccount account = accounts.get(i);
                System.out.println((i + 1) + ". Numero de cuenta: " + account.getAccountNumber() +
                        ", Tipo de cuenta: " + account.getAccountType() +
                        ", Saldo: " + account.getBalance());
            }
            System.out.print("Ingrese el numero 1 para realizar procesos: ");
            int accountIndex = scanner.nextInt();
            // Verificamos que el índice esté dentro del rango válido
            if (accountIndex > 0 && accountIndex <= accounts.size()) {
                BankAccount selectedAccount = accounts.get(accountIndex - 1); // Seleccionar cuenta correctamente
                System.out.println("Operaciones disponibles:");
                System.out.println("1. Agregar dinero");
                System.out.println("2. Retirar dinero");
                System.out.print("Seleccione una opción: ");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Ingrese la cantidad a agregar: ");
                        double depositAmount = scanner.nextDouble();
                        selectedAccount.deposit(depositAmount);
                        System.out.println("Nuevo saldo: " + selectedAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double withdrawAmount = scanner.nextDouble();
                        selectedAccount.withdraw(withdrawAmount);
                        System.out.println("Nuevo saldo: " + selectedAccount.getBalance());
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            } else {
                System.out.println("Numero de cuenta invalido.");
            }
        } else {
            System.out.println("El empleado no tiene cuentas bancarias.");
        }
    }
}

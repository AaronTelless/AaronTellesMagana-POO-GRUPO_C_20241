package ejercicio_banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private List<BankAccount> accounts;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.accounts = new ArrayList<>();
        determineAccountType();
    }

    private void determineAccountType() {
        if (salary <= 50000) {
            addAccountType('A');
        } else if (salary <= 100000) {
            addAccountType('B');
        } else {
            addAccountType('C');
        }
    }

    private void addAccountType(char accountType) {
        BankAccount account = new BankAccount(accountType);
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getData() {
        return String.format("Nombre: %s, Edad: %d, Salario: %.2f", this.getName(), this.getAge(), this.getSalary());
    }

    public void handleAccountOperations(Scanner scanner) {
        if (accounts.size() > 0) {
            System.out.println("Seleccione una cuenta para operar:");
            for (int i = 0; i < accounts.size(); i++) {
                BankAccount account = accounts.get(i);
                System.out.println((i + 1) + ". Numero de cuenta: " + account.getAccountNumber() +
                        ", Tipo de cuenta: " + account.getAccountType() +
                        ", Saldo: " + account.getBalance());
            }
            System.out.print("Ingrese el número de cuenta: ");
            int accountIndex = scanner.nextInt();
            if (accountIndex > 0 && accountIndex <= accounts.size()) {
                BankAccount selectedAccount = accounts.get(accountIndex - 1);
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
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double withdrawAmount = scanner.nextDouble();
                        selectedAccount.withdraw(withdrawAmount);
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

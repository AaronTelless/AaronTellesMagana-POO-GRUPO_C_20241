package ejercicio_banco;


public class BankAccount {
    private static long nextAccountNumber = 1; // Variable estática para el siguiente número de cuenta
    private long accountNumber; // Número de cuenta
    private double balance; // Saldo
    private char accountType; // Tipo de cuenta: A, B o C

    public BankAccount(char accountType) {
        this.accountNumber = nextAccountNumber++; // Asignar y luego incrementar para el siguiente número de cuenta
        this.accountType = accountType;
    }

    // Método para agregar dinero a la cuenta
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Se han agregado $" + amount + " a la cuenta.");
    }

    // Método para retirar dinero de la cuenta
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Se han retirado $" + amount + " de la cuenta.");
        } else {
            System.out.println("Saldo insuficiente para retirar $" + amount);
        }
    }

    // Método getter para obtener el saldo de la cuenta
    public double getBalance() {
        return balance;
    }

    // Método getter para obtener el tipo de cuenta
    public char getAccountType() {
        return accountType;
    }

    // Método getter para obtener el número de cuenta
    public long getAccountNumber() {
        return accountNumber;
    }
}


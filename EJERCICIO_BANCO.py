class Banco:
    def __init__(self):
        self.employees = []

    def add_employee(self, employee):
        self.employees.append(employee)

    def get_employees(self):
        return self.employees

    def show_all_employees(self):
        for employee in self.employees:
            print("Empleado:", employee.get_name())
            print("Información:", employee.get_data())
            print("Cuentas Bancarias:")
            for account in employee.get_accounts():
                print("Numero de cuenta:", account.get_account_number())
                print("Tipo de cuenta:", account.get_account_type())
                print("Saldo:", account.get_balance())
            print("-----------------------")

    def get_employee_by_name(self, employee_name):
        for employee in self.employees:
            if employee.get_name() == employee_name:
                return employee
        return None

    def handle_account_operations(self, employee):
        employee.handle_account_operations()


class BankAccount:
    next_account_number = 1

    def __init__(self, account_type):
        self.account_number = BankAccount.next_account_number
        BankAccount.next_account_number += 1
        self.balance = 0.0
        self.account_type = account_type

    def deposit(self, amount):
        self.balance += amount
        print(f"Se han agregado ${amount:.2f} a la cuenta.")

    def withdraw(self, amount):
        if self.balance - amount >= 0:
            self.balance -= amount
            print(f"Se han retirado ${amount:.2f} de la cuenta.")
        else:
            print("Saldo insuficiente para retirar.")

    def get_balance(self):
        return self.balance

    def get_account_type(self):
        return self.account_type

    def get_account_number(self):
        return self.account_number


class Employee:
    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary
        self.accounts = []
        self.determine_account_type()

    def determine_account_type(self):
        if self.salary <= 50000:
            self.add_account_type('A')
        elif self.salary <= 100000:
            self.add_account_type('B')
        else:
            self.add_account_type('C')

    def add_account_type(self, account_type):
        account = BankAccount(account_type)
        self.accounts.append(account)

    def get_accounts(self):
        return self.accounts

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def get_salary(self):
        return self.salary

    def get_data(self):
        return f"Nombre: {self.get_name()}, Edad: {self.get_age()}, Salario: {self.get_salary():.2f}"

    def handle_account_operations(self):
        if self.accounts:
            print("Seleccione una cuenta para operar:")
            for i, account in enumerate(self.accounts, 1):
                print(f"{i}. Numero de cuenta: {account.get_account_number()}, Tipo de cuenta: {account.get_account_type()}, Saldo: {account.get_balance()}")
            
            account_index = int(input("Ingrese el numero 1 para continuar con el proceso: "))
            if 1 <= account_index <= len(self.accounts):
                selected_account = self.accounts[account_index - 1]
                print("Operaciones disponibles:")
                print("1. Agregar dinero")
                print("2. Retirar dinero")
                option = int(input("Seleccione una opcion: "))
                if option == 1:
                    deposit_amount = float(input("Ingrese la cantidad a agregar: "))
                    selected_account.deposit(deposit_amount)
                elif option == 2:
                    withdraw_amount = float(input("Ingrese la cantidad a retirar: "))
                    selected_account.withdraw(withdraw_amount)
                else:
                    print("Opcion no valida.")
            else:
                print("Numero de cuenta invalido.")
        else:
            print("El empleado no tiene cuentas bancarias.")


if __name__ == "__main__":
    banco = Banco()

    while True:
        print("\nBIENVENIDO AL BANCO DE RYAN GOSLING")
        print("1. Agregar Nuevo Empleado")
        print("2. Mostrar todos los Empleados y sus Cuentas")
        print("3. Mostrar Informacion de un Empleado y Operaciones")
        print("4. Salir")
        option = int(input("Ingrese la opcion deseada: "))

        if option == 1:
            name = input("Ingrese el nombre del empleado: ")
            age = int(input("Ingrese la edad del empleado: "))
            salary = float(input("Ingrese el salario del empleado: "))

            new_employee = Employee(name, age, salary)
            banco.add_employee(new_employee)

            print("Empleado agregado con exito.")
        elif option == 2:
            print("Todos los Empleados y sus Cuentas:")
            banco.show_all_employees()
        elif option == 3:
            search_name = input("Ingrese el nombre del empleado a buscar: ")
            employee = banco.get_employee_by_name(search_name)
            if employee is not None:
                banco.handle_account_operations(employee)
            else:
                print("Empleado no encontrado.")
        elif option == 4:
            print("Hasta luego!")
            break
        else:
            print("Opción no valida. Intente nuevamente.")
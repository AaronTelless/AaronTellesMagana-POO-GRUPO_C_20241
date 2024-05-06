public class EjemplosExcepcionesTarea {

    public static void main(String[] args) {
        try {
            // Ejemplo 1: NullPointerException
            String s = null;
            System.out.println(s.length()); // Rayo McQueen sin ruedas.
        } catch (NullPointerException e) {
            System.out.println("Error: Se intentó acceder a un objeto que es null.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 2: ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Intentando acceder a un elemento más allá del tamaño del array.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Se intentó acceder a un índice fuera del rango de un array.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 3: ArithmeticException
            int result = 10 / 0; // División entre cero. Randy Orton tratando de dividir por 0, imposible.
        } catch (ArithmeticException e) {
            System.out.println("Error: Se intentó realizar una operación aritmética ilegal.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 4: IllegalArgumentException
            int age = -5;
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("Edad inválida"); // Intentando ingresar una edad negativa o mayor a 150 años.
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Se pasó un argumento ilegal a un método.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 5: NumberFormatException
            String numStr = "abc";
            int num = Integer.parseInt(numStr); // Convertir una cadena no numérica a un número.
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir la cadena a un formato numérico.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 6: FileNotFoundException
            java.io.FileInputStream fis = new java.io.FileInputStream("archivo.txt"); // Intentando abrir un archivo que no existe.
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo especificado.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 7: IOException
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("archivo.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error de entrada/salida al leer el archivo.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 8: InterruptedException
            Thread.sleep(1000); // Interrupción mientras se espera.
        } catch (InterruptedException e) {
            System.out.println("Error: Se interrumpió el hilo mientras estaba en espera.");
            e.printStackTrace();
        }

        try {
            // Ejemplo 9: StackOverflowError
            recursiveMethod(); // Método recursivo sin caso base.
        } catch (StackOverflowError e) {
            System.out.println("Error: Se excedió el límite de profundidad de la pila de llamadas.");
            e.printStackTrace();
        }
    }

    // Método recursivo que eventualmente causa un StackOverflowError
    public static void recursiveMethod() {
        recursiveMethod();
    }
}




//INVESTIGACION

// Ejemplo 1: NullPointerException
// Esta excepción ocurre cuando intentas acceder a un objeto que es null.

// Ejemplo 2: ArrayIndexOutOfBoundsException
// Esta excepción ocurre cuando intentas acceder a un índice fuera del rango de un array.

// Ejemplo 3: ArithmeticException
// Esta excepción ocurre cuando ocurre una operación aritmética ilegal, como la división por cero.

// Ejemplo 4: IllegalArgumentException
// Esta excepción indica que un método ha sido pasado un argumento ilegal.

// Ejemplo 5: NumberFormatException
// Esta excepción ocurre cuando se intenta convertir una cadena a un formato numérico, pero la cadena no tiene el formato adecuado.

// Ejemplo 6: ClassCastException
// Esta excepción se lanza cuando se intenta convertir un objeto a un tipo incompatible.

// Ejemplo 7: FileNotFoundException
// Esta excepción ocurre cuando se intenta abrir un archivo que no existe.

// Ejemplo 8: IOException
// Esta excepción indica un error de entrada/salida que puede ocurrir durante la lectura o escritura de archivos.

// Ejemplo 9: InterruptedException
// Esta excepción ocurre cuando un hilo está esperando, durmiendo o en un estado de inactividad y se interrumpe, ya sea antes o durante la actividad.

// Ejemplo 10: StackOverflowError
// Esta excepción ocurre cuando se excede el límite de profundidad de la pila de llamadas debido a una recursión infinita.

// Ejemplo 11: IllegalAccessException
// Esta excepción se lanza cuando se intenta acceder a un miembro de una clase que no tiene acceso permitido.
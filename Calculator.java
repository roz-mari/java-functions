public class Calculator {
    
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal. 
    double a = 10.5;
    double b = 2.0;
        System.out.println("Addition: " + add(a, b));
        System.out.println("Substraction: " + substract(a, b));
        System.out.println("Multiplication: " + multipy(a, b));
        System.out.println("Division: " + divide(a, b));


    }

    //Define los métodos basándote en su doc comment.

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */
     public static double add(double number1, double number2) {
         return number1 + number2;
     }

    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */
     public static double substract(double number1, double number2) {
         return number1 - number2;
     }

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */
     public static double multipy(double number1, double number2) {
         return number1 * number2;
     }

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return number1 / number2;
    }
}

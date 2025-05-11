public class BuiltInFunctions {
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        printMessage("Hello, world!");
        String message = "Hello, Java!";
        System.out.println("Length: " + getLength(message));
        System.out.println("Lowercase: " + convertToLowercase(message));
        System.out.println("Starts with 'Hel': " + findPrefix(message, "Hel"));
        System.out.println("Replace 'a' with '@': " + replaceCharacters(message, 'a', '@'));

        double number = 16.0;
        System.out.println("Square root of 16: " + getsSquareRoot(number));
        System.out.println("2 to the power of 3: " + getPower(2, 3));
        System.out.println("Random number: " + getRandomNumber());

        int number1 = 10;
        int number2 = 20;
        System.out.println("Max of 10 and 20: " + maxNumber(number1, number2));
    }

    /**
     * /**
     * Function name: printMessage
     *
     * @param message (String)
     *                <p>
     *                Inside the function:
     *                1. Find a java built-in function that prints the message on the console.
     */

    // Escribe tu código aquí
    public static void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Function name: getLength
     *
     * @param message (String)
     * @return (int)
     *
     * Inside the function:
     * 1. Find a built-in function that returns the length of a string.
     */

    // Escribe tu código aquí
    public static int getLength(String message) {
       return message.length();
    }

    /**
     * Function name: convertToLowercase
     *
     * @param message (String)
     * @return (String)
     *
     * Inside the function:
     * 1. Find a built-in function that converts a string to lowercase.
     */

    // Escribe tu código aquí
     public static String convertToLowercase(String message) {
         return message.toLowerCase();
     }

    /**
     * Function name: findPrefix
     *
     * @param message (String)
     * @param prefix (String)
     * @return (boolean)
     *
     * Inside the function:
     * 1. Find a built-in function that checks if a string starts with a specified prefix.
     */

    // Escribe tu código aquí
    public static boolean findPrefix(String message, String prefix) {
        return message.startsWith(prefix);
    }

    /**
     * Function name: replaceCharacters
     *
     * @param message (String)
     * @param oldChar (char)
     * @param newChar (char)
     * @return (String)
     *
     * Inside the function:
     * 1. Find a built-in function that replaces all occurrences of a specified character in a string with another character.
     */

    // Escribe tu código aquí
      public static String replaceCharacters(String message, char oldChar, char newChar) {
      return message.replace(oldChar, newChar);
      }

    /**
     * Function name: getsSquareRoot
     *
     * @param number (double)
     * @return (double)
     *
     * Inside the function:
     * 1. Find a built-in function that calculates the square root of a number.
     */

    // Escribe tu código aquí
    public static double getsSquareRoot(double number) {
        return Math.sqrt(number);
    }

    /**
     * Function name: getPower
     *
     * @param base (double)
     * @param exponent (double)
     * @return (double)
     *
     * Inside the function:
     * 1. Find a built-in function that calculates the power of a number.
     */

    // Escribe tu código aquí
    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Function name: getRandomNumber
     *
     * @return (double)
     *
     * Inside the function:
     * 1. Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
     */

    // Escribe tu código aquí
     public static double getRandomNumber() {
         return Math.random();
     }

    /**
     * Function name: maxNumber
     *
     * @param number1 (int)
     * @param number2 (int)
     * @return (int)
     *
     * Inside the function:
     * 1. Find a built-in function that returns the larger of two numbers.
     */

    // Escribe tu código aquí
    public static int maxNumber(int number1, int number2) {
        return Math.max(number1, number2);
}
}
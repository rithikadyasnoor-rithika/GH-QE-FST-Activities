package activities;

public class Activity8 {

    // Method that throws CustomException if the input is null
    public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("Custom Error: Provided string is null.");
        } else {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            // Call with a non-null string
            exceptionTest("Hello, Exceptions!");

            // Call with a null argument (this will throw CustomException)
            exceptionTest(null);

            // This line will not execute because the above call throws
            System.out.println("This line will not print.");

        } catch (CustomException e) {
            // Print the custom error message from our exception
            System.out.println("Caught Exception -> " + e.getMessage());
        }
    }
}

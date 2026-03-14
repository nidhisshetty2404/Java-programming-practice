package ExceptionHandlingAndMultithreading;

public class CheckAge {

        public static void main(String[] args) {

            int age = 16;

            try {

                if (age < 18) {
                    throw new ArithmeticException("Age must be 18 or above");
                }

                System.out.println("Eligible");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }


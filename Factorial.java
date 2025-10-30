public class Factorial {
    public static void main(String[] args) {
       
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument: the number to calculate the factorial.");
            return;
        }

                int number = Integer.parseInt(args[0]);

                if (number < 0) {
            System.out.println("Factorial of a negative number is undefined.");
        } else {
                       long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }

                       System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}

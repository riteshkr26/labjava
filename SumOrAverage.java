public class SumOrAverage {
    public static void main(String[] args) {
       
       
        if (args.length < 2) {
            System.out.println("Please provide at least two arguments: 'sum' or 'average', followed by the numbers.");
            return;
        }

        String operation = args[0].toLowerCase();
        double sum = 0;

       
        for (int i = 1; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }

        if (operation.equals("sum")) {
            System.out.println("Sum: " + sum);
        } else if (operation.equals("average")) {
            double average = sum / (args.length - 1);
            System.out.println("Average: " + average);
        } else {
            System.out.println("Unknown operation: " + operation);
            System.out.println("Please use 'sum' or 'average' as the first argument.");
        }
    }
}

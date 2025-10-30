
import java.util.Scanner;

public class MatrixOperations {

	 public static void main(String[] args) {
	        if (args.length < 2) {
	            System.out.println("Please provide the number of rows and columns as command-line arguments.");
	            return;
	        }

	        int rows = Integer.parseInt(args[0]);
	        int columns = Integer.parseInt(args[1]);

	        int[][] matrix = new int[rows][columns];
	        Scanner scanner = new Scanner(System.in);

	        // Read matrix elements from the console
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Menu-driven program
	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Sum of all elements");
	            System.out.println("2. Print the matrix");
	            System.out.println("3. Print the elements of the principal diagonal");
	            System.out.println("4. Print the sum of elements in the principal diagonal");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    int sum = sumOfElements(matrix);
	                    System.out.println("Sum of all elements: " + sum);
	                    break;

	                case 2:
	                    printMatrix(matrix);
	                    break;

	                case 3:
	                    printPrincipalDiagonal(matrix);
	                    break;

	                case 4:
	                    int diagonalSum = sumOfPrincipalDiagonal(matrix);
	                    System.out.println("Sum of elements in the principal diagonal: " + diagonalSum);
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }

	    public static int sumOfElements(int[][] matrix) {
	        int sum = 0;
	        for (int[] row : matrix) {
	            for (int element : row) {
	                sum += element;
	            }
	        }
	        return sum;
	    }

	    public static void printMatrix(int[][] matrix) {
	        System.out.println("Matrix:");
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void printPrincipalDiagonal(int[][] matrix) {
	        System.out.println("Principal diagonal elements:");
	        int minDimension = Math.min(matrix.length, matrix[0].length);
	        for (int i = 0; i < minDimension; i++) {
	            System.out.print(matrix[i][i] + " ");
	        }
	        System.out.println();
	    }

	    public static int sumOfPrincipalDiagonal(int[][] matrix) {
	        int sum = 0;
	        int minDimension = Math.min(matrix.length, matrix[0].length);
	        for (int i = 0; i < minDimension; i++) {
	            sum += matrix[i][i];
	        }
	        return sum;
	    }
}

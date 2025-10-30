import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        // Step 1: Create input.txt with two numbers if it does not already exist
        createInputFile(inputFileName);

        // Step 2: Read from input.txt
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        reader.close();

        // Step 3: Write to output.txt
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
        if (number1 != null) {
            writer.write(number1);
            writer.newLine(); // Move to the next line
        }
        if (number2 != null) {
            writer.write(number2);
        }
        writer.close();

        System.out.println("Numbers have been read from " + inputFileName + " and written to " + outputFileName);
    }

    private static void createInputFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            // Create file and write default numbers
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("123"); // First number
            writer.newLine();
            writer.write("456"); // Second number
            writer.close();
        }
    }
}

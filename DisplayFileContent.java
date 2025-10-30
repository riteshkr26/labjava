

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFileContent {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java DisplayFileContent <filename>");
            return;
        }

        String filename = args[0];

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}


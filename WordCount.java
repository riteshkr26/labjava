import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String filename = "test1.txt";
        int wordCount = 0;
        int isCount = 0;

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken().toLowerCase();
                wordCount++;
                if ("is".equals(word)) {
                    isCount++;
                }
            }
        }
        br.close();

        System.out.println("Total number of words: " + wordCount);
        System.out.println("Occurrences of 'is': " + isCount);
    }
}

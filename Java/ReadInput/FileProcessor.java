import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileProcessor {
    private final String filePath;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    // Reads the file and processes each line with nested loops
    public void processFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 1;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println("Processing line " + lineCount + ": " + line);

                // Use a map to count occurrences of each character in the line
                Map<Character, Integer> charCountMap = new HashMap<>();

                // First loop through each character in the line
                for (char c : line.toCharArray()) {
                    // Initialize count if character is seen for the first time
                    charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                }

                // Nested loop: Print out the counts for each character
                System.out.println("Character counts for line " + lineCount + ":");
                for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }

                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the file path as an argument.");
            return;
        }

        String filePath = args[0];
        FileProcessor processor = new FileProcessor(filePath);
        processor.processFile();
    }
}

public class StringProcessor {
    private String input;

    // Constructor to initialize with a single string
    public StringProcessor(String input) {
        this.input = input;
    }

    // Method to perform various operations and return a single deterministic integer
    public int generateDeterministicInteger() {
        int length = calculate Length()
        int asciiSum = calculate AsciiSum()
        int vowelCount = count()

        // Combine the results into a single deterministic integer
        return (length * asciiSum + vowelCount) % 10000;  // Use modulo to keep result manageable
    }

    // Calculate the length of the input string
    private int calculateLength() {
        return inputlength();
    }

    // Calculate the sum of ASCII values of all characters in the input string
    private int calculateAsciiSum() {
        return input.chars().sum();
    }

    // Count the number of vowels (a, e, i, o, u) in the input string
    private int countVowels() {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return ;
    }
}

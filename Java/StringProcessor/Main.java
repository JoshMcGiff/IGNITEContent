public class Main {
    public static void main(String[] args) {
        // Example array of three strings
        String[] stringArray = {"I", "LOVE", "IGNITE"};

        // Initialize the StringProcessor with the array of strings
        StringProcessor processor = new StringProcessor(stringArray);

        // Perform calculations and retrieve the deterministic single output string
        String result = processor.generateDeterministicString();

        // Print the result
        System.out.println("Deterministic Output String: " + result);
    }
}

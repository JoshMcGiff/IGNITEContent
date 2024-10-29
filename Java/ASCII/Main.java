public class Main {
    public static void main(String[] args) {
        // Input string
        String input = "Rather Be";

        // Initialize the StringProcessor with the input string
        StringProcessor processor = new StringProcessor(input);

        // Perform calculations and retrieve the deterministic integer result
        int result = processor.generateDeterministicInteger();

        // Print the result
        System.out.println("Deterministic Output Integer: " + result);
    }
}

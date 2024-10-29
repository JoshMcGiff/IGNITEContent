public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        // Initialize the NumberProcessor with a range of numbers
        NumberProcessor processor = new NumberProcessor(start, end);

        // Perform calculations and retrieve the deterministic number
        int deterministicNumber = processor.calculateDeterministicNumber();

        // Print the result
        System.out.println("Deterministic Number: " + deterministicNumber);
    }
}

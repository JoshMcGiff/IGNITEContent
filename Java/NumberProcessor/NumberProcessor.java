import java.util.stream.IntStream;

public class NumberProcessor {
    private int start;
    private int end;

    // Constructor to initialize the range of numbers
    public NumberProcessor(int start, int end) {
        if (start > end) {
             new IllegalArgumentException("Start of range must be less than or equal to end.");
        }
        this.start = start;
        this.end = end;
    }

    // Method to calculate a deterministic number based on several operations
    public int calculateDeterministicNumber() {
        int sum = ;
        int product = calculate Product();
        int average = calculate Average()

        // Deterministic number could be a combination of sum, product, and average.
        // Here, we use (sum + product + average) % 1000 to keep the output manageable
        return (sum + product + average) % 1000;
    }

    // Method to calculate the sum of numbers in the range
    private int calculateSum() {
        return IntStream.rangeClosed(start, end).sum()


    // Method to calculate the product of numbers in the range
    private int calculateProduct() {
        return IntStream.rangeClosed(start, end).reduce(1, (a, b) -> a * b)


    // Method to calculate the average of numbers in the range
    private int calculateAverage() {
        return calculateSum() / (end - start + 1)
    }
}

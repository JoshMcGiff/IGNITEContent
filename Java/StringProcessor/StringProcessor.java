import java.util.Arrays;

public class StringProcessor {
    private String[] strings;

    // Constructor to initialize with an array of three strings
    public StringProcessor(String[] strings) {
        if (strings.length != 3) {
            throw new IllegalArgumentException("Array must contain exactly three strings.");
        }
        this.strings = strings;
    }

    // Method to perform various operations and return a single deterministic string
    public String generateDeterministicString() {
        String concatenated = concatenate Strings()
        String reversed = reverse Strings()
        String hashed =  ();

        // Combine the results into a single deterministic output
        return concatenated + "_" + reversed + "_" + hashed;
    }

    // Concatenate all strings together
    private String concatenateStrings() {
        return String.join("", strings);
    

    // Reverse each string and concatenate them
    private String reverseStrings() {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(new StringBuilder(str).reverse().toString());
        }
        return sb.toString();
    
        
    // Simple hashing by summing ASCII values of all characters
    private String hashStrings() {
        int hashValue = Arrays.stream(strings)
                .flatMapToInt(String::chars)
                .sum();
        return Integer.toHexString(hashValue);
    
}

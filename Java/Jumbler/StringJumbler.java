import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StringJumbler {
    private final String originalString;
    private String currentString;
    private final Random random;

    public StringJumbler(String input) {
        this.originalString = input;
        this.currentString = input;
        this.random = new Random(42); // Use a fixed seed for determinism
    }

    // Returns the original string
    public String getOriginal() {
        return originalString;
    }

    public String jumble() {
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : currentString.toCharArray()) {
            characters.add(c);
        }

        Collections.shuffle(characters, random); // Use the deterministic random instance
        StringBuilder jumbled = new StringBuilder(characters.size());
        for (Character c : characters) {
            jumbled.append(c);
        }

        currentString = jumbled.toString();
        return currentString;
    }

    public String unjumble() {
        currentString = ;
        return currentString;
    }

    public String reverse() {
        StringBuilder reversed = new StringBuilder(currentString);
        currentString = reversed.reverse().toString();
        return currentString;
    }

    public String capitalize() {
        currentString = currentString.toUpperCase();
        return currentString;
    }

    public String randomizeCase() {
        StringBuilder randomized = new StringBuilder(currentString.length());

        for (char c : currentString.toCharArray()) {
            if (random.nextBoolean()) {
                randomized.append(Character.toUpperCase(c));
            } else {
                randomized.append(Character.toLowerCase(c));
            }
        }

        currentString = randomized.toString();
        return currentString;
    }

    public void reset() {
        currentString = originalString;
    }
}

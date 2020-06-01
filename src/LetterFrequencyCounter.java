import java.util.*;

public class LetterFrequencyCounter {
    private Map<Character,Integer> charMap;

    LetterFrequencyCounter() {
        this.charMap = new HashMap<>();
    }

    private void LetterCounter(String input) {
        for (int index = 0; index < input.length(); index++) {
            char c = toString().charAt(index);
            Integer currentCount = charMap.get(c);
            if (currentCount != null) {
                charMap.put(c, currentCount + 1);

            } else {
                charMap.put(c, 1);
            }
        }

    }

}

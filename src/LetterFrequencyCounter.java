import java.util.*;

public class LetterFrequencyCounter {
    Map<Character,Integer> charMap;
    final String notAccepted = " .,\"';:%£$#[{}]/?!+=-_";

    LetterFrequencyCounter() {
        this.charMap = new HashMap<>();
    }

    void letterCounter(String input) {
        for (int index = 0; index < input.length(); index++) {
            char c = input.charAt(index);
            Integer currentCount = charMap.get(c);
            if (!notAccepted.contains(String.valueOf(c))){
                if (currentCount != null) {
                    charMap.put(c, currentCount + 1);

                } else {
                    charMap.put(c, 1);
                }
            }
        }

    }

}

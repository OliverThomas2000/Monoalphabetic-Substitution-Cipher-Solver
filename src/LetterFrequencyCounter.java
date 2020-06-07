import java.util.*;

public class LetterFrequencyCounter extends FrequencyCounter {

    void counter(String input) {
        for (int index = 0; index < input.length(); index++) {
            char c = input.charAt(index);
            Integer currentCount = frequencyMap.get(c);
            if (!NotAcceptedLetters.notAccepted.contains(String.valueOf(c))) {
                if (currentCount != null) {
                    frequencyMap.put(c, currentCount + 1);

                } else {
                    frequencyMap.put(c, 1);
                }
            }
        }

    }

}

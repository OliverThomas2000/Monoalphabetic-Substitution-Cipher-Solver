public class WordFrequencyCounter extends FrequencyCounter {

    void counter(String[] input) {
        for (int index = 0; index < input.length; index++) {
            String word = input[index];
            Integer currentCount = frequencyMap.get(word);
            if (!NotAcceptedLetters.notAccepted.contains(String.valueOf(word))) {
                if (currentCount != null) {
                    frequencyMap.put(word, currentCount + 1);

                } else {
                    frequencyMap.put(word, 1);
                }
            }
        }

    }
}

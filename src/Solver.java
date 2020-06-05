import java.util.*;

public class Solver {
    public static void main(String[] args) {
        String cipherText = "the quick brown fox jumped over the lazy dog";
        CipherMap currentDecrypted = new CipherMap();
        LetterFrequencyCounter letterFrequency = new LetterFrequencyCounter();
        letterFrequency.letterCounter(cipherText.strip().toUpperCase());

        LinkedHashMap<Character, Integer> orderedFrequencies =
                MapSortByValue.MapSortDescending(letterFrequency.charMap);
        Character[] mostCommon = orderedFrequencies.keySet().toArray(new Character[0]);

        currentDecrypted.addPair(mostCommon[0], 'E');
        //TODO create a class that find three letter words ending in our 'e'
    }
}

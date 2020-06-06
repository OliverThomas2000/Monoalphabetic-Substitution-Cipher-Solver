import java.util.*;

public class Solver {
    public static void main(String[] args) {
        String cipherText =
                "the quick brown fox jumps over the lazy dog";
        CipherMap currentDecrypted = new CipherMap();
        WordTypeFilter filter = new WordTypeFilter(cipherText.toUpperCase());
        LetterFrequencyCounter letterFrequency = new LetterFrequencyCounter();
        letterFrequency.letterCounter(cipherText.strip().toUpperCase());

        LinkedHashMap<Character, Integer> orderedFrequencies =
                MapSortByValue.MapSortDescending(letterFrequency.charMap);
        Character[] mostCommon = orderedFrequencies.keySet().toArray(new Character[0]);
        currentDecrypted.addPair('E', mostCommon[0]);
        String[] threeLetterWords = filter.returnXLetterWords(3);
        System.out.println(filter.returnEndsWithX('E')[0]);
    }
}

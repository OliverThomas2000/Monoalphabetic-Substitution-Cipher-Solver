import java.util.*;

public class Solver {
    public static void main(String[] args) {
        String cipherText =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et" +
                " dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
                "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
                "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";
        CipherMap currentDecrypted = new CipherMap();
        WordTypeFilter filter = new WordTypeFilter(cipherText.toUpperCase());
        LetterFrequencyCounter letterFrequency = new LetterFrequencyCounter();
        letterFrequency.letterCounter(cipherText.strip().toUpperCase());

        LinkedHashMap<Character, Integer> orderedFrequencies =
                MapSortByValue.MapSortDescending(letterFrequency.charMap);
        Character[] mostCommon = orderedFrequencies.keySet().toArray(new Character[0]);
        currentDecrypted.addPair('E', mostCommon[0]);
        System.out.println(filter.returnXLetterWords(3)[0]);
        //TODO extend filter class to return words ending in a particular letter.
    }
}

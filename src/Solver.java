import java.util.*;

/**
 * A class to house the main method of the system,
 * handles the skeletal structure of the program
 * explaining the ideas behind the decryption
 */
public class Solver {
    public static void main(String[] args) {
        String cipherText =
                "the quick brown fox jumps over the lazy dog";
        CipherMap currentDecrypted = new CipherMap(); //use this map to keep track of our decoding
        WordTypeFilter filter = new WordTypeFilter(cipherText.toUpperCase()); //use this to return selections of words
        LetterFrequencyCounter letterFrequency = new LetterFrequencyCounter();
        letterFrequency.letterCounter(cipherText.strip().toUpperCase()); // tally the letters in cipherText

        LinkedHashMap<Character, Integer> orderedFrequencies = //order the letters in cipher by frequency
                MapSortByValue.MapSortDescending(letterFrequency.charMap);
        Character[] mostCommon = orderedFrequencies.keySet().toArray(new Character[0]);
        currentDecrypted.addPair('E', mostCommon[0]);//our most common letter is probably an E
        String[] threeLetterWords = filter.returnXLetterWords(3);
        filter.setWords(threeLetterWords);
        String[] xxe = filter.returnEndsWithX('E'); //three letter words ending with e
        String the = (String) ArrayMode.mostCommonElement(xxe);
        System.out.println(the);
    }
}

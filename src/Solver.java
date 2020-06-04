import java.util.*;

public class Solver {
    public static void main(String[] args){
        String cipherText = "the quick brown fox jumped over the lazy dog";
        LetterFrequencyCounter letterFrequency = new LetterFrequencyCounter();
        letterFrequency.letterCounter(cipherText.strip().toUpperCase());
        System.out.println(letterFrequency.charMap);
        LinkedHashMap<Character,Integer> orderedFrequencies =  MapSortByValue.MapSortDescending(letterFrequency.charMap);
        Character[] mostCommon = orderedFrequencies.keySet().toArray(new Character[0]);
        System.out.println(mostCommon[0]);
    }
}

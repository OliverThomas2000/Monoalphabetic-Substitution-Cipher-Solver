import java.util.*;

public class WordTypeFilter {
    String[] words;
    WordTypeFilter(String words){
        this.words= words.split(" ");
    }

    public String[] returnXLetterWords(int length){
        ArrayList<String> outputList = new ArrayList<String>();
        for (String word: this.words){
            if (word.length() == length) {
                outputList.add(word);
            }
        }
        String[] output = outputList.toArray(new String[outputList.size()]);
        return output;
    }
}

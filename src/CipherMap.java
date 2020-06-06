import java.util.*;

public class CipherMap {
    HashMap<Character, Character> cipherMap;

    CipherMap(){
        this.cipherMap = new HashMap<>();
    }

    void addPair(char plaintext, Character cipherText) {
        this.cipherMap.put(cipherText, plaintext);
    }
}

import java.util.*;

public class CipherMap {
    private final Character[] acceptedChars = {};
    private HashMap<Character, Character> cipherMap;

    void addPair(char plaintext, char cipherText) {
        this.cipherMap.put(Character.valueOf(cipherText), Character.valueOf(plaintext));
    }
}

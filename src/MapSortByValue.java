import java.util.*;

public class MapSortByValue {
    protected static LinkedHashMap<Character, Integer> MapSortDescending(Map<Character, Integer> map) {
        LinkedHashMap<Character, Integer> sorted = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));
        return sorted;
    }
}

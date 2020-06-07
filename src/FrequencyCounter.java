import java.util.*;

public abstract class FrequencyCounter {
    Map<Object, Integer> frequencyMap;

    FrequencyCounter() {
        this.frequencyMap = new HashMap<>();
    }

    protected Object mostFrequent() {
        LinkedHashMap<Object, Integer> sorted = new LinkedHashMap<>();
        this.frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));
        return sorted.entrySet().iterator().next().getKey();
    }
}

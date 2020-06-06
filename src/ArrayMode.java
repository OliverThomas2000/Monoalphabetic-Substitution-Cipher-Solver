public class ArrayMode {
    public static Object mostCommonElement(Object[] array) {
        int n = array.length;
        int maxCount = 1;
        Object output = array[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (array[i].equals(array[i - 1]))
                count++;
            else {
                if (count > maxCount) {
                    maxCount = count;
                    output = array[i - 1];
                }
                count = 1;
            }
        }
        return output;
    }
}

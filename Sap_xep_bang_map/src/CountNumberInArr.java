import sun.awt.AWTAccessor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumberInArr {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 3, 5};
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (countMap.containsKey(arr[i])) {
                countMap.replace(arr[i], countMap.get(arr[i]) + 1);
            } else {
                countMap.put(arr[i], 1);
            }

        }
        System.out.println(countMap.entrySet());
        Set<Integer> key = countMap.keySet();
        for (Integer item : key) {
            System.out.println(item + ":" + countMap.get(item));
        }
    }
}

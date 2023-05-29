package hackerrank.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HachNV on 26/05/2023
 */
public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 7, 3, 2, 1);
        lonelyinteger(list);
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if(map.containsKey(a.get(i))) map.put(a.get(i), map.get(a.get(i))+1);
            else map.put(a.get(i), 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) return entry.getKey();
        }
        return 1;
    }
}

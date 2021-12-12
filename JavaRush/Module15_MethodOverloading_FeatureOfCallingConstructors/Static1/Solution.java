/*
*  В статическом блоке инициализировать labels 5 различными парами.
*/

package Static1;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> labels = new HashMap<String, Integer>();

    static {
        labels.put("Bears", 54);
        labels.put("Lions", 512);
        labels.put("Monkeys", 454);
        labels.put("Fishes", 89);
        labels.put("Wolves", 34);
    }

    public static void main(String[] args) {
        for ( Map.Entry<String, Integer> pairs : Solution.labels.entrySet()) {
            System.out.println(pairs.getKey() + " : " + pairs.getValue());
        }
    }
}
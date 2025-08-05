import java.util.*;
public class Rearrangestring {
    public static String rearrange(String str) {

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }


        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;


        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll();
            result.append(current.getKey());


            if (prev != null && prev.getValue() > 0) {
                maxHeap.offer(prev);
            }


            current.setValue(current.getValue() - 1);
            prev = current;
        }


        return result.length() == str.length() ? result.toString() : "Not possible to rearrange";
    }

    public static void main(String[] args) {
        String input = "aaabbc";
        System.out.println("Rearranged: " + rearrange(input));
    }
}

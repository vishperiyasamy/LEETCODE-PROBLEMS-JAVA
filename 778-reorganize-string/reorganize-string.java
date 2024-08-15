class Solution {
    public String reorganizeString(String s) {
          // Step 1: Count the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a max heap (priority queue) based on character frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a, b) -> charFrequency.get(b) - charFrequency.get(a)
        );

        // Add all characters to the max heap
        maxHeap.addAll(charFrequency.keySet());

        String result = "";
        Character prevChar = null;
        int prevFreq = 0;

        // Step 3: Reorganize the string
        while (!maxHeap.isEmpty()) {
            char currentChar = maxHeap.poll();

            result += currentChar;
            if (prevFreq > 0) {
                maxHeap.offer(prevChar);
            }
            prevChar = currentChar;
            prevFreq = charFrequency.get(currentChar) - 1;
            charFrequency.put(currentChar, prevFreq);
            if (prevFreq == 0) {
                prevChar = null;
            }
        }
        if (result.length() != s.length()) {
            return "";
        }

        return result;
    }
}
class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> charFrequency.get(b) - charFrequency.get(a));
        maxHeap.addAll(charFrequency.keySet());
        String result = "";
        Character prevChar = null;
        int prevFreq = 0;
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
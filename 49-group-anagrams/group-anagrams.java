import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            // Convert the string to a character array
            char[] charArray = word.toCharArray();
            // Sort the array
            Arrays.sort(charArray);
            // Convert the sorted array back to a string
            String sortedWord = new String(charArray);
            
            // Use the sorted string as the key
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<String>());
            }
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Step 1: sort the string
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            
            // Step 2: store in hashmap
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(str);
        }
        
        // Step 3: return result
        return new ArrayList<>(map.values());
    }
}
package HashTable;

import java.util.*;

public class GroupAnagrams49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            }else {
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams49 groupAnagrams49 = new GroupAnagrams49();
        System.out.println(
                groupAnagrams49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})
        );
    }
}

package vn.nambb.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LS49 {

    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        LS49 ls49 = new LS49();
        System.out.println(ls49.groupAnagrams(strings));
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newS = new String(chars);
            if (map.containsKey(newS)) {
                map.get(newS).add(s);
            } else {
                map.put(newS, new ArrayList<>());
                map.get(newS).add(s);
            }
        }
        return map.values().stream().toList();
    }


}

package vn.nambb.medium;

import java.util.*;

public class LS347 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 2;

        LS347 ls347 = new LS347();
        System.out.println(Arrays.toString(ls347.topKFrequent(nums, k)));
    }


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer> integerList = new ArrayList<>();

        for (Integer integer : map.keySet()) {
            integerList.add(map.get(integer));
        }

        integerList.sort(Integer::compareTo);
        Set<Integer> result = new HashSet<>();

        for (int i = integerList.size() - 1; i > integerList.size() - k - 1; i--) {
            for (Integer key : map.keySet()) {
                if (!result.contains(key) && Objects.equals(map.get(key), integerList.get(i))) {
                    result.add(key);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

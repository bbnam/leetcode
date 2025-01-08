package vn.nambb.easy;

public class LS3042 {
    public static void main(String[] args) {
        String[] words = {"a","abb"};
        LS3042 solution = new LS3042();
        System.out.println(solution.countPrefixSuffixPairs(words));
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) continue;
                if (words[j].startsWith(words[i]) & words[j].endsWith(words[i])) {
                    count++;
                }
            }
        }
        return count;
    }
}

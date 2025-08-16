package vn.nambb.easy;

public class LS1323 {
    public static void main(String[] args) {
        int num = 9669;
        LS1323 ls1323 = new LS1323();
        System.out.println(ls1323.maximum69Number(num));
    }

    public int maximum69Number(int num) {
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6') {
                char[] chars = str.toCharArray();
                chars[i] = '9';
                return Integer.parseInt(new String(chars));
            }
        }

        return num;
    }
}

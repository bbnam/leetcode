package vn.nambb.easy;

public class LS74 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        LS74 ls74 = new LS74();
        System.out.println(ls74.searchMatrix(matrix, target));
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length - 1]) {
                if (matrix[mid][matrix[mid].length - 1] == target || matrix[mid][0] == target) {
                    return true;
                }
                return binarySearch(matrix[mid], target);
            } else if (matrix[mid][0] < target) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else {
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }

        return false;
    }

    public boolean binarySearch(int[] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] < target) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else {
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }
        return false;
    }
}

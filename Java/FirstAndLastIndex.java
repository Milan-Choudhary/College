package Java;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        //Correct the code to find the first and last occurrence using binary search

        int[] num = {5,7,7,8,8,10};
        int left = 0;
        int right = num.length - 1;
        int target = 8;

        int first = -1;
        int last = -1;

        //  first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] == target) {
                first = mid;
                right = mid - 1; // Continue searching in the left half
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = num.length - 1;

        //  last occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] == target) {
                last = mid;
                left = mid + 1; // Continue searching in the right half
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(first + " " + last);
    }
}

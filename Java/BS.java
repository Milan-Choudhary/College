

public class BS {
    public static void main(String[] args) {
        //Code for searching in rotated sorted array using binary search

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; 
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            }

            // Check if the left half is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } else { // Right half is sorted
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        System.out.println("Element found at index: " + result);
        
    }
}

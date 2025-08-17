package Java;

public class BinarySearch{
    public static void main(String[] args){
        int target = 10;

        int[] arr = {2,4,6,8,10,10,10,10,10,10,12,14,16,18,20};

        int index = -1;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] <= target){
                index = mid;
                left = mid + 1;
            }

            else if(arr[mid] > target){
                right = mid - 1;

            }

        }

        System.out.println(index);
    }
}
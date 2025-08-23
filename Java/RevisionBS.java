package Java;

public class RevisionBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2,3};
        int target = 2;
        int left = 0;
        int right = arr.length - 1;
        int res = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                res = mid;
                break;
            }

            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target < arr[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }

            else{
                if(arr[right] >= target && target > arr[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }

        System.out.println(res);
    }
}

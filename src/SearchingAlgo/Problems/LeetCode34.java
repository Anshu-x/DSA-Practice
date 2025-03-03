package SearchingAlgo.Problems;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        System.out.println(searchRange(nums, target));
    }
        public static int[] searchRange(int[] nums, int target) {
        return new int[] {firstOcc(nums, target),lastOcc(nums, target)};
    }

    public static int firstOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target || target < nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return (end <= 0 )? -1:end+1;
    }

    public static int lastOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target || target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return (start >= nums.length )? -1:start+1;
    }
}

package SearchingAlgo.Problems;

public class searchInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,1};
        System.out.println(search(arr,3));
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstHalf = binSearchOA(arr, target, 0,peak);
        if(firstHalf != -1) return firstHalf;
        else{
            return binSearchOA(arr,target,peak+1,arr.length-1);
        }
    }

    static int binSearchOA(int[] arr, int target, int start , int end){

        boolean isAsc = arr[0] < arr[arr.length - 1];
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid+1;
                }
            }

        }
        return -1;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid+1] > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}

package SearchingAlgo.Problems;

public class SearhingInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,0,1,2,3,4};
//        System.out.println(findPivot(arr));
        System.out.println(search(arr, 8));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binSearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) return pivot;

        if (target >= arr[0]) {
            return binSearch(arr, target, 0, pivot - 1);
        } else {
            return binSearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int findPivot(int arr[]){
        int start= 0;
        int end = arr.length-1 ;

        while(start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[mid] >= arr[start]){
                start = mid+1;
            }
            else if(arr[mid] <= arr[0]) end = mid - 1;
        }
        return -1;
    }

    static int binSearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}

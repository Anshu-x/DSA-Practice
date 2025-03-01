package SearchingAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-34,-17,-4,0,1,3,5,7,8,12,23,34,56,67,123,234,564};
        printIndex(arr);
        System.out.println(binSearch(arr, 56));
    }

    static int binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
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

    static void printIndex(int[] nums){
        int i= 0;
        for(int num: nums){
            System.out.println(num + " " + i);
            i++;
        }
    }
}

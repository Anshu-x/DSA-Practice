package SearchingAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-34,-17,-4,0,1,3,5,7,8,12,23,34,56,67,123,234,564};
        printIndex(arr);
        System.out.println(binSearch(arr, 56));
        System.out.println(binSearch(arr, 564));
        System.out.println(binSearch(arr, -34));
        System.out.println(binSearch(arr, 2));
        System.out.println(binSearch(arr, 8));

        int[] arr2 = {100,50,25,10,5,0,-5,-10,-25,-50,-100};
        printIndex(arr2);
        System.out.println(binSearch(arr2, 100));
        System.out.println(binSearch(arr2, -100));
        System.out.println(binSearch(arr2, 0));
        System.out.println(binSearch(arr2, -50));
        System.out.println(binSearch(arr2, -60));
    }

    static int binSearch(int[] arr, int target){
        if(arr[0] < arr[arr.length-1]) return binSearchIncr(arr, target);
        else return binSearchDecr(arr, target);
    }

    static int binSearchIncr(int[] arr, int target){
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
static int binSearchDecr(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                end = mid-1;
            }
            else if(target < arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }

    public static void printIndex(int[] nums){
        System.out.println();
        int i= 0;
        for(int num: nums){
            System.out.println(num + " " + i);
            i++;
        }
        System.out.println();
    }
}

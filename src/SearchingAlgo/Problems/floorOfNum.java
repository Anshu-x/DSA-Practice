package SearchingAlgo.Problems;

public class floorOfNum {

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,14,19,22,30};
        SearchingAlgo.BinarySearch.printIndex(arr);
        System.out.println(findFloorIndex(arr, 15)+" "+findFloor(arr, 15));
        System.out.println(findFloorIndex(arr, 31)+" "+findFloor(arr, 31));
        System.out.println(findFloorIndex(arr, 1)+" "+findFloor(arr, 1));
    }

    static Integer findFloorIndex(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == n){
                return mid;
            }
            else if(n < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        if(end < 0) return -1; //if no floor present in arr
        return end;
    }

    static Integer findFloor(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == n){
                return arr[mid];
            }
            else if(n < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        if(end < 0) return null; //if no floor present in arr
        return arr[end];
    }
}

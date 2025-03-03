package SearchingAlgo.Problems;

public class ceilOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,14,19,22,30};
        SearchingAlgo.BinarySearch.printIndex(arr);
        System.out.println(findCeilIndex(arr, 15)+" "+findCeil(arr, 15));
        System.out.println(findCeilIndex(arr, 31)+" "+findCeil(arr, 31));
        System.out.println(findCeilIndex(arr, 1)+" "+findCeil(arr, 1));

    }

    static Integer findCeilIndex(int[] arr, int n){
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

        if(start >= arr.length) return -1; //if no ceiling present in arr
        return start;
    }
    static Integer findCeil(int[] arr, int n){
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

        if(start >= arr.length) return null; //if no ceiling present in arr
        return arr[start];
    }
}

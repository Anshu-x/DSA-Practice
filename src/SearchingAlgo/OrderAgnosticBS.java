package SearchingAlgo;

//all in one function
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-34,-17,-4,0,1,3,5,7,8,12,23,34,56,67,123,234,564};
        SearchingAlgo.BinarySearch.printIndex(arr);
        System.out.println(binSearchOA(arr, 56));
        System.out.println(binSearchOA(arr, 564));
        System.out.println(binSearchOA(arr, -34));
        System.out.println(binSearchOA(arr, 2));
        System.out.println(binSearchOA(arr, 8));

        int[] arr2 = {100,50,25,10,5,0,-5,-10,-25,-50,-100};
        SearchingAlgo.BinarySearch.printIndex(arr);
        System.out.println(binSearchOA(arr2, 100));
        System.out.println(binSearchOA(arr2, -100));
        System.out.println(binSearchOA(arr2, 0));
        System.out.println(binSearchOA(arr2, -50));
        System.out.println(binSearchOA(arr2, -60));
    }

    static int binSearchOA(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
}

package SearchingAlgo.Problems;

import SearchingAlgo.BinarySearch;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-34, -17, -4, 0, 1, 3, 5, 7, 8, 12, 23, 34, 56, 67, 123, 234, 564};
        BinarySearch.printIndex(arr);
        System.out.println(SearchInInfiniteArray.ans(arr, 56));
//        System.out.println(SearchInInfiniteArray.ans(arr, 564));
//        System.out.println(SearchInInfiniteArray.ans(arr, -34));
//        System.out.println(SearchInInfiniteArray.ans(arr, 2));
//        System.out.println(SearchInInfiniteArray.ans(arr, 8));
    }


    static int ans(int[] arr, int target){
        int start = 0 ;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;

            end += (end - start + 1) * 2;
            start = newStart;

        }

        return ans(arr, target, start,end);
    }

    static int ans(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }


        }
        return -1;
    }
}

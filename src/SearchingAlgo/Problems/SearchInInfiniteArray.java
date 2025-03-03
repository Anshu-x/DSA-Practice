package SearchingAlgo.Problems;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-34, -17, -4, 0, 1, 3, 5, 7, 8, 12, 23, 34, 56, 67, 123, 234, 564};
        SearchingAlgo.BinarySearch.printIndex(arr);
        System.out.println(binSearchIncr(arr, 56));
//        System.out.println(binSearchIncr(arr, 564));
//        System.out.println(binSearchIncr(arr, -34));
//        System.out.println(binSearchIncr(arr, 2));
//        System.out.println(binSearchIncr(arr, 8));
    }

    static int binSearchIncr(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[end]) {
                end *= 2;
            } else {

                if (target == arr[mid]) {
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }
}

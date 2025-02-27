package SearchingAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3},
                {34,567,4},
                {3,44,53,78}
        };

        System.out.println(max(arr2d));
        System.out.println(min(arr2d));

    }

    static int[] linearSearch2d (int [][] arr, int target){
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max (int [][] arr){
        int max=arr[0][0];

        for(int[] row : arr){
            for(int col : row){
                if(col > max) {
                    max= col;
                }
            }
        }
        return max;
    }
    static int min (int [][] arr){
        int min =arr[0][0];

        for(int[] row : arr){
            for(int col : row){
                if(col > min) {
                    min = col;
                }
            }
        }
        return min;
    }


}

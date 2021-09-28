import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] squareOfNumber = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            squareOfNumber[i] = (nums[i]*nums[i]);
        }
        Arrays.sort(squareOfNumber);
        return squareOfNumber;
    }


    public static void main(String[] args) {
        int[] arrayOfNumbs = {-4,-1,3,5,8};
        SquaresOfSortedArray square = new SquaresOfSortedArray();
        arrayOfNumbs = square.sortedSquares(arrayOfNumbs);
        System.out.println(Arrays.toString(arrayOfNumbs) );
    }
}
public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int totalEvenNum = 0;
        int evenNumberCounter = 0;
        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            while(number!=0){
                evenNumberCounter++;
                number = number/10;
            }
            if(evenNumberCounter%2==0) {
                totalEvenNum++;
            }
                evenNumberCounter=0;

        }

return totalEvenNum;
    }

    public static void main(String[] args) {
        int[] arrayOfNumbs = {555,90,482,1771,7634735,644,343457,34,34343,343345};
        EvenNumberOfDigits even = new EvenNumberOfDigits();
        int totalNumber = even.findNumbers(arrayOfNumbs);
        System.out.println(totalNumber);
    }
}

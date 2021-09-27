public class MaxConsecutiveOnes {
    public int MaxOnes(int[] nums) {
        int maxNumberCounter = 0;
        int maxOnes = 0;
        if (nums != null) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    maxNumberCounter++;
                    if (maxNumberCounter > maxOnes) {
                        maxOnes = maxNumberCounter;
                    }
                }else {
                    maxNumberCounter = 0;
                }

            }
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] arrayOfNumbs = {1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1};
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        System.out.println(arrayOfNumbs.length);
        int maxOnes = m.MaxOnes(arrayOfNumbs);
        System.out.println(maxOnes);

    }
}


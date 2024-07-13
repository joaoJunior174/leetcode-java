import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(generateSolution(new int[]{-1,0,-1}));
    }

    public static int generateSolution(int [] nums) {

        int currentSum = nums[0];
        int bestSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int nextSum = currentSum + nums[i];
            currentSum = nums[i];

            if (nextSum > nums[i]) {
                currentSum = nextSum;
            }

            if (currentSum > bestSum) {
                bestSum = currentSum;
            }
        }

        return bestSum;
    }
}
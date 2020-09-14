package towsum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        boolean isEqual = false;
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            j = i + 1;
            while (j < nums.length) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    isEqual = true;
                    break;
                }
                ++j;
            }
            if (isEqual) {
                break;
            }
            ++i;
        }
        indices[0] = i;
        indices[1] = j;
        return indices;
    }
}

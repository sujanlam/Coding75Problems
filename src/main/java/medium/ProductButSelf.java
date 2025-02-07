package medium;

public class ProductButSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productButSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] productButSelf(int[] nums) {
        int[] res = new int[nums.length];

        int leftMult = 1;
        int rightMult = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = leftMult;
            leftMult = leftMult * nums[i];
        }
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = rightMult * res[i];
            rightMult = rightMult * nums[i];
        }

        return res;
    }
}

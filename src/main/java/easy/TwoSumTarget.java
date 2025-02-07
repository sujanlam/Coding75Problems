package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {
    public static void main(String[] args) {
        int[] nums = {2,7,4, 1,2,9};
        int target = 16;
        int[] res = twoSumTarget(nums, target);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] twoSumTarget(int[] nums, int target) {
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(mapp.containsKey(comp)){
                return new int[]{mapp.get(comp), i};
            }
            mapp.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}

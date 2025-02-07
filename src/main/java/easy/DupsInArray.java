package easy;

import java.util.HashSet;
import java.util.Set;

public class DupsInArray {
    public static void main(String[] args) {
        int[] nums = {14,2,3,14};

            System.out.println(containsDups(nums));

    }
    public static boolean containsDups(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}

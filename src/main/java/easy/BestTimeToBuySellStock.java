package easy;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] nums) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;
        while(sell < nums.length) {
            if(nums[buy] > nums[sell]){
                buy++;
            }
            maxProfit = Math.max(maxProfit, nums[sell]-nums[buy]);
            sell++;
        }

        return maxProfit;
    }
}

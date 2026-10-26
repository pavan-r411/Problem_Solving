class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int l =0; 
        int total = 0;
        for(int i =0; i < nums.length; i++ ){
            total += nums[i];             
            while(total >= target){
                len = Math.min(len,(i - l + 1));
                total -= nums[l];
                l++;
            }

        }

        return len == Integer.MAX_VALUE ?  0 : len;

    }
}
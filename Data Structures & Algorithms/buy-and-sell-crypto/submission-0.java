class Solution {
    public int maxProfit(int[] prices) {
        int globalMin = prices[0];
        int prof = Integer.MIN_VALUE;

        for(int i = 1;i<prices.length;i++){
            int diff = prices[i] - globalMin;
            prof = Math.max(diff, prof);
            globalMin = Math.min(globalMin, prices[i]);
        }

        System.out.println(globalMin);

        return Math.max(prof,0);
        
    }
}

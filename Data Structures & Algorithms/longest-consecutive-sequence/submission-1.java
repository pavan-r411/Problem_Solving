class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int maxLen = Integer.MIN_VALUE;
        for(int i : nums){
            if(s.contains(i-1)) continue;
            int cnt = 0;
            int ele = i;
            while(s.contains(ele)){
                cnt++;
                ele++;
            }
            maxLen = Math.max(cnt, maxLen);
            cnt = 0;
        }

        return Math.max(maxLen,0);
        
    }
}

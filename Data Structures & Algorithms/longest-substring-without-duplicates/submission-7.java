class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int ans = 0;

        while(r < s.length()){
            char curr = s.charAt(r);
            if(map.containsKey(curr)){
                l = Math.max(l, map.get(curr) + 1);
                map.put(curr, r);
            }else{
                map.put(curr, r);
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}

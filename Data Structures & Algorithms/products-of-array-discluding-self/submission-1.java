class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> forward = new HashMap<>();
        Map<Integer, Integer> backward = new HashMap<>();
        int n = nums.length - 1;
        int f = 1;
        int b = 1;
        int []res = new int[n+1];
        for(int i = 0;i<=n;i++){
            forward.put(i, f);
            backward.put(n - i, b);
            f = f * nums[i];
            b = b * nums[n -i];
        }

        for(int i =0;i<=n;i++){
            res[i] = forward.get(i) * backward.get(i);
        }
        return res;
        
    }
}  

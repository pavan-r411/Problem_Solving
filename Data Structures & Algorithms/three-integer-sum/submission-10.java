class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = 0;
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0;i<nums.length; i++){
            
            if(i > 0 && nums[i] == nums[i-1]) continue;

            l = i + 1;
            r = nums.length - 1;

            while(l < r){
               
                sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(r > l && nums[r] == nums[r+1]){
                        r--;
                    }
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }

                else if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                        
                }
            }
        }

        return res;
        
        
    }
}

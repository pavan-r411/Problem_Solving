class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i =0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int rem = -(nums[i] + nums[j]);

                if(map.containsKey(rem) ){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], rem);
                    Collections.sort(temp);
                    set.add(temp);
                }

                map.put(nums[j], j);
            }

            map.clear();
        }

        return new ArrayList<>(set);
        
        
    }
}

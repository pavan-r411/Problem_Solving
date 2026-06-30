class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a , map.getOrDefault(a, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(), b.getValue())
        );

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            heap.add(m);
            if(heap.size()>k){
                heap.poll();
            }

        }

        int [] ans = new int[k];
        int i = 0;
        while(!heap.isEmpty()){
            ans[i++] = heap.poll().getKey();
        }

        return ans;
    }
}

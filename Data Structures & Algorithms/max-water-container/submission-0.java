class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length -1;
        int cont = Integer.MIN_VALUE;
        while(start < end){
            int vol = Math.min(heights[start], heights[end]) * (end - start);
            cont = Math.max(cont, vol);
            if(heights[start] > heights[end]){
                end --;
            }else{
                start++;
            }
        }

        return cont;
        
    }
}

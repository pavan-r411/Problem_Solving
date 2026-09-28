class Solution {
    public int[] replaceElements(int[] arr) {
        int replace = -1;
        int cur = -1;
        for(int i = arr.length -1 ;i>=0;i--){
            cur = arr[i];
            arr[i] = replace;
            replace = Math.max(replace, cur);
        }

        return arr;
        
    }
}
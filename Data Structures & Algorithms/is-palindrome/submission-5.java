class Solution {
    public boolean isPalindrome(String s) {
        int low =0;
        int high = s.length() - 1;

        while(low < high && low>=0 && high <= s.length()-1){
            
            if(!Character.isLetterOrDigit(s.charAt(low))){
                low++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(high))){
                high--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(high)) != Character.toLowerCase(s.charAt(low))){
                System.out.println(Character.toLowerCase(s.charAt(high)) +" "+ Character.toLowerCase(s.charAt(low)));
                return false;
            }

            low++;
            high--;
        }

        return true;
        
    }
}

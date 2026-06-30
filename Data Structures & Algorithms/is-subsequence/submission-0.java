class Solution {
    public boolean isSubsequence(String s, String t) {
        int ps = 0;
        int pt = 0;

        int sn = s.length();
        int tn = t.length();

        while(ps < sn && pt < tn){
            if(s.charAt(ps) == t.charAt(pt)){
                ps++;
                pt++;
            }else{
                pt++;
            }
        }
        
        return ps == sn;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0,p2 =0,cnt = 0;
        while(p1<s.length() && p2<t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                cnt++;
            }
            p2++;
        }
        if(cnt == s.length()) return true;
        else return false;
        
    }
}
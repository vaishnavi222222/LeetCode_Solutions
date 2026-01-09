class Solution {
    public boolean palindrome(String ss){
        int i = 0;
        int j = ss.length()-1;
        while(i < j){
            if(ss.charAt(i) != ss.charAt(j)){
                 return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(palindrome(s)) return true;
        int p1 = 0,p2 = s.length() -1;
        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
                String s1 = s.substring(p1,p2);
                String s2 = s.substring(p1+1,p2+1);
                 boolean r1 = palindrome(s1);
                 boolean r2 = palindrome(s2);
                if(r1 || r2) return true;
                if(!r1 && !r2) return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
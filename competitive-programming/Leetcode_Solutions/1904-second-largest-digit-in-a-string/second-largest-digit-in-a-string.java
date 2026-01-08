class Solution {
    public int secondHighest(String s) {
        int fl = -1;
        int sl = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9 && s.charAt(i)-'0' > fl){
                sl = fl;
                fl = s.charAt(i)-'0';
            }
            else if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9 && s.charAt(i)-'0' > sl && s.charAt(i)-'0' != fl){
                sl = s.charAt(i) -'0';

            }
        }
        return sl;
    }
}
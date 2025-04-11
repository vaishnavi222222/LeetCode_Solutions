class Solution {
    public boolean sym(int val){
        String s = Integer.toString(val);
        int v1 = 0;
        int v2 = 0;
        if(s.length()%2 != 0) return false;
        for(int i=0;i<(s.length());i++){
            int num = s.charAt(i) - '0';
            if(i<(s.length())/2) v1 += num;
            else v2 += num;
        }
        return v1 == v2;
    }
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for(int i=low;i<=high;i++){
                if(sym(i)){
                     cnt++;
                }
                //Syste
        }
        return cnt;
    }
}
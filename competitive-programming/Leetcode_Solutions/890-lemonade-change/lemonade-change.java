class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a =0,b=0,c=0;
        int cnt = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                a++;
                cnt++;
            } else if(bills[i] == 10 && a > 0){
                b++;
                a--;
                cnt++;
            }else if(a>0 && b>0){
                c++;
                a--;
                b--;
                cnt++;
            }else if(a>=3){
                c++;
                a = a-3;
                cnt++;
            }
        }
        if(cnt == bills.length) return true;
        return false;
    }
}
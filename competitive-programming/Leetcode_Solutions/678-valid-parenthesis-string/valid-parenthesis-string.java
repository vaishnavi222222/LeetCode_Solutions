class Solution {
    public boolean checkValidString(String s) {
        int leftmax = 0,leftmin = 0;
        for(char a : s.toCharArray()){
            if(a == '('){
                leftmax++;
                leftmin++;
            }
            else if(a==')'){
                leftmax--;
                leftmin--;
            }
            else{
                leftmin--;
                leftmax++;
            }
        if(leftmax <0) return false;
        if(leftmin <0) leftmin = 0;
        }
        return leftmin == 0;
    }
}
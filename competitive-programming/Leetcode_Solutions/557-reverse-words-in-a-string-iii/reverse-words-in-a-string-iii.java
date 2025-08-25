class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length;i++){
            StringBuilder ss = new StringBuilder(a[i]);
            sb.append(ss.reverse());
            if(i!=a.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
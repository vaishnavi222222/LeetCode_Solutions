class Solution {
    public boolean vowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
                return true;
            }
            return false;
    }
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int p1 = 0;
        int p2 = a.length - 1;
        while(p1<p2){
            if(vowel(a[p1]) && vowel(a[p2])){
                    char temp = a[p1];
                    a[p1] = a[p2];
                    a[p2] = temp;
                    p1++;
                    p2--;
            }
             if(!vowel(a[p1]))  p1++;
             if(!vowel(a[p2]))  p2--;

        }
        return new String(a);
    }
}
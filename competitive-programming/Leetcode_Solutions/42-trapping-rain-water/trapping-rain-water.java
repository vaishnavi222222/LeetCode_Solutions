class Solution {
    public int trap(int[] a) {
        int N=a.length;
        int[] pf=new int[N];
            pf[0]=a[0];
            for(int i=1;i<N-1;i++){
                pf[i]=Math.max(pf[i-1],a[i]);
            }
            int[] sf=new int[N];
            sf[N-1]=a[N-1];
            for(int i=N-2;i>0;i--){
                sf[i]=Math.max(sf[i+1],a[i]);
            }
            int sum=0;
            for(int i=1;i<N-1;i++){
                sum+=Math.min(pf[i],sf[i])-a[i];
            }
            return sum;

        
    }
}
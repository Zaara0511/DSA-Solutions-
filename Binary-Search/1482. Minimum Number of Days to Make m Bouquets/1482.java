class Solution {
    public boolean check(int[] bloomDay, int m, int k, int mid){
        int f=0;
        int b=0;
        int n=bloomDay.length;

        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                f++;
                if(f==k){
                    b++;
                    f=0;
                }
            }else{
                f=0;
            }
        }
        return b>=m;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=1;
        int n=bloomDay.length;
        int ans=-1;
        int high=0;

        for(int z: bloomDay){
            high=Math.max(high,z);
        }

        if(m*k >n){
            return -1;
        }
        while(low<=high){
            int mid= low+(high-low)/2;

            if(check(bloomDay, m, k, mid)){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
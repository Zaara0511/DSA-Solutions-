class Solution {
    public boolean check(int n ,int[] quantities,int mid){
        int sum=0;
        int m=quantities.length;
        for(int i=0;i<m ;i++){
            sum+=(quantities[i]+mid-1)/mid;
        }
        return n>=sum;

    }
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1;
        int high=0;
        int ans=0;
        for(int x:quantities ){
            high=Math.max(high,x);
        }

        while(low<=high){
            int mid= low+(high-low)/2;

            if(check(n, quantities, mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
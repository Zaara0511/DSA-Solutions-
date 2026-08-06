class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2]; int p=0;
        int[] neg=new int[n/2]; int e=0;
        int[] res= new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[e]=nums[i];
                e++;
            }else{
                pos[p]=nums[i];
                p++;
            }
        }
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                res[i]=pos[x];
                x++;
            }else{
                res[i]=neg[y];
                y++;
            }
        }

        return res;
    }
}

class Solution {
    public boolean check(int[] nums, int target, int mid){
        int sum=0;
         for(int i=0;i<mid;i++) {
            sum += nums[i];
        }

        if(sum>= target) {
        return true;
        }
      
        for(int i=mid;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-mid];

            if(sum>=target){
                return true;
            }
        }
        return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
      int l=1;
      int ans=0;
      int h=nums.length;

      while( l<=h){
        int mid= l+(h-l)/2;

        if(check(nums, target,mid)){
            ans=mid;
            h=mid-1;
        }else{
            l=mid+1;
        }
      }
      return ans;
    }
}
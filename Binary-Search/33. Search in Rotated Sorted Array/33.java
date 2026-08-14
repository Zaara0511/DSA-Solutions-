class Solution {
    public int search(int[] nums, int target) {
        //bs n 
             int ans=-1;
             int n= nums.length;
             int low=0;
             int high=n-1;

             while(low<=high){
                int mid= low+(high-low)/2;

                if(nums[mid]==target){
                    return mid;
                }else{
                    //left sorted
                    if(nums[mid]>=nums[low]){
                        if(nums[low]<= target && target<nums[mid]){
                            high=mid-1;
                        }else{
                            low=mid+1;
                        }
                    }

                    //right sort
                    else {
                        if(nums[high]>=target && target>nums[mid]){
                            low=mid+1;
                        }else {
                            high=mid-1;
                        }
                    }
                }
             }
        return ans;
    }
}
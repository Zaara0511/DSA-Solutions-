class Solution {
    public void rotate(int[] nums, int k) {
    k=k%nums.length;
     //whole array reverse   
      int l=0;
      int r=nums.length-1;

      while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
      }
    //first part
      int left=0;
      int right=k-1;
      while(left<right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
      }

    //second part

    int x=k;
    int y=nums.length-1;

     while(x<y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
        x++;
        y--;
      }
    
    }
}

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();
        int n=nums.length;
      
        for(int x: nums){
                set.add(x);
                
        }
       int ans=k;

       while(set.contains(ans)){
            ans=ans+k;
       }
        return ans;
    }
}
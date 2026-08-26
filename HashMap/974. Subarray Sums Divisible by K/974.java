class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // prefix1 % k == prefix2 % k
        //       ↓
        // (prefix2 - prefix1) % k == 0
        
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int c=0;
        map.put(0,1);

        for(int num: nums){
            sum= sum+num;
            int r= sum%k;

            if(r<0){
                r+=k;
            }

            if(map.containsKey(r)){
                
                c+= map.get(r);
                
            }
            map.put(r, map.getOrDefault(r,0)+1);
        }
        return c;
    }
}
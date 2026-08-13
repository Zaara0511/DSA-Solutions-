class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list= new ArrayList<>();
        if(n==1){
            return list;
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<n;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int val=e.getValue();
            int key=e.getKey();

            if(val>=2){
                list.add(key);
            }

        }
        return list;
    }
}

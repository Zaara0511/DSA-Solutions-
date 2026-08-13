class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> set = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        for(int x: nums1){
            set.put(x,set.getOrDefault(x,0)+1);
        }

        for(int y: nums2){
            if(set.containsKey(y) && set.get(y) > 0){
                list.add(y);

                set.put(y, set.get(y)-1);
            }
        }

        int[] res= new int[list.size()];
        int i=0;
        for(int z: list){
            res[i++]=z;
        }
        return res;
    }
}
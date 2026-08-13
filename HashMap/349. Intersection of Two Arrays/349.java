class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> same = new HashSet<>();

        for(int x:nums1) { //one array
            set.add(x);
        }

        
        for(int x:nums2) { //common 
            if(set.contains(x)){
                same.add(x);
            }
        }
        
        int[] res=new int[same.size()];

        int i=0;
        for(int x:same) {
            res[i++]=x;
        }
        return res;
    }
}

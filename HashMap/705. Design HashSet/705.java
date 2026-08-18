class MyHashSet {
    ArrayList<Integer> list;
    public MyHashSet() {
        list= new ArrayList<>();
    }
    
    public void add(int key) {
        if(!list.contains(key)){
            list.add(key);
        }
        
    }
    
    public void remove(int key) {
        //check n remove
        int n=list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)==key){
                list.remove(i);
                break;
            }
        }
    }
    
    public boolean contains(int key) {
        int n=list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)==key){
                return true;
            }
        }
        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
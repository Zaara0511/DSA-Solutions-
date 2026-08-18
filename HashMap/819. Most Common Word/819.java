class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map= new HashMap<>();
        HashSet<String> set= new HashSet<>();
        for(String ss: banned){
            set.add(ss);
        }

        paragraph= paragraph.toLowerCase();
        paragraph= paragraph.replaceAll("[!?',;.]"," ");
        String[] s=paragraph.split("\\s+");
        for(int i=0;i<s.length;i++){
            String word=s[i];
            map.put(word,map.getOrDefault(word,0)+1);
            }
        
    int max=0;
    String temp="";
        for(String str: map.keySet()){
            if(!set.contains(str)){
                if(map.get(str)>max){
                    temp=str;
                    max=map.get(str);
                }
            }
        }
        return temp;
    }
}
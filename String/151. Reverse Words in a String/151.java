class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        s=s.strip();
        String[] str= s.split("\\s+");

        for(int i=str.length-1;i>=0;i--){
            String word= str[i];
            if(!word.equals("")){
                sb.append(word);
                sb.append(" ");
            }
        }
        String res=sb.toString();
        res=res.strip();
        return res;
    }
}
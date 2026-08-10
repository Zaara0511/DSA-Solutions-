class Solution {
    public String simplifyPath(String path) {

        // 1. use split function
        // 2.  use stack keep tracks of str parts
        // 3. append it to sb

        Stack<String> st=new Stack<>();
        String[] arr=path.split("/");
        
        for(int i=0; i<arr.length;i++){
            String part=arr[i];

            if( part.equals("..")){
                if(!st.isEmpty()){
                       st.pop();
                }
             
            }else if(part.equals(".")|| part.equals("")){
                continue;
            }else{
                st.push(part);
            }
        }
        StringBuilder sb= new StringBuilder();
        for(String words: st){
            sb.append('/');
            sb.append(words);
        }
        if(sb.length()==0){
            sb.append('/');   
               }
        return sb.toString();
    }
}
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb= new StringBuilder();
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch<='z'&& ch>='a'){
                sb.append(ch);
            }else if( ch=='('){
                sb.append(ch);
                int pos=sb.length()-1;
                st.push(pos);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                    sb.append(ch);
                }
            }
        }
        while(!st.isEmpty()){
            int i= st.pop();
            sb.deleteCharAt(i);
        }

        return sb.toString();
    }
}
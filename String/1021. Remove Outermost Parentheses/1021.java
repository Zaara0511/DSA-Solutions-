class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                if(ch=='('){
                    st.push(i);
                }
            }else{
                if(ch==')'){
                    st.pop();
                    if(!st.isEmpty()){
                         sb.append(')');
                    }
                   
                }else{
                    st.push(i);
                    sb.append('(');
                }

            }
        }
        return sb.toString();
    }
}
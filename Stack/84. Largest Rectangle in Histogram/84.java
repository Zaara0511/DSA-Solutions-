class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st= new Stack<>();
        int[] left= new int[n];
        int[] right= new int[n];

        for(int i=0;i<n;i++){ //first smaller in left
            int curr=heights[i];

            while(!st.isEmpty() && heights[st.peek()]>=curr){
                  st.pop();
            }

            if(st.isEmpty()){
                left[i]=0;
            }else{
                left[i]=st.peek() + 1;
            }
            st.push(i);

        }
        st.clear();

        for(int i=n-1;i>=0;i--){
            
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i]=n-1;
            }else{
                right[i]=st.peek() - 1;
            }
            st.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){

            int width=right[i]-left[i] + 1;
            int area= width* heights[i];
            max=Math.max(max,area);

        }
        return max;
    }
}
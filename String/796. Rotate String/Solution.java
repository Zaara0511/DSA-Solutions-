public class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int g=goal.length();
        
        if(n!=g){
            return false;
        }
        if(n==0){
            return true;
        }

        for(int i=0;i<n;i++){
            if(goal.charAt(i)!=s.charAt(0)){
                continue;
            }
            int j=0;
            int k=i;

            while(j<n){

                if(s.charAt(j)!= goal.charAt(k)){
                    break;
                }
                j++;
                k=(k+1)%n;

            }
            if(j==n){
                return true;
         }
           

        }
         
         return false;
    }
}
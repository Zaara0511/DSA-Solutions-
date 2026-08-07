class Solution {
    public int smallestNumber(int n, int t) {
        //n dits n check if its divisible by t

       
        
        while(true){
            int pro=1;
            int temp=n;

        while(temp>0){
            int digit=temp%10;
            pro= pro* digit;
            temp=temp/10;


        }
        if (pro%t==0) {
            return n;
         }
        n++;

    }
    }
}


class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        //sort both
        // new syntax: for( i , j; i<n;i++,j++;) //O(n)
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p= prices.length;
        int d=discounts.length;
        double sum=0;

        
        for(int i=p-1, j=d-1; i>=0; i--, j--){
          
            if(j>=0){
                sum+= (prices[i] *(100-discounts[j]))/100.0;
            }else{
                sum+=(double)(prices[i]);
            }
        }
        return sum;
        
    }
}©leetcode
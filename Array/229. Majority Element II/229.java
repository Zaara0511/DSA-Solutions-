import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // n/3 => 2 nums possible
        int n=nums.length;
        int num1=0; int c1=0;
        int num2=0; int c2=0;

        for(int x: nums){


            if(x==num1){
                c1++;
            }else if(x==num2){
                c2++;
            }else if(c1==0){
                num1=x;
                c1=1;
            }else if(c2==0){
                num2=x;
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        int l1=0;
        int l2=0;
        for(int y: nums){
            if(y==num1){
                l1++;
            }
            if(y==num2 && num1!=num2){
                l2++;
            }
        }

        ArrayList<Integer> list= new ArrayList<>();

        if(l1> n/3){
            list.add(num1);
        }
        if(l2 > n/3){
            list.add(num2);
        }
        return list;
    }
}
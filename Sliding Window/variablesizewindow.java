import java.util.*;
//second problem can be of variable size sliding window three conditions will be applied here
//longest subarray of sum k:
public class variablesizewindow {
    public static void main(String[] args) {
        int []arr={4,1,1,1,2,3,5};
        int i=0,j=0;
        int sum=0,k=5;
        int mx=Integer.MIN_VALUE;
        while(j<arr.length){
            sum=sum+arr[j];
            if(sum<k){//simply inc if we have not reached to desired sum as k=5 for this que
                j++;
            }
            else if(sum==k)//if we reached to our desired result then simply perform the given operations we want as per question
            {
               mx=Math.max(mx,j-i+1);
               j++;
            }
            else if(sum>k){//if it's more than condition simply dec from previous pointer
                while(sum>k){
                    sum-=arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(mx);
    }
}

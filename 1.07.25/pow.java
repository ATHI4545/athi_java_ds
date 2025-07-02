import java.util.*;
class pow{
    public static void main(String [] args ){
        
        int[] arr={7,1,3,5,3,6,4};
        
        int minval=Integer.MAX_VALUE;
        int maxval=Integer.MIN_VALUE;
       int minpos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minval){
                minval=arr[i];
                minpos=i;
            }
        }
        for(int j=minpos+1;j<arr.length;j++){
            int profit=arr[j]-arr[minpos];
            maxval=Math.max(maxval,profit);
        }
        System.out.print(maxval);
    }
}

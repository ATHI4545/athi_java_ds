import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
 
        for (int i = 0; i <= 6; i++) {
            arr[i] = sc.nextInt();
        }

       int st=0;
       int en=arr.length-1;
       int t=0;
        int[] ans=new int[arr.length];
       while(st<=en){
        if(t<arr.length){
            ans[t++]=arr[en--];
        }
        else{
            ans[t++]=arr[st++];
        }
        for(int num:ans){
            System.out.print(arr[num]+" ");
        }
       }
}
}
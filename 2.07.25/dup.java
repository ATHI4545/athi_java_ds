import java.util.Arrays;
import java.util.HashMap;
public class dup{
    public static void main(String [] args){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr={1,3,4,2,2,4};
        int[] sample=new int[4];
        int k=0;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            if(map.get(i)>1){
                sample[k]=i;
                k++;
            }
        }
        System.out.print(Arrays.toString(sample));
    }
}
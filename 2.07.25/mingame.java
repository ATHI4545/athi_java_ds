import java.util.Arrays;

class mingame{
    public static void main(String [] args){

      int[] nums={5,4,2,3};
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i+=2){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        System.out.println(nums);
    }
}

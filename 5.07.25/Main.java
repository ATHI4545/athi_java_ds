import java.util.Scanner;

public class AlternateSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int[] result = new int[n];
        int start = 0;
        int end = n - 1;
        boolean turn = true; 
        int idx = 0;

        while(start <= end) {
            if(turn) {
                result[idx++] = arr[end--];
            } else {
                result[idx++] = arr[start++];
            }
            turn = !turn;
        }
        System.out.println("Alternate Sorted Output:");
        for(int val : result) {
            System.out.print(val + " ");
        }
    }
}

class crossnum{
    public static void main(String args []){
        int n=5;
        int n1=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    System.out.print(j+" ");
                }
  
                if(j==n1&&n%2!=0){
                    continue;
                }
                if(j==n-i+1){
                    System.out.print(n-i+1+" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}
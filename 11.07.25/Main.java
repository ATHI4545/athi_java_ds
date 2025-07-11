import java.util.*;
	public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int age=sc.nextInt();
      
      if(age<0){
          System.out.print("-1");
      }else if(age>5 && age<13){
          System.out.println("0");
      }else if(age>12 && age<20){
          System.out.println("2");
      }else if(age>19 && age<51){
          System.out.println("3");
      }else if(age>50 && age<61){
          System.out.println("4");
      }else if(age>60 && age<102){
          System.out.println("5");
      }else if(age>101){
          System.out.println("-1");
      }
}
}
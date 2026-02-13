import java.util.Scanner;

public class FinallyDemo {
    
       public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result=0;
            try{
              result=a/b;
              System.out.println("Result: "+result);
               }
           catch(ArithmeticException e){
               System.out.println("Error: / by zero");
                }
           finally{
           System.out.println("Finally block executed");
           }
         sc.close();
     }
}

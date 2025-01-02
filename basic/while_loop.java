
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        // int i=1,n=5;
        // while (i<=n) { 
        //     System.out.println(i);
        //     i++;
        // }

       int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int num=sc.nextInt();
       while (num>=0) { 
           sum+=num;
           System.out.println("Enter a number:");
           num=sc.nextInt();
       } 
       sc.close();
       System.out.println("Sum:"+sum);
    
       
       //do while loop [the body of do while loop will execute once only check for the condition]
    //    num=-4;
    //    do { 
    //        System.out.println("Hello World");
    //        num=sc.nextInt();
    //    } while (num>=0);

    }
}

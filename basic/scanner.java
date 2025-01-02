import  java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age!");
        int num=sc.nextInt();
        System.out.println("Please enter your name:");
        String name=sc.next();
        System.out.println("Num:"+num);
        System.out.println("Name:"+name);
        sc.close();
   /*
    * Constants are non-modifiable (immutable) variables, declared with keyword final. 
    You can only assign values to final variables ONCE. Their values cannot be changed 
    during program execution.
    */
   
    final double PI=3.145663476;
    System.out.println(PI);
    }
}

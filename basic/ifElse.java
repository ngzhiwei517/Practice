public class ifElse {
    public static void main(String[] args) {
    //     int number=-5;

   
    // if (number>0) {
    //     System.out.println("The number is positive");
    // }
    // else{
    //     System.out.println("The number is not positive.");

    // }
    // System.out.println("Statement outside if... else block");
    // System.out.println();    


//-------------------------------------------------------------------------------------//
    /* Java ternary operator 
     * Format condition?Expression1:Expression2;
    */
    
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your marks:");
        // double marks=sc.nextDouble();
        // String result=(marks>40)? "Pass": "Fail";
        // System.out.println("My result:"+result);
        // sc.close();

        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Enter number:");
        // int number=scanner.nextInt();
        // String result=(number%2==0)?"Even":"Odd";
        // System.out.println(number+" is:"+result);
        // scanner.close();
//-------------------------------------------------------------------------------------//
        // int a=40,b=20;
        // int max=(a>b)?a:b;
        // System.out.println("Max number:"+max);

        // int marks=65;
        // String grade=(marks>=90)?"A+":(marks>=80)?"A":(marks>=70)?"A-":"B";
        // System.out.println("Grade:"+grade);

        //COMPARE THREE NUMBER 
        int x=34,y=75,z=13;
        int largest=(x>y)?((x>z)?x:z):((y>z)?y:z);
        System.out.println("The largest number is:"+largest);
     
    }

}

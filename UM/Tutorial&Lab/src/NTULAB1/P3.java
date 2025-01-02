package NTULAB1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        String heading="US$\tS$\n--------------------";
        Scanner sc=new Scanner(System.in);
        int start,end,increment;
        final double CONVERSION_RATE=1.82;
        System.out.print("Enter the starting value (US$):");
        start=sc.nextInt();
        System.out.print("Enter the ending value (US$):");
        end=sc.nextInt();
        System.out.print("Enter the increment (US$):");
        increment=sc.nextInt();

        System.out.println("By using for loop:");
        System.out.println(heading);
        for (int i=start;i<=end;i+=increment){
            double conversion=i*CONVERSION_RATE;
            System.out.printf("%d\t%.2f",i,conversion);
            System.out.println();
        }

        System.out.println();
        System.out.println("By using while loop:");
        System.out.println(heading);
        int temp=start;
        while (temp<=end){
            double conversion=temp*CONVERSION_RATE;
            System.out.printf("%d\t%.2f\n",temp,conversion);
            temp+=increment;
        }

        System.out.println();
        System.out.println("By using do while loop:");
        System.out.println(heading);
        int useDoWhile=start;
        do{
            if(useDoWhile>end){
                break;
            }
            double conversion=useDoWhile*CONVERSION_RATE;
            System.out.printf("%d\t%.2f\n",useDoWhile,conversion);
            useDoWhile+=increment;
        }while (useDoWhile<=end);
    }


}

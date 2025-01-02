package NTULAB1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the height:");
        int height= scanner.nextInt();
        if(height==0){
            System.out.println("Error input!!");
            return;
        }
        for(int i=1;i<=height;i++){
            for(int j=i;j>0;j--){
                if(j%2==0){
                    System.out.printf("BB");
                }else{
                    System.out.printf("AA");
                }
            }
            System.out.println();
        }
    }


}

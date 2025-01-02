package Q1;

import java.util.Random;

public class Number2 {
    int[]array;

    public Number2(){
        this(10);
    }

    public Number2(int size){
        this(size,100);
    }

    public Number2(int size,int range){
        Random r=new Random();
        array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=r.nextInt(range+1);
        }
    }

    public void display(){
        System.out.print("Display all the items of the array:");
        for(int arr:array){
            System.out.print(arr+" ");
        }
        System.out.println();
    }

    public void evenNum(){
        System.out.print("Display all the even number of the array:");
        for(int num:array){
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }

    public void prime(){
        System.out.print("Prime numbers:");
        for(int i=0;i<array.length;i++){
            if (isPrime(array[i])){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }

    public boolean isPrime(int num){
        if(num<=1){
            return false;
        }else {
            for(int i=2;i<Math.sqrt(num)+1;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public void maxNum(){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximum number:"+max);
    }

    public void minNum(){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Minimum number:"+min);
    }

    public void average(){
        int sum=0;
        double average;
        for(int num:array){
            sum+=num;
        }
        average=(double) sum/(array.length);
        System.out.println("Average:"+average);
    }

    public void squareNum(){
        System.out.print("Sqaure numbers:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]*array[i]+" ");
        }
    }

}

class Test{
    public static void main(String[] args) {
        Number2 num2=new Number2();
        num2.display();
        num2.evenNum();
        num2.maxNum();
        num2.minNum();
        num2.average();
        num2.prime();
        num2.squareNum();
        System.out.println();
        System.out.println();
        Number2 num3=new Number2(5);
        num3.display();
        num3.evenNum();
        num3.maxNum();
        num3.minNum();
        num3.average();
        num3.prime();
        num3.squareNum();
        System.out.println();
        System.out.println();
        System.out.println();
        Number2 num4=new Number2(4,50);
        num4.display();
        num4.evenNum();
        num4.maxNum();
        num4.minNum();
        num4.average();
        num4.prime();
        num4.squareNum();

    }
}

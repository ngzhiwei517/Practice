package Q4;

import java.util.Scanner;

public class Fraction2 {
    private double numerator;
    private double denominator;

    public void input(double numerator,double denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void setNumerator(double numerator){
        this.numerator=numerator;
    }

    public void setDenominator(double denominator){
        if(denominator==0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator=denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }
    public void display(){
        double large,small;
         if(denominator>numerator){
             large=denominator;
             small=numerator;
         }else{
             large=numerator;
             small=denominator;
         }
        double gcd=gcd(large,small);
        this.numerator=getNumerator()/gcd;
        this.denominator=getDenominator()/gcd;
        System.out.println("Fraction in the lowest terms:"+(int)numerator+"/"+(int)denominator);
    }

    private double gcd(double a,double b){
        if(b==0){
            return Math.abs(a);
        }
        return gcd(b,a%b);
    }


    public static void main(String[] args) {
        Fraction2 f2=new Fraction2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator:");
        double numerator=sc.nextDouble();
        System.out.println("Enter denominator:");
        double denominator=sc.nextDouble();
        f2.input(numerator,denominator);
        System.out.println("Fraction:"+(int)f2.getNumerator()+"/"+(int)f2.getDenominator());
        f2.display();
    }

}

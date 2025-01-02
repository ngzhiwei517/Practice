class staticKeywordTry{
    public static int add(int a,int b){
        return a+b;
    }

    public int multiple(int a,int b){
        return a*b;
    }
}


public class staticKeyword {
   static int age=10;
   static int height;
    public static void main(String[] args) {
        height=176;
        System.out.println("My age:"+age+" and my height is "+height); //static variable can be accessed directly within the same class
        staticKeywordTry s1=new staticKeywordTry();
        System.out.println("2 * 5 = "+s1.multiple(2,5));
        System.out.println("2 + 5 = "+staticKeywordTry.add(2,5));
    }


}

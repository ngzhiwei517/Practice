public class casting {
    public static void main(String[] args) {
        //when change from more precision to less precision need to perform casting 
        double result=10.5;
        int intResult=(int)result;
        System.out.println(intResult);
        //casting didn't perform round off action
        
        
        System.out.println();
        int roundResult=(int)Math.round(result);
        System.out.println("Round off result:"+roundResult);

    }

    
}
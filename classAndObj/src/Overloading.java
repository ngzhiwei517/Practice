

public class Overloading {
    //overloading by changing the number of parameter
    private static void display(int a, int b) {
        System.out.println("Arguments:" + a + " and " + b);
    }

    private static void display(int a) {
        System.out.println("Argument:" + a);
    }

    //overloading by changing the data type of the parameter
    private static void display(String a) {
        System.out.println("Got string object:" + a);
    }

    public static void main(String[] args) {
        //convert int to String
        int num = 4;
        String number = String.valueOf(num);


        //get the class name[simplest without the package] [get String]
        System.out.println("Type:" + number.getClass().getSimpleName());
        //get full name with the package [java.util (package name)]
        System.out.println("Type:" + number.getClass().getName());

        display(2);
        display(4, 5);
        display("Hello");

        System.out.println(HelperService.formatNumber(4));
        System.out.println(HelperService.formatNumber(6.798));
        System.out.println(HelperService.formatNumber("550")); //Integer to Double work properly (automatic conversion) [WIDENING]
    }



}

class HelperService {
    public static String formatNumber(int number) {
        return String.format("%d", number);
    }

    public static String formatNumber(double value) {
        return String.format("%.2f", value);
    }

    //used to convert String to their respective numeric type Integer.parseInteger
    public static String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
        //CONVERT STRING TO DOUBLE
    }
}
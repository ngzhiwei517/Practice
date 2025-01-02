package Exception;

/*When you create a new class (CustomException) that extends another class (like Exception), your new class inherits all the methods and functionality of the parent class (Exception).*/

/*The parent class (Exception) has a method called getMessage() that returns the error message for an exception.
Your custom class (CustomException) doesn’t explicitly define getMessage(). Instead, it relies on the inherited behavior from Exception.*/

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class expFour {
    public static void main(String[] args) {
        try {
            validateNumber(-34);
        } catch (CustomException e) {
            System.out.println("Caught custom exception:" + e.getMessage());
        }
    }

    public static void validateNumber(int num) throws CustomException {
        if (num < 0) {
            throw new CustomException("Negative number are not allowed!");
        } else {
            System.out.println("Valid number:" + num);
        }
    }


}

import java.util.Random;

public class randomPractice {
    public static void main(String[] args) {
        Random r1=new Random();
        int num=r1.nextInt(10);
        System.out.print("Random integer between 0[inclusive] and 10 [exclusive]:");
        System.out.println(num);

        //random float between 0 and 10
        double randomFloat=r1.nextDouble()*10; //0 inclusive and 10 exclusive
        System.out.printf("Random floating point number:%.2f\n",randomFloat);

        //random number within a range
        int min=1;
        int max=10;
        int randomNum=r1.nextInt(max-min+1)+min;
        System.out.println("Random int:"+randomNum);

        switch (randomNum){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Unknown day");
        }
    }
}

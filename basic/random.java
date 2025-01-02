import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random=new Random();
        //generate random integer from 0(inclusive) to 10(exclusive)
        int num=random.nextInt(10);
        System.out.println(num);
        System.out.println();
        //generate random float from 0(inclusive) to 10(exclusive)
        double rand_float=random.nextDouble()*10;
        System.out.println(rand_float);


        //random integer for certain range [exp from 4 to 10]
        int min=4;
        int max=10;
        int random_num=random.nextInt(max-min+1)+min;
        System.out.println("Random number between 4 and 10:"+random_num);

        int day=5;
        switch (day) {
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
                System.out.println("Bye!");
                break;
        }
      

    }
  
    


}
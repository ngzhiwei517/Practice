enum TrafficLight{
    RED,YELLOW,GREEN
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

enum Operations{
    ADD{
        public int apply(int a,int b){
            return a+b;
        }
    },

    SUBSTRACT{
        public int apply(int a,int b){
            return a+b;
        }
    },

    MULTIPLY{
        public int apply(int a,int b){
            return a*b;
        }
    },

    DIVIDE{
        public int apply(int a,int b){
            return a/b;
        }
    };
    public abstract int apply(int a, int b);

}
public class enumUsage {
    /*Enumerations make the code more readable and manageable by grouping related constants under one name*/
    public static void main(String[] args) {
       int result1=Operations.ADD.apply(3,4);
        System.out.println("Result of 3+4:"+result1);

        //Basic enum examples
        Day today=Day.SATURDAY;

        for(Day day:Day.values()){
            System.out.print(day+" ");
        }
        System.out.println();
        TrafficLight light=TrafficLight.GREEN;
        //Enum with switch
       switch (light){
           case RED:
               System.out.println("Stop!");
               break;

           case YELLOW:
               System.out.println("Get Ready...");
               break;

           case GREEN:
               System.out.println("Go!");
               break;

           default:
               System.out.println("Invalid color");
       }
    }


}

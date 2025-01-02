public class array {
    public static void main(String[] args) {
        //java for each loop
        //integer array
        // int[] number={3,7,-6,2};
        // for(int numbers:number){
        //     System.out.println(numbers);
        // }

        // String[] fruit={"apple","papaya","orange"};
        // int i=1;
        // for (String fru:fruit){
        //     System.out.println(i+++" "+fru); //post increment
        // }
        
        // System.out.println();
        // String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        // //print all the element of the array
        // for (String k : fruits) {
        //     System.out.println(k);
        // }

        // int sum=0;
        // double average=0.0;
        // int[]age={12,43,55,34,22};
        // for(int ag:age){
        //     sum+=ag;
        //     System.out.print(ag+" ");
        // }
        // average=(double)sum/age.length; //casting is not necessary to get the accurate result!
        // System.out.println("Sum:"+sum);
        // System.out.println("Average:"+average);

        // int num=10;
        // System.out.println("Integer value is:"+num);
        // String data=String.valueOf(num);
        // System.out.println("String value is:"+data);
    
        //multi-dimensional array
        int[][]a=new int[3][4]; //array which can hold 12 elements 3 rows and 4 column
        int[][]number={{1,2,3},{4,5,6,9},{7}};
        // System.out.println("Length of row 1:"+number[0].length);
        // System.out.println("Length of row 2:"+number[1].length);
        // System.out.println("Length of row 3:"+number[2].length);

        // System.out.println("Print all the elements of 2d array:");
        // for (int i = 0; i<number.length;i++) {
        //     for(int j=0;j<number[i].length;j++){
        //         System.out.println(number[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        //access 2D array by using for_each loop



/*         for(int[] innerArray:number){ //access each array
            for(int data:innerArray){
                System.out.println(data);
            }
            System.out.println();
        } */

        

    
    }
}

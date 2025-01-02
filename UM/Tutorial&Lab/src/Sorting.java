public class Sorting {
    public static void main(String[] args) {
        double[] numberList = {-2, 4.5, 5, 1, 2, -3.3};
        int[]number={2,9,5,4,8,1};
        System.out.print("Before sorting:");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        bubbleSortTwo(number);
        System.out.println();
        System.out.print("After sorting:");
        for (int j = 0; j < number.length; j++) {
            System.out.print(number[j] + " ");
        }
    }

    public static void Selection_Sort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            double minElement = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                {
                    if (array[j] < minElement) {
                        minElement = array[j];
                        minIndex = j;
                    }
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = minElement;
            }
        }
    }

    public static void selectionSortTwo(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElement = array[i];
            int minIndex = i;
            for (int j = i + 1; j<array.length; j++) {
                if(array[j]<minElement){
                    minElement=array[j];
                    minIndex=j;
                }
            }
            array[minIndex]=array[i];
            array[i]=minElement;
        }
    }

    public static void InsertionSort(int[]array){
        for(int i=1;i<array.length;i++){
            int k;
            int currentElement=array[i];
            for(k=i-1;k>=0 && array[k]>currentElement;k--){
                array[k+1]=array[k];
            }
            array[k+1]=currentElement;
        }
    }

    public static void InsertionSortTwo(double[]array){
        for(int i=1;i<array.length;i++){
            double currentElement=array[i];
            int j;
            for(j=i-1;j>=0 && j>currentElement;j--){
                array[j+1]=array[j];
            }
            array[j+1]=currentElement;
        }
    }

    public static void bubbleSort(int[]array){
        boolean needNextPass=true;
        for(int i=1;i<array.length && needNextPass;i++){
            needNextPass=false;
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    needNextPass=true;
                }
            }
        }
    }

    public static void bubbleSortTwo(int[]array){
        boolean needNextPass=true;
        for(int i=1;i<array.length && needNextPass;i++){
            needNextPass=false;
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    needNextPass=true;
                }
            }
        }
    }

}

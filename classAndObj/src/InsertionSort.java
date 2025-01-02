public class InsertionSort {
    public static void insertionSort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int k;
            for(k=i-1;k>=0 &&arr[k]>temp;k--){
                arr[k+1]=arr[k];
            }
            arr[k+1]=temp;
        }
    }


    public static void main(String[] args) {
        int[]list={2,3,2,5,6,1,-2,3,14,12};
        insertionSort(list);
        System.out.print("Insertion sort:");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}

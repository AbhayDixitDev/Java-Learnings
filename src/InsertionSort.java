import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
     

        System.out.println("Enter the size of the array");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter value for index "+i+" :");
            arr[i] = scan.nextInt();
        }

        System.out.println("Array before sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }

        for ( int i =0; i<size;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        System.out.println("\nArray after sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
        scan.close();
    }
}

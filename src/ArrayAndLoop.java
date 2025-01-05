import java.util.Scanner;

public class ArrayAndLoop {
    public static void main(String [] arg){
        int[] arr= new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){

            System.out.print("1Enter value for index "+i+" :");
            arr[i] = scan.nextInt();

        }

        for(int i:arr){
            System.out.print(i+" ");
        }

        scan.close();
    }
}

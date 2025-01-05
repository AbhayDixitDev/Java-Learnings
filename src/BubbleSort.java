public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Array before sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }

        for(int i=0;i<arr.length;i++){
            int swap =0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }

        System.out.println("\nArray after sorting");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

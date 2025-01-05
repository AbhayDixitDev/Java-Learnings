import java.util.Scanner;


class ArmStrongNumber{
    public static void main(String [] arr){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check if it is armstrong number or not");
        n = scan.nextInt();

        int temp=n;
        int size=0;

        while(temp>0){
            temp = temp/10;
            size++;
        }
        System.out.println(size);

        int result = 0;
        temp = n;

        while(temp>0){
            int r = temp%10;
            result = result + (int)Math.pow(r,size);
            temp = temp/10;
        }

        if(result == n){
            System.out.println(n+" is an armstrong number");
        }
        else{
            System.out.println(n+" is not an armstrong number");
        }
    }
}
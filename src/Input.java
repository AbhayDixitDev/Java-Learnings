import java.util.Scanner;

public class Input {
    public static void main(String [] arr){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name= scanner.nextLine();

        System.out.println("Your name is "+name);
    }
}

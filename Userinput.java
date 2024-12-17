import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        System.out.println("taking input from the user :");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number 1 :");
        int a = sc.nextInt();
        System.out.println("enter number 2 :");
        int b = sc.nextInt();
      int sum = a + b ;
        System.out.print("the sum of these numbers is : ");
        System.out.println(sum);

    }
}

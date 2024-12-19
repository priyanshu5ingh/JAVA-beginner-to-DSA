import java.util.Scanner;
public class ProblemsetQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to know the number entered by the user is integer or not
        System.out.println("please enter the number : ");
        boolean number = sc.hasNextInt();
        System.out.println(" the number enterd is " + number);


    }
}

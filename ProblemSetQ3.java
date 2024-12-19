import java.util.Scanner;
public class ProblemSetQ3 {
    public static void main(String[] args) {
        //Write a program where the the user has to enter his/her name and the the system greets
        // them with " hellow <name> have a good day
        System.out.println("Please enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a nice day !!");

    }
}

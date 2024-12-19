import java.util.Scanner;
public class ProblemsetQ4 {
    public static void main(String[] args) {
        // Write a program to convert kilometers into miles
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Kilometers ");
        float Kilometer = sc.nextFloat();
        float onekilometer = 0.62137119F;
        float Miles = onekilometer*Kilometer;
        System.out.print(Miles);
    }
}

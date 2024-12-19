import java.util.Scanner;
public class ProblemSetQ2 {
    public static void main(String[] args) {
        // Write a program to calculate CGPA using marks of 3 Subjects out of 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the marks obtained in the 3 Subjects : ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float CGPA = (a + b+ c )/30;

        System.out.printf("the CGPA of the Student is %s%n", CGPA);
    }
}

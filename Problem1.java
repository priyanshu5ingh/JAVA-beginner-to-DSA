import java.util.Scanner;
public class Problem1 {
    // Write a program to calculate the percentage of a student in CBSE board examination of his 5 subjects
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of the Subject 1 " );
        int a = sc.nextInt();
        System.out.println("enter the marks of the subject 2 ");
        int b = sc.nextInt();
        System.out.println("enter the marks of the subject 3 ");
        int c = sc.nextInt();
        System.out.println("enter the marks of the subject 4 ");
        int d = sc.nextInt();
        System.out.println("enter the marks of the subject 5 ");
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        System.out.print(" total marks of the student out of 500 is ");
        System.out.println(sum);
        float average;
        average = ((float) sum /5);
        System.out.print("the percentage of the student is :");
        System.out.println(average);



    }
}

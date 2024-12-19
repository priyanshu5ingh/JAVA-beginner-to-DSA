public class OperatorPrecidence {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        System.out.println(a);// java uses only precedence and associativity not BODMAS
        // Associativity
        int b = 60/5-34*2;
        System.out.println(b);

    }
}

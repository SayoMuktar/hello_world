import java.util.Scanner;

public class Fibonacci { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(1 + "+" + "Enter a number: ");
        int n = scanner.nextInt();
       int i = 0;
        int a = 2, b = 1;
        //System.out.print("Fibonacci sequence: ");
        System.out.println(a + "+"+" " + b + " ");
       for ( i < n) {
            int sum = a + b;
            System.out.println(b + "+" + sum + " ");
            a = b;
            b = sum;
        }
    }
}

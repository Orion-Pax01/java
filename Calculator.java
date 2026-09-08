import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        System.out.println("Choose operation: +, -, *, /, %");
        char operation = sc.next().charAt(0);
        int result = 0;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("Result: " + result);

    }
}

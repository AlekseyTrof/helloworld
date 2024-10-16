package Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Введите операцию(+, -, /, *: ");
        char operation = scanner.next().charAt(0);
        double result;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }
        System.out.println("\nРезультат: " + firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }
}

package Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите операцию(+, -, /, *): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();
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

import java.util.Scanner;

public class Calculator {
        public static void sum(double firstValue, double secondValue){
            double sum = firstValue + secondValue;
            System.out.println("Summation = "+sum);
        }

    public static void sub(double firstValue, double secondValue){
        double sub = firstValue - secondValue;
        System.out.println("Subtraction = "+sub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstValue = sc.nextDouble();
        double secondValue = sc.nextDouble();
            Calculator calculator = new Calculator();
            calculator.sum(firstValue,secondValue);
            calculator.sub(firstValue,secondValue);
    }
    private double multiplication(double a, double b){
            return a * b;
    }
}
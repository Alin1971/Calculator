import java.util.Scanner;

public class Calculator {
        private double sum(double firstValue, double secondValue){
            Scanner sc = new Scanner(System.in);
            firstValue = sc.nextDouble();
            secondValue = sc.nextDouble();
            return firstValue + secondValue;
        }
    }
    

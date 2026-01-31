import task3.Rational;
import java.util.Arrays;
import java.util.Random;

public class TestTask3 {
    public static void main(String[] args) {
        Rational[] rationals = new Rational[100];
        Random random = new Random();

        for (int i = 0; i < rationals.length; i++) {
            long n = random.nextInt(20) + 1;
            long d = random.nextInt(20) + 1;
            rationals[i] = new Rational(n, d);
        }

        System.out.println("Первые 5 сгенерированных чисел ");
        for(int i=0; i<5; i++) System.out.print(rationals[i] + "  ");
        System.out.println("\n");

        Arrays.sort(rationals);

        System.out.println("Сортировка ");
        Rational smallest = rationals[0];
        Rational largest = rationals[rationals.length - 1];
        System.out.println("Маленький: " + smallest);
        System.out.println("Большой:  " + largest + "\n");

        Rational sum = new Rational(0, 1);
        Rational product = new Rational(1, 1);

        for (Rational r : rationals) {
            sum = sum.add(r);
            product = product.multiply(r);
        }


        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product + "\n");

        Rational difference = largest.subtract(smallest);
        Rational division = largest.divide(smallest);

        System.out.println("Операция max/min");
        System.out.println("Большой-Маленький: " + difference);
        System.out.println("Большой/Маленький:   " + division);
        System.out.println("Десетичное значение деления:       " + division.doubleValue());
    }
}
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

        System.out.println("First 5 generated numbers ");
        for(int i=0; i<5; i++) System.out.print(rationals[i] + "  ");
        System.out.println("\n");

        Arrays.sort(rationals);

        System.out.println("Sorted ");
        Rational smallest = rationals[0];
        Rational largest = rationals[rationals.length - 1];
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest:  " + largest + "\n");

        Rational sum = new Rational(0, 1);
        Rational product = new Rational(1, 1);

        for (Rational r : rationals) {
            sum = sum.add(r);
            product = product.multiply(r);
        }

        System.out.println("Aggregates");
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Product of all numbers: " + product + "\n");

        Rational difference = largest.subtract(smallest);
        Rational division = largest.divide(smallest);

        System.out.println("Operations on Max/Min");
        System.out.println("Difference (Largest - Smallest): " + difference);
        System.out.println("Division (Largest / Smallest):   " + division);
        System.out.println("Decimal value of Division:       " + division.doubleValue());
    }
}
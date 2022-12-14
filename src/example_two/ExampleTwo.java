package example_two;

import java.util.Scanner;
public class ExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product p1 = new Product("Mouse", 33.80);
        Product p2 = new Product("Notebook", 3500.00);
        Product p3 = new Product("Keyboard", 52.99);
        Product p4 = new Product("Screen", 750.00);

        double[] product = {p1.getPrice(), p2.getPrice(), p3.getPrice(), p4.getPrice()};
        double sum = 0;

        for(int i = 0; i < product.length; i++){
            sum += product[i];
        }

        System.out.println(sum);

        double averagePrice = sum / product.length;
        System.out.printf("The average price of the products is $ %.2f", averagePrice);

        scanner.close();
    }
}

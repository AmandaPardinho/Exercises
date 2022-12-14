package example_one;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = {1.75, 1.56, 1.82, 1.94, 1.35, 1.6};
        double sum = 0;

        for(int i = 0; i < heights.length; i++){
            sum = sum + heights[i];
        }

        System.out.println(sum);

        double average = sum / heights.length;
        System.out.println(average);

        scanner.close();
    }

}

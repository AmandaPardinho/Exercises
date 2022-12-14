package example_three;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Rent {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Hostel s1 = new Hostel("João", "joao@joao.com", 7);
        Hostel s2 = new Hostel("Sílvia", "silvia@silvia.com", 0);
        Hostel s3 = new Hostel("Bernardo", "bernardo@bernardo.com", 1);
        Hostel s4 = new Hostel("Giovana", "giovana@giovana.com", 5);
        Hostel s5 = new Hostel("Elsa", "elsa@elsa.com", 9);

        /*Integer[] studentRent = {s1, s2, s3, s4, s5};

        Arrays.stream(studentRent).forEach((s -> {
            System.out.println(s);
        }));

        System.out.println("\nStudents in room order: ");
        studentRent.getClass().isInterface(Comparator.comparing(Hostel::getRoom)).forEach(student ->
                System.out.println(student));*/

    }
}

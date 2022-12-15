package example_three;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class Rent {

    public static void main(String[] args) {
        List<Hostel> guest = new ArrayList<Hostel>();

        guest.add(new Hostel("João", "joao@joao.com", 7));
        guest.add(new Hostel("Sílvia", "silvia@silvia.com", 0));
        guest.add(new Hostel("Bernardo", "bernardo@bernardo.com", 1));
        guest.add(new Hostel("Giovana", "giovana@giovana.com", 5));
        guest.add(new Hostel("Elsa", "elsa@elsa.com", 9));


        guest.stream().forEach((g -> {
            System.out.println(g);
        }));

        System.out.println("\nStudents in room order:\n");
        guest.stream().sorted(Comparator.comparing(Hostel::getRoom)).forEach(hostel -> System.out.println(hostel));
    }
}

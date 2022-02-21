import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inThailand();
    }

    public static void inThailand() {
        int minusYear = 543;
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.next());

        System.out.println(year - minusYear);
    }
}

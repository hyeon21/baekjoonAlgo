import java.util.Scanner;

public class IOnArithmetic {

    public static void main(String[] args) {
        IOnArithmetic ioa = new IOnArithmetic();
        ioa.inThailand();
    }

    public void helloWorld() {
        System.out.println("Hello World!");
    }

    public void weLoveKriii() {
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
    }

    public void cat() {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    public void dog() {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }

    public void plus() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a + b);
    }

    public void minus() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a - b);
    }

    public void multiply() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a * b);
    }

    public void division() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println((double)a / b);
    }

    public void calcul() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public void remainder() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }

    public void remainderMultiply() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a * ((b % 100) % 10));
        System.out.println(a * ((b % 100) / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }

    public void wow() {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        System.out.println(id + "??!");
    }

    public void inThailand() {
        int minusYear = 543;
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.next());

        System.out.println(year - minusYear);
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Conditional {

    public static void main(String[] args) {
        Conditional cond = new Conditional();
        try {
            cond.ovenClock();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public void compare() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }

    public void compareGrade() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();

        switch (a / 10) {
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default :
                System.out.println("F");
        }
    }

    public void isLeapYear() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int isLeapYear = 0;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = 1;
            }
        }

        System.out.println(isLeapYear);
    }

    public void quadrantN() {
        int quadrant = 0;
        Scanner scanner = new Scanner(System.in);
        int coordX, coordY;

        coordX = scanner.nextInt();
        coordY = scanner.nextInt();

        if (0 < coordY) {
            if (0 < coordX) {
                quadrant = 1;
            } else {
                quadrant = 2;
            }
        } else {
            if (coordX < 0) {
                quadrant = 3;
            } else {
                quadrant = 4;
            }
        }

        System.out.println(quadrant);
    }

    public void alarmsClocks() throws IOException {
        int hh, mm;
        int modifiedHour, modifiedMin;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        hh = Integer.parseInt(st.nextToken());
        mm = Integer.parseInt(st.nextToken());

        modifiedHour = hh;
        modifiedMin = mm - 45;

        if (modifiedMin < 0) {
            modifiedHour--;
            if (modifiedHour < 0) {
                modifiedHour = 23;
            }
            modifiedMin += 60;
        }
        br.close();
        System.out.println(modifiedHour + " " + modifiedMin);
    }

    public void ovenClock() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startHour = Integer.parseInt(st.nextToken());
        int startMin = Integer.parseInt(st.nextToken());
        int cookTime = Integer.parseInt(br.readLine());

        startMin += cookTime;

        if (59 < startMin) {
            int plusHour = startMin / 60;
            startHour += plusHour;
            if (23 < startHour) {
                startHour -= 24;
            }
            startMin -= (60 * plusHour);
        }

        br.close();

        System.out.println(startHour + " " + startMin);

    }

    public void diceGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstDice = Integer.parseInt(st.nextToken());
        int secondDice = Integer.parseInt(st.nextToken());
        int thirdDice = Integer.parseInt(st.nextToken());

        int prize = 0;

        if (firstDice == secondDice) {
            if (firstDice == thirdDice) {
                prize = 10000 + (1000 * firstDice);
            } else {
                prize = 1000 + (100 * firstDice);
            }
        } else if (firstDice == thirdDice) {
            prize = 1000 + (100 * firstDice);
        } else if (secondDice == thirdDice) {
            prize = 1000 + (100 * secondDice);
        } else {
            prize = 100 * getMaxNum(firstDice, secondDice, thirdDice);
        }

        System.out.println(prize);
    }

    public int getMaxNum(int a, int b, int c) {
        int maxNum = a;

        if (maxNum < b) {
            maxNum = b;
        }
        if (maxNum < c) {
            maxNum = c;
        }

        return maxNum;
    }

}

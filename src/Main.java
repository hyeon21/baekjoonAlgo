import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.diceGame();

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

        br.close();
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

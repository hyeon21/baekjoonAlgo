import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicMath1 {

    public static void main(String[] args) {

        BasicMath1 bm1 = new BasicMath1();
        try {
            bm1.printPassCount();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void getBreakEvenPoint() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] info = br.readLine().split(" ");
        final int FIXED_COST = Integer.parseInt(info[0]);
        final int VARIABLE_COST = Integer.parseInt(info[1]);
        final int GOODS_COST = Integer.parseInt(info[2]);
        br.close();
        if (GOODS_COST <= VARIABLE_COST) {
            System.out.println("-1");
            return;
        }
        System.out.println((FIXED_COST / (GOODS_COST - VARIABLE_COST)) + 1);
    }

    public void printPassCount() {

        try {
            Scanner sc = new Scanner(System.in);
            int roomNumber = sc.nextInt();
            int firstRoomOnLine = 2;
            int line = 1;

            if (roomNumber < 1 || 1000000000 < roomNumber) {
                throw new Exception();
            }

            if (roomNumber == 1) {
                System.out.println(1);
            } else {
                while (firstRoomOnLine <= roomNumber) {
                    firstRoomOnLine = firstRoomOnLine + (6 * line);
                    line ++;
                }

                System.out.println(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

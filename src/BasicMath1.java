import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath1 {

    public static void main(String[] args) {

        BasicMath1 bm1 = new BasicMath1();
        try {
            bm1.getBreakEvenPoint();
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
}

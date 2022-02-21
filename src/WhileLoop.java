import java.io.*;
import java.util.StringTokenizer;

public class WhileLoop {

    public static void main(String[] args) {
        WhileLoop wl = new WhileLoop();

        try {
            wl.plusWhile();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void plusWhile() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            bw.write(a + b + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public void eofPlus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input = null;

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input, " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public void plusCycle() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int originN = Integer.parseInt(br.readLine());
        int rN = originN;
        int cycle = 0;

        br.close();

        do {
            rN = ((rN % 10) * 10) + (((rN / 10) + (rN % 10)) % 10);
            cycle++;
        } while (originN != rN);

        System.out.println(cycle);
    }

}

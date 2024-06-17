import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            /****** 입력 ******/
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;
            /****** 판단+출력 ******/
            String answer = "";
            if(b%a==0) answer = "factor";
            else if(a%b==0) answer = "multiple";
            else answer = "neither";
            System.out.println(answer);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cnt = 1;
        int i = 1, j = 1;
        boolean UP = true; //위로 가는중
        while (cnt++ < X) {
            if(i==1 && UP) {
                UP = false;
                j++;
            } else if(j==1 && !UP) {
                UP = true;
                i++;
            } else if(!UP) {
                i++;
                j--;
            } else if(UP) {
                i--;
                j++;
            }
        }
        System.out.println(i+"/"+j);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어 개수 N
        Set<String> set = new LinkedHashSet<>();
        while (N-- > 0) set.add(br.readLine()); // 중복 제거
        set.stream().sorted((a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length())
                .forEach(System.out::println);
    }
}
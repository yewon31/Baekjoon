import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		// n x m 의 이차배열 생성
		char[][] arr = new char[n][m];
		for(int i = 0; i < arr.length; i++) {
			// 한 줄씩 입력받은 뒤 toCharArray() 로 문자 배열 생성
			arr[i] = br.readLine().toCharArray();
		}
    
    // 체스판 전체의 문자 개수는 8 * 8 = 64
		int min = 64;
		for(int i = 0; i <= arr.length - 8; i++) {
			for(int j = 0; j <= arr[i].length - 8; j++) {
				// 'W' 부터 시작하는 체스판과 일치여부 카운트
				int cnt1 = 0;
				// 'B' 부터 시작하는 체스판과 일치여부 카운트
				int cnt2 = 0;
				// (i, j) 부터 8 x 8 의 공간을 탐색
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						// x y 평면에서 x = (i+k), y = (j+l)
						// W B W    x + y 가 짝수인 좌표 -> 'W'
						// B W B    x + y 가 홀수인 좌표 -> 'B'
						// W B W
						// 일치하면 'W' 부터 시작하는 체스판 카운트 값 cnt1++
						// 아닌경우 'B' 부터 시작하는 체스판 카운트 값 cnt2++
						if((i + k + j + l) % 2 == 0) {
							if(arr[i + k][j + l] == 'W') {
								cnt1++;
							} else {
								cnt2++;
							}
						} else {
						// 위와 반대되게 작성
							if(arr[i + k][j + l] == 'W') {
								cnt2++;
							} else {
								cnt1++;
							}
						}
					}
				}
				// 일치하지 않는 개수 -> 바꿔야 될 횟수
				// 'W'체스판과 'B'체스판 중 작은값 저장
				if(64 - cnt1 < min | 64 - cnt2 < min) {
					if(64 - cnt1 >= 64 - cnt2) {
						min = 64 - cnt2;
					} else {
						min = 64 - cnt1;
					}
				}
			}			
		}
		// 최소 바꿀 횟수 출력
		System.out.println(min);
		br.close();
	}
}
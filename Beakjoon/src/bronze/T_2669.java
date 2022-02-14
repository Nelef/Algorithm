package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2669 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] arr = new int[101][101];

		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int ax = Integer.parseInt(st.nextToken());
			int ay = Integer.parseInt(st.nextToken());
			int bx = Integer.parseInt(st.nextToken());
			int by = Integer.parseInt(st.nextToken());

			for (int x = ax; x < bx; x++) {
				for (int y = ay; y < by; y++) {
					arr[x][y] = 1;
				}
			}
		}
		int result = 0;
		for (int x = 0; x < 101; x++) {
			for (int y = 0; y < 101; y++) {
				if (arr[x][y] == 1) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}

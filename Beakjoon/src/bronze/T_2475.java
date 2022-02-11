package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int result = 0;
		for (int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			result += temp * temp;
		}
		System.out.println(result % 10);
	}
}

package beakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if (b - 45 < 0) {
			if (a - 1 < 0) {
				a += 24;
			}
			a = a - 1;
			b = b + 60 - 45;
		} else {
			b -= 45;
		}

		System.out.println(a + " " + b);
	}
}

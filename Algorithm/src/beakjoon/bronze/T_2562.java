package beakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int max_i = 0;
		for (int i = 0; i < 9; i++) {
			int temp = Integer.parseInt(br.readLine());

			if (max < temp) {
				max = temp;
				max_i = i + 1;
			}
		}
		System.out.println(max + "\n" + max_i);
	}
}
